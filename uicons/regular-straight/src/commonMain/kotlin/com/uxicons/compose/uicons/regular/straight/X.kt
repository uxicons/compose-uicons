package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _X: ImageVector? = null

val Icons.Rs.X: ImageVector
    get() = _X ?: UXIcon(name = "X") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.24f, 12f)
                lineToRelative(8.8f, -12f)
                lineToRelative(-2.48f, 0f)
                lineToRelative(-7.56f, 10.31f)
                lineToRelative(-7.56f, -10.31f)
                lineToRelative(-2.48f, 0f)
                lineToRelative(8.8f, 12f)
                lineToRelative(-8.8f, 12f)
                lineToRelative(2.48f, 0f)
                lineToRelative(7.56f, -10.31f)
                lineToRelative(7.56f, 10.31f)
                lineToRelative(2.48f, 0f)
                lineToRelative(-8.8f, -12f)
                close()
            }
        }.also { _X = it}
