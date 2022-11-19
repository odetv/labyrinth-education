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
        BtnPetunjuk btnPetunjuk = new BtnPetunjuk();
        addObject(btnPetunjuk,198,455);
        BtnTentang btnTentang = new BtnTentang();
        addObject(btnTentang,404,455);
        TextTitle textTitle = new TextTitle();
        addObject(textTitle,300,245);
    }
}