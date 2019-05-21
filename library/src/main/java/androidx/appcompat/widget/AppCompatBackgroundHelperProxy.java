package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class AppCompatBackgroundHelperProxy {
    private final AppCompatBackgroundHelper appCompatBackgroundHelper;

    public AppCompatBackgroundHelperProxy(View view) {
        this.appCompatBackgroundHelper = new AppCompatBackgroundHelper(view);
    }

    public void loadFromAttributes(AttributeSet attrs, int defStyleAttr) {
        appCompatBackgroundHelper.loadFromAttributes(attrs, defStyleAttr);
    }

    public void onSetBackgroundResource(int resId) {
        appCompatBackgroundHelper.onSetBackgroundResource(resId);
    }

    public void onSetBackgroundDrawable(Drawable background) {
        appCompatBackgroundHelper.onSetBackgroundDrawable(background);
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        appCompatBackgroundHelper.setSupportBackgroundTintList(tint);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return appCompatBackgroundHelper.getSupportBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        appCompatBackgroundHelper.setSupportBackgroundTintMode(tintMode);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return appCompatBackgroundHelper.getSupportBackgroundTintMode();
    }

    public void applySupportBackgroundTint() {
        appCompatBackgroundHelper.applySupportBackgroundTint();
    }
}
