package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeft: ImageVector? = null

val Icons.Br.TurnLeft: ImageVector
    get() = _TurnLeft ?: UXIcon(name = "TurnLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 13.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineTo(3.9f)
            lineToRelative(4.63f, 4.41f)
            curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.05f, 2.12f)
            curveToRelative(-0.29f, 0.31f, -0.69f, 0.47f, -1.09f, 0.47f)
            curveToRelative(-0.37f, 0f, -0.74f, -0.14f, -1.03f, -0.41f)
            lineTo(1.34f, 12.71f)
            curveToRelative(-0.88f, -0.88f, -1.34f, -2.0f, -1.34f, -3.21f)
            reflectiveCurveToRelative(0.47f, -2.33f, 1.32f, -3.18f)
            lineTo(6.46f, 1.41f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.55f, 2.12f, 0.05f)
            curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.05f, 2.12f)
            lineToRelative(-4.63f, 4.41f)
            horizontalLineToRelative(14.6f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
        }
    }.also { _TurnLeft = it }
