package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeft: ImageVector? = null

val Icons.Sr.TurnLeft: ImageVector
    get() = _TurnLeft ?: UXIcon(name = "TurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 8f)
                horizontalLineTo(2.37f)
                curveToRelative(0.03f, -0.04f, 0.06f, -0.08f, 0.1f, -0.12f)
                lineTo(7.6f, 2.7f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.01f)
                lineTo(1.05f, 6.47f)
                curveToRelative(-0.68f, 0.68f, -1.05f, 1.57f, -1.05f, 2.53f)
                reflectiveCurveToRelative(0.37f, 1.85f, 1.04f, 2.53f)
                lineToRelative(5.13f, 5.18f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.3f, 0.71f, 0.3f)
                curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.7f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                lineToRelative(-5.14f, -5.18f)
                curveToRelative(-0.04f, -0.04f, -0.06f, -0.08f, -0.1f, -0.12f)
                horizontalLineToRelative(16.63f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _TurnLeft = it}
