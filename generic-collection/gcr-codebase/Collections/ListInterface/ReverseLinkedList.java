import java.util.LinkedList;
public class ReverseLinkedList{
    public static void reverseLinkedList(LinkedList<Integer> list){
        LinkedList<Integer> reversedList = new LinkedList<>();
        for(int i = list.size() - 1;i>=0;i--){
            reversedList.add(list.get(i));
        }  
            
            list.clear();
            list.addAll(reversedList);
        
    }
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		reverseLinkedList(list);
		System.out.println(list);
	}
}
