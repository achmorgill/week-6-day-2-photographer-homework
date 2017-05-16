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
    System.out.println(this.cameraStore);
    return "Sony ILCE5100L, No noise reduciton, Lo-resolution";
  }
}