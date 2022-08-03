public class Main {
    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("******");
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println("******");
        System.out.println(PaintJob.getBucketCount(3.5, 1.5));
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        System.out.println(PaintJob.getBucketCount(3.26, 0.75));
    }
}

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if( (width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0) ) return -1;
        double total = Math.ceil(( ( width * height) - (extraBuckets*areaPerBucket) ) / areaPerBucket);
        return (int) total;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if( (width <= 0) || (height <= 0) || (areaPerBucket <= 0) ) return -1;
        double total = Math.ceil( (width * height) / areaPerBucket );
        return (int) total;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if( (area <= 0) || (areaPerBucket <= 0) ) return -1;
        double total = Math.ceil(area / areaPerBucket);
        return (int) total;
    }
}
