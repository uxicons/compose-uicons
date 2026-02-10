package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Review: ImageVector? = null

val Icons.Br.Review: ImageVector
    get() = _Review ?: UXIcon(name = "Review") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8.03f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(11.33f, 0f, 8.03f, 0f)
            reflectiveCurveTo(2.03f, 2.69f, 2.03f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(8.03f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(10f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -4.69f, 3.81f, -8.5f, 8.5f, -8.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(23.64f, 17.77f)
            lineToRelative(-2.37f, 1.93f)
            lineToRelative(0.98f, 2.98f)
            curveToRelative(0.13f, 0.4f, -0.0f, 0.85f, -0.34f, 1.11f)
            curveToRelative(-0.34f, 0.26f, -0.8f, 0.28f, -1.16f, 0.05f)
            lineToRelative(-2.75f, -1.79f)
            lineToRelative(-2.71f, 1.81f)
            curveToRelative(-0.17f, 0.11f, -0.36f, 0.17f, -0.56f, 0.17f)
            curveToRelative(-0.21f, 0f, -0.42f, -0.07f, -0.6f, -0.2f)
            curveToRelative(-0.34f, -0.25f, -0.48f, -0.7f, -0.35f, -1.1f)
            lineToRelative(0.94f, -3.02f)
            lineToRelative(-2.38f, -1.93f)
            curveToRelative(-0.32f, -0.27f, -0.44f, -0.71f, -0.29f, -1.11f)
            curveToRelative(0.14f, -0.39f, 0.52f, -0.66f, 0.94f, -0.66f)
            horizontalLineToRelative(3.0f)
            lineToRelative(1.06f, -2.98f)
            curveToRelative(0.15f, -0.39f, 0.52f, -0.65f, 0.94f, -0.65f)
            reflectiveCurveToRelative(0.79f, 0.26f, 0.94f, 0.65f)
            lineToRelative(1.06f, 2.98f)
            horizontalLineToRelative(3.0f)
            curveToRelative(0.42f, 0f, 0.8f, 0.26f, 0.94f, 0.66f)
            curveToRelative(0.14f, 0.4f, 0.03f, 0.84f, -0.29f, 1.11f)
            close()
        }
    }.also { _Review = it }
