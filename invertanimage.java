import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class invertanimage extends JavaKaraProgram {
    private void NavchAwahTawih(){
      if (kara.onLeaf()){
          kara.removeLeaf();
      }else{
          kara.putLeaf();
  }
  kara.move();
    }
  private void YwaadZuun(){
      if (kara.onLeaf()){
          kara.removeLeaf();
      }else{
          kara.putLeaf();
  }
      kara.turnLeft();
      kara.move();
      kara.turnLeft();
  }
  private void YwaadBaruun(){
        if (kara.onLeaf()){
          kara.removeLeaf();
      }else{
          kara.putLeaf();
  }
      kara.turnRight();
      kara.move();
      kara.turnRight();
  }
  public void myProgram() {
    // put your main program here, for example:
   while (!kara.treeFront() && !kara.treeRight()) {
            NavchAwahTawih(); 
    while (kara.treeLeft() && !kara.treeFront() && !kara.treeRight()) {
            NavchAwahTawih();
      while(kara.treeFront() && kara.treeLeft()){
             YwaadBaruun();      
         }
      }
   while (!kara.treeFront() && !kara.treeRight()) {
           NavchAwahTawih();
            if(kara.treeFront()){
             YwaadZuun();
            while (!kara.treeFront() && !kara.treeRight()) {
                NavchAwahTawih(); 
             if((kara.treeFront())){
                 YwaadBaruun();
             while (!kara.treeFront() && !kara.treeRight()) {
                 NavchAwahTawih();
            if(kara.treeFront() && !kara.treeRight()){
                 YwaadZuun();
            while (!kara.treeFront() && !kara.treeRight()) {
                NavchAwahTawih(); 
            if(kara.treeFront() && !kara.treeRight()){
                YwaadBaruun();
             while (!kara.treeFront() && !kara.treeRight()) {
                 NavchAwahTawih();
            if(kara.treeFront() && !kara.treeRight()){
                 YwaadZuun();
}}}}}}}}}}}
    if(kara.treeLeft() && kara.treeRight() && kara.treeFront()){
    if(kara.onLeaf()){
        kara.removeLeaf(); 
       }else{
           kara.putLeaf();
       }
    }
      while(kara.treeRight() && !kara.treeFront()){
      NavchAwahTawih();
      }  
      if(kara.treeFront()&&kara.treeRight() && !kara.treeLeft()){
            if(kara.onLeaf()){
        kara.removeLeaf(); 
       }else{
           kara.putLeaf();
       }     
    }
  }
}
        