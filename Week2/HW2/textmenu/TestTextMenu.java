package textmenu;

/**
 * 
 * Reference: <a href="https://www.java-forums.org/new-java/26584-menu-driven-console-help-please.html">A Simple Text-Based Menu System
</a>
 * @author JosAH
 */
public class TestTextMenu {
    
    private static TextMenuItem item1= new TextMenuItem("item 1",new Runnable() {
        public void run() {
            System.out.println("running item 1");
        }
    });
     
    private static TextMenuItem item2= new TextMenuItem("item 2",new Runnable() {
        public void run() {
            System.out.println("running item 2");
        }
    });
 
    private static TextMenuItem item3= new TextMenuItem("item 3",new Runnable() {
        public void run() {
            System.out.println("running item 3");
        }
    });
 
    private static TextMenu nestedMenu= new TextMenu("nested menu", true, false, item2, item3);
    private static TextMenu topMenu= new TextMenu("top menu", false, true, item1, nestedMenu);
 
    public static void main(String[] args) {
         
        topMenu.run();
    }
}
