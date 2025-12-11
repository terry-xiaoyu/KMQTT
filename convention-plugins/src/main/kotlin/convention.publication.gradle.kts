plugins {
    id("com.vanniktech.maven.publish")
}

mavenPublishing {
  publishToMavenCentral(automaticRelease = true)
  signAllPublications()

  coordinates("io.github.terry-xiaoyu", project.name, "1.0.0.4")

  pom {
    name.set("KMQTT")
    description.set("A Kotlin Multiplatform MQTT library")
    inceptionYear.set("2025")
    url.set("https://github.com/terry-xiaoyu/kmqtt/")
    licenses {
      license {
        name.set("The Apache License, Version 2.0")
        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
        distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
      }
    }
    developers {
      developer {
        id.set("terry-xiaoyu")
        name.set("Shawn")
        url.set("https://github.com/terry-xiaoyu/")
      }
    }
    scm {
      url.set("https://github.com/terry-xiaoyu/kmqtt/")
      connection.set("scm:git:git://github.com/terry-xiaoyu/kmqtt.git")
      developerConnection.set("scm:git:ssh://git@github.com/terry-xiaoyu/kmqtt.git")
    }
  }
}
