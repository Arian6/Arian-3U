/* Name: South Africa
 * Date: March 3 2015
 * Version : V0.1
 * Author: Arian Krasniqi
 */


final int wide = 400;
final int high = 200;

int axisx = 50;
int axisy = 150;

//display size
size(500,5000);

//red rectangle
noStroke();
fill(226,61,40);
rect(axisx, axisy, wide, high);

//blue rectangle
noStroke();
fill(12,28,140);
rect(axisx, axisy + high * .5, wide, high / 2);

//whitetriangle
noStroke();
fill(255,255,255);
triangle(axisx + wide * .175 ,axisy, axisx + wide * .5, axisy + high * .5, axisx + wide * .175, axisy + high * 1);

//whiterectangle
noStroke();
fill(255,255,255);
rect(axisx, axisy + high * .325, wide , high * .35);

//whiterectangle 2
noStroke();
fill(255,255,255);
rect(axisx, axisy, wide * .175, high);

//greentriangle
noStroke();
fill(0,124,89);
triangle(axisx + wide * 0.1125 ,axisy, axisx + wide * 0.4375, axisy + high * .5, axisx + wide * 0.1125, axisy + high * 1);

//greenrectangle
noStroke();
fill(0,124,89);
rect(axisx, axisy + high * .4, wide , high * .2);

//greenrectangle 2
noStroke();
fill(0,124,89);
rect(axisx, axisy, wide * 0.1125, high);

//yellowtriangle
noStroke();
fill(252,181,20);
triangle(axisx ,axisy + high * .125, axisx + wide * .25, axisy + high * .5, axisx, axisy + high * .85);

//blacktriangle
noStroke();
fill(0,0,0);
triangle(axisx ,axisy + high * .225, axisx + wide * 0.1875, axisy + high * .5, axisx, axisy + high * .75);



