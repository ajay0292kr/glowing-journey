#include <stdio.h>
#include <string.h>
 
/* Description: This program reads a string and counts the no. of chars in it */
/* Date: 2016/06/10 */
/* Rules: use indentation properly */

int main() {
   char string[100];
   int c = 0, count[26] = {0};
 
   printf("Enter a string\n");
  /* taken a string as an input, hence use 'gets' otherwise we can use getchar to accept
  one char at a time */ 
   gets(string);
   while (string[c] != '\0') {
      /** Considering characters from 'a' to 'z' only
          and ignoring others */
 
      if (string[c] >= 'a' && string[c] <= 'z') 
         count[string[c]-'a']++;
 
      c++;
   }
 
   for (c = 0; c < 26; c++) {
      /** Printing only those characters 
          whose count is at least 1 */
 
      if (count[c] != 0)
         printf("%c occurs %d times in the entered string.\n",c+'a',count[c]);
   }
 
   return 0;
}
