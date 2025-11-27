import io.github.qupath.gradle.PlatformPlugin
import io.github.qupath.gradle.Utils

plugins {
    // Don't need extension-conventions because we don't require access to the UI
    id("qupath.common-conventions")
    id("qupath.javafx-conventions")
    id("qupath.publishing-conventions")
    `java-library`
}

extra["moduleName"] = "qupath.extension.slidescore"
base {
    archivesName = "qupath-extension-slidescore"
    description = "QuPath extension to support image reading using SlideScore."
}

val platform = Utils.currentPlatform()
dependencies {
    implementation(project(":qupath-core"))
    implementation(project(":qupath-gui-fx"))
    implementation(libs.jna)
    implementation(libs.qupath.fxtras)
}
