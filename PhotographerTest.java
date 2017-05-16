import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;
 

  @Before 
  public void before() {
    photographer = new Photographer("Jane");
    digitalCamera = new DigitalCamera();
    analogCamera = new AnalogCamera();
  }

 @Test
 public void getName(){
   assertEquals("Jane", photographer.getName());
 } 

 @Test
 public void cameraStoreIsEmpty(){
   assertEquals(0, photographer.cameraCount());
 }
 @Test
 public void addDigitalCameraToCameraStore() {
  photographer.addCamera(digitalCamera);
  assertEquals(1,photographer.cameraCount());
 }

 @Test
 public void addAnalogCameraToCameraStore() {
  photographer.addCamera(analogCamera);
  assertEquals(1,photographer.cameraCount());
 }
 @Test
 public void addTwoCamerasToCameraStore() {
  photographer.addCamera(analogCamera);
  photographer.addCamera(digitalCamera);
  assertEquals(2,photographer.cameraCount());

 }
 @Test
 public void removeAllCamerasFromCameraStore() {
  photographer.addCamera(analogCamera);
  photographer.addCamera(digitalCamera);
  photographer.removeAllCameras();
  assertEquals(0,photographer.cameraCount());
 }
 @Test
 public void removeAnalogCameraFromCameraStore() {
  photographer.addCamera(analogCamera);
  photographer.addCamera(digitalCamera);
  photographer.removeCamera(analogCamera);
  assertEquals(1,photographer.cameraCount());
 }
 @Test
 public void showAllCameraDetails() {
  photographer.addCamera(analogCamera);
  String cameraString = photographer.allCameraDetails();
  assertEquals("Sony ILCE5100L, No noise reduciton, Lo-resolution", cameraString);
 }
}