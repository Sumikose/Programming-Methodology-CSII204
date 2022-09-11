import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class foresttwo extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  void followTrees() {
      while (kara.treeRight()) {
          kara.move();
      }
  }
  public void myProgram() {
    // put your main program here, for example:
    while (!kara.onLeaf()) {
        if (kara.treeFront()) {
            kara.turnLeft();
            kara.move();
            kara.turnRight();
            kara.move();
            
            followTrees();
            
            kara.turnRight();
            kara.move();
            kara.turnLeft();
        }
        else {
            kara.move();
        }
    }
    kara.removeLeaf();
  }
}
            
            
            
            
            
                        
        