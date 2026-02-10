package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWoozy: ImageVector? = null

val Icons.Ts.FaceWoozy: ImageVector
    get() = _FaceWoozy ?: UXIcon(name = "FaceWoozy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.97f, 5.51f)
                lineToRelative(-0.83f, -0.56f)
                curveToRelative(-0.91f, 1.36f, -2.14f, 2.38f, -3.54f, 2.94f)
                lineToRelative(0.37f, 0.93f)
                curveToRelative(1.6f, -0.64f, 2.98f, -1.78f, 4.0f, -3.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.28f, 11.05f)
                lineToRelative(4f, -2f)
                lineToRelative(0.45f, 0.89f)
                lineToRelative(-4f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 18f)
                curveToRelative(-0.3f, 0f, -0.79f, -0.48f, -1.19f, -0.86f)
                curveToRelative(-0.58f, -0.56f, -1.19f, -1.14f, -1.89f, -1.14f)
                curveToRelative(-0.65f, 0f, -1.12f, 0.31f, -1.53f, 0.58f)
                curveToRelative(-0.34f, 0.22f, -0.62f, 0.42f, -0.97f, 0.42f)
                curveToRelative(-0.49f, 0f, -1.75f, -0.96f, -2.65f, -1.85f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(0.36f, 0.36f, 2.21f, 2.15f, 3.35f, 2.15f)
                curveToRelative(0.65f, 0f, 1.12f, -0.31f, 1.53f, -0.58f)
                curveToRelative(0.34f, -0.22f, 0.62f, -0.42f, 0.97f, -0.42f)
                curveToRelative(0.3f, 0f, 0.79f, 0.48f, 1.19f, 0.86f)
                curveToRelative(0.58f, 0.56f, 1.19f, 1.14f, 1.89f, 1.14f)
                curveToRelative(1.93f, 0f, 3.66f, -2.92f, 3.86f, -3.25f)
                lineToRelative(-0.87f, -0.5f)
                curveToRelative(-0.41f, 0.71f, -1.85f, 2.75f, -2.99f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13.5f)
                curveToRelative(1.29f, 0f, 2.3f, -1.54f, 2.3f, -3.5f)
                reflectiveCurveToRelative(-1.01f, -3.5f, -2.3f, -3.5f)
                reflectiveCurveToRelative(-2.3f, 1.54f, -2.3f, 3.5f)
                reflectiveCurveToRelative(1.01f, 3.5f, 2.3f, 3.5f)
                close()
                moveTo(16f, 7.5f)
                curveToRelative(0.61f, 0f, 1.3f, 1.03f, 1.3f, 2.5f)
                reflectiveCurveToRelative(-0.69f, 2.5f, -1.3f, 2.5f)
                reflectiveCurveToRelative(-1.3f, -1.03f, -1.3f, -2.5f)
                reflectiveCurveToRelative(0.69f, -2.5f, 1.3f, -2.5f)
                close()
            }
        }.also { _FaceWoozy = it}
