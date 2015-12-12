package de.jakobjarosch.test.client;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name = "window", isNative = true)
public class Window {
    public static native void alert(String message);
}
