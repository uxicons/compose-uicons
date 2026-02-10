package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleDroplet: ImageVector? = null

val Icons.Ts.BottleDroplet: ImageVector
    get() = _BottleDroplet ?: UXIcon(name = "BottleDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.84f, 10.23f)
                lineToRelative(-3.84f, -3.46f)
                lineTo(15f, 1f)
                horizontalLineToRelative(1f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.63f)
                lineToRelative(-3.84f, 3.46f)
                curveToRelative(-0.74f, 0.66f, -1.16f, 1.61f, -1.16f, 2.6f)
                verticalLineToRelative(11.31f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-11.16f)
                curveToRelative(0f, -0.99f, -0.42f, -1.94f, -1.16f, -2.6f)
                close()
                moveTo(19f, 23f)
                lineTo(5f, 23f)
                verticalLineToRelative(-10.31f)
                curveToRelative(0f, -0.71f, 0.3f, -1.39f, 0.83f, -1.86f)
                lineToRelative(4.17f, -3.75f)
                lineTo(10f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6.22f)
                lineToRelative(4.17f, 3.76f)
                curveToRelative(0.53f, 0.47f, 0.83f, 1.15f, 0.83f, 1.86f)
                verticalLineToRelative(10.16f)
                close()
                moveTo(12.34f, 12.13f)
                lineToRelative(-0.34f, -0.32f)
                lineToRelative(-0.34f, 0.32f)
                curveToRelative(-0.27f, 0.25f, -2.66f, 2.53f, -2.66f, 4.37f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.83f, -2.39f, -4.11f, -2.66f, -4.37f)
                close()
                moveTo(12f, 18.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.01f, 1.23f, -2.5f, 2f, -3.3f)
                curveToRelative(0.77f, 0.79f, 2f, 2.28f, 2f, 3.3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _BottleDroplet = it}
