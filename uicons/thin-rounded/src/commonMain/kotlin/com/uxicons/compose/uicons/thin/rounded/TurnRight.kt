package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnRight: ImageVector? = null

val Icons.Tr.TurnRight: ImageVector
    get() = _TurnRight ?: UXIcon(name = "TurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.53f, 9.63f)
                lineToRelative(-6.18f, 6.22f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.0f, -0.71f)
                lineToRelative(6.1f, -6.15f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(18.25f)
                lineToRelative(-6.11f, -6.15f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.0f)
                lineToRelative(6.18f, 6.22f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, -0.0f, 2.27f)
                close()
            }
        }.also { _TurnRight = it}
