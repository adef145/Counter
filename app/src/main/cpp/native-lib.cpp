#include <jni.h>
#include "Counter.h"

Counter *counter = new Counter();

extern "C"
JNIEXPORT jint JNICALL
Java_com_adefruandta_counter_MainActivity_count(JNIEnv *env, jobject instance) {
    return counter->count();
}