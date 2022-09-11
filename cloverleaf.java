import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class cloverleaf extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    while (!kara.treeFront()) {
        if (kara.onLeaf()) 
            kara.removeLeaf();
            else
            kara.putLeaf();
            
            kara.move();
        }
        if (kara.onLeaf()) 
            kara.removeLeaf();
            else
            kara.putLeaf();
  }
}
            
        
        
            
            
        
            