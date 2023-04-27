package com.myapp;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;


public class TestModule extends ReactContextBaseJavaModule {

    @Override
    public String getName() {
        return "TestModule";
    }

    TestModule(ReactApplicationContext context) {
        super(context);
    }

    @ReactMethod
    public void createEvent(String name, String location) {
        Log.d("CalendarModule", "Create event called with name: " + name
                + " and location: " + location);
    }
}