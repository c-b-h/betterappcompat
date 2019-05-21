package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.widget.TextViewCompat;

public class AppCompatTextHelperProxy {
    @NonNull
    private final AppCompatTextHelper appCompatTextHelper;

    public AppCompatTextHelperProxy(@NonNull TextView textView) {
        this.appCompatTextHelper = new AppCompatTextHelper(textView);
    }

    public void loadFromAttributes(AttributeSet attrs, int defStyleAttr) {
        appCompatTextHelper.loadFromAttributes(attrs, defStyleAttr);
    }

    public void applyCompoundDrawablesTints() {
        appCompatTextHelper.applyCompoundDrawablesTints();
    }

    public void onSetTextAppearance(Context context, int resId) {
        appCompatTextHelper.onSetTextAppearance(context, resId);
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        appCompatTextHelper.onLayout(changed, left, top, right, bottom);
    }

    public void setTextSize(int unit, float size) {
        appCompatTextHelper.setTextSize(unit, size);
    }

    public void autoSizeText() {
        appCompatTextHelper.autoSizeText();
    }

    public boolean isAutoSizeEnabled() {
        return appCompatTextHelper.isAutoSizeEnabled();
    }

    public void setAutoSizeTextTypeWithDefaults(@TextViewCompat.AutoSizeTextType int autoSizeTextType) {
        appCompatTextHelper.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(
            int autoSizeMinTextSize,
            int autoSizeMaxTextSize,
            int autoSizeStepGranularity,
            int unit) throws IllegalArgumentException {
        appCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(
                autoSizeMinTextSize,
                autoSizeMaxTextSize,
                autoSizeStepGranularity,
                unit);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] presetSizes, int unit)
            throws IllegalArgumentException {
        appCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
    }

    public int getAutoSizeTextType() {
        return appCompatTextHelper.getAutoSizeTextType();
    }

    public int getAutoSizeStepGranularity() {
        return appCompatTextHelper.getAutoSizeStepGranularity();
    }

    public int getAutoSizeMinTextSize() {
        return appCompatTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeMaxTextSize() {
        return appCompatTextHelper.getAutoSizeMaxTextSize();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return appCompatTextHelper.getAutoSizeTextAvailableSizes();
    }
}
