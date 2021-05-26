[kakao](../../index.md) / [io.github.kakaocup.kakao.common.views](../index.md) / [KBaseView](./index.md)

# KBaseView

`open class KBaseView<out T> : `[`BaseActions`](../../io.github.kakaocup.kakao.common.actions/-base-actions/index.md)`, `[`BaseAssertions`](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)`, `[`Interceptable`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)`<ViewInteraction, ViewAssertion, ViewAction>`

Base class for all Kakao views

This base class allows create new custom view with ease. All you
have to do is to extend this class, implement all necessarily additional
actions/assertions interfaces and override necessary constructors

### Parameters

`T` - Type of your custom view. Needs to be defined to enable invoke() and perform() for descendants

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KBaseView(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Constructs view class with view interaction from given ViewBuilder`KBaseView(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KBaseView(parent: DataInteraction, function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Constructs view class with parent and view interaction from given ViewBuilder |

### Properties

| Name | Summary |
|---|---|
| [root](root.md) | `open var root: Matcher<Root>` |
| [view](view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun invoke(function: `[`T`](index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](perform.md) | `infix fun perform(function: `[`T`](index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](index.md#T)<br>Infix function for invoking lambda on your view |

### Inherited Functions

| Name | Summary |
|---|---|
| [act](../../io.github.kakaocup.kakao.common.actions/-base-actions/act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [assert](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/assert.md) | `open fun assert(function: () -> ViewAssertion): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check the view with the given custom assertion |
| [click](../../io.github.kakaocup.kakao.common.actions/-base-actions/click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doesNotExist](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/does-not-exist.md) | `open fun doesNotExist(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the matched view does not exist |
| [doubleClick](../../io.github.kakaocup.kakao.common.actions/-base-actions/double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [hasAnyTag](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-any-tag.md) | `open fun hasAnyTag(vararg tags: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has at least one of the given tags |
| [hasBackgroundColor](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-background-color.md) | `open fun hasBackgroundColor(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasBackgroundColor(colorCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given background color |
| [hasDescendant](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-descendant.md) | `open fun hasDescendant(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given descendant |
| [hasNotDescendant](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-not-descendant.md) | `open fun hasNotDescendant(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given descendant |
| [hasNotSibling](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-not-sibling.md) | `open fun hasNotSibling(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has not given sibling |
| [hasSibling](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-sibling.md) | `open fun hasSibling(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given sibling |
| [hasTag](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-tag.md) | `open fun hasTag(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given tag |
| [inRoot](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/in-root.md) | `open fun inRoot(function: `[`RootBuilder`](../../io.github.kakaocup.kakao.common.builders/-root-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view is in given root |
| [intercept](../../io.github.kakaocup.kakao.intercept/-interceptable/intercept.md) | `open fun intercept(builder: `[`Interceptor.Builder`](../../io.github.kakaocup.kakao.intercept/-interceptor/-builder/index.md)`<`[`INTERACTION`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md#INTERACTION)`, `[`ASSERTION`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md#ASSERTION)`, `[`ACTION`](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md#ACTION)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the interceptors for the instance. Interceptors will be invoked on the interaction with the KView. |
| [isClickable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-clickable.md) | `open fun isClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is clickable |
| [isCompletelyAbove](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-above.md) | `open fun isCompletelyAbove(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely above of the view matching the given matcher. |
| [isCompletelyBelow](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-below.md) | `open fun isCompletelyBelow(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely below of the view matching the given matcher. |
| [isCompletelyDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-displayed.md) | `open fun isCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is completely displayed |
| [isCompletelyLeftOf](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-left-of.md) | `open fun isCompletelyLeftOf(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
| [isCompletelyRightOf](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-right-of.md) | `open fun isCompletelyRightOf(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view displayed is completely right of the view matching the given matcher. |
| [isDisabled](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-disabled.md) | `open fun isDisabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is disabled |
| [isDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-displayed.md) | `open fun isDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is displayed |
| [isEnabled](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-enabled.md) | `open fun isEnabled(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is enabled |
| [isFocusable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-focusable.md) | `open fun isFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focusable |
| [isFocused](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-focused.md) | `open fun isFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is focused |
| [isGone](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-gone.md) | `open fun isGone(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has GONE visibility |
| [isInvisible](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-invisible.md) | `open fun isInvisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has INVISIBLE visibility |
| [isNotClickable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-clickable.md) | `open fun isNotClickable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not clickable |
| [isNotCompletelyDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-completely-displayed.md) | `open fun isNotCompletelyDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not completely displayed |
| [isNotDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-displayed.md) | `open fun isNotDisplayed(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not displayed |
| [isNotFocusable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-focusable.md) | `open fun isNotFocusable(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focusable |
| [isNotFocused](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-focused.md) | `open fun isNotFocused(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not focused |
| [isNotSelected](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-selected.md) | `open fun isNotSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is not selected |
| [isSelected](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-selected.md) | `open fun isSelected(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view is selected |
| [isVisible](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-visible.md) | `open fun isVisible(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has VISIBLE visibility |
| [longClick](../../io.github.kakaocup.kakao.common.actions/-base-actions/long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [matches](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/matches.md) | `open fun matches(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view matches given matcher |
| [notMatches](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/not-matches.md) | `open fun notMatches(function: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Check if the view does not match given matcher |
| [onFailure](../../io.github.kakaocup.kakao.common.actions/-base-actions/on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](../../io.github.kakaocup.kakao.common.actions/-base-actions/press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](../../io.github.kakaocup.kakao.common.actions/-base-actions/repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [reset](../../io.github.kakaocup.kakao.intercept/-interceptable/reset.md) | `open fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Removes the interceptors from the instance. |
| [scrollTo](../../io.github.kakaocup.kakao.common.actions/-base-actions/scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [KAlertDialog](../../io.github.kakaocup.kakao.dialog/-k-alert-dialog/index.md) | `class KAlertDialog : `[`KBaseView`](./index.md)`<`[`KAlertDialog`](../../io.github.kakaocup.kakao.dialog/-k-alert-dialog/index.md)`>`<br>View for interact with default alert dialog |
| [KBottomNavigationView](../../io.github.kakaocup.kakao.bottomnav/-k-bottom-navigation-view/index.md) | `class KBottomNavigationView : `[`KBaseView`](./index.md)`<`[`KBottomNavigationView`](../../io.github.kakaocup.kakao.bottomnav/-k-bottom-navigation-view/index.md)`>, `[`BottomNavigationViewActions`](../../io.github.kakaocup.kakao.bottomnav/-bottom-navigation-view-actions/index.md)`, `[`BottomNavigationViewAssertions`](../../io.github.kakaocup.kakao.bottomnav/-bottom-navigation-view-assertions/index.md)<br>View for acting and asserting on BottomNavigationView |
| [KButton](../../io.github.kakaocup.kakao.text/-k-button/index.md) | `class KButton : `[`KBaseView`](./index.md)`<`[`KButton`](../../io.github.kakaocup.kakao.text/-k-button/index.md)`>, `[`TextViewAssertions`](../../io.github.kakaocup.kakao.text/-text-view-assertions/index.md)<br>View with BaseActions and TextViewAssertions |
| [KCheckBox](../../io.github.kakaocup.kakao.check/-k-check-box/index.md) | `class KCheckBox : `[`KBaseView`](./index.md)`<`[`KCheckBox`](../../io.github.kakaocup.kakao.check/-k-check-box/index.md)`>, `[`CheckableActions`](../../io.github.kakaocup.kakao.check/-checkable-actions/index.md)`, `[`TextViewAssertions`](../../io.github.kakaocup.kakao.text/-text-view-assertions/index.md)`, `[`CheckableAssertions`](../../io.github.kakaocup.kakao.check/-checkable-assertions/index.md)<br>View with CheckableActions, CheckableAssertions and TextViewAssertions |
| [KChipGroup](../../io.github.kakaocup.kakao.chipgroup/-k-chip-group/index.md) | `class KChipGroup : `[`KBaseView`](./index.md)`<`[`KChipGroup`](../../io.github.kakaocup.kakao.chipgroup/-k-chip-group/index.md)`>, `[`ChipGroupActions`](../../io.github.kakaocup.kakao.chipgroup/-chip-group-actions/index.md)`, `[`ChipGroupAssertions`](../../io.github.kakaocup.kakao.chipgroup/-chip-group-assertions/index.md)<br>View with ChipGroupActions and ChipGroupAssertions |
| [KDatePicker](../../io.github.kakaocup.kakao.picker.date/-k-date-picker/index.md) | `class KDatePicker : `[`KBaseView`](./index.md)`<`[`KDatePicker`](../../io.github.kakaocup.kakao.picker.date/-k-date-picker/index.md)`>, `[`DatePickerAction`](../../io.github.kakaocup.kakao.picker.date/-date-picker-action/index.md)`, `[`DatePickerAssertion`](../../io.github.kakaocup.kakao.picker.date/-date-picker-assertion/index.md)<br>View for interact with default date picker |
| [KDatePickerDialog](../../io.github.kakaocup.kakao.picker.date/-k-date-picker-dialog/index.md) | `class KDatePickerDialog : `[`KBaseView`](./index.md)`<`[`KDatePickerDialog`](../../io.github.kakaocup.kakao.picker.date/-k-date-picker-dialog/index.md)`>`<br>View for interact with default date picker dialog |
| [KDrawerView](../../io.github.kakaocup.kakao.drawer/-k-drawer-view/index.md) | `class KDrawerView : `[`KBaseView`](./index.md)`<`[`KDrawerView`](../../io.github.kakaocup.kakao.drawer/-k-drawer-view/index.md)`>, `[`DrawerActions`](../../io.github.kakaocup.kakao.drawer/-drawer-actions/index.md)<br>View with DrawerActions and BaseAssertions |
| [KEditText](../../io.github.kakaocup.kakao.edit/-k-edit-text/index.md) | `class KEditText : `[`KBaseView`](./index.md)`<`[`KEditText`](../../io.github.kakaocup.kakao.edit/-k-edit-text/index.md)`>, `[`EditableActions`](../../io.github.kakaocup.kakao.edit/-editable-actions/index.md)`, `[`TextViewAssertions`](../../io.github.kakaocup.kakao.text/-text-view-assertions/index.md)<br>View with EditableActions and TextViewAssertions |
| [KImageView](../../io.github.kakaocup.kakao.image/-k-image-view/index.md) | `class KImageView : `[`KBaseView`](./index.md)`<`[`KImageView`](../../io.github.kakaocup.kakao.image/-k-image-view/index.md)`>, `[`ImageViewAssertions`](../../io.github.kakaocup.kakao.image/-image-view-assertions/index.md)<br>View with BaseActions and ImageViewAssertions |
| [KNavigationView](../../io.github.kakaocup.kakao.navigation/-k-navigation-view/index.md) | `class KNavigationView : `[`KBaseView`](./index.md)`<`[`KNavigationView`](../../io.github.kakaocup.kakao.navigation/-k-navigation-view/index.md)`>, `[`NavigationViewActions`](../../io.github.kakaocup.kakao.navigation/-navigation-view-actions/index.md)`, `[`NavigationViewAssertions`](../../io.github.kakaocup.kakao.navigation/-navigation-view-assertions/index.md)<br>View with NavigationViewActions and NavigationViewAssertions |
| [KProgressBar](../../io.github.kakaocup.kakao.progress/-k-progress-bar/index.md) | `class KProgressBar : `[`KBaseView`](./index.md)`<`[`KProgressBar`](../../io.github.kakaocup.kakao.progress/-k-progress-bar/index.md)`>, `[`ProgressBarActions`](../../io.github.kakaocup.kakao.progress/-progress-bar-actions/index.md)`, `[`ProgressBarAssertions`](../../io.github.kakaocup.kakao.progress/-progress-bar-assertions/index.md)<br>View with ProgressBarActions and ProgressBarAssertions |
| [KRatingBar](../../io.github.kakaocup.kakao.rating/-k-rating-bar/index.md) | `class KRatingBar : `[`KBaseView`](./index.md)`<`[`KRatingBar`](../../io.github.kakaocup.kakao.rating/-k-rating-bar/index.md)`>, `[`RatingBarActions`](../../io.github.kakaocup.kakao.rating/-rating-bar-actions/index.md)`, `[`RatingBarAssertions`](../../io.github.kakaocup.kakao.rating/-rating-bar-assertions/index.md)<br>View with RatingBarActions and RatingBarAssertions |
| [KScrollView](../../io.github.kakaocup.kakao.scroll/-k-scroll-view/index.md) | `class KScrollView : `[`KBaseView`](./index.md)`<`[`KScrollView`](../../io.github.kakaocup.kakao.scroll/-k-scroll-view/index.md)`>, `[`ScrollViewActions`](../../io.github.kakaocup.kakao.scroll/-scroll-view-actions/index.md)`, `[`BaseAssertions`](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)<br>View with ScrollViewActions and BaseAssertions |
| [KSearchView](../../io.github.kakaocup.kakao.searchview/-k-search-view/index.md) | `class KSearchView : `[`KBaseView`](./index.md)`<`[`KSearchView`](../../io.github.kakaocup.kakao.searchview/-k-search-view/index.md)`>, `[`SearchViewActions`](../../io.github.kakaocup.kakao.searchview/-search-view-actions/index.md)`, `[`SearchViewAssertions`](../../io.github.kakaocup.kakao.searchview/-search-view-assertions/index.md) |
| [KSeekBar](../../io.github.kakaocup.kakao.progress/-k-seek-bar/index.md) | `class KSeekBar : `[`KBaseView`](./index.md)`<`[`KSeekBar`](../../io.github.kakaocup.kakao.progress/-k-seek-bar/index.md)`>, `[`SeekBarActions`](../../io.github.kakaocup.kakao.progress/-seek-bar-actions/index.md)`, `[`ProgressBarAssertions`](../../io.github.kakaocup.kakao.progress/-progress-bar-assertions/index.md)<br>View with SeekBarActions and ProgressBarAssertions |
| [KSlider](../../io.github.kakaocup.kakao.slider/-k-slider/index.md) | `class KSlider : `[`KBaseView`](./index.md)`<`[`KSlider`](../../io.github.kakaocup.kakao.slider/-k-slider/index.md)`>, `[`SliderActions`](../../io.github.kakaocup.kakao.slider/-slider-actions/index.md)`, `[`SliderAssertions`](../../io.github.kakaocup.kakao.slider/-slider-assertions/index.md) |
| [KSnackbar](../../io.github.kakaocup.kakao.text/-k-snackbar/index.md) | `class KSnackbar : `[`KBaseView`](./index.md)`<`[`KSnackbar`](../../io.github.kakaocup.kakao.text/-k-snackbar/index.md)`>`<br>View with internal TextView and a Button |
| [KSwipeRefreshLayout](../../io.github.kakaocup.kakao.swiperefresh/-k-swipe-refresh-layout/index.md) | `class KSwipeRefreshLayout : `[`KBaseView`](./index.md)`<`[`KSwipeRefreshLayout`](../../io.github.kakaocup.kakao.swiperefresh/-k-swipe-refresh-layout/index.md)`>, `[`SwipeRefreshLayoutActions`](../../io.github.kakaocup.kakao.swiperefresh/-swipe-refresh-layout-actions/index.md)`, `[`SwipeRefreshLayoutAssertions`](../../io.github.kakaocup.kakao.swiperefresh/-swipe-refresh-layout-assertions/index.md)<br>View with SwipeRefreshLayoutActions and SwipeRefreshLayoutAssertions |
| [KSwipeView](../-k-swipe-view/index.md) | `class KSwipeView : `[`KBaseView`](./index.md)`<`[`KSwipeView`](../-k-swipe-view/index.md)`>, `[`SwipeableActions`](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)<br>View with SwipeableActions and BaseAssertions |
| [KSwitch](../../io.github.kakaocup.kakao.switch/-k-switch/index.md) | `class KSwitch : `[`KBaseView`](./index.md)`<`[`KSwitch`](../../io.github.kakaocup.kakao.switch/-k-switch/index.md)`>, `[`SwitchableActions`](../../io.github.kakaocup.kakao.switch/-switchable-actions/index.md)`, `[`TextViewAssertions`](../../io.github.kakaocup.kakao.text/-text-view-assertions/index.md)`, `[`CheckableAssertions`](../../io.github.kakaocup.kakao.check/-checkable-assertions/index.md)<br>View with SwitchableActions, CheckableAssertions and TextViewAssertions |
| [KTabLayout](../../io.github.kakaocup.kakao.tabs/-k-tab-layout/index.md) | `class KTabLayout : `[`KBaseView`](./index.md)`<`[`KTabLayout`](../../io.github.kakaocup.kakao.tabs/-k-tab-layout/index.md)`>, `[`TabLayoutActions`](../../io.github.kakaocup.kakao.tabs/-tab-layout-actions/index.md)`, `[`TabLayoutAssertions`](../../io.github.kakaocup.kakao.tabs/-tab-layout-assertions/index.md)<br>View with TabLayoutActions and TabLayoutAssertions |
| [KTextInputLayout](../../io.github.kakaocup.kakao.edit/-k-text-input-layout/index.md) | `class KTextInputLayout : `[`KBaseView`](./index.md)`<`[`KTextInputLayout`](../../io.github.kakaocup.kakao.edit/-k-text-input-layout/index.md)`>, `[`TextInputLayoutAssertions`](../../io.github.kakaocup.kakao.edit/-text-input-layout-assertions/index.md)<br>View with TextInputLayoutAssertions |
| [KTextView](../../io.github.kakaocup.kakao.text/-k-text-view/index.md) | `class KTextView : `[`KBaseView`](./index.md)`<`[`KTextView`](../../io.github.kakaocup.kakao.text/-k-text-view/index.md)`>, `[`TextViewActions`](../../io.github.kakaocup.kakao.text/-text-view-actions/index.md)`, `[`TextViewAssertions`](../../io.github.kakaocup.kakao.text/-text-view-assertions/index.md)<br>View with BaseActions and TextViewAssertions |
| [KTimePicker](../../io.github.kakaocup.kakao.picker.time/-k-time-picker/index.md) | `class KTimePicker : `[`KBaseView`](./index.md)`<`[`KTimePicker`](../../io.github.kakaocup.kakao.picker.time/-k-time-picker/index.md)`>, `[`TimePickerAction`](../../io.github.kakaocup.kakao.picker.time/-time-picker-action/index.md)`, `[`TimePickerAssertion`](../../io.github.kakaocup.kakao.picker.time/-time-picker-assertion/index.md)<br>View for interact with default time picker |
| [KTimePickerDialog](../../io.github.kakaocup.kakao.picker.time/-k-time-picker-dialog/index.md) | `class KTimePickerDialog : `[`KBaseView`](./index.md)`<`[`KTimePickerDialog`](../../io.github.kakaocup.kakao.picker.time/-k-time-picker-dialog/index.md)`>`<br>View for interact with default date picker dialog |
| [KToolbar](../../io.github.kakaocup.kakao.toolbar/-k-toolbar/index.md) | `class KToolbar : `[`KBaseView`](./index.md)`<`[`KToolbar`](../../io.github.kakaocup.kakao.toolbar/-k-toolbar/index.md)`>, `[`ToolbarViewActions`](../../io.github.kakaocup.kakao.toolbar/-toolbar-view-actions.md)`, `[`ToolbarViewAssertions`](../../io.github.kakaocup.kakao.toolbar/-toolbar-view-assertions/index.md)<br>View for acting and asserting on Toolbar |
| [KView](../-k-view/index.md) | `class KView : `[`KBaseView`](./index.md)`<`[`KView`](../-k-view/index.md)`>`<br>Simple view with BaseActions and BaseAssertions |
| [KViewPager](../../io.github.kakaocup.kakao.pager/-k-view-pager/index.md) | `class KViewPager : `[`KBaseView`](./index.md)`<`[`KViewPager`](../../io.github.kakaocup.kakao.pager/-k-view-pager/index.md)`>, `[`SwipeableActions`](../../io.github.kakaocup.kakao.common.actions/-swipeable-actions/index.md)`, `[`ViewPagerAssertions`](../../io.github.kakaocup.kakao.pager/-view-pager-assertions/index.md)<br>View with SwipeableActions and ViewPagerAssertions |