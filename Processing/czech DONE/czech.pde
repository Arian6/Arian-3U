/* Name: Czech Republic
 * Date: March 03 2015
 * Version: v0.1
 * Author: Arian Krasniqi
 */

final int startc = 100;
int bluetri = startc + 150;

//display size
size(500,500);

//red rectangle
fill(255,255,255);
rect(startc, 150,400,200);
//white rectangle
fill(205,5,5);
rect(startc, 250, 400, 100);

//triangle
fill(30,85,135);
triangle(startc,150, bluetri, 250, startc, 350);

