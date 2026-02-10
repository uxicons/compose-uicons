package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeft: ImageVector? = null

val Icons.Ts.TurnLeft: ImageVector
    get() = _TurnLeft ?: UXIcon(name = "TurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(1.25f)
                lineToRelative(6.6f, 6.65f)
                lineToRelative(-0.71f, 0.7f)
                lineTo(0.47f, 9.63f)
                curveToRelative(-0.3f, -0.3f, -0.47f, -0.7f, -0.47f, -1.13f)
                reflectiveCurveToRelative(0.17f, -0.83f, 0.47f, -1.13f)
                lineTo(7.15f, 0.65f)
                lineToRelative(0.71f, 0.7f)
                lineTo(1.25f, 8f)
                horizontalLineToRelative(20.25f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _TurnLeft = it}
