# Logger
A logger which contains stack element and other thread information

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
    implementation 'com.danielworld:logger:1.0.5'
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

## License
Logger is licensed under the Apache License, Version 2.0.
See [LICENSE](LICENSE.txt) for full license text.

```
Copyright (c) 2019 DanielWorld.
@Author Namgyu Park

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```