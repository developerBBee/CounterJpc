package jp.developer.bbee.counterjpc

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

/**
 * CountViewModel is holding count state
 */
class CountViewModel : ViewModel() {

    /**
     * holding number of count
     */
    private val _count: MutableState<Int> = mutableStateOf(0)
    val count: State<Int> = _count

    /**
     * This function called on button tap counts up the number
     *
     * [count] + 1 and update view
     */
    fun onCountUpTapped() {
        val currentValue = requireNotNull(count.value)
        _count.value = currentValue + 1
    }
}