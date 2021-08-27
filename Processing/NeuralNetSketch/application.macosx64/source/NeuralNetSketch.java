import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.video.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class NeuralNetSketch extends PApplet {


Main test;
screenshotTest test1;
Boolean photoTaken = false;
Boolean need_to_delay = true;
int counter = 200;
int pics_taken = 0;
public void setup(){
     

  String[] cameras = Capture.list();
  
  if (cameras.length == 0) {
    println("There are no cameras available for capture.");
    exit();
  } else {
    println("Available cameras:");
    for (int i = 0; i < cameras.length; i++) {
      println(cameras[i]);
    }
    
    // The camera can be initialized directly using an 
    // element from the array returned by list():
    cam = new Capture(this, cameras[0]);
    cam.start(); 
  }   
  
}

Capture cam;

public void draw() {
  
  if (cam.available()) {
    cam.read();
  }
  set(0, 0, cam);
  takePic();
  if (photoTaken == false) {
    photoTaken = true;
  }

  counter--;
  if (counter <= 0) {
    exit();
  }
}

public void takePic() {
  /* if (pics_taken == 1) {
    exit();
  } */
  saveFrame("NNImg.png");
 // pics_taken++;
  return;
}

/*void setup() {
  size(640, 480);

  String[] cameras = Capture.list();
  
  if (cameras.length == 0) {
    println("There are no cameras available for capture.");
    exit();
  } else {
    println("Available cameras:");
    for (int i = 0; i < cameras.length; i++) {
      println(cameras[i]);
    }
    
    // The camera can be initialized directly using an 
    // element from the array returned by list():
    cam = new Capture(this, cameras[0]);
    cam.start();     
  }      
}*/

public void callNeuralNet(String path) {
  String[] arg = {path};
   try {
     test.main(arg);
   } catch (IOException e) {
     print("failed");
   }
   String[] line = loadStrings("../../../../sexData.txt");
   print(line[0]);
  
}
  public void settings() {  size(640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "NeuralNetSketch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
