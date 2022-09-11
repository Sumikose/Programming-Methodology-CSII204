import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class pacman extends JavaKaraProgram {
  private void zuun(){
 kara.turnLeft();
 kara.turnLeft();
 kara.move();
  }
  public void myProgram() {
      kara.removeLeaf();
      while(!kara.treeFront()){
          kara.move();
          if(!kara.onLeaf()){
              zuun();
              kara.turnRight();
              kara.move();
              if(!kara.onLeaf()){
                  zuun();
                  kara.move();
              }
          }
          kara.removeLeaf();
      }
  }
}