plugins {
	id("java")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("io.qtjambi:qtjambi:6.6.2")
	runtimeOnly("io.qtjambi:qtjambi-native-linux-x64:6.6.2")
}