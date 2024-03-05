public class Array {
    public static void main(String[] args) {
//        Cara penulisan array berdasarkan tipe data int
        int[] CollectionNumber = {
                1,2,3,4,5,6,7,8,9
        };

//        Cara penulisan array berdasarkan tipe data string
        String [] CollectionName = {

                "Muhamad", "Nur", "Syami"
        };

        System.out.println(CollectionNumber[1]);
        System.out.println(CollectionName[1]);

//        Mengubah Array
        CollectionName[2] ="Budi";
        System.out.println(CollectionName[2]);

//    Mengambil panjang array

        System.out.println(CollectionNumber.length);

//      Menghapus data didalam array di java itu tidak bisa
//      tetapi mengubahnya menjadi 0 untuk tipe data number
//      atau mengubahnya null untuk tipe data string

        CollectionNumber[0]= 0;
        CollectionName[0]= null;

//        Array Multi Dimensi
        String[] [] multiDimesiArray = {
                {"syami", "coko", "budi"},
                {"Jan", "kucing", "buaya"}

        };

        System.out.println(multiDimesiArray[1][2]);


    }

}
