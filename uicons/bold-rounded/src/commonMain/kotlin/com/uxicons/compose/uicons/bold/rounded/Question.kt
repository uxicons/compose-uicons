package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Question: ImageVector? = null

val Icons.Br.Question: ImageVector
    get() = _Question ?: UXIcon(name = "Question") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -1.94f, 1.35f, -3.71f, 3.91f, -5.12f)
            curveToRelative(1.91f, -1.05f, 2.89f, -3.13f, 2.51f, -5.3f)
            curveToRelative(-0.35f, -2.0f, -2.0f, -3.65f, -4f, -4f)
            curveToRelative(-1.45f, -0.25f, -2.87f, 0.09f, -4.0f, 0.97f)
            curveToRelative(-1.11f, 0.87f, -1.82f, 2.16f, -1.92f, 3.56f)
            curveToRelative(-0.06f, 0.82f, -0.79f, 1.45f, -1.61f, 1.38f)
            curveToRelative(-0.83f, -0.06f, -1.45f, -0.78f, -1.38f, -1.61f)
            curveToRelative(0.17f, -2.24f, 1.29f, -4.32f, 3.07f, -5.7f)
            curveTo(8.89f, 0.28f, 11.15f, -0.28f, 13.44f, 0.13f)
            curveToRelative(3.22f, 0.57f, 5.87f, 3.21f, 6.44f, 6.44f)
            curveToRelative(0.6f, 3.4f, -1.02f, 6.79f, -4.02f, 8.45f)
            curveToRelative(-1.48f, 0.81f, -2.36f, 1.74f, -2.36f, 2.49f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(10.5f, 22.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
        }
    }.also { _Question = it }
