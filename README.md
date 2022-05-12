# ActionBar API
[![Maven Central](https://img.shields.io/maven-central/v/io.github.invvk/actionbar-api.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.invvk%22%20AND%20a:%22actionbar-api%22)
[![CI](https://github.com/Invvk/actionbar-api/actions/workflows/ci.yml/badge.svg)](https://github.com/Invvk/actionbar-api/actions/workflows/ci.yml)

a simple action bar api supports the following versions:

| Version                | Support            |
|------------------------|--------------------|
| 1.18.2                 | :heavy_check_mark: |
| 1.17.1                 | :heavy_check_mark: |
| 1.16.5                 | :heavy_check_mark: |
| 1.12.2                 | :heavy_check_mark: |
| 1.8.8                  | :heavy_check_mark: |
| 1.15.x, 1.14.x, 1.13.x | :x:                |

## Add to your dependency

in your maven project, add this to `pom.xml`:
```xml
<dependency>
    <groupId>io.github.invvk</groupId>
    <artifactId>actionbar-api</artifactId>
    <version>{VERSION HERE}</version>
    <scope>compile</scope>
</dependency>
```

or if you are using gradle, add this to your `build.gradle`:
```groovy
implementation 'io.github.invvk:actionbar-api:{VERSION HERE}'
```

# Usage
The usage of this class is pretty simple. through the class `ActionBarAPI` you have 3 different methods:
 - sendAll(Message)
 - send(Player, Message)
 - send(Player, Message, Duration, plugin)

and that's it!

# License
This project falls under the [MIT License](https://github.com/Invvk/ActionBar-API/blob/main/LICENSE)