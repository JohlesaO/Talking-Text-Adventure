import.java.util.*;
class Descriptions{

  String keyword;
  String username;
  int r;
  int c;

  public Descriptions(int r, int c, String keyword, String username){
    this.r=r;
    this.c=c;
    this.keyword=keyword;
    this.username=username;
  }

  public static void talkResponse(char[][]map, String[][] descriptions, String word, String username){
      int r = 0;
      int c = 0;
      for(int row = 0; row < map.length; row++){
        for(int col = 0; col < map[row].length; col++){
          if(map[row][col] == 'X'){
            r = row;
            c = col;
          }
        }
      }
        //this method sees which keyword was used in thesentence, then
        //generates a reply based on that keyword.
        //love, beautiful, hello/hi, name, weather
        
        //generates a random number
        Random ran = new Random();
        //tests for specific word. Prints index "number" outof specified arrayList
        //arrayList name matches keyword

        if(descriptions[r][c].contains("Choo-choo Express")){
          if(word.equals("hello/hi")){
            System.out.println(hiRes.get(ran.nextInt(4)));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(ran.nextInt(3)));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(ran.nextInt(4)));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(ran.nextInt(3)));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(ran.nextInt(3)));
          }else{
            genericReply(username);
          }//incremented everything by  1
        }else if(descriptions[r][c].contains("Midnight Avenue")){
            if(word.equals("hello/hi")){
            System.out.println(hiRes.get(ran.nextInt(3) + 3));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(ran.nextInt(3) + 2));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(ran.nextInt(3) + 3));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(ran.nextInt(5) + 2));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(ran.nextInt(2) + 2));
          }else{
            genericReply(username);
          }
        }else if(descriptions[r][c].contains("Sheep Pastures")){
          if(word.equals("hello/hi")){
            System.out.println(hiRes.get(ran.nextInt(3) + 6));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(ran.nextInt(2) + 5));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(ran.nextInt(3) + 6));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(ran.nextInt(2) + 7));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(ran.nextInt(2) + 4));
          }else{
            genericReply(username);
          }
        }else if(descriptions[r][c].contains("Golden Rye Fields")){
          if(word.equals("hello/hi")){
            System.out.println(hiRes.get(ran.nextInt(2) + 8));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(ran.nextInt(3) + 6));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(ran.nextInt(2) + 8));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(ran.nextInt(2) + 8));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(ran.nextInt(2) + 5));
          }else{
            genericReply(username);
          }
        }else if(descriptions[r][c].contains("Majestic Falls")){
          if(word.equals("hello/hi")){
            System.out.println(hiRes.get(ran.nextInt(3)+10));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(ran.nextInt(2)+7));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(ran.nextInt(2)+10));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(ran.nextInt(2)+ 9));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(ran.nextInt(2)+6));
          }else{
            genericReply(username);
          }
        }else if(descriptions[r][c].contains("Tooth Fairy Cloud")){
          if(word.equals("hello/hi")){
            System.out.println(hiRes.get(ran.nextInt(3)+12));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(ran.nextInt(2)+8));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(ran.nextInt(2)+11));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(ran.nextInt(3)+10));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(ran.nextInt(3) + 7));
          }else{
            genericReply(username);
          }
        }else if(descriptions[r][c].contains("Hot Air Balloon")){
          if(word.equals("hello/hi")){
            System.out.println(hiRes.get(ran.nextInt(2) +14));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(ran.nextInt(3)+9));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(3));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(2));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(2));
          }else{
            genericReply(username);
          }
        }else if(descriptions[r][c].contains("Big Clock")){
          if(word.equals("hello/hi")){
            System.out.println(hiRes.get(3));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(2));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(3));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(2));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(2));
          }else{
            genericReply(username);
          }
        }else{//Evil Storm Cloud
          if(word.equals("hello/hi")){
            System.out.println(hiRes.get(3));
          }else if(word.equals("love")){
            System.out.println(loveRes.get(2));
          }else if(word.equals("beautiful")){
            System.out.println(beautifulRes.get(3));
          }else if(word.equals("name")){
            System.out.println(nameRes.get(2));
          }else if(word.equals("weather")){
            System.out.println(weatherRes.get(2));
          }else{
            genericReply(username);
          }
        }
    }

  ////////HI/HELLO RESPONSE LIST///////////
  ArrayList<String> hiRes = new ArrayList<String>(10);
    //CHOO
    hiRes.add("*coughs and wheezes*");
    hiRes.add("water " + username + "...*wheeze*...please...");
    hiRes.add("*coughs* help");
    //MIDNIGHT
    hiRes.add("Hullo. " + username + ", was it?/nI need some cash.");
    hiRes.add("Hi. Please help me. I need a train ticket to my house in WakeLand.");
    hiRes.add("Hey there, " + username + ".");
    //SHEEP
    hiRes.add("Hello dear child. Have you seen a wooden staff around here?");
    hiRes.add("Hello " + username + ". I am busy at the moment, looking for my staff. I cannot herd my shewithout it!");
    hiRes.add("Hello, child.");
    //GOLDEN
    hiRes.add("Hello, " + username + "! You are the first person to talk to me in centuries!");
    hiRes.add("Hi! Please talk to me forever.");
    hiRes.add("Hello!");
    //MAJESTIC
    hiRes.add("Salutations, " + username + ". I have expected you.");
    hiRes.add("I can help you get back to the awakened world, but first you must help me get my horn back, "username +  ".");
    hiRes.add("Bonjour.");
    //TOOTH
    hiRes.add("You will leave me alone unless you have teeth for me, " + username + ".");
    hiRes.add("What do you want, " + username + "!");
    hiRes.add("Leave me alone, " + username + "!");
    //BALLOON
    hiRes.add("Good day. I need help riding this hot air balloon. Do you think you can release me?");
    hiRes.add("Hello. You look familiar.");
    //DWARF
    hiRes.add("Hello yourself, " + username + ".");
    hiRes.add("You need to fix this clock! Bring me the pieces.");
    hiRes.add("*grunts* Where are the clock pieces?");
    //STORM
    hiRes.add("How dare you speak to me!?");
    hiRes.add("The storm cloud greets you by striking a bolt of lightning at your feet again.");

  ////////////LOVE RESPONSE LIST//////////////////
  ArrayList<String> loveRes = new ArrayList<String>(10);
    //CHOO
    loveRes.add("I would love some water right now.");
    loveRes.add("You know, water sounds lovely right now.");
    //MIDNIGHT
    loveRes.add("That's nice, " + username + ".");
    loveRes.add("Ok...");
    loveRes.add("Umm...alright");
    //SHEEP
    loveRes.add("Good for you, " + username + ".");
    loveRes.add("I would love to have my staff back.");
    //GOLDEN
    loveRes.add("Awesomesauce.");
    loveRes.add("I love to talk!");
    //MAJESTIC
    loveRes.add("Wooooow.");
    loveRes.add("I would love my magical horn back.");
    //TOOTH
    loveRes.add("I agree.");
    loveRes.add("It would be lovely if you could leave me alone right now.");
    //BALLOON
    loveRes.add("That's wonderful, " + username + "!");
    loveRes.add("I would love to see the skies right now, " + username + ".");
    loveRes.add("I love to fly hot air balloons.");
    //DWARF
    loveRes.add("Same here, " + username + ".");
    loveRes.add("I would love it if you brought me the clock pieces.");
    //STORM
    loveRes.add("I do not want you here one bit, " + username + ".");
    loveRes.add("*awkward silence*");

  /////////BEAUTIFUL RESPONSE LIST//////////
  ArrayList<String> beautifulRes = new ArrayList<String>(10);
    //CHOO
    beautifulRes.add("Are you ok, " + username + "?");
    beautifulRes.add("Interesting comment.");
    beautifulRes.add("You know, water would be real beautiful right now.");
    //MIDNIGHT
    beautifulRes.add("Interesting...beauty is in the eye of the beholder.");
    beautifulRes.add("Well, I guess, " + username + ".");
    beautifulRes.add("Cash is beautiful.");
    //SHEEP
    beautifulRes.add("Of course!");
    beautifulRes.add("No place is more beautiful than here!");
    //GOLDEN
    beautifulRes.add("You are too, " + username + ".");
    beautifulRes.add("These rye fields are beautiful, " + username + ". You should stay a bit!");
    //MAJESTIC
    beautifulRes.add("Beautiful I am. Sorry, what were you saying, " + username + "?");
    beautifulRes.add("Yes, yes. I am the most beautiful unicorn in the universe.");
    //TOOTH
    beautifulRes.add("Alrighty.");
    beautifulRes.add("Yeah, " + username + ". " + "Sure, sure.");
    //BALLOON
    beautifulRes.add("Yes, that is true, " + username +".");
    beautifulRes.add("Nothing is more beautiful than seeing the skies above the clouds.");
    //DWARF
    beautifulRes.add("What is more beautiful than a completed clock?");
    beautifulRes.add("A fixed clock is beautiful.");
    //STORM  
    beautifulRes.add("Maybe you should think again, " +username + ".");
    beautifulRes.add("It would be much more beautiful without you in the way.");

  ///////NAME RESPONSE LIST/////////
  ArrayList<String> nameRes = new ArrayList<String>(10);
    //CHOO
    nameRes.add("Look at the tag.");
    nameRes.add("Your conscience should have told you already, " + username + ".");
    //MIDNIGHT
    nameRes.add("I don't know...do you?");
    nameRes.add("It seems that I forgot my name, " + username + "!");
    nameRes.add("*whispers* It's Bob.");
    nameRes.add("Umm...Bob. Keep it on the down low.");
    nameRes.add("The name's Bob.");
    //SHEEP
    nameRes.add("I am but a lonely wanderer. I am The Shepherd.");
    nameRes.add("I am The Shepherd.");
    //GOLDEN
    nameRes.add("I'm The Lonely Scarecrow.");
    nameRes.add("I was orignally named Fred.");
    //MAJESTIC
    nameRes.add("My name is *neighs loudly*");
    nameRes.add("The others call me Max.");
    //TOOTH
    nameRes.add("Speak to the hand.");
    nameRes.add("Maybe I'll tell you my name, maybe not.");
    nameRes.add("Fine. My name is Toofy. Ok. Now go away.");
    //BALLOON
    nameRes.add("My name is Aviator Teddy.");
    nameRes.add("The name is Aviator Teddy. Pleasure to be your acquaintance.");
    //DWARF
    nameRes.add("What is your name, again? " + username +", was it?");
    nameRes.add("My name is Dwarf. Now go get me those clock parts!");
    nameRes.add("Dwarf is the name. And no, I don't know who Snow White is.");
    //STORM  
    nameRes.add("I am the all mighty Evil Storm Cloud.");
    nameRes.add("I am the Evil Storm Cloud. Bow before me!");

  ///////////WEATHER RESPONSE LIST////////////
  ArrayList<String> weatherRes = new ArrayList<String>(10);
    //CHOO
    weatherRes.add("Brr...");
    weatherRes.add("*sniffle* It's so cold.");
    //MIDNIGHT
    weatherRes.add(username + ", it is quite dark here.");
    weatherRes.add("It is quite cold, " + username + ".");
    //SHEEP
    weatherRes.add("The weather is lovely today, " +username + ".");
    weatherRes.add("It's perfectly sunny today.");
    //GOLDEN
    weatherRes.add("What a bright day!");
    weatherRes.add("It's been much sunnier since you came along, " + username + ".");
    //MAJESTIC
    weatherRes.add(username + " I feel a bad omen is coming.");
    weatherRes.add("Today is quite misty.");
    //TOOTH
    weatherRes.add("Skies are cloudy here. That's why I am sleeping here today.");
    weatherRes.add("Not too cold today.");
    weatherRes.add("About 60 degrees F now.");
    //BALLOON
    weatherRes.add("Oh goodness. Those clouds spoil all the fun.");
    weatherRes.add("How toasty the sun is!");
    //DWARF
    weatherRes.add("The weather is alright.");
    weatherRes.add("Hurry and get me those parts before it rains!");
    //STORM
    weatherRes.add(username + ", I don't like today's weather. Not stormy enough.");
    weatherRes.add("I guess today is alright.")
  
}