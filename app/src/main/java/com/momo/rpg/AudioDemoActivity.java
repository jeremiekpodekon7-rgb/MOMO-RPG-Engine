package com.momo.rpg;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.momo.rpg.audio.SynthAudioEngine;

public class AudioDemoActivity extends AppCompatActivity {
    private SynthAudioEngine synthAudioEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        synthAudioEngine = new SynthAudioEngine();
        synthAudioEngine.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (synthAudioEngine != null) {
            synthAudioEngine.stop();
        }
    }
}
