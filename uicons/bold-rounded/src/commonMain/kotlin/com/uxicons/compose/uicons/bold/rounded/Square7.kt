package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square7: ImageVector? = null

val Icons.Br.Square7: ImageVector
    get() = _Square7 ?: UXIcon(name = "Square7") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            close()
            moveTo(10.0f, 19f)
            curveToRelative(-0.25f, 0f, -0.51f, -0.06f, -0.74f, -0.2f)
            curveToRelative(-0.72f, -0.41f, -0.97f, -1.33f, -0.56f, -2.05f)
            lineToRelative(5.01f, -8.76f)
            horizontalLineToRelative(-5.21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5.9f)
            curveToRelative(0.91f, 0f, 1.73f, 0.46f, 2.21f, 1.23f)
            curveToRelative(0.48f, 0.77f, 0.52f, 1.72f, 0.11f, 2.53f)
            lineToRelative(-5.42f, 9.48f)
            curveToRelative(-0.28f, 0.48f, -0.78f, 0.76f, -1.3f, 0.76f)
            close()
        }
    }.also { _Square7 = it }
