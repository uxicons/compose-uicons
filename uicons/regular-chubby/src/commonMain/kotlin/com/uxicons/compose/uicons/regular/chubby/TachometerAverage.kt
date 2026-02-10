package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAverage: ImageVector? = null

val Icons.Rc.TachometerAverage: ImageVector
    get() = _TachometerAverage ?: UXIcon(name = "TachometerAverage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11.38f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.4f)
                curveToRelative(-0.72f, 0.37f, -1.21f, 1.11f, -1.21f, 1.97f)
                curveToRelative(0f, 1.22f, 0.99f, 2.21f, 2.21f, 2.21f)
                reflectiveCurveToRelative(2.21f, -0.99f, 2.21f, -2.21f)
                curveToRelative(0f, -0.86f, -0.49f, -1.61f, -1.21f, -1.97f)
                close()
            }
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
                curveToRelative(0f, 2.22f, -0.33f, 4.31f, -0.92f, 5.89f)
                curveToRelative(-0.17f, 0.45f, -0.5f, 0.8f, -0.94f, 0.98f)
                curveToRelative(-0.43f, 0.18f, -0.9f, 0.18f, -1.33f, -0.01f)
                lineToRelative(-2.08f, -0.92f)
                curveToRelative(-0.5f, -0.23f, -1.1f, 0.0f, -1.32f, 0.51f)
                reflectiveCurveToRelative(0.0f, 1.1f, 0.51f, 1.32f)
                lineToRelative(2.08f, 0.92f)
                curveToRelative(0.48f, 0.21f, 0.98f, 0.32f, 1.49f, 0.32f)
                curveToRelative(0.48f, 0f, 0.97f, -0.1f, 1.43f, -0.29f)
                curveToRelative(0.94f, -0.4f, 1.68f, -1.17f, 2.04f, -2.13f)
                curveToRelative(0.67f, -1.8f, 1.04f, -4.14f, 1.04f, -6.59f)
                curveTo(23f, 3.24f, 17.12f, 1.99f, 12f, 1.99f)
                close()
            }
        }.also { _TachometerAverage = it}
