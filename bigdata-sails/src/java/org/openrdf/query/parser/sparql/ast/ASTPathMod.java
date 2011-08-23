/* Generated By:JJTree: Do not edit this line. ASTPathMod.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.openrdf.query.parser.sparql.ast;

public class ASTPathMod extends SimpleNode {

	private long lowerBound = Long.MIN_VALUE;

	private long upperBound = Long.MIN_VALUE;

	public ASTPathMod(int id) {
		super(id);
	}

	public ASTPathMod(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data)
		throws VisitorException
	{
		return visitor.visit(this, data);
	}

	public void setLowerBound(long lowerBound) {
		this.lowerBound = lowerBound;
	}

	public long getLowerBound() {
		return lowerBound;
	}

	public void setUpperBound(long upperBound) {
		this.upperBound = upperBound;
	}

	public long getUpperBound() {
		return upperBound;
	}

}
/* JavaCC - OriginalChecksum=1a51081ed2eaf8b7e8d74a420479b725 (do not edit this line) */
