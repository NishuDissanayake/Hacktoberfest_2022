// Same problem
// Remove Duplicates from unsorted array problem of gfg

class Solution {
    
    public int[] removeDuplicates(int A[], int N)
    {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();
        
        int count = 0;
        for (int item:A){
            if (! h.contains(item)){
                h.add(item);
                l.add(item);
                count++;
            }
        }
        
        int a[] = new int[count];
        for (int i = 0; i < count ;i++){
            a[i] = l.get(i);
        }
        
        return a;
    }
}
