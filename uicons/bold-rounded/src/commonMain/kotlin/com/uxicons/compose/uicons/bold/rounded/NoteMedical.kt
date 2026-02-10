package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteMedical: ImageVector? = null

val Icons.Br.NoteMedical: ImageVector
    get() = _NoteMedical ?: UXIcon(name = "NoteMedical") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(10.34f)
            curveToRelative(1.47f, 0f, 2.85f, -0.57f, 3.89f, -1.61f)
            lineToRelative(2.66f, -2.66f)
            curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            curveToRelative(0f, 0f, -0.0f, 10.45f, -0.01f, 10.5f)
            horizontalLineToRelative(-3.0f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(2.99f)
            curveToRelative(-0.05f, 0.0f, -10.5f, 0.01f, -10.5f, 0.01f)
            close()
            moveTo(15.5f, 13.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _NoteMedical = it }
