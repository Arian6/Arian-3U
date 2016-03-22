
final int xloc = 50;
final int yloc = 50;

public void setup() {
size(500,500);
noStroke();
background(14,19,203);
smooth();
frameRate(30);

}


public void draw() {
fill(240,245,22);
arc(xloc, yloc, 80, 80, radians(30), radians(330)); 

fill(0,0,0);
ellipse(xloc + 15, yloc - 20, 10, 10);
}
