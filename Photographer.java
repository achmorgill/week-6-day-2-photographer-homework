import java.util.*;

public class Photographer {

  private String name;

  private ArrayList<Printable> cameraStore;

  public Photographer(String name){
    this.name = name;
    
    this.cameraStore = new ArrayList<Printable>();
  }

  public String getName(){
    return this.name;
  }

  public int cameraCount() {
    return cameraStore.size();
  }

  public void addCamera(Printable camera)  {
    this.cameraStore.add(camera);
  }

  public void removeAllCameras() {
    this.cameraStore.clear();
  }

  public void removeCamera(Printable camera) {
    this.cameraStore.remove(camera);
    System.out.println(camera);
  }

  public String allCameraDetails() {
    String cameraDetails = "Sony ILCE5100L, No noise reduciton, Lo-resolution";

    for (int i=0; i<this.cameraStore.size(); i++) {
     Printable camera = this.cameraStore.get(i);
     cameraDetails = camera.printDetails() + "\n";
     System.out.println(i);
     System.out.println(camera);
     System.out.println(cameraDetails);
   }
   return cameraDetails;
 }

}