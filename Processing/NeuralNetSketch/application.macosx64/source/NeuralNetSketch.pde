import processing.video.*;
Main test;
screenshotTest test1;
Boolean photoTaken = false;
Boolean need_to_delay = true;
int counter = 200;
int pics_taken = 0;
void setup(){
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
  
}

Capture cam;

void draw() {
  
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

void takePic() {
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

void callNeuralNet(String path) {
  String[] arg = {path};
   try {
     test.main(arg);
   } catch (IOException e) {
     print("failed");
   }
   String[] line = loadStrings("../../../../sexData.txt");
   print(line[0]);
  
}
