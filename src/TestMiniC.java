import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestMiniC {
	public static void main(String[] args) throws Exception {
		MiniCLexer lexer = new MiniCLexer( new ANTLRFileStream("test.c"));
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    MiniCParser parser = new MiniCParser(tokens);
	    ParseTree tree = parser.program();
	    // 여기부터 새로운 부분
	    ParseTreeWalker walker = new ParseTreeWalker();
	    walker.walk(new MiniCPrintListener(), tree);
	    //자바gui 사용하여파스트리 보는 코드
//	    JFrame frame = new JFrame("Antlr AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
//        JScrollPane scroll = new JScrollPane(panel);
//        scroll.getVerticalScrollBar().setUnitIncrement(30);
//        scroll.getHorizontalScrollBar().setUnitIncrement(30);
//        viewr.setScale(1.5);//scale a little
//        panel.add(viewr);
//        frame.add(scroll);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(2000,2000);
//        frame.setVisible(true);
	}
	
}