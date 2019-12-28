# Logger

A logger which contains stack element and other thread information

=======
## Gradle build
build.gradle
<pre>
buildscript {
    repositories {
        jcenter()
    }
}

dependencies {
    ...
    implementation 'com.danielworld:logger:1.0.3'
}
</pre>

## Result
thread name + file name + method name + line number
<pre>
2019-12-29 04:23:00.040 11444-11444/com.danielworld.logger.sample V/com.danielworld.logger.sample.MainActivity: (thread : main)[[MainActivity.kt>onCreate>#15]] Hello debug!
2019-12-29 04:23:00.040 11444-11444/com.danielworld.logger.sample V/com.danielworld.logger.sample.MainActivity: (thread : main)[[MainActivity.kt>onCreate>#16]] Hello info!
2019-12-29 04:23:00.040 11444-11444/com.danielworld.logger.sample V/com.danielworld.logger.sample.MainActivity: (thread : main)[[MainActivity.kt>onCreate>#17]] Hello verbose!
2019-12-29 04:23:00.040 11444-11444/com.danielworld.logger.sample V/com.danielworld.logger.sample.MainActivity: (thread : main)[[MainActivity.kt>onCreate>#18]] Hello warning!
2019-12-29 04:23:00.040 11444-11444/com.danielworld.logger.sample V/com.danielworld.logger.sample.MainActivity: (thread : main)[[MainActivity.kt>onCreate>#19]] Hello error!
</pre>
