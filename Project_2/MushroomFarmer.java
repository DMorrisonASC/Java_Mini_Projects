/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/18/2021
    Instructor: For a bit of fungi biology, many common
mushrooms grows from spores, which are released from adult mushrooms. Most mushrooms take a few days
to a little over a week to fully mature into adults. Your simulation will need to take this into account.
Your simulation should read in a file, specified by the user, which determines how long a mushroom lives,
where the initial spore is placed in the field, and what are the nutrient levels within the field. Then your
program should simulate one day at a time, as the mushrooms grow, mature, spread their spores to make
new mushrooms, and die off. Once there are no more mushrooms in the field, the program should specify
what day had the greatest number of mushrooms at once, how many mushrooms were there on that day, and
what the nutrient levels in the field are now.
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MushroomFarmer {
    public static void main(String[] args) throws IOException {
        Field field = new Field();
        field.createField();



    }
}
