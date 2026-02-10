package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendDown: ImageVector? = null

val Icons.Br.ArrowTrendDown: ImageVector
    get() = _ArrowTrendDown ?: UXIcon(name = "ArrowTrendDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 9.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3.38f)
            lineToRelative(-5.88f, -5.88f)
            lineToRelative(-4.12f, 4.12f)
            curveToRelative(-1.04f, 1.04f, -2.73f, 1.04f, -3.76f, 0f)
            lineTo(0.44f, 8.56f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(4.44f, 4.44f)
            lineToRelative(4.08f, -4.08f)
            curveToRelative(1.06f, -1.06f, 2.78f, -1.06f, 3.84f, 0f)
            lineToRelative(6.08f, 6.08f)
            verticalLineToRelative(-3.38f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ArrowTrendDown = it }
