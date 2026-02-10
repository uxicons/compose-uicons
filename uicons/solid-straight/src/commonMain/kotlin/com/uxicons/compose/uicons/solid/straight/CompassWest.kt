package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassWest: ImageVector? = null

val Icons.Ss.CompassWest: ImageVector
    get() = _CompassWest ?: UXIcon(name = "CompassWest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.01f, 7.78f)
                lineToRelative(-1.83f, 4.22f)
                lineToRelative(1.76f, 4.14f)
                lineToRelative(-6.99f, -4.14f)
                lineToRelative(7.06f, -4.22f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(15.35f, 12.0f)
                lineToRelative(1.4f, -3.25f)
                curveToRelative(0.53f, -0.96f, 0.18f, -2.19f, -0.78f, -2.72f)
                curveToRelative(-0.61f, -0.34f, -1.34f, -0.34f, -1.97f, 0.02f)
                lineTo(4.05f, 12.0f)
                lineToRelative(9.95f, 5.98f)
                curveToRelative(0.31f, 0.17f, 0.65f, 0.26f, 0.98f, 0.26f)
                curveToRelative(0.7f, 0f, 1.38f, -0.37f, 1.75f, -1.02f)
                curveToRelative(0.33f, -0.58f, 0.34f, -1.3f, 0.04f, -1.9f)
                lineToRelative(-1.41f, -3.32f)
                close()
            }
        }.also { _CompassWest = it}
