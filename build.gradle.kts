import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    id("org.jetbrains.kotlin.jvm").version("1.5.31")
    id("application")
    id("com.github.johnrengelman.shadow").version("7.1.0")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.22")
    testImplementation("io.mockk:mockk:1.10.0")

    implementation(platform("org.http4k:http4k-bom:4.14.1.1"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k:http4k-server-jetty")
    implementation("org.http4k:http4k-contract")
    implementation("org.http4k:http4k-format-jackson")
}


tasks.withType<Test> {
    useJUnitPlatform {
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("io.github.aworley1.boiler_controller.HelloWorldKt")
}

