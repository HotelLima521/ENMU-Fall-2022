##
# Source Dir
# ##
SRC_DIR := src

##
# Output Dir
##
OUT_DIR := out

##
# Sources
##
SRCS := $(wildcard $(SRC_DIR)/*.java)

##
# classes
##
CLS := $(SRCS:$(SRC_DIR)/%.java=$(OUT_DIR)/%.class)

##
# Compiler and CFLAGS
##
JC := javac
JCFLAGS := -d $(OUT_DIR)/ -cp $(SRC_DIR)/

##
# Suffixes
##
.SUFFIXES: .java

##
# targets that don't produce out
##
PHONY: all clean

##
# Default target(s)
##
all: $(CLS)

$(CLS): $(OUT_DIR)/%.class: $(SRC_DIR)/%.java
	$(JC) $(JCFLAGS) $<

##
# Cleanup output
##
clean:
	rm $(OUT_DIR)/*.class
