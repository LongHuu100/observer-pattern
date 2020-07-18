public class Event {
    private OnEventListener mOnEventListener;

    public void setOnEventListener(OnEventListener listener) {
        mOnEventListener = listener;
    }

    public void doEvent() {
        /*
         * code code code
         */

         // and in the end

         if (mOnEventListener != null)
             mOnEventListener.onEvent(eventResult); // event result object :)
    }
}
