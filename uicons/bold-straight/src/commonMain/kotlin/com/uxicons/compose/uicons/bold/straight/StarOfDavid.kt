package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOfDavid: ImageVector? = null

val Icons.Bs.StarOfDavid: ImageVector
    get() = _StarOfDavid ?: UXIcon(name = "StarOfDavid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.08f, 12f)
                lineToRelative(3.56f, -6f)
                horizontalLineToRelative(-7.11f)
                lineTo(12.0f, 0.06f)
                lineToRelative(-3.52f, 5.94f)
                lineTo(1.38f, 6f)
                lineToRelative(3.55f, 6f)
                lineToRelative(-3.55f, 6f)
                horizontalLineToRelative(7.1f)
                lineToRelative(3.52f, 5.94f)
                lineToRelative(3.52f, -5.94f)
                horizontalLineToRelative(7.11f)
                lineToRelative(-3.56f, -6f)
                close()
                moveTo(16.79f, 12f)
                lineToRelative(-2.37f, 4f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-2.37f, -4f)
                lineToRelative(2.37f, -4f)
                horizontalLineToRelative(4.83f)
                lineToRelative(2.37f, 4f)
                close()
            }
        }.also { _StarOfDavid = it}
