package cz.csjug.example.d_spring

import org.springframework.stereotype.Service

@Service
class KotlinStateService {
    var state: State = State.StateA

    @JvmOverloads // it creates the overloaded version of function with default parameters for JVM
    fun changeState(state: State = State.StateB) {
        this.state = state
    }
}

enum class State {
    StateA,
    StateB
}