# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()


class MinStack:
    # time complexity: o(1), space complexity: o(n)
    def __init__(self):
        self.st = []

    def push(self, val: int) -> None:
        min_value = self.getMin()
        if min_value == None or min_value > val:
            min_value = val
        self.st.append([val, min_value])

    def pop(self) -> None:
        self.st.pop()

    def top(self) -> int:
        if self.st:
            return self.st[-1][0]
        else:
            return None

    def getMin(self) -> int:
        if self.st:
            return self.st[-1][1]
        else:
            return None
