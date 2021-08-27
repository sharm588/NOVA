#include <stdio.h>
int main() {
  int targ = 1 << 27 | 1 << 14 | 1 << 6;
  int test = 1 << 27 | 1 << 14| 1 << 6| 1 << -1;
  int hit = test ^ targ;
  hit = !hit;
  printf("%d, %d, %d\n", targ, test, hit);
}
