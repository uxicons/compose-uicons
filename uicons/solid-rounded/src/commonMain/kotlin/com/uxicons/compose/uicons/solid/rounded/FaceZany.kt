package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceZany: ImageVector? = null

val Icons.Sr.FaceZany: ImageVector
    get() = _FaceZany ?: UXIcon(name = "FaceZany") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
                reflectiveCurveTo(18.63f, 0f, 12f, 0f)
                close()
                moveTo(14.5f, 5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(5f, 12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(14.96f, 19.49f)
                curveToRelative(0.01f, -0.16f, 0.04f, -0.32f, 0.04f, -0.49f)
                verticalLineToRelative(-1.66f)
                curveToRelative(-0.69f, 0.33f, -1.36f, 0.59f, -2f, 0.81f)
                verticalLineToRelative(0.85f)
                curveToRelative(0f, 1.5f, -1f, 3f, -2.5f, 3f)
                reflectiveCurveToRelative(-2.5f, -1.5f, -2.5f, -3f)
                verticalLineToRelative(-1f)
                lineToRelative(0.01f, -0.0f)
                curveToRelative(0.0f, -0.52f, 0.39f, -0.96f, 0.92f, -0.99f)
                curveToRelative(0.05f, -0.0f, 5.17f, -0.39f, 8.35f, -3.7f)
                curveToRelative(0.29f, -0.3f, 0.74f, -0.39f, 1.13f, -0.22f)
                curveToRelative(0.38f, 0.17f, 0.62f, 0.56f, 0.59f, 0.98f)
                curveToRelative(-0.11f, 1.49f, -1.12f, 4.21f, -4.04f, 5.42f)
                close()
                moveTo(13f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _FaceZany = it}
