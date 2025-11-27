# QuPath extension to support opening files from a Slide Score server

This is a plugin for the image analysis software [QuPath](https://qupath.github.io) (v0.6.0+). It allows directly opening images that are stored in the digital pathology slide management software [Slide Score](https://www.slidescore.com), downloading annotations from there, uploading annotations and detections back and working with TMAs.

# Installation

Download the latest `qupath-extension-slidescore-[version].zip` file from [releases](https://github.com/SlideScore/qupath-extension-slidescore/releases) and unzip it into your `extensions` directory. 

# Building

Clone this repo into the qupath 0.6.0 repo and add to ``settings.gradle.kts``:

* `include("qupath-extension-slidescore")` below `include("qupath-extension-openslide")`
* `mavenCentral()` below `maven("https://maven.scijava.org/content/groups/public/")`
