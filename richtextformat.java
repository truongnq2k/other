string rtfText; //string to save to db
TextRange tr = new TextRange(richTextBox.Document.ContentStart, richTextBox.Document.ContentEnd);
using (MemoryStream ms = new MemoryStream())
{
    tr.Save(ms, DataFormats.Rtf);
    rtfText = Encoding.ASCII.GetString(ms.ToArray());
}
string rtfText= ... //string from db
byte[] byteArray = Encoding.ASCII.GetBytes(rtfText);
using (MemoryStream ms = new MemoryStream(byteArray))
{
    TextRange tr = new TextRange(richTextBox.Document.ContentStart, richTextBox.Document.ContentEnd);
    tr.Load(ms, DataFormats.Rtf);
}
