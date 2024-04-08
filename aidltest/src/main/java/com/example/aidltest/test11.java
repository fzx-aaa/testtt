package com.example.aidltest;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class test11 implements Parcelable {
    protected test11(Parcel in) {
    }

    public static final Creator<test11> CREATOR = new Creator<test11>() {
        @Override
        public test11 createFromParcel(Parcel in) {
            return new test11(in);
        }

        @Override
        public test11[] newArray(int size) {
            return new test11[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
    }
}
