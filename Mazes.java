import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class Mazes extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
     while (!kara.onLeaf()) {
         if (!kara.treeFront() &&  kara.treeLeft() &&  kara.treeRight()  && !kara.onLeaf()){
          kara.move();
          }
           if (!kara.treeFront() &&  !kara.treeLeft() &&  kara.treeRight()  && !kara.onLeaf()){
          kara.turnLeft();
          kara.move();
          }
           if (kara.treeFront() &&  !kara.treeLeft() &&  !kara.treeRight() && !kara.onLeaf()){
          kara.turnLeft();
          kara.move();
          }
           if (kara.treeFront() &&  !kara.treeLeft() &&  kara.treeRight()  && !kara.onLeaf()){
          kara.turnLeft();
          kara.move();
          }
           if (kara.treeFront() &&  kara.treeLeft() &&  !kara.treeRight()  && !kara.onLeaf()){
          kara.turnRight();
          kara.move();
           }
            if (kara.treeFront() &&  kara.treeLeft() &&  kara.treeRight()  && !kara.onLeaf()){
          kara.turnLeft();
          kara.turnLeft();
          
          }
           if (!kara.treeFront() &&  kara.treeLeft() &&  !kara.treeRight()  && !kara.onLeaf()){
          kara.move();
           }
     }
  }
}
        