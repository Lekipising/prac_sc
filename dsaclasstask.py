

class Node:
    def __init__(self, data): 
        self.data = data
        self.next = None
   

class LinkedList:
    def __init__(self):  
        self.top = None
        
    def push(self, item):
        if self.top is None:
            self.top = Node(item)
        else:
            nw = Node(item)
            nw.next = self.top
            self.top = nw
 
    def pop(self):
        if self.top is None:
            return None
        else:
            po = self.top.data
            self.top = self.top.next
            return po

    def peek(self):
        pass

    def isEmpty(self):
        pass

    def size(self):
        pass

    def display(self):
        pass

    # def search(self, item):
    #     if self.top is None:
    #         print("List has no elements")
    #         return

    #     item = self.top
    #     while item is not None:
    #         if item.data == item:
    #             print(item.data)
    #             return True
    #         item = item.next

    #     # print("item not found")
    #     # return False




if __name__ == '__main__':

    ls = LinkedList()
  
    ls.top = Node(1)

    sec = Node(2)
    thd = Node(3)

    ls.top.next = sec
    sec.next = thd

    ls.push(5)
    ls.pop()


