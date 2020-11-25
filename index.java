//Variables
int n = 299;
int steps = 0;
int x = 200;
int y = 200;



//Setup
void setup() {
	size(500, 500);
  frameRate(100);
}


void draw() {
  //Draws rectangle
	stroke(1);
  fill(0,0,255);
  rect(x, y, 10, 10);
 

  //Movement
  inr r = (int)(Math.random() * 4);
  
  if (steps <= n) {

  fill(x/2);
  rect(x, y, 10, 10);

  if (r == 0) {
    fill(0,0,255);
    x = x + 10;
    steps = steps + 1;
    rect(x, y, 10, 10);
  } else if (r == 1) {
    fill(0,0,255);
    x = x - 10;
    steps = steps + 1;
    rect(x, y, 10, 10);
  } else if (r == 2) {
    fill(0,0,255);
    y = y + 10;
    steps = steps + 1;
    rect(x, y, 10, 10);
  } else if (r == 3) {
    fill(0,0,255);
    y = y - 10;
    steps = steps + 1;
    rect(x, y, 10, 10);
  } else if(steps == n){
  background(0);
    r = 4;
  }

  if (x >= 400){
    r = 1
  } else if (x <= 0){
    r = 0
  }
  if (y >= 400){
    r = 3
  } else if (y <= 0){
    r = 2;
  }


  }

    println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);

}



	



