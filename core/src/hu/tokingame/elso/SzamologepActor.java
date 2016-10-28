package hu.tokingame.elso;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.Game;

/**
 * Created by davim on 2016. 10. 21..
 */

public class SzamologepActor extends Group {
    public MyLabel display;
    public static Game game;
    private SzamologepActor szamologepActor;
    private java.lang.String jo = "OK"; //amit kiír ha helyes a válasz
    private java.lang.String rosz = "ERROR"; // ha rossz
    private int maxhibak = 5; // hányszor hibázhat
    private int hibak = 0; // hányszor hibázott
    private final int maxHosz = 10;


    public SzamologepActor()
    {
        addActor(new MyActorInit() {
            @Override
            void init() { // 0-as gomb
                setPosition(730,30);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "0");
                        System.out.println("0");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
        @Override
        void init() { // 1-es gomb
            setPosition(738,134);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "1");
                        System.out.println("1");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // 2-es gomb
                setPosition(900,134);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "2");
                        System.out.println("2");
                    }

                });
            }
        });addActor(new MyActorInit() {
            @Override
            void init() { // 3-es gomb
                setPosition(1059,134);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "3");
                        System.out.println("3");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // 4-es gomb
                setPosition(736,233);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "4");
                        System.out.println("4");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // 5-es gomb
                setPosition(900,223);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "5");
                        System.out.println("5");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // 6-es gomb
                setPosition(1059,224);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "6");
                        System.out.println("6");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // 7-es gomb
                setPosition(740,322);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "7");
                        System.out.println("7");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // 8-es gomb
                setPosition(900,321);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "8");
                        System.out.println("8");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // 9-es gomb
                setPosition(1059,315);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if(!(display.getText().length()>= maxHosz || display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString()))) display.setText(display.getText() + "9");
                        System.out.println("9");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // törlés gomb
                setPosition(1059,405);
                setSize(110,55);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if (display.getText().length()!= 0){
                            if(display.getText().toString().equals(rosz) || display.getText().toString().equals(jo) || display.getText().toString().equals(kepletString().toString())) display.setText("");
                            else display.setText(display.getText().substring(0,display.getText().length()-1));
                            System.out.println("DEL");
                        }
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // egyenlőség jel gomb
                setPosition(890, 32);
                setSize(290, 80);
                addListener(new ClickListener(){
                   public void clicked(InputEvent event, float x, float y){
                       super.clicked(event, x, y);
                       if(display.getText().length() > 0){
                           try{
                               long a = Long.parseLong(display.getText().toString());
                               osszevet(a);
                           }catch (Exception e){
                               System.out.println("huehue");
                           }
                       }
                   }
                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // + - váltó gomb
                setPosition(750,405);
                setSize(110,49);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if (display.getText().length() != 0 && !display.getText().toString().equals(jo) && !display.getText().toString().equals(rosz)){
                            if(!display.getText().toString().equals(kepletString())){
                                if (display.getText().charAt(0)=='-'){
                                    display.setText(display.getText().substring(1,display.getText().length()));
                                }else{
                                    display.setText("-"+display.getText());
                                }
                            }
                        }else{
                            display.setText("-");
                        }

                    }

                });
            }
        });
        szamologepActor=this;
        addActor(new MyActorInit() {
            @Override
            void init() { // fx gomb
                setPosition(900,405);
                setSize(120,55);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        display.setText(kepletString().toString());
                        System.out.println("FX");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() {
                setPosition(750,461);
                setSize(120,45);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new MenuScreen(game));
                    }

                });
            }
        });

        display=new MyLabel("", MyLabel.style2);

        display.setPosition(740,510);
        display.setSize(400,100);
        display.setFontScale(1.5f);
        display.setColor(0,0,0,1);
        //display.debug();
        addActor(display);// számológép kijelző aktora


        setSize(MyScreen.WORLD_WIDTH,MyScreen.WORLD_HEIGHT);


    }


    private java.lang.String kepletString(){
        java.lang.String s = "x";
        java.lang.String keplet = Generator.getFuggveny().toString();
        keplet = keplet.replace(",", "");
        keplet = keplet.replace(" ","");
        keplet = keplet.substring(2,keplet.length()-1);
        s += keplet;
        return s;
    }

    public void osszevet(Long bevitt){

        long u = Generator.getSorozatElemek().get(5);
        if(bevitt == u){
            display.setText(jo);
        }
        else{
            display.setText(rosz);
            hibak++;
            NotepadActor.setHibaszaml("Próbálkozások: "+hibak +"/"+ maxhibak);
            if(hibak == maxhibak) {
                if(Globals.egyediMode) {
                    game.setScreen(new CustomGameScreen(game));
                }else{
                    game.setScreen(new GameScreen(game));
                }
            }
        }
    }

}
