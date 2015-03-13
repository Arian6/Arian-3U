/* Name: Bahama Flag
 * Date: March 03 2015
 * Version: v0.1
 * Author: Arian Krasniqi
 */

//CONSTANTS
final int wide = 400;
final int high = 200;

//VARIABLES
int axisx = 50;
int axisy = 150;

//size of display
size(500,500);

//background
fill(0,172,198);
rect(axisx, axisy, wide , high);

//yellow rectangle
fill(249,224,76);
rect(axisx, axisy + high *0.375, wide , high /4);

//triangle
fill(0,0,0);
triangle(axisx,axisy, axisx + wide * 0.5, axisy + high * 0.5, axisx, axisy + high * 1);


