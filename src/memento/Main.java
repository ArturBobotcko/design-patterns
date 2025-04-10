package memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        // Set editor's content and save a snapshot
        editor.setContent("a");
        history.push(editor.createState());

        // Set editor's content and save a snapshot
        editor.setContent("b");
        history.push(editor.createState());

        // Set editor's content
        editor.setContent("c");

        // Undo
        editor.restore(history.pop());

        // output: b
        System.out.println(editor.getContent());
    }
}
