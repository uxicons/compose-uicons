package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeopleLine: ImageVector? = null

val Icons.Br.PeopleLine: ImageVector
    get() = _PeopleLine ?: UXIcon(name = "PeopleLine") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 10.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            close()
            moveTo(18f, 7f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
            close()
            moveTo(6f, 7f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            reflectiveCurveTo(7.93f, 0f, 6f, 0f)
            reflectiveCurveTo(2.5f, 1.57f, 2.5f, 3.5f)
            reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
            close()
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineTo(6f, 21f)
            curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(9f, 21f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            close()
            moveTo(17.01f, 9.36f)
            curveToRelative(-0.09f, 0.82f, 0.5f, 1.56f, 1.33f, 1.66f)
            curveToRelative(1.38f, 0.15f, 2.49f, 1.27f, 2.65f, 2.65f)
            curveToRelative(0.09f, 0.83f, 0.85f, 1.42f, 1.66f, 1.33f)
            curveToRelative(0.82f, -0.09f, 1.42f, -0.83f, 1.33f, -1.66f)
            curveToRelative(-0.31f, -2.77f, -2.53f, -4.99f, -5.3f, -5.3f)
            curveToRelative(-0.84f, -0.09f, -1.56f, 0.5f, -1.66f, 1.33f)
            close()
            moveTo(1.36f, 14.99f)
            curveToRelative(0.81f, 0.09f, 1.57f, -0.5f, 1.66f, -1.33f)
            curveToRelative(0.15f, -1.38f, 1.27f, -2.49f, 2.65f, -2.65f)
            curveToRelative(0.82f, -0.09f, 1.42f, -0.83f, 1.33f, -1.66f)
            curveToRelative(-0.09f, -0.82f, -0.82f, -1.41f, -1.66f, -1.33f)
            curveTo(2.57f, 8.34f, 0.34f, 10.57f, 0.04f, 13.34f)
            curveToRelative(-0.09f, 0.82f, 0.5f, 1.56f, 1.33f, 1.66f)
            close()
        }
    }.also { _PeopleLine = it }
