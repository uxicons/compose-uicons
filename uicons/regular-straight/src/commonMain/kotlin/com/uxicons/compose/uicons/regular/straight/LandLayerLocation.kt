package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayerLocation: ImageVector? = null

val Icons.Rs.LandLayerLocation: ImageVector
    get() = _LandLayerLocation ?: UXIcon(name = "LandLayerLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.94f, 16.85f)
                lineToRelative(-11.94f, 7.17f)
                lineTo(0.06f, 16.85f)
                lineToRelative(5.66f, -3.4f)
                lineToRelative(1.48f, 1.45f)
                lineToRelative(-3.25f, 1.95f)
                lineToRelative(8.06f, 4.83f)
                lineToRelative(8.06f, -4.83f)
                lineToRelative(-3.26f, -1.95f)
                lineToRelative(1.48f, -1.45f)
                lineToRelative(5.67f, 3.4f)
                close()
                moveTo(7.06f, 11.96f)
                curveToRelative(-2.74f, -2.74f, -2.74f, -7.18f, -0.01f, -9.91f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                curveToRelative(1.32f, 1.32f, 2.05f, 3.08f, 2.05f, 4.95f)
                reflectiveCurveToRelative(-0.73f, 3.63f, -2.05f, 4.95f)
                lineToRelative(-4.95f, 4.84f)
                lineToRelative(-4.94f, -4.83f)
                close()
                moveTo(8.46f, 10.54f)
                lineToRelative(3.54f, 3.46f)
                lineToRelative(3.54f, -3.47f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.19f, 1.46f, -3.53f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                reflectiveCurveToRelative(-2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                close()
                moveTo(12f, 9.99f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
            }
        }.also { _LandLayerLocation = it}
