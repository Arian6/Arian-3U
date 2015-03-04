/* Name: Kuwait
 * Date: March 03 2015
 * Version: v0.1
 * Author: Arian Krasniqi
 */

final int startc = 75;
int whiterecx = startc + 100;
int blacktri = startc + 150;

//display size
size(500,500);

//green rectangle
fill(50,152,89);
rect(startc, 150,400,200);

//red rectangle
fill(205,5,5);
rect(startc, 250, 400, 100);

//triangle
fill(0,0,0);
triangle(startc,150, blacktri, 250, startc, 350);

//whiterect
fill(255,255,255);
rect(whiterecx,218, 300 ,65);

