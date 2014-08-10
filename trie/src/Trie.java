import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * **************
 * 　数据结构复习
 * 　　　Trie树
 * ***************
 */

public class Trie {
    //根节点root
    private Vertex root;

    protected class Vertex {
        protected int words;
        protected int prefixes;
        protected Vertex[] edges;   //子节点

        Vertex() {
            words = 0;
            prefixes = 0;
            edges = new Vertex[26];
            for (int i = 0; i < edges.length; i++) {
                edges[i] = null;
            }
        }
    }

    public Trie() {
        root = new Vertex();
    }

    public List<String> listAllWords() {
        List<String> words = new ArrayList<String>();
        Vertex[] edges = root.edges;

        for (int i = 0; i < edges.length; i++) {
            if (edges[i] != null) {
                String word = "" + (char) ('a' + i);
                depthFirstSearchWords(words, edges[i], word);
            }
        }
        return words;
    }

    private void depthFirstSearchWords(List words, Vertex vertex, String wordSegment) {
        Vertex[] edges = vertex.edges;
        boolean hasChildren = false;
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] != null) {
                hasChildren = true;
                String newword = wordSegment + (char) ('a' + i);
                depthFirstSearchWords(words, edges[i], newword);
            }
        }
        //遍历26个指针，发现该节点没有孩子，即为叶子节点
        if (!hasChildren) {
            words.add(wordSegment);
        }
    }

    public int countPrefixes(String prefix) {
        return countPrefixes(root, prefix);
    }

    private int countPrefixes(Vertex vertex, String prefixSegment) {
        //到达根节点
        if (prefixSegment.length() == 0) {
            return vertex.prefixes;
        }

        char c = prefixSegment.charAt(0);
        int index = c - 'a';
        //不存在该单词
        if (vertex.edges[index] == null) {
            return 0;
        } else {
            return countPrefixes(vertex.edges[index], prefixSegment.substring(1));
        }
    }

    public int countWords(String word) {
        return countWords(root, word);
    }

    private int countWords(Vertex vertex, String wordSegment) {
        if (wordSegment.length() == 0) {
            return vertex.words;
        }

        char c = wordSegment.charAt(0);
        int index = c - 'a';
        if (vertex.edges[index] == null) {
            return 0;
        } else {
            return countWords(vertex.edges[index], wordSegment.substring(1));
        }
    }

    public void addWord(String word) {
        System.out.println("新增单词'"+word+"'到Trie树");
        addWord(root, word);
    }

    private void addWord(Vertex vertex, String wordSegment) {
//        该单词所有字符均已添加
        if (wordSegment.length() == 0) {
            vertex.words++;
        } else {
            vertex.prefixes++;
            char c = Character.toLowerCase(wordSegment.charAt(0));
            int index = c - 'a';
            //子节点不存在
            if (vertex.edges[index] == null) {
                System.out.println("新增一个节点: " + c);
                vertex.edges[index] = new Vertex();
            }

            addWord(vertex.edges[index], wordSegment.substring(1));
        }
    }

    public static void main(String[] args) {
        Trie trie;
        trie = new Trie();

        trie.addWord("Chinese");
        trie.addWord("China");
        trie.addWord("Chile");
        trie.addWord("Base");
        trie.addWord("Banana");
        trie.addWord("America");
        trie.addWord("American");

        System.out.println("trie.root.prefixes: " + trie.root.prefixes);
        System.out.println("trie.root.words: " + trie.root.words);

        List<String> list = trie.listAllWords();
        Iterator iterlist = list.listIterator();

        while (iterlist.hasNext()) {
            String s = (String) iterlist.next();
            System.out.println(s);
        }

        int count = trie.countPrefixes("ch");
        int count1 = trie.countWords("america");
        System.out.println("the count of c prefixes: " + count);
        System.out.println("the count of countwords: " + count1);
    }
}