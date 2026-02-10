package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeft: ImageVector? = null

val Icons.Bs.TurnLeft: ImageVector
    get() = _TurnLeft ?: UXIcon(name = "TurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(4.65f)
                lineToRelative(4.41f, 4.44f)
                lineToRelative(-2.13f, 2.11f)
                lineTo(0.76f, 11.34f)
                curveToRelative(-0.49f, -0.49f, -0.76f, -1.14f, -0.76f, -1.84f)
                reflectiveCurveToRelative(0.27f, -1.35f, 0.76f, -1.84f)
                lineTo(6.94f, 1.44f)
                lineToRelative(2.13f, 2.11f)
                lineToRelative(-4.41f, 4.44f)
                horizontalLineToRelative(15.85f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _TurnLeft = it}
