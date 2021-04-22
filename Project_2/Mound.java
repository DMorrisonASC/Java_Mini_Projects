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

import java.util.LinkedList;

public class Mound {
    private int numOfNutrient = 0;
    private int numOfSpores = 0;
    private int daysToLive = 0;
    private LinkedList<Mushroom> mushroomsInMound = new LinkedList<Mushroom>();

    public Mound(int nutrients) {
        this.numOfNutrient = nutrients;
    }
    public Mound(int nutrients, int spores) {
        this.numOfNutrient = nutrients;
        this.numOfSpores = spores;
    }
    public Mound(int nutrients, int spores, int daysToLive) {
        this.numOfNutrient = nutrients;
        this.numOfSpores = spores;
        this.daysToLive = daysToLive;
    }

    public int getNumOfNutrient() {
        return numOfNutrient;
    }

    public void setNumOfNutrient(int numOfNutrient) {
        this.numOfNutrient = numOfNutrient;
    }

    public int getNumOfSpores() {
        return numOfSpores;
    }

    public void setNumOfSpores(int numOfSpores) {
        this.numOfSpores = numOfSpores;
    }

    public int getDaysToLive() {
        return daysToLive;
    }

    public void setDaysToLive(int daysToLive) {
        this.daysToLive = daysToLive;
    }

    public LinkedList<Mushroom> getMushroomsInMound() {
        return mushroomsInMound;
    }

    public void setMushroomsInMound(LinkedList<Mushroom> mushroomsInMound) {
        this.mushroomsInMound = mushroomsInMound;
    }

    public void addSpores(int sporesAdded) {
        this.numOfSpores += sporesAdded;
    }

    public void growSpores() {
        for (int i = 0; i < numOfSpores; i++) {
            if (getNumOfNutrient() > 0 ) {
                Mushroom growMushroom = new Mushroom(getDaysToLive());
                mushroomsInMound.add(growMushroom);
                setNumOfNutrient(getNumOfNutrient() - 1);
            }
        }
        setNumOfSpores(getNumOfSpores() - getNumOfSpores());
    }

    public void expendLife() {
        for (int i = 0; i < mushroomsInMound.size(); i++) {
            Mushroom expendMushroom = mushroomsInMound.get(i);
            if (expendMushroom.getDaysToLive() > 0) {
                expendMushroom.setDaysToLive(expendMushroom.getDaysToLive() - 1);
            }
            else {
                mushroomsInMound.remove(mushroomsInMound.get(i));
            }
        }
    }
}
