CC = gcc
CFLAGS = -Wall
LDFLAGS =
OBJFILES = zadanie.o test1.o 
TARGET = zadanie test1 test2 test3 test4 test5 test6 test7 test8 test9 test10

all: $(TARGET)

#$(TARGET): $(OBJFILES)
#	$(CC) $(CFLAGS) -o $(TARGET) $(OBJFILES) $(LDFLAGS)

zadanie: zadanie.o 
	$(CC) $(CFLAGS) -o zadanie zadanie.o  

test1: zadanie.o test1.o
	$(CC) $(CFLAGS) -o test1 zadanie.o test1.o 

test2: zadanie.o test2.o
	$(CC) $(CFLAGS) -o test2 zadanie.o test2.o

test3: zadanie.o test3.o
	$(CC) $(CFLAGS) -o test3 zadanie.o test3.o 

test4: zadanie.o test4.o
	$(CC) $(CFLAGS) -o test4 zadanie.o test4.o

test5: zadanie.o test5.o
	$(CC) $(CFLAGS) -o test5 zadanie.o test5.o 

test6: zadanie.o test6.o
	$(CC) $(CFLAGS) -o test6 zadanie.o test6.o

test7: zadanie.o test7.o
	$(CC) $(CFLAGS) -o test7 zadanie.o test7.o

test8: zadanie.o test8.o
	$(CC) $(CFLAGS) -o test8 zadanie.o test8.o

test9: zadanie.o test9.o
	$(CC) $(CFLAGS) -o test9 zadanie.o test9.o

test10: zadanie.o test10.o
	$(CC) $(CFLAGS) -o test10 zadanie.o test10.o

clean:
	rm -f $(OBJFILES) $(TARGET) *~