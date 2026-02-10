package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossSmall: ImageVector? = null

val Icons.Bs.CrossSmall: ImageVector
    get() = _CrossSmall ?: UXIcon(name = "CrossSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.06f, 7.06f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-4.94f, 4.94f)
                lineToRelative(-4.94f, -4.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.94f, 4.94f)
                lineToRelative(-4.94f, 4.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.94f, -4.94f)
                lineToRelative(4.94f, 4.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-4.94f, -4.94f)
                lineToRelative(4.94f, -4.94f)
                close()
            }
        }.also { _CrossSmall = it}
