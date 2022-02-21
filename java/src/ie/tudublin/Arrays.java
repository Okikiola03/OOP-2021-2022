package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
    float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};

    String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    float[] a1 = new float[100];

    float[] a2;

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        for(int i = 0; i <rainfall.length; i++)
        {
            println(rainfall[i] + "\t" + months[i]);
        }

        for(float r:rainfall)
        {
            println(r);
        }

        for(int i = rainfall.length-1; i >= 0; i--)
        {
            println(rainfall[i] + "\t" + months[i]);
        }

        float min = rainfall[0];
        float max = rainfall[0];
        int index_min = 0;
        int index_max = 0;

        for(int i = 0; i<rainfall.length; i++)
        {
            if(min > rainfall[i])
            {
                index_min = i;
            }

            if(max < rainfall[i])
            {
                index_max = i;
            }

        }

        println(rainfall[index_min] + " is the minimum rainfall amount and it occurred in " + months[index_min]);
        println(rainfall[index_max] + " is the maximum rainfall amount and it occurred in " + months[index_max]);

    }

    public void draw()
    {

    }
    
}