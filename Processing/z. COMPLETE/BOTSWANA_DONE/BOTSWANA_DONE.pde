/* Name: Botswana Flag
 * Date: 3, March 2015
 * Version: v0.2
 * Author: Arian Krasniqi
 */

//Final
final int high = 30;
final int wide = 200;
int axisy = 50;
int axisx = 50;


//display
size(500,500);

//first rectangle
fill(20, 135, 155);
rect(axisx, axisy + high * 0.4, wide, high * 4);

//second rectangle
fill(255,255,255);
rect(axisx, axisy + high * 1.9, wide, high);

//third rectangle
fill(0,0,0);
rect(axisx, axisy + high * 2.1,wide, high * 0.6);



