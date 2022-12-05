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
# Jar Creation
##
jar: $(CLS)
	jar cvf $(OUT_DIR)/ClassProject.jar $(CLS)
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
all: ClassProject
ClassProject: $(CLS)
$(CLS): $(OUT_DIR)/%.class: $(SRC_DIR)/%.java
	$(JC) $(JCFLAGS) $<

##
# Cleanup output
##
clean:
	rm $(OUT_DIR)/*.class
