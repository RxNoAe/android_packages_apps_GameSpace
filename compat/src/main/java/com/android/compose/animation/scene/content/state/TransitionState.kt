package com.android.compose.animation.scene.content.state

import com.android.compose.animation.scene.SceneKey

/** Compile-time stand-in for AOSP's TransitionState. */
sealed interface TransitionState {
    sealed interface Transition : TransitionState {
        class ChangeScene(val currentScene: SceneKey) : Transition
    }
}
