#include <iostream>
#include <string>

using namespace std;

int minInsertionsToMakePalindrome(const string &s) {
    int insertions = 0;
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s[left] == s[right]) {
            // Characters match, move both pointers towards the center
            left++;
            right--;
        } else {
            // Characters don't match, insert the character at 'left' or 'right'
            // to make them equal, and increment the insertion count
            if (s[left] < s[right]) {
                left++;
            } else {
                right--;
            }
            cout<<s[left];

            insertions++;
        }
    }

    return insertions;
}

int main() {
    string s;

    cout << "Enter a string: ";
    cin >> s;

    int steps = minInsertionsToMakePalindrome(s);

    cout << "Minimum steps to make a palindrome: " << steps << endl;

    return 0;
}