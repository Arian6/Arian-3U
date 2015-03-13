/* Name: Norway
 * Date: March 3 2015
 * Version: v0.1
 * Author: Arian Krasniqi
 */

//CONSTANTS
final int high = 200;
final int wide = 400;
//VARIABLES
int axisx = 50;
int axisy = 150;



//display size
size(500,500);

//background
noStroke();
fill(227,37,43);
rect(axisx,axisy,wide,high);

//whiterect1
noStroke();
fill(255,255,255);
rect(axisx + wide * 0.25,axisy, wide * 0.2,high);

//whiterect2
noStroke();
fill(255,255,255);
rect(axisx,axisy + high * 0.35, wide, high * 0.325);

//bluerect1
noStroke();
fill(10,45,113);
rect(axisx + wide * 0.3, axisy, wide * 0.1, high);

//bluerect2
noStroke();
fill(10,45,113);
rect(axisx, axisy + high * 0.425, wide, high * 0.175);
