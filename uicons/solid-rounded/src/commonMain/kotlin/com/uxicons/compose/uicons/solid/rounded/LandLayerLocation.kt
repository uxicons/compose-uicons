package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayerLocation: ImageVector? = null

val Icons.Sr.LandLayerLocation: ImageVector
    get() = _LandLayerLocation ?: UXIcon(name = "LandLayerLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.95f, 2.05f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                reflectiveCurveToRelative(-3.63f, 0.73f, -4.95f, 2.05f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0.01f, 9.91f)
                lineToRelative(2.5f, 2.44f)
                curveToRelative(0.68f, 0.66f, 1.56f, 0.99f, 2.45f, 0.99f)
                reflectiveCurveToRelative(1.77f, -0.33f, 2.45f, -0.99f)
                lineToRelative(2.5f, -2.45f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                close()
                moveTo(12f, 9.99f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                close()
                moveTo(24f, 16.76f)
                curveToRelative(0.0f, 0.35f, -0.18f, 0.68f, -0.48f, 0.86f)
                lineToRelative(-9.86f, 5.92f)
                curveToRelative(-0.51f, 0.31f, -1.08f, 0.46f, -1.65f, 0.46f)
                reflectiveCurveToRelative(-1.14f, -0.15f, -1.65f, -0.46f)
                lineTo(0.48f, 17.62f)
                curveToRelative(-0.3f, -0.18f, -0.49f, -0.51f, -0.48f, -0.86f)
                curveToRelative(0.0f, -0.35f, 0.19f, -0.68f, 0.49f, -0.86f)
                lineToRelative(4.86f, -2.84f)
                curveToRelative(0.1f, 0.11f, 0.2f, 0.22f, 0.31f, 0.33f)
                lineToRelative(2.5f, 2.44f)
                curveToRelative(1.03f, 1.01f, 2.4f, 1.56f, 3.85f, 1.56f)
                reflectiveCurveToRelative(2.82f, -0.56f, 3.85f, -1.56f)
                lineToRelative(2.52f, -2.46f)
                curveToRelative(0.1f, -0.1f, 0.19f, -0.2f, 0.29f, -0.3f)
                lineToRelative(4.85f, 2.84f)
                curveToRelative(0.3f, 0.18f, 0.49f, 0.51f, 0.49f, 0.86f)
                close()
            }
        }.also { _LandLayerLocation = it}
