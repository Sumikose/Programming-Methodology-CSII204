import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class tunnelseeker extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    while (!(kara.treeLeft() && kara.treeRight())) {
      kara.move();
    }
    while (kara.treeLeft() && kara.treeRight())
    kara.move();
  }
}

        