package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeftDown: ImageVector? = null

val Icons.Bs.TurnLeftDown: ImageVector
    get() = _TurnLeftDown ?: UXIcon(name = "TurnLeftDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 3.5f)
                verticalLineToRelative(15.85f)
                lineToRelative(4.44f, -4.41f)
                lineToRelative(2.11f, 2.13f)
                lineToRelative(-6.22f, 6.18f)
                curveToRelative(-0.49f, 0.49f, -1.14f, 0.76f, -1.84f, 0.76f)
                reflectiveCurveToRelative(-1.35f, -0.27f, -1.84f, -0.76f)
                lineToRelative(-6.22f, -6.17f)
                lineToRelative(2.11f, -2.13f)
                lineToRelative(4.44f, 4.41f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
            }
        }.also { _TurnLeftDown = it}
