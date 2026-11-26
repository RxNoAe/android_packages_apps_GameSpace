package com.android.compose.animation.scene

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerInputChange
import com.android.compose.animation.scene.content.state.TransitionState
import kotlinx.coroutines.CoroutineScope

/** Compile-time stand-ins for AOSP's compose scene-transition library.
 *  This module is compileOnly, so none of it is packaged into the APK. */

class SceneKey(val name: String)
class ElementKey(val name: String)

class InterruptionResult(
    val animateFrom: SceneKey,
    val chain: Boolean = false,
)

fun interface InterruptionHandler {
    fun onInterruption(
        interrupted: TransitionState.Transition.ChangeScene,
        newTargetScene: SceneKey,
    ): InterruptionResult
}

class TransitionSpec {
    var spec: AnimationSpec<Float>? = null
    fun fractionRange(start: Float = 0f, end: Float = 1f, block: () -> Unit) {
    }
    fun fade(element: ElementKey) {
    }
}

class SceneTransitions {
    var interruptionHandler: InterruptionHandler? = null
    fun from(from: SceneKey, to: SceneKey, block: TransitionSpec.() -> Unit) {
    }
}

fun transitions(block: SceneTransitions.() -> Unit): SceneTransitions =
    SceneTransitions().apply(block)

fun Modifier.element(element: ElementKey): Modifier = this

fun interface SwipeDetector {
    fun detectSwipe(change: PointerInputChange): Boolean
}

class MutableSceneTransitionLayoutState {
    fun setTargetScene(scene: SceneKey, scope: CoroutineScope) {
    }
}

@Composable
fun rememberMutableSceneTransitionLayoutState(
    initialScene: SceneKey,
    transitions: SceneTransitions,
): MutableSceneTransitionLayoutState = remember { MutableSceneTransitionLayoutState() }

class SceneTransitionLayoutScope {
    fun scene(key: SceneKey, content: @Composable () -> Unit) {
    }
}

@Composable
fun SceneTransitionLayout(
    state: MutableSceneTransitionLayoutState,
    swipeDetector: SwipeDetector? = null,
    content: @Composable SceneTransitionLayoutScope.() -> Unit,
) {
}
