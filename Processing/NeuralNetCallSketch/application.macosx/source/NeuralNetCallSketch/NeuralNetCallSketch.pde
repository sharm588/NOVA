Main test;
void setup() {
  callNeuralNet("../../../../Processing/NeuralNetSketch/application.macosx64/NNImg.png");
}
void callNeuralNet(String path) {
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
