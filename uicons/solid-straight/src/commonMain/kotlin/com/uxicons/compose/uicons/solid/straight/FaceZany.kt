package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceZany: ImageVector? = null

val Icons.Ss.FaceZany: ImageVector
    get() = _FaceZany ?: UXIcon(name = "FaceZany") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.63f, -5.37f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.63f, 0f, 12f)
                reflectiveCurveTo(5.37f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.37f, 12f, 12f)
                close()
                moveTo(11f, 7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(7f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(18.31f, 12.57f)
                reflectiveCurveToRelative(-2.4f, 2.07f, -5.18f, 3.21f)
                curveToRelative(-2.77f, 1.14f, -5.93f, 1.35f, -5.93f, 1.35f)
                curveToRelative(0.23f, 0.3f, 0.5f, 0.59f, 0.8f, 0.88f)
                verticalLineToRelative(0.99f)
                curveToRelative(0f, 1.5f, 1f, 3f, 2.5f, 3f)
                reflectiveCurveToRelative(2.5f, -1.5f, 2.5f, -3f)
                verticalLineToRelative(-1.04f)
                curveToRelative(0.3f, -0.1f, 0.6f, -0.21f, 0.89f, -0.33f)
                curveToRelative(0.38f, -0.15f, 0.75f, -0.33f, 1.11f, -0.51f)
                verticalLineToRelative(1.88f)
                curveToRelative(0f, 0.1f, -0.01f, 0.2f, -0.02f, 0.3f)
                curveToRelative(2.8f, -1.37f, 3.61f, -4.48f, 3.33f, -6.73f)
                close()
            }
        }.also { _FaceZany = it}
