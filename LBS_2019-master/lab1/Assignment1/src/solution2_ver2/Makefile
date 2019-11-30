all src/*.java: copy_bins
	javac -classpath "src/" -d "bins/" src/ShoppingCart.java


copy_bins:
	cp -r src/backEnd/*.txt bins/

clean:
	$(RM) -r bins/*
	$(RM) -r src/backEnd/*.class src/*.class
