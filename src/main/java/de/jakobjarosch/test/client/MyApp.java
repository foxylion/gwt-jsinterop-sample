package de.jakobjarosch.test.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name = "MyApp")
public class MyApp {
    public static void click() {
        Window.alert("Hello, I'm GWT JsInterop!\nThanks for clicking.");
    }
}
