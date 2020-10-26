package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {

        LinkedListStack<Character> data = new LinkedListStack<Character>();

        if (str == null)
        {
            return true;
        }
        if (str.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
            {
                data.push(str.charAt(i));
            }
            else
                {
                if (data.size() == 0)
                {
                    return false;
                }
                switch (str.charAt(i))
                {

                    case ')':
                        if (data.pop() != '(')
                        {
                            return false;
                        }
                        break;
                    case '}':
                        if (data.pop() != '{')
                        {
                            return false;
                        }
                        break;

                    case ']':
                        if (data.pop() != '[')
                        {
                            return false;
                        }
                        break;
                }
            }
        }
        return data.size() == 0;
    }
}
