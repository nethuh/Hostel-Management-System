package bo;


import bo.custom.ReservationBOImpl;
import bo.custom.RoomBOImpl;
import bo.custom.StudentBOImpl;

public class BOFactory {private static BOFactory boFactory;
    private BOFactory(){}

    public static BOFactory getInstance(){
        return (null == boFactory) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOType{
        STUDENT,ROOM,RESERVATION;
    }

    public <T extends SuperBO> T getBO(BOType boType){
        switch (boType){
            case STUDENT:
                return (T) new StudentBOImpl();
            case ROOM:
                return (T) new RoomBOImpl();
            case RESERVATION:
                return (T) new ReservationBOImpl();
            default:
                return null;
        }
    }

}
