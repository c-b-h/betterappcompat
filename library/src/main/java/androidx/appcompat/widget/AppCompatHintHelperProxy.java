package androidx.appcompat.widget;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class AppCompatHintHelperProxy {
    public static InputConnection onCreateInputConnection(InputConnection ic,
                                                   EditorInfo outAttrs,
                                                   View view) {
        return AppCompatHintHelper.onCreateInputConnection(ic, outAttrs, view);
    }
}
