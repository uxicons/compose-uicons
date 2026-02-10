package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOfDavid: ImageVector? = null

val Icons.Rs.StarOfDavid: ImageVector
    get() = _StarOfDavid ?: UXIcon(name = "StarOfDavid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.99f, 12f)
                lineToRelative(3.5f, -6f)
                horizontalLineToRelative(-7.0f)
                lineTo(12.0f, 0.01f)
                lineToRelative(-3.49f, 5.99f)
                lineTo(1.51f, 6f)
                lineToRelative(3.5f, 6f)
                lineToRelative(-3.5f, 6f)
                horizontalLineToRelative(7.0f)
                lineToRelative(3.49f, 5.99f)
                lineToRelative(3.49f, -5.99f)
                horizontalLineToRelative(7.0f)
                lineToRelative(-3.5f, -6f)
                close()
                moveTo(19.01f, 8f)
                lineToRelative(-1.18f, 2.02f)
                lineToRelative(-1.18f, -2.02f)
                horizontalLineToRelative(2.35f)
                close()
                moveTo(16.68f, 12f)
                lineToRelative(-2.33f, 4f)
                horizontalLineToRelative(-4.68f)
                lineToRelative(-2.33f, -4f)
                lineToRelative(2.33f, -4f)
                horizontalLineToRelative(4.68f)
                lineToRelative(2.33f, 4f)
                close()
                moveTo(12.0f, 3.98f)
                lineToRelative(1.18f, 2.02f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(1.18f, -2.02f)
                close()
                moveTo(4.99f, 8f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-1.18f, 2.02f)
                lineToRelative(-1.18f, -2.02f)
                close()
                moveTo(4.99f, 16f)
                lineToRelative(1.18f, -2.02f)
                lineToRelative(1.18f, 2.02f)
                horizontalLineToRelative(-2.35f)
                close()
                moveTo(12.0f, 20.02f)
                lineToRelative(-1.18f, -2.02f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-1.18f, 2.02f)
                close()
                moveTo(17.83f, 13.98f)
                lineToRelative(1.18f, 2.02f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(1.18f, -2.02f)
                close()
            }
        }.also { _StarOfDavid = it}
