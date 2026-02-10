package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webcam: ImageVector? = null

val Icons.Tr.Webcam: ImageVector
    get() = _Webcam ?: UXIcon(name = "Webcam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 10f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                curveToRelative(0f, 3.94f, 2.29f, 7.35f, 5.61f, 8.98f)
                curveToRelative(-0.71f, 0.52f, -1.33f, 1.18f, -1.8f, 1.94f)
                curveToRelative(-0.4f, 0.63f, -0.41f, 1.4f, -0.05f, 2.05f)
                curveToRelative(0.36f, 0.64f, 1.01f, 1.03f, 1.75f, 1.03f)
                horizontalLineToRelative(8.98f)
                curveToRelative(0.73f, 0f, 1.4f, -0.4f, 1.76f, -1.03f)
                curveToRelative(0.35f, -0.62f, 0.34f, -1.36f, -0.02f, -1.96f)
                curveToRelative(-0.47f, -0.79f, -1.1f, -1.47f, -1.84f, -2.02f)
                curveToRelative(3.33f, -1.63f, 5.62f, -5.04f, 5.62f, -8.99f)
                close()
                moveTo(15.29f, 19.47f)
                curveToRelative(0.85f, 0.5f, 1.56f, 1.21f, 2.07f, 2.05f)
                curveToRelative(0.18f, 0.3f, 0.18f, 0.64f, 0.01f, 0.95f)
                curveToRelative(-0.19f, 0.33f, -0.52f, 0.52f, -0.89f, 0.52f)
                lineTo(7.5f, 23.0f)
                curveToRelative(-0.37f, 0f, -0.69f, -0.19f, -0.87f, -0.51f)
                curveToRelative(-0.18f, -0.33f, -0.17f, -0.72f, 0.03f, -1.04f)
                curveToRelative(0.51f, -0.82f, 1.23f, -1.52f, 2.06f, -2.0f)
                curveToRelative(1.03f, 0.36f, 2.13f, 0.55f, 3.28f, 0.55f)
                reflectiveCurveToRelative(2.24f, -0.19f, 3.27f, -0.55f)
                curveToRelative(0.01f, 0.01f, 0.02f, 0.01f, 0.03f, 0.02f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 1f, 12f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _Webcam = it}
