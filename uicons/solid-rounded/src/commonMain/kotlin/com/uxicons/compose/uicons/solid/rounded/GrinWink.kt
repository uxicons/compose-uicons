package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinWink: ImageVector? = null

val Icons.Sr.GrinWink: ImageVector
    get() = _GrinWink ?: UXIcon(name = "GrinWink", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 0.83f)
                curveTo(114.68f, 0.99f, 0.17f, 115.51f, 0f, 256.83f)
                curveToRelative(12.8f, 339.2f, 499.2f, 339.05f, 512f, 0f)
                curveTo(511.85f, 115.51f, 397.32f, 0.98f, 256f, 0.83f)
                close()
                moveTo(155.9f, 191.18f)
                horizontalLineToRelative(64f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                horizontalLineToRelative(-64f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                curveTo(134.57f, 200.74f, 144.12f, 191.18f, 155.9f, 191.18f)
                close()
                moveTo(387.2f, 330.75f)
                curveToRelative(-25.51f, 44.97f, -72.94f, 73.04f, -124.63f, 73.77f)
                curveToRelative(-51.73f, -0.72f, -99.2f, -28.79f, -124.76f, -73.77f)
                curveToRelative(-6.36f, -9.92f, -3.47f, -23.12f, 6.45f, -29.47f)
                curveToRelative(4.71f, -3.02f, 10.43f, -4.07f, 15.9f, -2.91f)
                curveToRelative(32.8f, 12.36f, 67.37f, 19.39f, 102.4f, 20.82f)
                curveToRelative(34.97f, -1.45f, 69.48f, -8.48f, 102.23f, -20.82f)
                curveToRelative(11.52f, -2.45f, 22.85f, 4.9f, 25.31f, 16.42f)
                curveTo(391.28f, 320.28f, 390.23f, 326.02f, 387.2f, 330.75f)
                close()
                moveTo(347.9f, 233.85f)
                curveToRelative(-23.57f, 0f, -42.67f, 0f, -42.67f, -21.33f)
                curveToRelative(0f, -23.56f, 19.1f, -42.67f, 42.67f, -42.67f)
                reflectiveCurveToRelative(42.67f, 19.1f, 42.67f, 42.67f)
                curveTo(390.57f, 233.85f, 371.48f, 233.85f, 347.9f, 233.85f)
                close()
            }
        }.also { _GrinWink = it}
