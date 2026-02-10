package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSouth: ImageVector? = null

val Icons.Ss.CompassSouth: ImageVector
    get() = _CompassSouth ?: UXIcon(name = "CompassSouth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.25f, 8.99f)
                lineToRelative(-4.25f, 7.06f)
                lineToRelative(-4.22f, -7.05f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.0f)
                lineToRelative(4.21f, 1.82f)
                lineToRelative(4.25f, -1.83f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17.21f, 7.28f)
                curveToRelative(-0.58f, -0.33f, -1.3f, -0.34f, -1.9f, -0.04f)
                lineToRelative(-3.32f, 1.41f)
                lineToRelative(-3.25f, -1.4f)
                curveToRelative(-0.96f, -0.53f, -2.19f, -0.18f, -2.72f, 0.78f)
                verticalLineToRelative(0.0f)
                curveToRelative(-0.34f, 0.61f, -0.33f, 1.34f, 0.02f, 1.97f)
                lineToRelative(5.94f, 9.94f)
                lineToRelative(5.98f, -9.95f)
                curveToRelative(0.54f, -0.96f, 0.2f, -2.18f, -0.76f, -2.72f)
                close()
            }
        }.also { _CompassSouth = it}
