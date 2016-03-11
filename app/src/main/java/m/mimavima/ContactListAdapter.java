package m.mimavima;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MorM on 3/10/16.
 */
public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ContactViewHolder>{

        List<Contact> contacts;

        public class ContactViewHolder extends RecyclerView.ViewHolder {

            CardView cv;

            TextView contactName;
            TextView contactId;



            ContactViewHolder(View itemView) {
                super(itemView);
                cv = (CardView)itemView.findViewById(R.id.cv);
                contactName = (TextView)itemView.findViewById(R.id.contact_name);
                contactId = (TextView)itemView.findViewById(R.id.contact_id);


            }


        }
        //Constructor
        ContactListAdapter(List<Contact> contacts){
            this.contacts = contacts;
        }

        @Override
        public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_card_fregment, parent, false);
            ContactViewHolder fvh = new ContactViewHolder(v);
            return fvh;

        }

        @Override
        public void onBindViewHolder(ContactViewHolder contactViewHolder, int i) {
            contactViewHolder.contactName.setText(contacts.get(i).contactName);
//        System.out.println(fruits.get(i).num);
            contactViewHolder.contactId.setText("" + contacts.get(i).contactId);
        }

        @Override
        public int getItemCount() {
            return contacts.size();
        }

        @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }

}
