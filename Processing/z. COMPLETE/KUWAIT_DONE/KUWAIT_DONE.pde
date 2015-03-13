/* Name: Kuwait
 * Date: March 03 2015
 * Version: v0.1
 * Author: Arian Krasniqi
 */
 
 //CONSTANTS
final int high = 200;
final int wide = 400;
//VARIABLES
int axisx = 75;
int axisy = 150;
 
 
 //display size
size(500,500);

//green rectangle
fill(50,152,89);
rect(axisx, axisy,wide,high);

//red rectangle
fill(205,5,5);
rect(axisx, axisy + high * .5, wide, high /2);

//triangle
fill(0,0,0);
triangle(axisx,axisy, axisx + wide *0.375, axisy + high * .5, axisx, axisy + high * 1);

//whiterect
fill(255,255,255);
rect(axisx + wide * 0.25, axisy + high *0.34, (wide / 4) * 3 ,high * 0.325);

