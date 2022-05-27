package list;

/**
 * 英雄列表
 */
public class HeroList {
    //头节点
    private HeroNode head = new HeroNode(0, "", 0d);

    /**
     * 在列表的末端添加英雄节点
     *
     * 如果节点的next为null，就说明是最后一个节点，因为他没有next了
     *
     * @param heroNode
     */
    public void addHead(HeroNode heroNode){
        // 使用一个临时的temp先保存头节点
        HeroNode temp = head;

        //一直在找，找到最后一个节点
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = heroNode;
    }

    public void print(HeroList list){
        HeroNode head = list.head;
        while(head.next != null){
            System.out.println(head.name);
            head = head.next;
        }
    }
}
