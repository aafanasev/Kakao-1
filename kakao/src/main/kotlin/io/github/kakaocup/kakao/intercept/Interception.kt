package io.github.kakaocup.kakao.intercept

data class Interception<T>(val isOverride: Boolean, val interceptor: T)
