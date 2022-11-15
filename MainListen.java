import java.util.Stack;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class MainListen extends CalculatorBaseListener {

    private final Stack<Integer> stack = new Stack<>();

    public Integer getResult() {
        return stack.peek();
    }

    @Override
    public void exitAddSub(CalculatorParser.AddSubContext ctx) {
        int right = stack.pop();
        int left = stack.pop();
        int result;
        if (ctx.op.getType() == CalculatorParser.PLUS) {
            result = left + right;
        } else {
            result = left - right;
        }
        stack.push(result);
    }

    @Override
    public void exitInt(CalculatorParser.IntContext ctx) {
        stack.push(Integer.valueOf(ctx.INT().getText()));
    }

    @Override
    public void exitMulDiv(CalculatorParser.MulDivContext ctx) {
        int right = stack.pop();
        int left = stack.pop();
        int result;
        if (ctx.op.getType() == CalculatorParser.TIMES) {
            result = left * right;
        } else {
            result = left / right;
        }
        stack.push(result);
    }
    
    public static void main(String[] args) throws Exception {
        CharStream charStreams = CharStreams.fromFileName​("example.txt");
        CalculatorLexer lexer = new CalculatorLexer(charStreams);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //System.out.println(tokens.getText());

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expr(); // parse

        ParseTreeWalker walker = new ParseTreeWalker();
        MainListen listener = new MainListen();
        walker.walk(listener, tree);
        System.out.println(listener.getResult());
    }
    

}
