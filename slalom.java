import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class slalom extends JavaKaraProgram {
 private void BaruunErgeh(){
 kara.move();
            kara.turnRight();
            kara.move();
  }
  private void ZuunErgeh(){
            kara.move();
            kara.turnLeft();
            kara.move();
  }
  public void myProgram() {
      while(true){
        if(kara.treeLeft()){
            ZuunErgeh();
            ZuunErgeh();
        }
        if(kara.treeRight()){
            BaruunErgeh();
            BaruunErgeh();
        }
        
      }
      /*while(kara.treeLeft()){
      while(kara.treeLeft()){
        ZuunErgeh();
        if(kara.treeLeft()&&kara.treeRight()){
            BaruunErgeh();
        }
        if(kara.treeRight()){
            BaruunErgeh();
        }
     } 
     while(kara.treeRight()){
        BaruunErgeh();
        if(kara.treeLeft()&&kara.treeRight()){
            ZuunErgeh();
        }
        if(kara.treeLeft()){
            ZuunErgeh();
        }
        }
     }*/ 
  }
}
        