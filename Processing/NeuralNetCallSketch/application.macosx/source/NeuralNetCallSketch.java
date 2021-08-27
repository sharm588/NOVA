import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class NeuralNetCallSketch extends PApplet {

Main test;
public void setup() {
  callNeuralNet("../../../../Processing/NeuralNetSketch/application.macosx64/NNImg.png");
}
public void callNeuralNet(String path) {
  String[] arg = {path};
   try {
     test.main(arg);
   } catch (IOException e) {
     print("failed");
   }
   String[] line = loadStrings("../../../../sexData.txt");
   print(line[0]);
   exit();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "NeuralNetCallSketch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
