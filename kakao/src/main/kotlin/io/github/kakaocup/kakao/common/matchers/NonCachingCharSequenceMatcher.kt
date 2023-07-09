package io.github.kakaocup.kakao.common.matchers

import android.content.res.Resources
import android.view.View
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.test.espresso.matcher.BoundedDiagnosingMatcher
import org.hamcrest.Description

/**
 *
 */
internal class NonCachingCharSequenceMatcher(
    @StringRes private val resourceId: Int
) : BoundedDiagnosingMatcher<View, TextView>(TextView::class.java) {

    private var resName: String? = null
    private var expectedText: String? = null

    override fun describeMoreTo(description: Description) {
        description.appendText("text is string with id: $resourceId")
        if (resName != null) {
            description.appendText(" [$resName]")
        }
        if (expectedText != null) {
            description.appendText(" value: $expectedText")
        }
    }

    override fun matchesSafely(textView: TextView, mismatchDescription: Description): Boolean {
        expectedText = try {
            textView.resources.getString(resourceId)
        } catch (ignored: Resources.NotFoundException) {
            /* view could be from a context unaware of the resource id. */
            null
        }
        resName = safeGetResourceEntryName(textView.resources, resourceId)

        val actualText = textView.text
        mismatchDescription.appendText("view.text was $actualText")
        // FYI: actualText may not be string ... its just a char sequence convert to string.
        return null != expectedText && expectedText.contentEquals(actualText)
    }

    // Copy\paste from espresso. They conveniently made this private :)

    /**
     * Get the resource entry name in a safe manner. This is similar to {@link
     * #safeGetResourceName(Resources, int)}, but makes a call to {@link
     * Resources#getResourceEntryName(int)} instead.
     *
     * @param res The {@link Resources} to query for the ID.
     * @param id The ID to query.
     * @return The resource entry name or {@code null} if not found.
     * @see #safeGetResourceName(Resources, int)
     * @see Resources#getResourceEntryName(int)
     */
    @Suppress("SwallowedException")
    private fun safeGetResourceEntryName(res: Resources, id: Int): String? {
        return try {
            if (isViewIdGenerated(id)) null else res.getResourceEntryName(id)
        } catch (_: Resources.NotFoundException) {
            null
        }
    }

    /**
     * IDs generated by [View.generateViewId] will fail if used as a resource ID in attempted
     * resources lookups. This now logs an error in API 28, causing test failures. This method is
     * taken from [View.isViewIdGenerated] to prevent resource lookup to check if a view id was
     * generated.
     */
    @Suppress("MagicNumber")
    private fun isViewIdGenerated(id: Int): Boolean {
        return id and -0x1000000 == 0 && id and 0x00FFFFFF != 0
    }
}
