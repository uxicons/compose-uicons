package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlow: ImageVector? = null

val Icons.Tc.TachometerSlow: ImageVector
    get() = _TachometerSlow ?: UXIcon(name = "TachometerSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.65f)
                curveToRelative(-0.31f, 0f, -0.6f, 0.08f, -0.85f, 0.22f)
                lineToRelative(-2.99f, -2.93f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                reflectiveCurveToRelative(-0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(2.99f, 2.92f)
                curveToRelative(-0.14f, 0.25f, -0.21f, 0.54f, -0.21f, 0.85f)
                curveToRelative(0f, 0.98f, 0.8f, 1.78f, 1.77f, 1.78f)
                reflectiveCurveToRelative(1.77f, -0.8f, 1.77f, -1.78f)
                reflectiveCurveToRelative(-0.8f, -1.78f, -1.77f, -1.78f)
                close()
                moveTo(12f, 14.2f)
                curveToRelative(-0.43f, 0f, -0.77f, -0.35f, -0.77f, -0.78f)
                reflectiveCurveToRelative(0.35f, -0.78f, 0.77f, -0.78f)
                reflectiveCurveToRelative(0.77f, 0.35f, 0.77f, 0.78f)
                reflectiveCurveToRelative(-0.35f, 0.78f, -0.77f, 0.78f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.02f)
                curveTo(4.29f, 2.02f, 1f, 5.32f, 1f, 13.05f)
                curveToRelative(0f, 2.51f, 0.38f, 4.91f, 1.06f, 6.75f)
                curveToRelative(0.32f, 0.87f, 0.99f, 1.57f, 1.84f, 1.93f)
                curveToRelative(0.85f, 0.36f, 1.78f, 0.35f, 2.63f, -0.03f)
                lineToRelative(2.18f, -0.97f)
                curveToRelative(0.25f, -0.11f, 0.37f, -0.41f, 0.25f, -0.66f)
                curveToRelative(-0.11f, -0.25f, -0.41f, -0.36f, -0.66f, -0.25f)
                lineToRelative(-2.18f, 0.97f)
                curveToRelative(-0.59f, 0.26f, -1.24f, 0.27f, -1.83f, 0.02f)
                curveToRelative(-0.6f, -0.25f, -1.06f, -0.73f, -1.29f, -1.35f)
                curveToRelative(-0.64f, -1.73f, -1.0f, -4f, -1.0f, -6.4f)
                curveTo(2f, 5.92f, 4.9f, 3.02f, 12f, 3.02f)
                reflectiveCurveToRelative(10f, 2.9f, 10f, 10.03f)
                curveToRelative(0f, 2.4f, -0.35f, 4.67f, -0.98f, 6.39f)
                curveToRelative(-0.23f, 0.62f, -0.69f, 1.1f, -1.29f, 1.36f)
                curveToRelative(-0.59f, 0.25f, -1.25f, 0.24f, -1.83f, -0.01f)
                lineToRelative(-2.19f, -0.97f)
                curveToRelative(-0.25f, -0.11f, -0.55f, 0.0f, -0.66f, 0.26f)
                curveToRelative(-0.11f, 0.25f, 0.0f, 0.55f, 0.26f, 0.66f)
                lineToRelative(2.19f, 0.97f)
                curveToRelative(0.43f, 0.19f, 0.88f, 0.29f, 1.34f, 0.29f)
                curveToRelative(0.44f, 0f, 0.87f, -0.09f, 1.29f, -0.27f)
                curveToRelative(0.85f, -0.36f, 1.52f, -1.06f, 1.84f, -1.93f)
                curveToRelative(0.68f, -1.83f, 1.05f, -4.23f, 1.05f, -6.74f)
                curveToRelative(0f, -9.77f, -5.88f, -11.03f, -11f, -11.03f)
                close()
            }
        }.also { _TachometerSlow = it}
