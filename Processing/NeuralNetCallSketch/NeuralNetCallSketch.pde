Main test;
void setup() {
  callNeuralNet("/Users/rohit/Documents/Processing/NeuralNetSketch/application.macosx64/NNImg.png");
}
void callNeuralNet(String path) {
  String[] arg = {path};
   try {
     test.main(arg);
   } catch (IOException e) {
     print("failed");
   }
   String[] line = loadStrings("/Users/rohit/Documents/Processing/NeuralNetCallSketch/application.macosx/data/sexData.txt");
   print(line[0]);
   exit();
}
