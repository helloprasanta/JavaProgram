package com.prasanta;

public class EditorPaneLoad extends JFrame{

public EditorPaneLoad() throws Exception{

    FileReader reader = new FileReader("a.html");
    JEditorPane editor = new JEditorPane();
    JTextPane editor = new JTextPane();
    editor.setContentType( "text/html" );
    editor.setEditable( false );
    editor.read(reader, null);
    //System.out.println(editor.getText());
    //System.out.println("\n------------\n");
    Document doc = editor.getDocument();
    // System.out.println(doc.getText(0, doc.getLength()));
    JScrollPane scrollPane = new JScrollPane( editor );
    scrollPane.setPreferredSize( new Dimension(300, 200) );
    getContentPane().add( scrollPane );
}

public static void main(String[] args)
    throws Exception
{
    EditorPaneLoad frame = new EditorPaneLoad();
    frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
    frame.pack();
    frame.setLocationRelativeTo( null );
    frame.setVisible(true);
}
}