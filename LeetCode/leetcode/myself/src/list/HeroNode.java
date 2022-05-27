package list;

public class HeroNode {
    public int id;
    public String name;
    //武力值
    public Double force;

    public HeroNode next;

    public HeroNode(int id, String name, Double force){
        this.id = id;
        this.name = name;
        this.force = force;
    }
}
