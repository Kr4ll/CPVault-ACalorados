class Node{
  public int data;
  public Node next = null;
  
  public static int getNth(Node n, int index) throws Exception {
    int data = Integer.MIN_VALUE;
    int counter = 0;
    while (n != null){
      if (counter == index){
        data = n.data;
        break;
      }
      counter++;
      n = n.next;
    }
    if (data == Integer.MIN_VALUE)
      throw new Exception();
    return data;
  }
}
