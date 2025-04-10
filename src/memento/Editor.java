package memento;

public class Editor {
    private String content;

    /**
     * Creates a snapshot of current state of the editor
     */
    public EditorState createState() {
        return new EditorState(content);
    }

    /**
     * Restores a content from provided state
     */
    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
