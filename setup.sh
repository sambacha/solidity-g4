#!/usr/bin/env bash

set -e

READLINK=readlink
if [[ "$OSTYPE" == "darwin"* ]]; then
	READLINK=greadlink
fi
ROOT_DIR=$(${READLINK} -f "$(dirname "$0")"/..)
WORKDIR="${ROOT_DIR}/build/antlr"
ANTLR_JAR="${ROOT_DIR}/build/deps/antlr4.jar"
ANTLR_JAR_URI="https://www.antlr.org/download/antlr-4.8-complete.jar"

SGR_RESET="\033[0m"
SGR_BOLD="\033[1m"
SGR_GREEN="\033[32m"
SGR_RED="\033[31m"
SGR_BLUE="\033[34m"

vt_cursor_up() { echo -ne "\033[A"; }
vt_cursor_begin_of_line() { echo -ne "\r"; }

download_antlr4() {
	if [[ ! -e "$ANTLR_JAR" ]]; then
		curl -o "${ANTLR_JAR}" "${ANTLR_JAR_URI}"
	fi
}

prepare_workdir() {
	mkdir -p "${ROOT_DIR}/build/deps"
	mkdir -p "${WORKDIR}"
	mkdir -p "${WORKDIR}/src"
	mkdir -p "${WORKDIR}/target"
}

prepare_workdir
download_antlr4

echo "Creating parser"
(
	cd "${ROOT_DIR}"/docs/grammar
	# Create lexer/parser from grammar
	java -jar "${ANTLR_JAR}" SolidityParser.g4 SolidityLexer.g4 -o "${WORKDIR}/src/"

	# Compile lexer/parser sources
	javac -classpath "${ANTLR_JAR}" "${WORKDIR}/src/"*.java -d "${WORKDIR}/target/"
)
