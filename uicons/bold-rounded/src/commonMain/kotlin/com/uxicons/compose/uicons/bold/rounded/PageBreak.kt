package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PageBreak: ImageVector? = null

val Icons.Br.PageBreak: ImageVector
    get() = _PageBreak ?: UXIcon(name = "PageBreak") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 16f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(2.5f, 16f)
            close()
            moveTo(10.5f, 13f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(21.5f, 13f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(3.5f, 11f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5.5f)
            lineTo(13f, 7f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.34f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            lineToRelative(-2.66f, -2.66f)
            curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
            lineTo(7.5f, -0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(20.87f, 18.05f)
            curveToRelative(-0.8f, -0.21f, -1.62f, 0.28f, -1.83f, 1.08f)
            curveToRelative(-0.28f, 1.1f, -1.28f, 1.87f, -2.42f, 1.87f)
            lineTo(7.37f, 21f)
            curveToRelative(-1.14f, 0f, -2.14f, -0.77f, -2.42f, -1.87f)
            curveToRelative(-0.21f, -0.8f, -1.03f, -1.29f, -1.83f, -1.08f)
            curveToRelative(-0.8f, 0.21f, -1.28f, 1.02f, -1.08f, 1.83f)
            curveToRelative(0.62f, 2.43f, 2.81f, 4.13f, 5.33f, 4.13f)
            horizontalLineToRelative(9.25f)
            curveToRelative(2.51f, 0f, 4.7f, -1.7f, 5.33f, -4.13f)
            curveToRelative(0.21f, -0.8f, -0.28f, -1.62f, -1.08f, -1.83f)
            close()
        }
    }.also { _PageBreak = it }
