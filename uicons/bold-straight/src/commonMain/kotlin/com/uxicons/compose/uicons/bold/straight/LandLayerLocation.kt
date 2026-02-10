package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayerLocation: ImageVector? = null

val Icons.Bs.LandLayerLocation: ImageVector
    get() = _LandLayerLocation ?: UXIcon(name = "LandLayerLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.24f, 1.76f)
                curveToRelative(-1.13f, -1.13f, -2.64f, -1.76f, -4.24f, -1.76f)
                reflectiveCurveToRelative(-3.11f, 0.62f, -4.24f, 1.76f)
                curveToRelative(-1.13f, 1.13f, -1.76f, 2.64f, -1.76f, 4.24f)
                reflectiveCurveToRelative(0.62f, 3.11f, 1.77f, 4.25f)
                lineToRelative(4.23f, 4.14f)
                lineToRelative(4.24f, -4.15f)
                curveToRelative(1.13f, -1.13f, 1.76f, -2.64f, 1.76f, -4.24f)
                reflectiveCurveToRelative(-0.62f, -3.11f, -1.76f, -4.24f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(24f, 15.7f)
                verticalLineToRelative(1.1f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 16.8f)
                verticalLineToRelative(-1.1f)
                lineToRelative(6.49f, -3.9f)
                lineToRelative(2.22f, 2.17f)
                lineToRelative(-3.8f, 2.28f)
                lineToRelative(7.08f, 4.25f)
                lineToRelative(7.08f, -4.25f)
                lineToRelative(-3.8f, -2.28f)
                lineToRelative(2.22f, -2.17f)
                lineToRelative(6.49f, 3.9f)
                close()
            }
        }.also { _LandLayerLocation = it}
