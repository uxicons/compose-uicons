package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeftDown: ImageVector? = null

val Icons.Ts.TurnLeftDown: ImageVector
    get() = _TurnLeftDown ?: UXIcon(name = "TurnLeftDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                verticalLineToRelative(20.25f)
                lineToRelative(6.65f, -6.6f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-6.72f, 6.68f)
                curveToRelative(-0.3f, 0.3f, -0.7f, 0.47f, -1.13f, 0.47f)
                reflectiveCurveToRelative(-0.83f, -0.17f, -1.13f, -0.47f)
                lineTo(0.65f, 16.85f)
                lineToRelative(0.7f, -0.71f)
                lineToRelative(6.65f, 6.6f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _TurnLeftDown = it}
