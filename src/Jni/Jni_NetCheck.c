#include <jni.h>
#include "Jni_NetCheck.h"   // <— headerul generat de javac -h

// Exemplu minimal: întoarce JNI_TRUE ca să confirmăm că totul e legat corect.
JNIEXPORT jboolean JNICALL Java_Jni_1NetCheck_checkConnection
  (JNIEnv *env, jclass clazz, jstring url, jint flags) {
    return JNI_TRUE;
}
