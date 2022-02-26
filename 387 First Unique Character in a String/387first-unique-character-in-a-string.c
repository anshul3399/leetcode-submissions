#include <string.h>

int firstUniqChar(char * s){
    int ret = -1;
    unsigned int frequencyMap[26] = {0};
    unsigned int strLength = strlen(s);
    for(unsigned int i=0; i<strLength; i++){
        unsigned int index = (int)(s[i])-97;
        frequencyMap[index] = frequencyMap[index] + 1;
    }
    for(unsigned int i=0; i<strLength; i++){
        if(1==frequencyMap[(int)(s[i]-97)]){
            ret = i;
            break;
        }
    }
    return ret;
}