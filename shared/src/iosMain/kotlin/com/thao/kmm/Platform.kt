package com.thao.kmm

import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual class Country actual constructor() {
    actual val countryName: String
        get() = "Singapore"
}