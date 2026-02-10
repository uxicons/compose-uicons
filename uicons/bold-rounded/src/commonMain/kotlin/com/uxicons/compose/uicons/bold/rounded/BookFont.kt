package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookFont: ImageVector? = null

val Icons.Br.BookFont: ImageVector
    get() = _BookFont ?: UXIcon(name = "BookFont") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(3.47f, 0f, 1f, 2.47f, 1f, 5.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(12f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(23f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(20f, 5.5f)
            lineTo(20f, 15f)
            lineTo(10f, 15f)
            lineTo(10f, 3f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(6.5f, 3f)
            horizontalLineToRelative(0.5f)
            lineTo(7f, 15f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.53f, 0f, -1.03f, 0.09f, -1.5f, 0.26f)
            lineTo(4f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(17.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(14.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(12.15f, 13.5f)
            curveToRelative(0.42f, 0f, 0.8f, -0.27f, 0.95f, -0.67f)
            lineToRelative(0.3f, -0.83f)
            horizontalLineToRelative(3.22f)
            lineToRelative(0.3f, 0.83f)
            curveToRelative(0.14f, 0.4f, 0.52f, 0.67f, 0.95f, 0.67f)
            horizontalLineToRelative(0f)
            curveToRelative(0.7f, 0f, 1.18f, -0.69f, 0.95f, -1.34f)
            lineToRelative(-2.39f, -6.66f)
            curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
            reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1f)
            lineToRelative(-2.39f, 6.66f)
            curveToRelative(-0.23f, 0.65f, 0.25f, 1.34f, 0.95f, 1.34f)
            close()
            moveTo(15.9f, 10f)
            horizontalLineToRelative(-1.79f)
            lineToRelative(0.9f, -2.51f)
            lineToRelative(0.9f, 2.51f)
            close()
        }
    }.also { _BookFont = it }
