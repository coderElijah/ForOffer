
/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:ForOffer
 * PackageName: PACKAGE_NAME
 * Date: 2017/9/27 20:06
 */
public class ReplaceBlank {
    public String replaceSpace(StringBuffer str) {
        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i<str.length();i++){
            char s = str.charAt(i);
            if(s==' '){
                buffer.append("%20");
                continue;
            }
            buffer.append(s);
        }

        return buffer.toString();
    }
}

/**
 * 场景及功能：
 *
 * @Author elijahliu
 * @mthod a
 * @param null
 * @Date 2017/9/27 20:15
 * Return a
 *
 *
 * 题目描述
请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
