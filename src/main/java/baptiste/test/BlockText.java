package baptiste.test;

public class BlockText {
    public static void main(String[] args) {
        var myStr = """
                test 1
                """;

        System.out.println(myStr);

        var json = """
                {"menu": {
                  "id": "file",
                  "value": "File",
                  "popup": {
                    "menuitem": [
                      {"value": "New", "onclick": "CreateNewDoc()"},
                      {"value": "Open", "onclick": "OpenDoc()"},
                      {"value": "Close", "onclick": "CloseDoc()"}
                    ]
                  }
                }}
                """;
        System.out.println(json);

        var indentMagik = """
                je suis indenté
                    en fonction de l'élément le plus à gauche
        """;
        System.out.println(indentMagik);

        var escape = """
                escaping \"""
                escaping \
                escaping
                no trailling space                       
                """;
        System.out.println(escape);


    }
}
