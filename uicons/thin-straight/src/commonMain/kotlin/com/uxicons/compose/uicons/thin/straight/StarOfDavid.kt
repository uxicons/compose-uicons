package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOfDavid: ImageVector? = null

val Icons.Ts.StarOfDavid: ImageVector
    get() = _StarOfDavid ?: UXIcon(name = "StarOfDavid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.0f, 12f)
                lineToRelative(3.5f, -6f)
                horizontalLineToRelative(-7.0f)
                lineTo(12.0f, 0.01f)
                lineToRelative(-3.5f, 5.99f)
                lineTo(1.5f, 6f)
                lineToRelative(3.5f, 6f)
                lineToRelative(-3.5f, 6f)
                horizontalLineToRelative(7.0f)
                lineToRelative(3.5f, 5.99f)
                lineToRelative(3.5f, -5.99f)
                horizontalLineToRelative(7.0f)
                lineToRelative(-3.5f, -6f)
                close()
                moveTo(20.75f, 7f)
                lineToRelative(-2.34f, 4.01f)
                lineToRelative(-2.34f, -4.01f)
                horizontalLineToRelative(4.68f)
                close()
                moveTo(17.84f, 12f)
                lineToRelative(-2.92f, 5f)
                horizontalLineToRelative(-5.84f)
                lineToRelative(-2.92f, -5f)
                lineToRelative(2.92f, -5f)
                horizontalLineToRelative(5.84f)
                lineToRelative(2.92f, 5f)
                close()
                moveTo(12.0f, 1.99f)
                lineToRelative(2.34f, 4.01f)
                horizontalLineToRelative(-4.68f)
                lineToRelative(2.34f, -4.01f)
                close()
                moveTo(3.25f, 7f)
                horizontalLineToRelative(4.67f)
                lineToRelative(-2.34f, 4.01f)
                lineToRelative(-2.34f, -4.01f)
                close()
                moveTo(3.25f, 17f)
                lineToRelative(2.34f, -4.01f)
                lineToRelative(2.34f, 4.01f)
                lineTo(3.25f, 17f)
                close()
                moveTo(12.0f, 22.01f)
                lineToRelative(-2.34f, -4.01f)
                horizontalLineToRelative(4.68f)
                lineToRelative(-2.34f, 4.01f)
                close()
                moveTo(18.42f, 12.99f)
                lineToRelative(2.34f, 4.01f)
                horizontalLineToRelative(-4.68f)
                lineToRelative(2.34f, -4.01f)
                close()
            }
        }.also { _StarOfDavid = it}
