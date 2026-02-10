package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendUp: ImageVector? = null

val Icons.Br.ArrowTrendUp: ImageVector
    get() = _ArrowTrendUp ?: UXIcon(name = "ArrowTrendUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 6f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.38f)
            lineToRelative(-5.88f, 5.88f)
            lineToRelative(-4.12f, -4.12f)
            curveToRelative(-1.04f, -1.04f, -2.73f, -1.04f, -3.76f, 0f)
            lineTo(0.44f, 15.44f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0f)
            lineToRelative(4.44f, -4.44f)
            lineToRelative(4.12f, 4.12f)
            curveToRelative(0.52f, 0.52f, 1.2f, 0.78f, 1.88f, 0.78f)
            reflectiveCurveToRelative(1.36f, -0.26f, 1.88f, -0.78f)
            lineToRelative(6.12f, -6.12f)
            verticalLineToRelative(3.38f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
        }
    }.also { _ArrowTrendUp = it }
