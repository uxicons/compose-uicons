package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlowest: ImageVector? = null

val Icons.Rc.TachometerSlowest: ImageVector
    get() = _TachometerSlowest ?: UXIcon(name = "TachometerSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.14f)
                curveToRelative(-1.08f, 0f, -1.99f, 0.79f, -2.18f, 1.82f)
                lineToRelative(-3.29f, 0.93f)
                curveToRelative(-0.53f, 0.15f, -0.84f, 0.7f, -0.69f, 1.23f)
                curveToRelative(0.12f, 0.44f, 0.53f, 0.73f, 0.96f, 0.73f)
                curveToRelative(0.09f, 0f, 0.18f, -0.01f, 0.27f, -0.04f)
                lineToRelative(3.31f, -0.94f)
                curveToRelative(0.4f, 0.43f, 0.97f, 0.69f, 1.6f, 0.69f)
                curveToRelative(1.22f, 0f, 2.21f, -0.99f, 2.21f, -2.21f)
                reflectiveCurveToRelative(-0.99f, -2.21f, -2.21f, -2.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.99f)
                curveTo(6.88f, 1.99f, 1f, 3.24f, 1f, 12.99f)
                curveToRelative(0f, 2.45f, 0.37f, 4.79f, 1.04f, 6.59f)
                curveToRelative(0.36f, 0.96f, 1.1f, 1.73f, 2.04f, 2.13f)
                curveToRelative(0.46f, 0.2f, 0.94f, 0.29f, 1.43f, 0.29f)
                curveToRelative(0.51f, 0f, 1.01f, -0.11f, 1.49f, -0.32f)
                lineToRelative(2.08f, -0.92f)
                curveToRelative(0.51f, -0.22f, 0.73f, -0.81f, 0.51f, -1.32f)
                reflectiveCurveToRelative(-0.81f, -0.73f, -1.32f, -0.51f)
                lineToRelative(-2.08f, 0.92f)
                curveToRelative(-0.43f, 0.19f, -0.9f, 0.19f, -1.33f, 0.01f)
                curveToRelative(-0.44f, -0.18f, -0.77f, -0.54f, -0.94f, -0.98f)
                curveToRelative(-0.59f, -1.59f, -0.92f, -3.68f, -0.92f, -5.89f)
                curveTo(3f, 5.52f, 6.6f, 3.99f, 12f, 3.99f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                curveToRelative(0f, 2.22f, -0.32f, 4.31f, -0.91f, 5.89f)
                curveToRelative(-0.17f, 0.45f, -0.5f, 0.8f, -0.94f, 0.99f)
                curveToRelative(-0.43f, 0.18f, -0.9f, 0.18f, -1.33f, -0.01f)
                lineToRelative(-2.09f, -0.92f)
                curveToRelative(-0.5f, -0.22f, -1.09f, 0.01f, -1.32f, 0.51f)
                curveToRelative(-0.22f, 0.51f, 0.01f, 1.1f, 0.51f, 1.32f)
                lineToRelative(2.09f, 0.92f)
                curveToRelative(0.94f, 0.41f, 1.98f, 0.42f, 2.92f, 0.02f)
                curveToRelative(0.94f, -0.4f, 1.68f, -1.18f, 2.03f, -2.14f)
                curveToRelative(0.67f, -1.8f, 1.03f, -4.14f, 1.03f, -6.58f)
                curveTo(23f, 3.24f, 17.12f, 1.99f, 12f, 1.99f)
                close()
            }
        }.also { _TachometerSlowest = it}
