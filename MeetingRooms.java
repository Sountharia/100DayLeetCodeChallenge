/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        System.out.println(intervals);
        Collections.sort(intervals, Comparator.comparingInt(i->i.start));
        System.out.println(intervals);
        for (int i=1; i<intervals.size();i++){
            Interval one = intervals.get(i-1);
            Interval two = intervals.get(i);
            if(one.end>two.start){
                return false;
            }
        }
        return true;

        // for(int i=0; i<intervals.size()-1;i++){
        //     Interval one = intervals.get(i);
        //     for(int j=i+1;j<intervals.size(); j++){
        //         Interval two = intervals.get(j);
        //         if (Math.min(one.end, two.end)>Math.max(one.start, two.start)){
        //             return false;
        //         }
        //     }
        // }
        
        // return true;
    }
}
