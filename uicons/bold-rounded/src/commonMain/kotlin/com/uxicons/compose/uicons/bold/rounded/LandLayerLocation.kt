package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayerLocation: ImageVector? = null

val Icons.Br.LandLayerLocation: ImageVector
    get() = _LandLayerLocation ?: UXIcon(name = "LandLayerLocation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.25f, 12.68f)
            curveToRelative(0.97f, 0.95f, 2.52f, 0.95f, 3.5f, 0f)
            lineToRelative(2.49f, -2.44f)
            curveToRelative(1.13f, -1.13f, 1.76f, -2.64f, 1.76f, -4.24f)
            reflectiveCurveToRelative(-0.62f, -3.11f, -1.76f, -4.24f)
            curveToRelative(-1.13f, -1.13f, -2.64f, -1.76f, -4.24f, -1.76f)
            reflectiveCurveToRelative(-3.11f, 0.62f, -4.24f, 1.76f)
            curveToRelative(-1.13f, 1.13f, -1.76f, 2.64f, -1.76f, 4.24f)
            reflectiveCurveToRelative(0.62f, 3.11f, 1.77f, 4.25f)
            lineToRelative(2.48f, 2.43f)
            close()
            moveTo(12f, 4f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            close()
            moveTo(24f, 16.5f)
            curveToRelative(0f, 0.52f, -0.27f, 1.01f, -0.72f, 1.28f)
            lineToRelative(-9.41f, 5.7f)
            curveToRelative(-0.57f, 0.35f, -1.22f, 0.52f, -1.86f, 0.52f)
            reflectiveCurveToRelative(-1.29f, -0.17f, -1.86f, -0.52f)
            lineTo(0.72f, 17.78f)
            curveToRelative(-0.45f, -0.27f, -0.72f, -0.76f, -0.72f, -1.28f)
            reflectiveCurveToRelative(0.27f, -1.01f, 0.72f, -1.28f)
            lineToRelative(4.96f, -3f)
            curveToRelative(0.71f, -0.43f, 1.63f, -0.2f, 2.06f, 0.51f)
            curveToRelative(0.43f, 0.71f, 0.2f, 1.63f, -0.51f, 2.06f)
            lineToRelative(-2.84f, 1.72f)
            lineToRelative(7.29f, 4.41f)
            curveToRelative(0.19f, 0.12f, 0.43f, 0.12f, 0.62f, 0f)
            lineToRelative(7.29f, -4.41f)
            lineToRelative(-2.84f, -1.72f)
            curveToRelative(-0.71f, -0.43f, -0.94f, -1.35f, -0.51f, -2.06f)
            curveToRelative(0.43f, -0.71f, 1.35f, -0.94f, 2.06f, -0.51f)
            lineToRelative(4.96f, 3f)
            curveToRelative(0.45f, 0.27f, 0.72f, 0.76f, 0.72f, 1.28f)
            close()
        }
    }.also { _LandLayerLocation = it }
