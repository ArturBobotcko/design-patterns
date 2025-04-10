package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    /**
     * Adds an editor state to a history (states list)
     */
    public void push(EditorState state) {
        states.add(state);
    }

    /**
     * Deletes a last editor state from the history
     */
    public EditorState pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
