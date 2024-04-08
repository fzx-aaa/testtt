// iService.aidl
package com.example.aidltest;

// Declare any non-default types here with import statements

interface iService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    int getPid();
    com.example.aidltest.MyData getMyData();
}