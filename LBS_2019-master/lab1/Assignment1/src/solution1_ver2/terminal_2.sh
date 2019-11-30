#Group11
#!/usr/bin/env bash

cd bins/
echo ""
echo "Terminal 2:: Demonstrating vulnerable attack, from attacks using 2 instances of ShoppingCart in the 2nd terminal"
echo ""

echo "Before Shopping starts..."
echo "cat wallet.txt"
cat wallet.txt

echo "cat pocket.txt"
cat pocket.txt

echo ""
echo ">>Now, buy a pen from ShoppingCart"
# vulnerable attack, buy a car at a price of a pen
echo "pen" | java ShoppingCart
sleep 1
echo ""

# Check vulnerable attacks
if grep --quiet pen pocket.txt; then
  echo "Program under vulnerable attack, buying a car at a price of a pen!!"
else
  echo "SafeWithdrawal works as expected, Safe to Shop!!"
fi
echo ""

# end ShoppingCart