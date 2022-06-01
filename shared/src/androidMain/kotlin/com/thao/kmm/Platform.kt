package com.thao.kmm

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual class Country actual constructor() {
    actual val countryName: String
        get() = "Viet Nam"
}