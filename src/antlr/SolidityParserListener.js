// Generated from grammar/SolidityParser.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by SolidityParser.
function SolidityParserListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

SolidityParserListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
SolidityParserListener.prototype.constructor = SolidityParserListener;

// Enter a parse tree produced by SolidityParser#sourceUnit.
SolidityParserListener.prototype.enterSourceUnit = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#sourceUnit.
SolidityParserListener.prototype.exitSourceUnit = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#pragmaDirective.
SolidityParserListener.prototype.enterPragmaDirective = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#pragmaDirective.
SolidityParserListener.prototype.exitPragmaDirective = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#importDirective.
SolidityParserListener.prototype.enterImportDirective = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#importDirective.
SolidityParserListener.prototype.exitImportDirective = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#importAliases.
SolidityParserListener.prototype.enterImportAliases = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#importAliases.
SolidityParserListener.prototype.exitImportAliases = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#path.
SolidityParserListener.prototype.enterPath = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#path.
SolidityParserListener.prototype.exitPath = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#symbolAliases.
SolidityParserListener.prototype.enterSymbolAliases = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#symbolAliases.
SolidityParserListener.prototype.exitSymbolAliases = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#contractDefinition.
SolidityParserListener.prototype.enterContractDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#contractDefinition.
SolidityParserListener.prototype.exitContractDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#interfaceDefinition.
SolidityParserListener.prototype.enterInterfaceDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#interfaceDefinition.
SolidityParserListener.prototype.exitInterfaceDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#libraryDefinition.
SolidityParserListener.prototype.enterLibraryDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#libraryDefinition.
SolidityParserListener.prototype.exitLibraryDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#inheritanceSpecifierList.
SolidityParserListener.prototype.enterInheritanceSpecifierList = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#inheritanceSpecifierList.
SolidityParserListener.prototype.exitInheritanceSpecifierList = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#inheritanceSpecifier.
SolidityParserListener.prototype.enterInheritanceSpecifier = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#inheritanceSpecifier.
SolidityParserListener.prototype.exitInheritanceSpecifier = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#contractBodyElement.
SolidityParserListener.prototype.enterContractBodyElement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#contractBodyElement.
SolidityParserListener.prototype.exitContractBodyElement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#namedArgument.
SolidityParserListener.prototype.enterNamedArgument = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#namedArgument.
SolidityParserListener.prototype.exitNamedArgument = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#callArgumentList.
SolidityParserListener.prototype.enterCallArgumentList = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#callArgumentList.
SolidityParserListener.prototype.exitCallArgumentList = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#identifierPath.
SolidityParserListener.prototype.enterIdentifierPath = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#identifierPath.
SolidityParserListener.prototype.exitIdentifierPath = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#modifierInvocation.
SolidityParserListener.prototype.enterModifierInvocation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#modifierInvocation.
SolidityParserListener.prototype.exitModifierInvocation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#visibility.
SolidityParserListener.prototype.enterVisibility = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#visibility.
SolidityParserListener.prototype.exitVisibility = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#parameterList.
SolidityParserListener.prototype.enterParameterList = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#parameterList.
SolidityParserListener.prototype.exitParameterList = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#parameterDeclaration.
SolidityParserListener.prototype.enterParameterDeclaration = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#parameterDeclaration.
SolidityParserListener.prototype.exitParameterDeclaration = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#constructorDefinition.
SolidityParserListener.prototype.enterConstructorDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#constructorDefinition.
SolidityParserListener.prototype.exitConstructorDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#stateMutability.
SolidityParserListener.prototype.enterStateMutability = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#stateMutability.
SolidityParserListener.prototype.exitStateMutability = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#overrideSpecifier.
SolidityParserListener.prototype.enterOverrideSpecifier = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#overrideSpecifier.
SolidityParserListener.prototype.exitOverrideSpecifier = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#functionDefinition.
SolidityParserListener.prototype.enterFunctionDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#functionDefinition.
SolidityParserListener.prototype.exitFunctionDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#modifierDefinition.
SolidityParserListener.prototype.enterModifierDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#modifierDefinition.
SolidityParserListener.prototype.exitModifierDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#fallbackFunctionDefinition.
SolidityParserListener.prototype.enterFallbackFunctionDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#fallbackFunctionDefinition.
SolidityParserListener.prototype.exitFallbackFunctionDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#receiveFunctionDefinition.
SolidityParserListener.prototype.enterReceiveFunctionDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#receiveFunctionDefinition.
SolidityParserListener.prototype.exitReceiveFunctionDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#structDefinition.
SolidityParserListener.prototype.enterStructDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#structDefinition.
SolidityParserListener.prototype.exitStructDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#structMember.
SolidityParserListener.prototype.enterStructMember = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#structMember.
SolidityParserListener.prototype.exitStructMember = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#enumDefinition.
SolidityParserListener.prototype.enterEnumDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#enumDefinition.
SolidityParserListener.prototype.exitEnumDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#userDefinedValueTypeDefinition.
SolidityParserListener.prototype.enterUserDefinedValueTypeDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#userDefinedValueTypeDefinition.
SolidityParserListener.prototype.exitUserDefinedValueTypeDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#stateVariableDeclaration.
SolidityParserListener.prototype.enterStateVariableDeclaration = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#stateVariableDeclaration.
SolidityParserListener.prototype.exitStateVariableDeclaration = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#constantVariableDeclaration.
SolidityParserListener.prototype.enterConstantVariableDeclaration = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#constantVariableDeclaration.
SolidityParserListener.prototype.exitConstantVariableDeclaration = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#eventParameter.
SolidityParserListener.prototype.enterEventParameter = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#eventParameter.
SolidityParserListener.prototype.exitEventParameter = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#eventDefinition.
SolidityParserListener.prototype.enterEventDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#eventDefinition.
SolidityParserListener.prototype.exitEventDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#errorParameter.
SolidityParserListener.prototype.enterErrorParameter = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#errorParameter.
SolidityParserListener.prototype.exitErrorParameter = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#errorDefinition.
SolidityParserListener.prototype.enterErrorDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#errorDefinition.
SolidityParserListener.prototype.exitErrorDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#usingDirective.
SolidityParserListener.prototype.enterUsingDirective = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#usingDirective.
SolidityParserListener.prototype.exitUsingDirective = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#typeName.
SolidityParserListener.prototype.enterTypeName = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#typeName.
SolidityParserListener.prototype.exitTypeName = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#elementaryTypeName.
SolidityParserListener.prototype.enterElementaryTypeName = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#elementaryTypeName.
SolidityParserListener.prototype.exitElementaryTypeName = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#functionTypeName.
SolidityParserListener.prototype.enterFunctionTypeName = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#functionTypeName.
SolidityParserListener.prototype.exitFunctionTypeName = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#variableDeclaration.
SolidityParserListener.prototype.enterVariableDeclaration = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#variableDeclaration.
SolidityParserListener.prototype.exitVariableDeclaration = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#dataLocation.
SolidityParserListener.prototype.enterDataLocation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#dataLocation.
SolidityParserListener.prototype.exitDataLocation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#UnaryPrefixOperation.
SolidityParserListener.prototype.enterUnaryPrefixOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#UnaryPrefixOperation.
SolidityParserListener.prototype.exitUnaryPrefixOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#PrimaryExpression.
SolidityParserListener.prototype.enterPrimaryExpression = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#PrimaryExpression.
SolidityParserListener.prototype.exitPrimaryExpression = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#OrderComparison.
SolidityParserListener.prototype.enterOrderComparison = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#OrderComparison.
SolidityParserListener.prototype.exitOrderComparison = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#Conditional.
SolidityParserListener.prototype.enterConditional = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#Conditional.
SolidityParserListener.prototype.exitConditional = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#PayableConversion.
SolidityParserListener.prototype.enterPayableConversion = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#PayableConversion.
SolidityParserListener.prototype.exitPayableConversion = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#Assignment.
SolidityParserListener.prototype.enterAssignment = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#Assignment.
SolidityParserListener.prototype.exitAssignment = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#UnarySuffixOperation.
SolidityParserListener.prototype.enterUnarySuffixOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#UnarySuffixOperation.
SolidityParserListener.prototype.exitUnarySuffixOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#ShiftOperation.
SolidityParserListener.prototype.enterShiftOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#ShiftOperation.
SolidityParserListener.prototype.exitShiftOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#BitAndOperation.
SolidityParserListener.prototype.enterBitAndOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#BitAndOperation.
SolidityParserListener.prototype.exitBitAndOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#FunctionCall.
SolidityParserListener.prototype.enterFunctionCall = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#FunctionCall.
SolidityParserListener.prototype.exitFunctionCall = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#IndexRangeAccess.
SolidityParserListener.prototype.enterIndexRangeAccess = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#IndexRangeAccess.
SolidityParserListener.prototype.exitIndexRangeAccess = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#NewExpression.
SolidityParserListener.prototype.enterNewExpression = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#NewExpression.
SolidityParserListener.prototype.exitNewExpression = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#IndexAccess.
SolidityParserListener.prototype.enterIndexAccess = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#IndexAccess.
SolidityParserListener.prototype.exitIndexAccess = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#AddSubOperation.
SolidityParserListener.prototype.enterAddSubOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#AddSubOperation.
SolidityParserListener.prototype.exitAddSubOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#BitOrOperation.
SolidityParserListener.prototype.enterBitOrOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#BitOrOperation.
SolidityParserListener.prototype.exitBitOrOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#ExpOperation.
SolidityParserListener.prototype.enterExpOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#ExpOperation.
SolidityParserListener.prototype.exitExpOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#AndOperation.
SolidityParserListener.prototype.enterAndOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#AndOperation.
SolidityParserListener.prototype.exitAndOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#InlineArray.
SolidityParserListener.prototype.enterInlineArray = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#InlineArray.
SolidityParserListener.prototype.exitInlineArray = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#OrOperation.
SolidityParserListener.prototype.enterOrOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#OrOperation.
SolidityParserListener.prototype.exitOrOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#MemberAccess.
SolidityParserListener.prototype.enterMemberAccess = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#MemberAccess.
SolidityParserListener.prototype.exitMemberAccess = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#MulDivModOperation.
SolidityParserListener.prototype.enterMulDivModOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#MulDivModOperation.
SolidityParserListener.prototype.exitMulDivModOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#FunctionCallOptions.
SolidityParserListener.prototype.enterFunctionCallOptions = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#FunctionCallOptions.
SolidityParserListener.prototype.exitFunctionCallOptions = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#BitXorOperation.
SolidityParserListener.prototype.enterBitXorOperation = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#BitXorOperation.
SolidityParserListener.prototype.exitBitXorOperation = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#Tuple.
SolidityParserListener.prototype.enterTuple = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#Tuple.
SolidityParserListener.prototype.exitTuple = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#EqualityComparison.
SolidityParserListener.prototype.enterEqualityComparison = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#EqualityComparison.
SolidityParserListener.prototype.exitEqualityComparison = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#MetaType.
SolidityParserListener.prototype.enterMetaType = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#MetaType.
SolidityParserListener.prototype.exitMetaType = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#assignOp.
SolidityParserListener.prototype.enterAssignOp = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#assignOp.
SolidityParserListener.prototype.exitAssignOp = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#tupleExpression.
SolidityParserListener.prototype.enterTupleExpression = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#tupleExpression.
SolidityParserListener.prototype.exitTupleExpression = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#inlineArrayExpression.
SolidityParserListener.prototype.enterInlineArrayExpression = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#inlineArrayExpression.
SolidityParserListener.prototype.exitInlineArrayExpression = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#identifier.
SolidityParserListener.prototype.enterIdentifier = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#identifier.
SolidityParserListener.prototype.exitIdentifier = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#literal.
SolidityParserListener.prototype.enterLiteral = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#literal.
SolidityParserListener.prototype.exitLiteral = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#booleanLiteral.
SolidityParserListener.prototype.enterBooleanLiteral = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#booleanLiteral.
SolidityParserListener.prototype.exitBooleanLiteral = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#stringLiteral.
SolidityParserListener.prototype.enterStringLiteral = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#stringLiteral.
SolidityParserListener.prototype.exitStringLiteral = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#hexStringLiteral.
SolidityParserListener.prototype.enterHexStringLiteral = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#hexStringLiteral.
SolidityParserListener.prototype.exitHexStringLiteral = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#unicodeStringLiteral.
SolidityParserListener.prototype.enterUnicodeStringLiteral = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#unicodeStringLiteral.
SolidityParserListener.prototype.exitUnicodeStringLiteral = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#numberLiteral.
SolidityParserListener.prototype.enterNumberLiteral = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#numberLiteral.
SolidityParserListener.prototype.exitNumberLiteral = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#block.
SolidityParserListener.prototype.enterBlock = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#block.
SolidityParserListener.prototype.exitBlock = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#uncheckedBlock.
SolidityParserListener.prototype.enterUncheckedBlock = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#uncheckedBlock.
SolidityParserListener.prototype.exitUncheckedBlock = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#statement.
SolidityParserListener.prototype.enterStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#statement.
SolidityParserListener.prototype.exitStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#simpleStatement.
SolidityParserListener.prototype.enterSimpleStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#simpleStatement.
SolidityParserListener.prototype.exitSimpleStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#ifStatement.
SolidityParserListener.prototype.enterIfStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#ifStatement.
SolidityParserListener.prototype.exitIfStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#forStatement.
SolidityParserListener.prototype.enterForStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#forStatement.
SolidityParserListener.prototype.exitForStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#whileStatement.
SolidityParserListener.prototype.enterWhileStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#whileStatement.
SolidityParserListener.prototype.exitWhileStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#doWhileStatement.
SolidityParserListener.prototype.enterDoWhileStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#doWhileStatement.
SolidityParserListener.prototype.exitDoWhileStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#continueStatement.
SolidityParserListener.prototype.enterContinueStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#continueStatement.
SolidityParserListener.prototype.exitContinueStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#breakStatement.
SolidityParserListener.prototype.enterBreakStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#breakStatement.
SolidityParserListener.prototype.exitBreakStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#tryStatement.
SolidityParserListener.prototype.enterTryStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#tryStatement.
SolidityParserListener.prototype.exitTryStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#catchClause.
SolidityParserListener.prototype.enterCatchClause = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#catchClause.
SolidityParserListener.prototype.exitCatchClause = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#returnStatement.
SolidityParserListener.prototype.enterReturnStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#returnStatement.
SolidityParserListener.prototype.exitReturnStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#emitStatement.
SolidityParserListener.prototype.enterEmitStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#emitStatement.
SolidityParserListener.prototype.exitEmitStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#revertStatement.
SolidityParserListener.prototype.enterRevertStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#revertStatement.
SolidityParserListener.prototype.exitRevertStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#assemblyStatement.
SolidityParserListener.prototype.enterAssemblyStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#assemblyStatement.
SolidityParserListener.prototype.exitAssemblyStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#variableDeclarationList.
SolidityParserListener.prototype.enterVariableDeclarationList = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#variableDeclarationList.
SolidityParserListener.prototype.exitVariableDeclarationList = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#variableDeclarationTuple.
SolidityParserListener.prototype.enterVariableDeclarationTuple = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#variableDeclarationTuple.
SolidityParserListener.prototype.exitVariableDeclarationTuple = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#variableDeclarationStatement.
SolidityParserListener.prototype.enterVariableDeclarationStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#variableDeclarationStatement.
SolidityParserListener.prototype.exitVariableDeclarationStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#expressionStatement.
SolidityParserListener.prototype.enterExpressionStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#expressionStatement.
SolidityParserListener.prototype.exitExpressionStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#mappingType.
SolidityParserListener.prototype.enterMappingType = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#mappingType.
SolidityParserListener.prototype.exitMappingType = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#mappingKeyType.
SolidityParserListener.prototype.enterMappingKeyType = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#mappingKeyType.
SolidityParserListener.prototype.exitMappingKeyType = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulStatement.
SolidityParserListener.prototype.enterYulStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulStatement.
SolidityParserListener.prototype.exitYulStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulBlock.
SolidityParserListener.prototype.enterYulBlock = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulBlock.
SolidityParserListener.prototype.exitYulBlock = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulVariableDeclaration.
SolidityParserListener.prototype.enterYulVariableDeclaration = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulVariableDeclaration.
SolidityParserListener.prototype.exitYulVariableDeclaration = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulAssignment.
SolidityParserListener.prototype.enterYulAssignment = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulAssignment.
SolidityParserListener.prototype.exitYulAssignment = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulIfStatement.
SolidityParserListener.prototype.enterYulIfStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulIfStatement.
SolidityParserListener.prototype.exitYulIfStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulForStatement.
SolidityParserListener.prototype.enterYulForStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulForStatement.
SolidityParserListener.prototype.exitYulForStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulSwitchCase.
SolidityParserListener.prototype.enterYulSwitchCase = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulSwitchCase.
SolidityParserListener.prototype.exitYulSwitchCase = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulSwitchStatement.
SolidityParserListener.prototype.enterYulSwitchStatement = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulSwitchStatement.
SolidityParserListener.prototype.exitYulSwitchStatement = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulFunctionDefinition.
SolidityParserListener.prototype.enterYulFunctionDefinition = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulFunctionDefinition.
SolidityParserListener.prototype.exitYulFunctionDefinition = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulPath.
SolidityParserListener.prototype.enterYulPath = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulPath.
SolidityParserListener.prototype.exitYulPath = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulFunctionCall.
SolidityParserListener.prototype.enterYulFunctionCall = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulFunctionCall.
SolidityParserListener.prototype.exitYulFunctionCall = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulBoolean.
SolidityParserListener.prototype.enterYulBoolean = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulBoolean.
SolidityParserListener.prototype.exitYulBoolean = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulLiteral.
SolidityParserListener.prototype.enterYulLiteral = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulLiteral.
SolidityParserListener.prototype.exitYulLiteral = function(ctx) {
};


// Enter a parse tree produced by SolidityParser#yulExpression.
SolidityParserListener.prototype.enterYulExpression = function(ctx) {
};

// Exit a parse tree produced by SolidityParser#yulExpression.
SolidityParserListener.prototype.exitYulExpression = function(ctx) {
};



exports.SolidityParserListener = SolidityParserListener;