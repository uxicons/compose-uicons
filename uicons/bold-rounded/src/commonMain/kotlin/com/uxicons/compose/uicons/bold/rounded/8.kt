package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _8: ImageVector? = null

val Icons.Br.Eight: ImageVector
    get() = _8 ?: UXIcon(name = "Eight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.12f, 9.14f)
            curveToRelative(0.86f, -0.97f, 1.38f, -2.25f, 1.38f, -3.64f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveTo(6.5f, 2.47f, 6.5f, 5.5f)
            curveToRelative(0f, 1.4f, 0.52f, 2.67f, 1.38f, 3.64f)
            curveToRelative(-2.33f, 1.4f, -3.88f, 3.95f, -3.88f, 6.86f)
            curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
            curveToRelative(0f, -2.91f, -1.56f, -5.46f, -3.88f, -6.86f)
            close()
            moveTo(9.5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            close()
        }
    }.also { _8 = it }
