package state;

public class Canvas {
    // Field of current tool with an interface type (Tool)
    private Tool currentTool;

    /**
     * Calls mouseDown event on an interface object
     *
     * Implementation is specific and vary on what current tool object is (polymorphism)
     */
    public void mouseDown() {
        currentTool.mouseDown();
    }

    /**
     * Calls mouseUp event on an interface object
     *
     * Implementation is specific and vary on what current tool object is (polymorphism)
     */
    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
