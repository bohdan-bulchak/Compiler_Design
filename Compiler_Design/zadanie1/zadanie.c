#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "greatest.h"
#include "zadanie.h"

#define MAX_LEN 64
#define ACCEPT 1
#define NON_ACCEPT -1   
#define UNDEF -1

int state = 0;
int state1 = 0;

void q0(char c) {
    if (c == 'a') {
        state = 1;
    }
    else if (c == 'b') {
        state = 2;
    }
    else {
        state = UNDEF;
    }
}

void q1(char c) {
    if (c == 'a') {
        state = 1;
    }
    else if (c == 'b') {
        state = 3;
    }
    else {
        state = UNDEF;
    }
}

void q2(char c) {
    if (c == 'a') {
        state = 6;
    }
    else if (c == 'b') {
        state = 4;
    }
    else if (c == 'c'){
        state = 5;
    }
    else {
        state = UNDEF;
    }
}

void q3(char c) {
    if (c == 'a') {
        state = 6;
    }
    else if (c == 'b') {
        state = 4;
    }
    else if (c == 'c'){
        state = 4;
    }
    else {
        state = UNDEF;
    }
}

void q4(char c) {
    if (c == 'a') {
        state = 6;
    }
    else if (c == 'b') {
        state = 4;
    }
    else {
        state = UNDEF;
    }
}

void q5(char c) {
    if (c == 'b') {
        state = 3;
    }
    else {
        state = UNDEF;
    }
}

void q6(char c) {
    if (c == 'b') {
        state = 3;
    }
    else {
        state = UNDEF;
    }
}

int isAccepted(char *str) {
    int len = strlen(str);
    
    for (int i = 0; i < len; i++) {
        if (state == 0) {
            q0(str[i]);
        }
        else if (state == 1) {
            q1(str[i]);
        }
        else if (state == 2) {
            q2(str[i]);
        }
        else if (state == 3) {
            q3(str[i]);
        } 
        else if (state == 4) {
            q4(str[i]);
        }
        else if (state == 5) {
            q5(str[i]);
        }
        else if (state == 6) {
            q6(str[i]);
        }
    }
    if (state == 2 || state == 3 || state == 4) {
        return ACCEPT;
    }
    else {
        return NON_ACCEPT;
    }
    
}

int main(int argc, char **argv) {

    char in_str[MAX_LEN];
  
    printf("Enter some text to check: ");
   
    fgets(in_str, MAX_LEN, stdin);

    in_str[strcspn(in_str, "\n")] = 0;
    

    printf("\n Your text: %s, size of text: %i", in_str, (int)strlen(in_str));
    printf("\n Text is: %c", isAccepted(in_str) == ACCEPT ? 'A' : 'N');
    
    return 0;
}
