package com.example.myapplication;
import android.webkit.JavascriptInterface;

import androidx.annotation.NonNull;

class JsObject {
    @NonNull
    @android.webkit.JavascriptInterface
    public String toString(){
        return  "injectedObject";
    }
}
