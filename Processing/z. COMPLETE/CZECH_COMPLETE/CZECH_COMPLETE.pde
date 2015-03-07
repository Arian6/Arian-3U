/* Name: Czech Republic
 * Date: March 03 2015
 * Version: v0.1
 * Author: Arian Krasniqi
 */

//constants
final int high = 200;
final int wide = 400;
//variables
int axisx = 100;
int axisy = 150;

//display size
size(700,500);

//red rectangle
fill(255,255,255);
rect(axisx, axisy,wide,high);
//white rectangle
fill(205,5,5);
rect(axisx, axisy + high * .5, wide, high / 2);

//triangle
fill(30,85,135);
triangle(axisx, axisy, axisx + wide * 0.375, axisy + high * .5, axisx , axisy + high * 1);

