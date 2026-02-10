package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownRight: ImageVector? = null

val Icons.Ss.DownRight: ImageVector
    get() = _DownRight ?: UXIcon(name = "DownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.02f, 23.01f)
                lineToRelative(4.94f, -4.98f)
                lineTo(0.77f, 7.84f)
                lineTo(7.84f, 0.77f)
                lineToRelative(10.2f, 10.2f)
                lineToRelative(4.97f, -4.92f)
                verticalLineToRelative(13.96f)
                curveToRelative(0f, 0.8f, -0.32f, 1.56f, -0.88f, 2.12f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                horizontalLineTo(6.02f)
                close()
            }
        }.also { _DownRight = it}
