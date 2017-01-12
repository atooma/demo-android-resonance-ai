package com.resonance_ai.sdk.sampleapp;

import android.app.Application;

import com.resonance_ai.engine.internals.ResonanceAI;

public class SampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ResonanceAI.init(this);
    }
}
