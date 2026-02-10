package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boss: ImageVector? = null

val Icons.Br.Boss: ImageVector
    get() = _Boss ?: UXIcon(name = "Boss") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 10f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            reflectiveCurveTo(14.76f, 0f, 12f, 0f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            close()
            moveTo(12f, 3f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            close()
            moveTo(24f, 19.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.57f)
            curveToRelative(-0.49f, -3.94f, -3.86f, -7f, -7.93f, -7f)
            reflectiveCurveToRelative(-7.44f, 3.06f, -7.93f, 7f)
            lineTo(1.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.2f, 1f, 1.41f)
            verticalLineToRelative(1.59f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.59f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            close()
            moveTo(16.9f, 18f)
            horizontalLineToRelative(-3.33f)
            lineToRelative(-0.67f, -2.34f)
            lineToRelative(0.88f, -1.32f)
            curveToRelative(1.57f, 0.6f, 2.77f, 1.97f, 3.12f, 3.66f)
            close()
            moveTo(10.22f, 14.34f)
            lineToRelative(0.88f, 1.32f)
            lineToRelative(-0.67f, 2.34f)
            horizontalLineToRelative(-3.33f)
            curveToRelative(0.34f, -1.69f, 1.54f, -3.05f, 3.12f, -3.66f)
            close()
        }
    }.also { _Boss = it }
