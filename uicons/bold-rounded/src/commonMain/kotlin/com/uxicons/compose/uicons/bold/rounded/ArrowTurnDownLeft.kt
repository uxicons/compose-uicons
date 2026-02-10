package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnDownLeft: ImageVector? = null

val Icons.Br.ArrowTurnDownLeft: ImageVector
    get() = _ArrowTurnDownLeft ?: UXIcon(name = "ArrowTurnDownLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 3.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineTo(4.25f)
            lineToRelative(3.33f, 3.46f)
            curveToRelative(0.57f, 0.6f, 0.56f, 1.55f, -0.04f, 2.12f)
            curveToRelative(-0.29f, 0.28f, -0.67f, 0.42f, -1.04f, 0.42f)
            curveToRelative(-0.39f, 0f, -0.79f, -0.15f, -1.08f, -0.46f)
            lineTo(1.01f, 16.95f)
            curveToRelative(-1.34f, -1.34f, -1.34f, -3.56f, 0.02f, -4.93f)
            lineTo(5.42f, 7.46f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.61f, 2.12f, -0.04f)
            curveToRelative(0.6f, 0.58f, 0.62f, 1.52f, 0.04f, 2.12f)
            lineToRelative(-3.33f, 3.46f)
            horizontalLineToRelative(14.25f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ArrowTurnDownLeft = it }
