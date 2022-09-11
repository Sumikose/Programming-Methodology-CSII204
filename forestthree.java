import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class forestthree extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    while (!kara.onLeaf()) {
        if (!kara.treeFront() && kara.treeLeft() && kara.treeRight())
            kara.move();
        if (kara.treeFront() && !kara.treeLeft() && kara.treeRight())
            kara.turnLeft();
        if (!kara.treeFront() && !kara.treeLeft() && kara.treeRight())
            kara.move();  
        if (!kara.treeFront() && kara.treeLeft() && !kara.treeRight())
            kara.move(); 
        if (kara.treeFront() && kara.treeLeft() && !kara.treeRight())
            kara.turnRight(); 
    }
  }
}