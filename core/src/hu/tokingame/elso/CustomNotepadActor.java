package hu.tokingame.elso;

import com.badlogic.gdx.scenes.scene2d.Group;

import java.util.Vector;

/**
 * Created by M on 10/27/2016.
 */

public class CustomNotepadActor extends Group {

    public Vector<MyLabel> notepadActors;
    public Vector sorozat;
    private static MyLabel hibaszaml;

    public CustomNotepadActor() {
        generate();
        sorozat = (Vector)Generator.getSorozatElemek().clone();
        notepadActors = new Vector<MyLabel>();
        for (int i = 0; i < 6; i++){
            MyLabel myLabel;
            addActor(myLabel = new MyLabel("asd",MyLabel.style3));
            notepadActors.add(myLabel);
        }
        notepadActors.get(0).setPosition(100, 610);
        notepadActors.get(0).setText(sorozat.get(0)+"");
        notepadActors.get(1).setPosition(100, 550);
        notepadActors.get(1).setText(sorozat.get(1)+"");
        notepadActors.get(2).setPosition(100, 490);
        notepadActors.get(2).setText(sorozat.get(2)+"");
        notepadActors.get(3).setPosition(100, 430);
        notepadActors.get(3).setText(sorozat.get(3)+"");
        notepadActors.get(4).setPosition(100, 365);
        notepadActors.get(4).setText(sorozat.get(4)+"");
        notepadActors.get(5).setPosition(100, 304);
        notepadActors.get(5).setText("?");
        setSize(MyScreen.WORLD_WIDTH,MyScreen.WORLD_HEIGHT);

        hibaszaml = new MyLabel("Próbálkozások: 0/5", MyLabel.style3);
        addActor(hibaszaml);
        hibaszaml.setPosition(85,23);

        setSize(1280, 720);
    }


    public void generate() {
        //super.generate();
        if(Globals.nehez){
            Generator.setMaxM(3);
            Generator.setMaxSz(2);
            Generator.setMinM(2);
            Generator.setMinSz(1);
            Generator.Generat();
    }else{
            Generator.setMaxM(2);
            Generator.setMaxSz(1);
            Generator.setMinM(1);
            Generator.setMinSz(1);
            Generator.Generat();
        }
    }
}
