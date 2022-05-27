package list;

import org.junit.Test;

public class listTest {

    @Test
    public void testAdd(){
        HeroList list = new HeroList();
        HeroNode heroNode = new HeroNode(1,"zhangsan", 0.1);

        list.addHead(heroNode);
        list.print(list);
    }
}
