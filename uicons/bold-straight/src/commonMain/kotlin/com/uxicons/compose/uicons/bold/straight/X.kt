package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _X: ImageVector? = null

val Icons.Bs.X: ImageVector
    get() = _X ?: UXIcon(name = "X") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.86f, 12f)
                lineToRelative(8.8f, -12f)
                lineToRelative(-3.72f, 0f)
                lineToRelative(-6.94f, 9.46f)
                lineToRelative(-6.94f, -9.46f)
                lineToRelative(-3.72f, 0f)
                lineToRelative(8.8f, 12f)
                lineToRelative(-8.8f, 12f)
                lineToRelative(3.72f, 0f)
                lineToRelative(6.94f, -9.46f)
                lineToRelative(6.94f, 9.46f)
                lineToRelative(3.72f, 0f)
                lineToRelative(-8.8f, -12f)
                close()
            }
        }.also { _X = it}
