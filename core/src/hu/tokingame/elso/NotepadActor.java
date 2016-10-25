package hu.tokingame.elso;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;

import java.util.Vector;


/**
 * Created by M on 10/24/2016.
 */

public class NotepadActor extends Group {

    public NotepadActor notepadActor;
    public Vector<MyLabel> notepadActors;

    public NotepadActor() {
        notepadActors = new Vector<MyLabel>();
        for (int i = 0; i < 6; i++){
            MyLabel myLabel;
            addActor(myLabel = new MyLabel("asd",MyLabel.style));
            notepadActors.add(myLabel);
        }
        notepadActors.get()
    }
}
