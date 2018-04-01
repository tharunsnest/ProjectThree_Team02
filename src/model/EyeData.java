package model;

import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class EyeData {

    public static final String BLINK = "Blink";
    public static final String WINK_LEFT = "Wink Left";
    public static final String WINK_RIGHT = "Wink Right";
    public static final String LOOK_LEFT = "Look Left";
    public static final String LOOK_RIGHT = "Look Right";

    private boolean blink;
    private boolean winkLeft;
    private boolean winkRight;
    private boolean lookLeft;
    private boolean lookRight;

    public EyeData() {
        blink = false;
        winkLeft = false;
        winkRight = false;
        lookLeft = false;
        lookRight = false;
    }

    public EyeData(String jstr) {
        setFromString(jstr);
    }

    public EyeData(JsonObject jobj) {
        setFromJsonObject(jobj);
    }

    public boolean getBlink() {
        return blink;
    }

    public void setBlink(boolean blink) {
        this.blink = blink;
    }

    public boolean getWinkLeft() {
        return winkLeft;
    }

    public void setWinkLeft(boolean winkLeft) {
        this.winkLeft = winkLeft;
    }

    public boolean getWinkRight() {
        return winkRight;
    }

    public void setWinkRight(boolean winkRight) {
        this.winkRight = winkRight;
    }

    public boolean getLookLeft() {
        return lookLeft;
    }

    public void setLookLeft(boolean lookLeft) {
        this.lookLeft = lookLeft;
    }

    public boolean getLookRight() {
        return lookRight;
    }

    public void setLookRight(boolean lookRight) {
        this.lookRight = lookRight;
    }

    // TODO - this should be in the client controller
    public void setFromString(String jstr) {
        JsonReader reader = Json.createReader(new StringReader(jstr));
        JsonObject jobj = reader.readObject();
        reader.close();
        setFromJsonObject(jobj);
    }

    // TODO - this should be in the client controller
    public void setFromJsonObject(JsonObject jobj) {
        setBlink(jobj.getBoolean(BLINK));
        setWinkLeft(jobj.getBoolean(WINK_LEFT));
        setWinkRight(jobj.getBoolean(WINK_RIGHT));
        setLookLeft(jobj.getBoolean(LOOK_LEFT));
        setLookRight(jobj.getBoolean(LOOK_RIGHT));
    }
}