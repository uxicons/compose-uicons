package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnRight: ImageVector? = null

val Icons.Br.TurnRight: ImageVector
    get() = _TurnRight ?: UXIcon(name = "TurnRight") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 9.5f)
            curveToRelative(0f, 1.2f, -0.47f, 2.33f, -1.32f, 3.18f)
            lineToRelative(-5.15f, 4.9f)
            curveToRelative(-0.29f, 0.28f, -0.66f, 0.41f, -1.03f, 0.41f)
            curveToRelative(-0.4f, 0f, -0.79f, -0.16f, -1.09f, -0.47f)
            curveToRelative(-0.57f, -0.6f, -0.55f, -1.55f, 0.05f, -2.12f)
            lineToRelative(4.63f, -4.41f)
            horizontalLineTo(5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(14.6f)
            lineToRelative(-4.63f, -4.41f)
            curveToRelative(-0.6f, -0.57f, -0.62f, -1.52f, -0.05f, -2.12f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.62f, 2.12f, -0.05f)
            lineToRelative(5.12f, 4.88f)
            curveToRelative(0.88f, 0.88f, 1.34f, 2.0f, 1.34f, 3.21f)
            close()
        }
    }.also { _TurnRight = it }
