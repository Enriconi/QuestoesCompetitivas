#include <iostream>

using namespace std;

int main() {
  
  string a;

  int aux = 0, n;

  cin >> n;

  for (int j = 0; j < n; j++) {
    cin >> a;

    for (int i = 0; i < a.size(); i++) {
      if (a[i] == '1') {
        aux += 2;
      }
      else if (a[i] == '2' || a[i] == '3' || a[i] == '5') {
        aux += 5;
      }
      else if (a[i] == '4') {
        aux += 4;
      }
      else if (a[i] == '6' || a[i] == '0' || a[i] == '9') {
        aux += 6;
      }
      else if (a[i] == '7') {
        aux += 3;
      }
      else if (a[i] == '8') {
        aux += 7;
      }
    }
  cout << aux << " leds" << endl;
  aux = 0;
  }
}