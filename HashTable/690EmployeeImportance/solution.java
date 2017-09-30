/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int total  = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        que.offer(id);
        while(!que.isEmpty()){
            int e = que.poll();
            List<Integer> sub = employees.get(e - 1).subordinates;
            for(int i : sub){
                que.offer(i);
            }
            total += employees.get(e - 1).importance;
        }
        
        return total;
    }
}