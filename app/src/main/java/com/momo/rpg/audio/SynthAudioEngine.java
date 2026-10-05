package com.momo.rpg.audio;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;

public class SynthAudioEngine {
    private AudioTrack audioTrack;
    private boolean playing;

    public void start() {
        int sampleRate = 22050;
        int bufferSize = AudioTrack.getMinBufferSize(sampleRate, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
        audioTrack = new AudioTrack(
                AudioManager.STREAM_MUSIC,
                sampleRate,
                AudioFormat.CHANNEL_OUT_MONO,
                AudioFormat.ENCODING_PCM_16BIT,
                bufferSize,
                AudioTrack.MODE_STREAM
        );

        audioTrack.play();
        playing = true;

        new Thread(() -> {
            short[] buffer = new short[2048];
            double phase = 0;
            while (playing) {
                for (int i = 0; i < buffer.length; i++) {
                    double wave = Math.sin(phase) * 2000;
                    buffer[i] = (short) wave;
                    phase += 0.18;
                }
                audioTrack.write(buffer, 0, buffer.length);
            }
        }).start();
    }

    public void stop() {
        playing = false;
        if (audioTrack != null) {
            audioTrack.stop();
            audioTrack.release();
            audioTrack = null;
        }
    }
}
