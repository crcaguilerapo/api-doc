plugins {
    id("java")
}

group = "org.crcaguilerapo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.swagger.core.v3:swagger-annotations:2.2.22")
    implementation("io.swagger.core.v3:swagger-models:2.2.22")
    implementation("io.swagger.core.v3:swagger-jaxrs2-jakarta:2.2.22")
    implementation("io.swagger.core.v3:swagger-integration:2.2.22")
    implementation("jakarta.ws.rs:jakarta.ws.rs-api:4.0.0")
    implementation("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")


    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}