package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextInputLeft: ImageVector? = null

val Icons.Br.TextInputLeft: ImageVector
    get() = _TextInputLeft ?: UXIcon(name = "TextInputLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-0.74f, 0f, -1.43f, -0.24f, -2f, -0.64f)
            curveToRelative(-0.57f, 0.4f, -1.26f, 0.64f, -2f, 0.64f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
            lineTo(7f, 3.5f)
            curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.74f, 0f, 1.43f, 0.24f, 2f, 0.64f)
            curveToRelative(0.57f, -0.4f, 1.26f, -0.64f, 2f, -0.64f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
            lineTo(10f, 20.5f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(14f, 10f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            close()
            moveTo(18.5f, 2f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(4.25f, 5.35f)
            curveToRelative(0.72f, -0.42f, 0.96f, -1.33f, 0.54f, -2.05f)
            curveToRelative(-0.42f, -0.72f, -1.33f, -0.96f, -2.05f, -0.54f)
            curveTo(1.05f, 3.74f, 0f, 5.56f, 0f, 7.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.94f, 1.05f, 3.75f, 2.75f, 4.74f)
            curveToRelative(0.24f, 0.14f, 0.5f, 0.2f, 0.75f, 0.2f)
            curveToRelative(0.52f, 0f, 1.02f, -0.27f, 1.3f, -0.74f)
            curveToRelative(0.42f, -0.72f, 0.17f, -1.63f, -0.54f, -2.05f)
            curveToRelative(-0.79f, -0.46f, -1.25f, -1.26f, -1.25f, -2.15f)
            lineTo(3.0f, 7.5f)
            curveToRelative(0f, -0.89f, 0.47f, -1.69f, 1.25f, -2.15f)
            close()
        }
    }.also { _TextInputLeft = it }
