/* Name: Bahama Flag
 * Date: March 03 2015
 * Version: v0.1
 */

final int startcoord = 50;
int blacktri = startcoord + 150;
//size of display
size(500,500);

//background
fill(0,172,198);
rect(startcoord, 150, 400 , 200);

//yellow rectangle
fill(249,224,76);
rect(startcoord, 225, 400 , 50);

//triangle
fill(0,0,0);
triangle(startcoord,150, blacktri, 250, startcoord, 350);


