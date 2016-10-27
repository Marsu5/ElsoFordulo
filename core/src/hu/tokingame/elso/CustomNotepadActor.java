package hu.tokingame.elso;

import com.badlogic.gdx.scenes.scene2d.Group;

import java.util.Vector;

/**
 * Created by M on 10/27/2016.
 */

public class CustomNotepadActor extends Group {

    public Vector<MyLabel> notepadActors;
    public Vector sorozat;

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
    }


    public void generate() {
        //super.generate();
        Generator.setMaxM(Globals.maxM);
        Generator.setMaxSz(Globals.maxSz);
        Generator.setMinM(Globals.minM);
        Generator.setMinSz(Globals.minSz);
        Generator.Generat();
    }
}
