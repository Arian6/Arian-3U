/* Name: Seychelles
 * Date: March 4 2015
 * Version: v0.1
 * Author: Arian Krasnqi
 */

// constant
final int connection = 100;
//variables

int secredtri = connection - 1;
int endpoint = connection + 250;

//display size
size(500,500);

// blue tri
noStroke();
fill(36,63,142);
triangle( connection, 100, 184, 100, connection, 300);

//yellowtri
noStroke();
fill(250,243,111);
triangle( 184, 100, 318, 100, connection, 300);

//redtri
noStroke();
fill(255,26,30);
triangle(318,100, 450,101, connection, 300);

//redtri2
noStroke();
fill(255,26,30);
triangle(450,100, 450, 150, secredtri, 300);

//whitetri
noStroke();
fill(255,255,255);
triangle(450,150, 450, 225, connection, 300);

//greentri
noStroke();
fill(28,88,32);
triangle(450,225,450,300, connection, 300);

