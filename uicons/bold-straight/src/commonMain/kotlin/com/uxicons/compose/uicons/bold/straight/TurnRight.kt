package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnRight: ImageVector? = null

val Icons.Bs.TurnRight: ImageVector
    get() = _TurnRight ?: UXIcon(name = "TurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.24f, 11.34f)
                lineToRelative(-6.17f, 6.22f)
                lineToRelative(-2.13f, -2.11f)
                lineToRelative(4.41f, -4.44f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15.85f)
                lineToRelative(-4.41f, -4.44f)
                lineToRelative(2.13f, -2.11f)
                lineToRelative(6.18f, 6.22f)
                curveToRelative(1.01f, 1.01f, 1.01f, 2.66f, -0.0f, 3.68f)
                close()
            }
        }.also { _TurnRight = it}
