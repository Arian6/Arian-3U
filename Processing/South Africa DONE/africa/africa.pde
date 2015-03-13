/* Name: South Africa
 * Date: March 3 2015
 * Version : V0.1
 * Author: Arian Krasniqi
 */

//CONSTANTS
final int startc = 50;

//VARIABLES
int whitetri = startc + 70;
int greentri = startc + 45;
int yellowtri = startc + 100;
int greentribottom = startc + 75;
int whitetritip = startc + 200;
int greentritip = startc + 175;

//display size
size(1000,1000);

//red rectangle
noStroke();
fill(226,61,40);
rect(startc, 150,400,200);

//blue rectangle
noStroke();
fill(12,28,140);
rect(startc, 250, 400, 100);

//whitetriangle
noStroke();
fill(255,255,255);
triangle(whitetri ,150, whitetritip, 250, whitetri, 350);

//whiterectangle
noStroke();
fill(255,255,255);
rect(startc, 215,400 , 70);

//whiterectangle 2
noStroke();
fill(255,255,255);
rect(startc, 150, 70, 200);

//greentriangle
noStroke();
fill(0,124,89);
triangle(greentri ,150, greentritip, 250, greentri, 350);

//greenrectangle
noStroke();
fill(0,124,89);
rect(startc, 230, 400 , 40);

//greenrectangle 2
noStroke();
fill(0,124,89);
rect(startc, 150, 45, 200);

//yellowtriangle
noStroke();
fill(252,181,20);
triangle(startc ,175, yellowtri, 250, startc, 320);

//blacktriangle
noStroke();
fill(0,0,0);
triangle(startc ,195, greentribottom, 250, startc, 300);



