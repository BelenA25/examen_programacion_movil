plugins {
    alias(libs.plugins.kapt)
    alias(libs.plugins.ucb.android.library)
}


android {
    namespace = "com.example.network"
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.moshi)
    implementation(libs.converter.moshi)
    kapt(libs.moshi.kapt)
}


kapt {
    correctErrorTypes = true
}
