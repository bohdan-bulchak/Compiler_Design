#include "greatest.h"
#include "zadanie.h"

TEST test(void) {
     
    int test = isAccepted("b");
    
    ASSERT_EQm("Yikes, 'b' doesn't match", 1, test);
    
    PASS();
}

SUITE(the_suite) {
    RUN_TEST(test);
    
}


GREATEST_MAIN_DEFS();

int main(int argc, char **argv) {

    GREATEST_MAIN_BEGIN();

    RUN_SUITE(the_suite);
    
    GREATEST_MAIN_END();
    
}