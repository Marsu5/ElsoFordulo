package hu.tokingame.elso;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by davim on 2016. 10. 21..
 */

public class SzamologepActor extends Group {
    public MyLabel display;

    public SzamologepActor() {
        display=new MyLabel("", MyLabel.style2);

        display.setPosition(740,550);


        addActor(display);
        addActor(new MyActorInit() {
            @Override
            void init() {
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
        void init() {
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
            void init() {
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
            void init() {
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
            void init() {
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
            void init() {
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
            void init() {
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
            void init() {
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
            void init() {
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
            void init() {
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
            void init() {
                setPosition(1059,430);
                setSize(110,60);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        if (display.getText().length()!= 0){
                            display.setText(display.getText().substring(0,display.getText().length()-1));
                            System.out.println("DEL");
                        }
                    }

                });
            }
        });



    }


}
