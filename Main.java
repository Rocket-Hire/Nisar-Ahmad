// Task # 1
// You have to write a function which takes an array of integers "seq" and an integer "target". There exist two elements of the array whose sum is equal to the target. You can assume that there exists only one solution. You have to return the indices of those elements
// [1,9,2,19]  Target = 3, Answer = 0,2

// [2,4]  Target = 6, Answer =0,1

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }


  private String getTargetIndices(List<Integer> items, int target){
    //[1,9,2,19] = 3
    //[1,2,9,19]
    //[1,2]
    //3-1 = 2
    //2 = 1,
    // -1
    //

    int itemCount = 0;
    int index = -1
    while(index == -1){
      int number = items.get(count);
      int nextNumber = target - number;
       index = items.indexof(nextNumber);
      if(index = -1){
        itemCount++;
      }
      
    }
    return itemCount+","+ index;
  }
}