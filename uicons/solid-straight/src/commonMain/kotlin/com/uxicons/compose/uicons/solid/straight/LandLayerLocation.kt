package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayerLocation: ImageVector? = null

val Icons.Ss.LandLayerLocation: ImageVector
    get() = _LandLayerLocation ?: UXIcon(name = "LandLayerLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.28f, 13.45f)
                lineToRelative(-6.28f, 6.25f)
                lineToRelative(-6.28f, -6.25f)
                lineTo(0.06f, 16.85f)
                lineToRelative(11.94f, 7.17f)
                lineToRelative(11.94f, -7.17f)
                lineToRelative(-5.67f, -3.4f)
                close()
                moveTo(16.95f, 2.05f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                reflectiveCurveToRelative(-3.63f, 0.73f, -4.95f, 2.05f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0.01f, 9.91f)
                lineToRelative(4.94f, 4.83f)
                lineToRelative(4.95f, -4.84f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                close()
                moveTo(12.0f, 9.99f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                close()
            }
        }.also { _LandLayerLocation = it}
