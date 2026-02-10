package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassCitrus: ImageVector? = null

val Icons.Br.MartiniGlassCitrus: ImageVector
    get() = _MartiniGlassCitrus ?: UXIcon(name = "MartiniGlassCitrus") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            curveToRelative(-2.14f, 0f, -3.99f, 1.22f, -4.9f, 3f)
            lineTo(3.27f, 3f)
            curveTo(1.92f, 3f, 0.72f, 3.82f, 0.23f, 5.09f)
            curveToRelative(-0.48f, 1.22f, -0.17f, 2.58f, 0.8f, 3.48f)
            lineToRelative(6.67f, 6.16f)
            curveToRelative(0.39f, 0.36f, 0.83f, 0.63f, 1.3f, 0.81f)
            verticalLineToRelative(5.46f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-5.46f)
            curveToRelative(0.47f, -0.18f, 0.91f, -0.45f, 1.31f, -0.81f)
            lineToRelative(4.14f, -3.83f)
            curveToRelative(0.34f, 0.07f, 0.69f, 0.1f, 1.05f, 0.1f)
            curveToRelative(3.04f, 0f, 5.5f, -2.46f, 5.5f, -5.5f)
            reflectiveCurveTo(21.54f, 0f, 18.5f, 0f)
            close()
            moveTo(11.28f, 12.52f)
            curveToRelative(-0.44f, 0.41f, -1.12f, 0.41f, -1.56f, 0.01f)
            lineTo(3.04f, 6.35f)
            curveToRelative(-0.03f, -0.03f, -0.06f, -0.06f, -0.02f, -0.16f)
            curveToRelative(0.02f, -0.06f, 0.09f, -0.18f, 0.25f, -0.18f)
            horizontalLineToRelative(14.47f)
            curveToRelative(0.16f, 0f, 0.23f, 0.13f, 0.25f, 0.18f)
            curveToRelative(0.04f, 0.11f, 0.01f, 0.14f, -0.04f, 0.19f)
            lineToRelative(-6.65f, 6.15f)
            close()
        }
    }.also { _MartiniGlassCitrus = it }
