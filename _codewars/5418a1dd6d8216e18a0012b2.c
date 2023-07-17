#include <stdbool.h>

bool validate(long card) {
  long sum = 0;
  int digit, position = 1, product = 0;

  do{
      digit = card % 10;
      if (position % 2 == 0){ // Even position
          product = digit * 2;
          while (product > 0){
              sum += product % 10;
              product /= 10;
          }
      }
      else // Odd position
          sum += digit;
      card /= 10;
      position++;
  } while (card > 0);
  return sum % 10 == 0;
}
