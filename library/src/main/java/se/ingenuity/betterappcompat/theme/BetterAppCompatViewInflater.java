package se.ingenuity.betterappcompat.theme;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatRadioButton;

import se.ingenuity.betterappcompat.widget.BetterAppCompatRadioButton;

@Keep
public class BetterAppCompatViewInflater extends AppCompatViewInflater {
    public BetterAppCompatViewInflater() {}

    @NonNull
    @Override
    protected AppCompatRadioButton createRadioButton(Context context, AttributeSet attrs) {
        return new BetterAppCompatRadioButton(context, attrs);
    }
}