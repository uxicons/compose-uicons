package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFastest: ImageVector? = null

val Icons.Rc.TachometerFastest: ImageVector
    get() = _TachometerFastest ?: UXIcon(name = "TachometerFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.99f)
                curveTo(6.88f, 1.99f, 1f, 3.24f, 1f, 12.99f)
                curveToRelative(0f, 2.45f, 0.37f, 4.79f, 1.03f, 6.58f)
                curveToRelative(0.35f, 0.96f, 1.1f, 1.74f, 2.04f, 2.14f)
                curveToRelative(0.94f, 0.4f, 1.98f, 0.39f, 2.92f, -0.02f)
                lineToRelative(2.09f, -0.92f)
                curveToRelative(0.51f, -0.22f, 0.73f, -0.81f, 0.51f, -1.32f)
                reflectiveCurveToRelative(-0.81f, -0.73f, -1.32f, -0.51f)
                lineToRelative(-2.09f, 0.92f)
                curveToRelative(-0.43f, 0.19f, -0.9f, 0.19f, -1.33f, 0.01f)
                curveToRelative(-0.44f, -0.19f, -0.77f, -0.54f, -0.94f, -0.99f)
                curveToRelative(-0.58f, -1.58f, -0.91f, -3.67f, -0.91f, -5.89f)
                curveTo(3f, 5.52f, 6.6f, 3.99f, 12f, 3.99f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                curveToRelative(0f, 2.21f, -0.33f, 4.31f, -0.92f, 5.89f)
                curveToRelative(-0.17f, 0.45f, -0.5f, 0.8f, -0.94f, 0.99f)
                curveToRelative(-0.43f, 0.18f, -0.9f, 0.18f, -1.33f, -0.01f)
                lineToRelative(-2.08f, -0.92f)
                curveToRelative(-0.51f, -0.23f, -1.1f, 0.01f, -1.32f, 0.51f)
                curveToRelative(-0.22f, 0.51f, 0.0f, 1.1f, 0.51f, 1.32f)
                lineToRelative(2.08f, 0.92f)
                curveToRelative(0.48f, 0.21f, 0.98f, 0.32f, 1.49f, 0.32f)
                curveToRelative(0.48f, 0f, 0.97f, -0.1f, 1.43f, -0.29f)
                curveToRelative(0.94f, -0.4f, 1.68f, -1.17f, 2.04f, -2.13f)
                curveToRelative(0.67f, -1.8f, 1.04f, -4.14f, 1.04f, -6.59f)
                curveTo(23f, 3.24f, 17.12f, 1.99f, 12f, 1.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.92f, 15.81f)
                curveToRelative(0.09f, 0.03f, 0.18f, 0.04f, 0.27f, 0.04f)
                curveToRelative(0.44f, 0f, 0.84f, -0.29f, 0.96f, -0.73f)
                curveToRelative(0.15f, -0.53f, -0.16f, -1.08f, -0.69f, -1.23f)
                lineToRelative(-3.29f, -0.93f)
                curveToRelative(-0.19f, -1.03f, -1.09f, -1.82f, -2.18f, -1.82f)
                curveToRelative(-1.22f, 0f, -2.21f, 0.99f, -2.21f, 2.21f)
                reflectiveCurveToRelative(0.99f, 2.21f, 2.21f, 2.21f)
                curveToRelative(0.63f, 0f, 1.2f, -0.27f, 1.6f, -0.69f)
                lineToRelative(3.31f, 0.94f)
                close()
            }
        }.also { _TachometerFastest = it}
