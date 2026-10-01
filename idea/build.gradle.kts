plugins {
  id("java")
  id("org.jetbrains.intellij.platform") version "2.19.0"
}

group = "org.haokee"
version = "0.1.0"

repositories {
  mavenCentral()
  intellijPlatform {
    defaultRepositories()
  }
}

dependencies {
  intellijPlatform {
    intellijIdea("2026.2.3")
  }
}

intellijPlatform {
  pluginConfiguration {
    ideaVersion {
      sinceBuild = "242"
    }
  }
}
