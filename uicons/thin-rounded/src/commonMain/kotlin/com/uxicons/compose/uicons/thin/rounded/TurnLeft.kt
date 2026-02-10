package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeft: ImageVector? = null

val Icons.Tr.TurnLeft: ImageVector
    get() = _TurnLeft ?: UXIcon(name = "TurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(1.25f)
                lineToRelative(6.1f, 6.15f)
                curveToRelative(0.2f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.14f, -0.35f, 0.14f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.47f, 9.63f)
                curveToRelative(-0.3f, -0.3f, -0.47f, -0.7f, -0.47f, -1.13f)
                reflectiveCurveToRelative(0.17f, -0.83f, 0.47f, -1.13f)
                lineTo(6.65f, 1.15f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                lineTo(1.25f, 8f)
                horizontalLineToRelative(18.25f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
            }
        }.also { _TurnLeft = it}
