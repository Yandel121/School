public class Poem {
    protected String title;
    protected int lines;
    public Poem(){
        this.title=title;
        this.lines=lines;
    }
    public String getTitle(){
        return title;
    }
    public int getLines(){
        return lines;
    }
    public void printPoem(){
        System.out.println("Title: "+this.getTitle());
        System.out.println("Lines: "+this.getLines());
    }
}
