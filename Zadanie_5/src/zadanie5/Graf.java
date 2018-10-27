package zadanie5;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graf {

    private int n;
    private LinkedList[] tab;

    public Graf(String lan) {

        StringTokenizer st = new StringTokenizer(lan,"() ,");
        n = Integer.parseInt(st.nextToken());
        tab = new LinkedList[n];

        for(int i=0; i<n; ++i)
            tab[i] = new LinkedList();

        while(st.hasMoreTokens()) {
            tab[Integer.parseInt(st.nextToken())].add(new Integer(st.nextToken()));
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        StringTokenizer st;

        while(i != tab.length){
            sb.append(i);
            sb.append(": ");
            st = new StringTokenizer(String.valueOf(tab[i]),"[] ,");

            if(!tab[i].isEmpty()){
                while(st.hasMoreTokens()){
                    sb.append(Integer.parseInt(st.nextToken()));
                    sb.append(" ");
                }
            }

            sb.append("\n");
            i++;
        }

        return sb.toString();
    }
}