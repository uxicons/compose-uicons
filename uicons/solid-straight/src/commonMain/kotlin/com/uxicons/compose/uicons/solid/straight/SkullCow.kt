package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCow: ImageVector? = null

val Icons.Ss.SkullCow: ImageVector
    get() = _SkullCow ?: UXIcon(name = "SkullCow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 0f)
                curveToRelative(0f, 2.61f, 2.01f, 4.76f, 4.56f, 4.98f)
                lineToRelative(-2.34f, 6.2f)
                curveToRelative(-0.66f, 1.9f, 0.19f, 4.0f, 1.99f, 4.9f)
                lineToRelative(1.93f, 0.68f)
                lineToRelative(1.55f, 7.24f)
                horizontalLineToRelative(8.62f)
                lineToRelative(1.55f, -7.24f)
                lineToRelative(1.81f, -0.63f)
                lineToRelative(0.12f, -0.05f)
                curveToRelative(1.8f, -0.9f, 2.65f, -3.0f, 1.98f, -4.92f)
                lineToRelative(-2.33f, -6.17f)
                curveToRelative(2.55f, -0.22f, 4.56f, -2.37f, 4.56f, -4.98f)
                close()
                moveTo(8.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SkullCow = it}
