package com.company;

public class Map {

    private int mapHeight = 20;
    private int mapWidth = 20;
    String[][] map = new String[getMapHeight()][getMapWidth()];

    public Map(){
    }

    public Map(int height,int width){
        setMapHeight(height);
        setMapWidth(width);
    }

    public int getMapHeight() {
        return mapHeight;
    }

    public void setMapHeight(int mapHeight) {
        this.mapHeight = mapHeight;
    }

    public int getMapWidth() {
        return mapWidth;
    }

    public void setMapWidth(int mapWidth) {
        this.mapWidth = mapWidth;
    }

    public void createMap(){
        for (int i = 0; i < getMapHeight(); i++) {
            for (int j = 0; j < getMapWidth(); j++) {

                createMapField(map[i], j);
                createMapBorder(i, j);

                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private void createMapField(String[] strings, int j) {
        if(strings[j] == null){
            strings[j] = " ";
        }
    }

    private void createMapBorder(int i, int j) {
        if(j == 0 || j == getMapHeight()-1){
            map[i][j] = "|";
        }
        if(i == 0 || i == getMapWidth()-1){
            map[i][j] = "_";
        }
    }
}
