package steven;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.interaction.SlashCommand;

public class Main {

    static int rng(int min, int max){

        int num = (int)(Math.random()*((max-min)+1))+min;
        return num;
    }


    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "ODk2MTc0MTM4NjgxNTk3OTky.YWDRNA.DBlhYq-nVb4gDUmCw4-DwBdtKUc";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();


        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {

            String msg = event.getMessageContent();


            //is (yes no maybe etc)
            if (msg.contains("?is")) {
                int num = rng(1,7);
                switch (num){
                    case 1: event.getChannel().sendMessage("not in my purview"); break;
                    case 2: event.getChannel().sendMessage("maybe :eyes:"); break;
                    case 3: event.getChannel().sendMessage("idk"); break;
                    case 4: event.getChannel().sendMessage("no comment :yawning_face: \nsorry my screenshotting friend"); break;
                    case 5: event.getChannel().sendMessage("i believe so"); break;
                    case 6: event.getChannel().sendMessage("no idea"); break;
                    case 7: event.getChannel().sendMessage("yes sir"); break;
                }

            }
            //where
            if (msg.contains("?wheres")) {
                int  num = rng(1,6);
                switch (num){
                    case 1: event.getChannel().sendMessage("in the flower box"); break;
                    case 2: event.getChannel().sendMessage("in the secret bunker"); break;
                    case 3: event.getChannel().sendMessage("in the shed"); break;
                    case 4: event.getChannel().sendMessage("in the camper"); break;
                    case 5: event.getChannel().sendMessage("in mexico"); break;
                    case 6: event.getChannel().sendMessage("at your moms house"); break;
                }
            }
            //scanner
            if (msg.contains("?scanner")) {
                int num = rng(1,6);
                switch (num){
                    case 1: event.getChannel().sendMessage("someone shitting in a bush"); break;
                    case 2: event.getChannel().sendMessage("alligator in an apartment complex"); break;
                    case 3: event.getChannel().sendMessage("Brian Laundrie BOLO"); break;
                    case 4: event.getChannel().sendMessage("bald white man"); break;
                    case 5: event.getChannel().sendMessage("24 people fighting"); break;
                    case 6: event.getChannel().sendMessage("white man on scooter pulled over"); break;
                }
            }
            //autogen brian sighting
            if (msg.contains("?spotted")) {
                int t1 = rng(1,5);
                int t2 = rng(1,5);
                int t3 = rng(1,4);
                int t4 = rng(1,6);

                String trait1 = "";
                String trait2 = "";
                String place = "";
                String action = "";

                switch(t1){
                    case 1: trait1="barefoot"; break;
                    case 2: trait1="bald"; break;
                    case 3: trait1="short"; break;
                    case 4: trait1="antisocial"; break;
                    case 5: trait1="gooberish"; break;
                }
                switch(t2){
                    case 1: trait2="hand tattoos"; break;
                    case 2: trait2="funny looking ears"; break;
                    case 3: trait2="a melon addiction"; break;
                    case 4: trait2="mediocre survival skills"; break;
                    case 5: trait2="the posture of a neanderthal"; break;
                }
                switch(t3){
                    case 1: place=" in Cancun, Mexico"; break;
                    case 2: place=" in North Port, Florida"; break;
                    case 3: place=" along the Appalachian Trail"; break;
                    case 4: place=" at a gas station in Georgia"; break;
                }
                switch(t4){
                    case 1: action="hugging a tree"; break;
                    case 2: action="eating a melon"; break;
                    case 3: action="dressed as a cop"; break;
                    case 4: action="evading law enforcement"; break;
                    case 5: action="hanging out with his dad"; break;
                    case 6: action="sitting criss cross applesauce"; break;
                }
                event.getChannel().sendMessage("A "+trait1+" white man with "+trait2+" has been spotted "+action+place);
            }
            //help
            if(msg.contains("?help")){
                event.getChannel().sendMessage("Welcome to Steven Botolino!! haha get it? like *BOT*olino?? because im a robot?? anyways... \n" +
                        "**is** - is brian alive?? is bertolino authorized to practice law in the state of florida?? is chris an accomplice?? \n" +
                        "**wheres** - wheres brian? wheres roberta? wheres chris? wheres the burner phone? \n" +
                        "**scanner** - stay up to date on the sarasota county police scanner shenanigans \n" +
                        "**spotted** - randomly generated brian sighting");
            }
            //do you even know the law???
            if(msg.contains("legal")){
                event.getChannel().sendMessage("do you even know the law");

            }

            if(msg.contains("door")&& !"896174138681597992".equals(event.getMessageAuthor().getIdAsString())){
                event.getChannel().sendMessage("With your face \uD83D\uDE42 and the beautiful eyes \uD83D\uDC40 and the conversation \uD83D\uDCAC with the little white lies \uD83E\uDD0D and the faded picture of a beautiful night \uD83C\uDF03  you *breathes* CARRY ME FROM YOUR CARR \uD83D\uDE97 UP THE STAIRS and I broke down crying :sob: was she worth this mess? \uD83E\uDDF9*breathes* after everything and that little black dress \uD83D\uDC57 \uD83D\uDDA4 after everything I must confess \uD83D\uDE4F I... neeeedd youuuu");
            }
            if(msg.equalsIgnoreCase("hey steven")){
                int num = rng(1,5);

                switch(num){
                    case 1: event.getChannel().sendMessage("i know looks can be deceiving but i know i saw a light in you"); break;
                    case 2: event.getChannel().sendMessage("boy you might have me believing i don't always have to be alone"); break;
                    case 3: event.getChannel().sendMessage("i've been holding back this feeling so i've got some things to say to you"); break;
                    case 4: event.getChannel().sendMessage("why are people always leaving? i think you and i should stay the same"); break;
                    case 5: event.getChannel().sendMessage("i could give you 50 reasons why i should be the one you choose"); break;
                }

            }
            if(msg.contains("drunk")&& !"896174138681597992".equals(event.getMessageAuthor().getIdAsString())){
                event.getChannel().sendMessage("im drunk :champagne: in the back of the car:blue_car: and i cried like a baby :sob:  coming home from the bar (OH) said im fine :thumbsup: but it wasnt true :thumbsdown:  I DONT WANNA KEEP SECRETS:lock: JUST TO KEEP YOU:couple: and i snuck in through the garden gate :tulip: every night that summer:sunny: just to seal my fate :book: and i scream for whatever its worth I LOVE YOU :smiling_face_with_3_hearts:  AINT THAT THE WORST :triumph: THING YOU EVER HEARD:ear:");
            }
            if(((msg.contains("hand")||msg.contains("touch"))&& !"896174138681597992".equals(event.getMessageAuthor().getIdAsString()))){
                event.getChannel().sendMessage("your midas touch \uD83D\uDC9B on the chevy door\uD83D\uDE97  november flush \uD83C\uDF2C️ and your flannel cure \uD83E\uDDE5 \"this dorm was once a madhouse\"\uD83E\uDD2A  i made a joke \"well it made for me\":smilecry:  how evergreen our group of friends \uD83C\uDF32 don't think we'll say that word again \uD83D\uDEAB and soon they'll have the nerve to \uD83D\uDCAA deck the halls that we once walked through 1️⃣ one for the money 2️⃣ two for the show i never was ready so i watched you go \uD83E\uDD7A sometimes you just dont know the answer \uD83C\uDFC1 til someones on their knees and asks you ❓ she wouldve made such a lovely bride \uD83D\uDC70\u200D♀️ what a shame shes fucked in the head they said \uD83D\uDCAC but you'll find the real thing instead :kiss_woman_man: she'll patch up your tapestry that i shred");
            }
            if(((msg.contains(" king ")||msg.contains("bones"))&& !"896174138681597992".equals(event.getMessageAuthor().getIdAsString()))){
                event.getChannel().sendMessage("is this the end of all the endings \uD83D\uDD50 my broken bones are mending \uD83E\uDDB4 with all these nights \uD83C\uDF03 we're spending \uD83D\uDCB0 up on the roof \uD83C\uDFE9 with a schoolgirl crushhhhhhh \uD83D\uDE18 drinking beer out of plastics cupssss \uD83C\uDF7B say you fancy me not fancy stuff \uD83E\uDD11 baby all at once this is enough");
            }
            if(msg.contains("heehee")){
                event.getChannel().sendMessage("https://www.youtube.com/watch?v=r6wb1NKa1C4&ab_channel=BoreCure");

            }


        });

        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
        //event.getChannel().sendMessage(""); break;

    }

}
