package com.example.instaclone;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.parse.ParseUser;

public class UserArrayAdapter extends ArrayAdapter<ParseUser> {

	private final Context context;
	private final List<ParseUser> users;
 
	public UserArrayAdapter(Context context, List<ParseUser> users) {
		super(context, R.layout.single_user_item, users);
		this.context = context;
		this.users = users;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.single_user_item, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.username_textview);
		textView.setText(users.get(position).getUsername());
 
		// Change icon based on name
//		String s = values[position];
// 
//		System.out.println(s);
// 
//		if (s.equals("WindowsMobile")) {
//			imageView.setImageResource(R.drawable.windowsmobile_logo);
//		} else if (s.equals("iOS")) {
//			imageView.setImageResource(R.drawable.ios_logo);
//		} else if (s.equals("Blackberry")) {
//			imageView.setImageResource(R.drawable.blackberry_logo);
//		} else {
//			imageView.setImageResource(R.drawable.android_logo);
//		}
 
		return rowView;
	}
	
}
