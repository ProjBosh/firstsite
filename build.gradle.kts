plugins {
    java
    // Обновите до 3.3.x или выше (лучшая совместимость с Gradle 8/9)
    id("org.springframework.boot") version "3.3.0"
    // ОБЯЗАТЕЛЬНО: версия 1.1.5 или выше, где удален вызов старого метода
    id("io.spring.dependency-management") version "1.1.5"
}


group = "com.example"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


repositories {
    mavenCentral()
}

dependencies {
    // Зависимости для Thymeleaf во frontend
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    // Зависимости для запуска сайта
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}