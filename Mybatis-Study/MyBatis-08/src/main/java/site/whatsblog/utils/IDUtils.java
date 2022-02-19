package site.whatsblog.utils;

import java.util.UUID;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/18 22:33</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@SuppressWarnings("all")
public class IDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
