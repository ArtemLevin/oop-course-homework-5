
import models.Table;
import models.TableModel;
import presenter.BookingPresenter;
import views.BookingView;

import java.util.Date;

public class Main {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 3, "Станислав");

        bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");
        bookingView.changeReservationTable(1003, new Date(), 3, "Станислав");
    }

}
