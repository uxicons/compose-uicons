package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeftDown: ImageVector? = null

val Icons.Tr.TurnLeftDown: ImageVector
    get() = _TurnLeftDown ?: UXIcon(name = "TurnLeftDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.25f)
                lineToRelative(6.15f, -6.1f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.0f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                lineToRelative(-6.22f, 6.18f)
                curveToRelative(-0.3f, 0.3f, -0.7f, 0.47f, -1.13f, 0.47f)
                reflectiveCurveToRelative(-0.83f, -0.17f, -1.13f, -0.47f)
                lineToRelative(-6.22f, -6.18f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.0f, -0.71f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                lineToRelative(6.15f, 6.1f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _TurnLeftDown = it}
