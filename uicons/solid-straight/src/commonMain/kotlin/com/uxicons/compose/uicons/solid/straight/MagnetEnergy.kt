package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnetEnergy: ImageVector? = null

val Icons.Ss.MagnetEnergy: ImageVector
    get() = _MagnetEnergy ?: UXIcon(name = "MagnetEnergy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.29f, 8.0f)
                horizontalLineToRelative(-0.63f)
                reflectiveCurveToRelative(0.93f, -2.98f, 0.93f, -2.98f)
                lineToRelative(-2.06f, 0.0f)
                curveToRelative(-0.41f, 0f, -0.71f, -0.4f, -0.59f, -0.8f)
                lineToRelative(1.51f, -4.22f)
                horizontalLineToRelative(3f)
                lineToRelative(-1f, 2.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.48f, 0f, 0.82f, 0.54f, 0.56f, 0.94f)
                lineToRelative(-3.71f, 4.56f)
                close()
                moveTo(7f, 0f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, 2.92f, -2.51f, 5.26f, -5.49f, 4.98f)
                curveToRelative(-2.6f, -0.25f, -4.51f, -2.58f, -4.51f, -5.19f)
                verticalLineToRelative(-4.79f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 6.63f, 5.37f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                close()
                moveTo(17f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _MagnetEnergy = it}
