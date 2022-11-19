import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Start extends World
{
    public Start()
    {
        super(600, 700, 1);
        prepare();
    }
    private void prepare()
    {
        BtnStart btnStart = new BtnStart();
        addObject(btnStart,300,350);
    }
}