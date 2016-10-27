package hu.tokingame.elso;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Vector;

/**
 * Created by davim on 2016. 10. 21..
 */

public class SzamologepActor extends Group {
    public MyLabel display;
    private MyLabel fx;
    private SzamologepActor szamologepActor;
    private java.lang.String jo = "PORFIKT";
    private java.lang.String rosz = "NEM";

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
                        display.setText(display.getText() + "0");
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
                        display.setText(display.getText() + "1");
                        System.out.println("1");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // 2-es gomb
                setPosition(900,129);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        display.setText(display.getText() + "2");
                        System.out.println("2");
                    }

                });
            }
        });addActor(new MyActorInit() {
            @Override
            void init() { // 3-es gomb
                setPosition(1059,124);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        display.setText(display.getText() + "3");
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
                        display.setText(display.getText() + "4");
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
                        display.setText(display.getText() + "5");
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
                        display.setText(display.getText() + "6");
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
                        display.setText(display.getText() + "7");
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
                        display.setText(display.getText() + "8");
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
                        display.setText(display.getText() + "9");
                        System.out.println("9");
                    }

                });
            }
        });
        addActor(new MyActorInit() {
            @Override
            void init() { // törlés gomb
                setPosition(1059,430);
                setSize(110,60);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if (display.getText().length()!= 0){
                            if(display.getText().toString().equals(rosz)) display.setText("");
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
                               int a = Integer.parseInt(display.getText().toString());
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
                setPosition(600,30);
                setSize(110,60);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if (display.getText().length() != 0 && !display.getText().toString().equals(jo) && !display.getText().toString().equals(rosz)){
                            if (display.getText().charAt(0)=='-'){
                                display.setText(display.getText().substring(1,display.getText().length()));
                            }else{
                                display.setText("-"+display.getText());
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
                setPosition(480,30);
                setSize(120,70);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        szamologepActor.addActor (fx = new MyLabel(kepletString(),MyLabel.style3));

                        fx.setPosition(100, 23);
                        System.out.println("FX");
                    }

                });
            }
        });

        display=new MyLabel("", MyLabel.style2);

        display.setPosition(740,510);
        display.setSize(400,100);
        display.setFontScale(2);
        display.setColor(0,0,0,1);
        display.debug();
        addActor(display);// kijelzo aktora


        setSize(1280, 720);


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

    public void osszevet(int bevitt){

        int u = Generator.getSorozatElemek().get(5);
        if(bevitt == u){
            display.setText(jo);
        }
        else{
            display.setText(rosz);
        }
    }

}
