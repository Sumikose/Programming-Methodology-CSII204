import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class followtree extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
   kara.move();    
  while(!kara.treeFront() && kara.treeRight()){
      kara.move();
      while(!kara.treeFront() && !kara.treeRight()){
          kara.turnRight();
          kara.move();
      if (kara.treeFront()&&kara.treeRight()){
      kara.turnLeft();
      }
      }
        if (kara.treeFront() && kara.treeRight()){
      kara.turnLeft();
        }
        if (kara.treeFront() && kara.treeRight()){
      kara.turnLeft();
        }
      }
}
}

        