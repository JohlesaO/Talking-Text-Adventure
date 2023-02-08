/**
 * Write a description of class Game11_20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//import all java objects so I can use array and scanner if needed
import java.util.*;
class Main
{
    public static void main(String[] args) {
        //as of right now, user should be in [1,1];
        String userInput = "";
        String username = "";
        // ' ' for empty areas, 'X' current position
        //initialize and set areas to ' ' or 'x'

        //creates board
        char[][]map = new char [3][];
        map[0] = new char[3];
        map[1] = new char[4];
        map[2] = new char[3];
        Random num = new Random();
        int randomJabberRow = num.nextInt(map.length);
        int randomJabberCol = num.nextInt(map.length);
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(i == 1 && j == 1){
                    map[i][j] = 'X';
                }else{
                    map[i][j] = ' ';
                }
            }
        }
        //set area descriptions in array. 2 methods will access descriptions array.
        String[][] descriptions = new String [3][4];

        Scanner console = new Scanner(System.in);
        System.out.print("Hello user!\nI see that you are a lost wanderer. What is your name?\n>");
        username = console.next();
        areaDescriptions(descriptions, username, randomJabberRow, randomJabberCol);

        //intro!
        System.out.println("Nice to meet you, " + username + "!\nMoments ago, you decided to take a nap because you were sleep-deprived. Tsk. Tsk. Now, you are trapped in this world, where I, your conscience, will be guiding you as you try to escape back to the real world. Good luck.\nSpeaking of which, you can ask me for help any time by typing 'help'.\nAt this moment, you are standing in front of a strange, large clock that is missing multiple parts. At the foot of the clock is a tiny dwarf sleeping with his cap on his face. Next to him is an ancient-looking cane.\n\nYou have nothing but a paper folded");
        System.out.println("up in your hands. What would you like to do?\n>");

        boolean jabberwordy = false;//player doesn't start at 1,2! Player is at 1,1.
        Scanner cs = new Scanner(System.in);
        userInput = cs.nextLine();
        userInput = userInput.toLowerCase();
        while(!userInput.contains("quit")){//runs all code in continuous loop until user
            //types in quit to console.
            String keyword = findKeyword(userInput);
            //finds the keywords (that are already set to all lowercase) that run certain code
            if(keyword.equals("map")){
                displayMap(map);
                //prints out 3x3 grid with 'X' on current player position
            }else if(keyword.equals("help")){
                help();
                //lists all keywords
            }else if(keyword.equals("look")){
                //showing map is unnecessary
                //displayMap(map);
                getDescription(map, descriptions);

            }else if(keyword.equals("right")||keyword.equals("left")||keyword.equals("up")||
            keyword.equals("down")){
                jabberwordy = movePlayer(map, keyword, descriptions, randomJabberRow, randomJabberCol);
                //isn't necessary to displayMap unless player asks for map.
                //displayMap(map);
                //getDescription(map, descriptions);
            }else if(!jabberwordy){
                talkResponse(map, descriptions, keyword, username);
            }else if(jabberwordy){
                getJabberwordyResponse(userInput);
            }else if(keyword.equals("")){//if its not the intro
                genericReply(username);
            }
            System.out.print("\n>");
            userInput = cs.nextLine();
            userInput = userInput.toLowerCase();//sets any user input to all lower case, so that
            //it matches the condition words needed for each method.
        }
    }
    
    public static void genericReply(String username){
        //creates list that stores replies, and produces a random output of the provided list
        ArrayList<String> replies = new ArrayList<String>();
        replies.add("How do you expect me to understand that?!");
        replies.add("I don't understand that.");
        replies.add("I don't know that!");
        replies.add("I am confused.");
        replies.add("Umm...");
        replies.add("Could you please re-phrase that?");
        replies.add("Ask me for help to see the phrases that you can use.");
        replies.add(username + ", I don't know what you mean.");
        replies.add("Try again.");
        replies.add("Alas, even one's grandmother would not understand.");
        Random r = new Random();
        int index = r.nextInt(replies.size());
        System.out.println(replies.get(index));
    }

    public static String findKeyword(String input){
        //if the user input contains any of the key words,
        //the method will identify and return that keyword
        //format: if input.contains("keyword"){
        //return keyword;
        //}

        //CP 1 keywords: up, down, left, right, map, look
        //all other keywords are irrelevant for CP1. Ignore.
        if(input.contains("up")){ //directional keyword. Decrease row value by 1. row -1;
            return "up";
        }else if(input.contains("down")){ //directional keyword. Should increase row value + 1
            return "down";
        }else if(input.contains("left")){
            return "left";//a directional keyword. Decrease column value by 1.
        }else if(input.contains("right")){ //directional keyword. Increase col val by 1.
            return "right";
        }else if(input.contains("map")){ //display map with 'X' at current place I'm at
            return "map";
        }else if(input.contains("look")){ //get description of current area
            return "look";
        }else if(input.contains("help")){
            return "help";
        }else if(input.contains("beautiful")){
            return "beautiful";
        }else if(input.contains("love")){
            return "love";
        }else if(input.contains("name")){
            return "name";
        }else if(input.contains("weather")){
            return "weather";
        }else if(input.contains("hello")||input.contains("hi")){
            //I just combined the two words because they are similar, and have the same function
            //so there is no need to make them two seperate words.
            return "hello/hi";
        }else{
            return "";
        }
    }

    //get descriptions(description[][] map
    public static void areaDescriptions(String[][]descriptions, String username, int randomJabberRow, int randomJabberCol){
        //int randomRow, int randomCol
        //this entire method only sets the certain areas of the map to a specific description
        //the getDescription method actually prints these descriptions out.
        descriptions[0][0] = "Choo-choo Express. You see a man red in the face, having a coughing fit. You look\nclosely at his name tag, which states in very bold print, \"CONDUCTOR COUGH\".\nGosh, he really lives up to his name. I think he needs some water.\n";
        //where you meet conductor
        descriptions[0][1] = "Midnight Avenue. "+ username +", this place is quite dark.\nIt is a single street, with damp cement and sidewalks that are lit up\nby eerily bright lamps. Wait---did something move over there?\nYour heart beats wildly as the shadow moves closer to you.\nThe lamp reveals a sketchy dude who looks like he hasn't slept in days.\n";
        //where you meet sketchy dude
        descriptions[0][2] = "Sheep Pastures. Mesmerizing! You are standing before a lucious\n green plain with colored sheep that look as if they were cotton candy. \nIn front of you is the shepherd who seems to be searching for something.\nHe looks frazzled. I don't think he knows you're here.\n";
        //where you meet the shepherd
        descriptions[1][0] = "Hot Air Balloon. In front of you is a large bear with fur that\nlooks strangely familiar. Could this be Cuddles the Bear that Aunt May\ngave you for Christmas last year? Cuddles looks like he is about to take off.\n";
        //where aviator teddy is
        descriptions[1][1] = "Big Clock. Isn't this where we began? The dwarf looks very\n impatient. Perhaps he needs something.\n";
        //site where clock fixing happens, also dwarf
        descriptions[1][2] = "The Jabberwordy. Standing atop of clouds and peering into your\nsoul is a stick-thin figure with striped pants, and a purple velvet \nsuit, with the body of a human, head of an orange cat, and eyes\n of a slimy toad. Simply revolting. What does it want from you?\n";

        descriptions[1][3] = "The Evil Storm Cloud. Before you is a gray, swirling mass.\n You stare at it, wide-eyed, petrified, with your mouth \ngaping open. It seems to be living. You shuffle your feet, and the grumpy\n cloud strikes a lightning bolt at your feet.";

        descriptions[2][0] = "Golden Rye Fields. There is a field of ripened rye blowing in the\nwind. As you glance around, something catches your eye. It's a scarecrow!\nIt seems to be smiling at you, and doesn't look very scary.\n";
        //where lonely scarecrow is
        descriptions[2][1] = "Tooth Fairy Cloud. Laying on a fluffy cloud is a fairy with a sack\nthat is overflowing with teeth. Could it be?? It's the tooth fairy!\n";
        //where lazy tooth fairy is
        descriptions[2][2] = "Majestic Falls. All around you are waterfalls so tall that the\nthe mist creates an ethereal fog, and creates a film on the ground.\nThere is a horse with a lump on its head, drinking from the stream.\n";

        /////SWITCHING SPOTS WITH JABBERWORDY////
        String saved = descriptions[randomJabberRow][randomJabberCol];//saves the description of the place to be replaced by Jabberwordy
        descriptions[randomJabberRow][randomJabberCol]=descriptions[1][2];//switches descriptions
        descriptions[1][2] = saved;//replaces new space with description.

        //descriptions[randomRow][randomCol] = jabberwordy stuff. this means we have to change
        //a description to be a cloud or something
    }

    public static void displayMap(char[][] map){
        //this prints out the outline of the map
        //to have the char inside, use array location to
        //know where to input 'X' in space
        System.out.println();
        mapBorder(map[0].length); //prints out classic border to fit map.
        for(int row = 0; row < map.length; row++){
            //per row, it goes through each column        
            //and prints out the ' ' or 'X' in each space
            for(int col = 0; col < map[row].length; col++){
                System.out.print("| " + map[row][col] + " ");
            }
            System.out.println("|");
            if(row < 2){
              mapBorder(map[1].length);   
            }else{
              mapBorder(map[row].length);
            }
        }
    }

    public static void mapBorder(int rowLength){
        System.out.print("+");
        for(int i = 1; i <= rowLength; i++){
            System.out.print("---+");
        }
        System.out.println();
    }

    public static void help(){
        System.out.println("Your command key words are:\nlook,help, map, up, down, left, right\n");
        System.out.println("Your talking key words are:\nlove, beautiful, hello/hi, name, weather");
        System.out.println("Type [quit] to stop playing.");
    }

    public static void getDescription(char[][] gameMap, String[][] placeDescription){
        //scans array grids for x, then prints out area description based on coordinates.
        for(int i = 0; i < gameMap.length; i++){
            //for every row
            for(int j = 0; j < gameMap[i].length; j++){
                if(gameMap[i][j] == 'X'){
                    System.out.print(placeDescription[i][j]);
                    //prints out the description for the current player position.
                }
            }
        }
        //i=rows, j=columns
    }

    public static boolean movePlayer(char[][] map, String direction, String[][] descriptions, int randomJabberRow, int randomJabberCol){
        //this method "moves" the player by switching the 'X' on the map with the space
        //that the user is going to move to from the right/left/up/down commands
        //and will access the description of the new area by putting replacing row and column
        //coordinates for the map.

        //find current position by going through each column per row
        //jabberwordyHere returns true if player is at 1,2
        boolean jabberwordyHere;
        //initialize values for row and col.
        int row = 0;
        int col = 0;

        //FIND WHERE 'X' is. Loop for current row and col values.
        for(int i = 0; i < map.length; i++){//for every row
            for(int j = 0; j < map[i].length; j++){//for every col in the row
                if(map[i][j] == 'X'){
                    row = i;
                    col = j;
                }
            }
        }
        //if/else for user direction keyword.
        //add/subtract to current row & col value based on answer.
        //WATCH OUT FOR OUT OF BOUNDS!!! IF STATEMENT NEEDED
        //update 'X' placement
        if(direction.equals("left")){//col--;
            //subtract 1 from col value, and SET ANOTHER VARIABLE so that array isn't immediately
            //out of bounds if the user decides to move somewhere "illegal"
            int num = col;
            num--;
            //since you can't increment, there's no point in putting "|| col <= 2"
            if(num >= 0){
                swapChars(map, row, col, row, col - 1);
                //will switch the current 'X' position with new position, and have a space
                col--;
                getDescription(map, descriptions);
            }else{//illegal area, give message instead before actually moving the player.
                errorMessage();
            }
        }else if(direction.equals("right")){
            //add 1 to col value
            //col++;
            int num = col;
            num++;
            if(num <= map[row].length - 1){
                swapChars(map, row, col, row, col + 1);
                col++;
                getDescription(map, descriptions);
            }else{
                errorMessage();
            }
        }else if(direction.equals("up")){
            //vertical movement, subtract from row val
            //row--;
            if(col == 3){
              errorMessage();
            }else{
            int num = row;
            num--;
            if(num >= 0){
                swapChars(map, row - 1, col, row, col);
                row--;
                getDescription(map, descriptions);
            }else{
                errorMessage();
            }
            }
        }else if(direction.equals("down")){
            //vertical, add to row val.
            //row++;
            if(col == 3){
              errorMessage();
            }else{
            int num = row;
            num++;
            if(num <= map.length){
                swapChars(map, row + 1, col, row, col);
                row++;
                getDescription(map, descriptions);
            }else{
                errorMessage();
            }
            }
        }else{
            System.out.print("I don't know that direction!");//if no direction makes sense.
        }
        //jabberwordy is in position 1,2
        if(row == randomJabberRow && col == randomJabberCol){
            jabberwordyHere = true;
        }else{
            jabberwordyHere = false;
        }
        return jabberwordyHere;
    }

    public static void errorMessage(){
        System.out.println("In that direction a black abyss. I would not venture there. Try");
        System.out.println("going somewhere else.");
    }

    public static void swapChars(char[][] map, int r, int c, int r2, int c2){
        //method swaps the 'X' on the map, so 'X' doesn't leave trace once player moves.
        //swap 'X' with space it is going to occupy.
        //must save one of the values. will be overwritten, value is reaccessed at the end.
        char savedValue = map[r][c]; //current location, 'X'
        map[r][c] = map[r2][c2]; //place to be occupied. ' '
        map[r2][c2] = savedValue;
    }

    
  
}



