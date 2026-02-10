package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseNight: ImageVector? = null

val Icons.Ss.HouseNight: ImageVector
    get() = _HouseNight ?: UXIcon(name = "HouseNight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.59f, 11.4f)
                curveToRelative(-0.78f, 0.38f, -1.66f, 0.6f, -2.59f, 0.6f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(2.69f, 0f, 6f, 0f)
                curveToRelative(0.93f, 0f, 1.81f, 0.22f, 2.59f, 0.6f)
                curveToRelative(-2.54f, 0.48f, -4.47f, 2.72f, -4.47f, 5.4f)
                reflectiveCurveToRelative(1.92f, 4.92f, 4.47f, 5.4f)
                close()
                moveTo(9f, 3.5f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                close()
                moveTo(0.5f, 18.5f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, -1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1f, -2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                close()
                moveTo(19f, 5.5f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-1.67f, 0.83f)
                close()
                moveTo(24f, 15.11f)
                verticalLineToRelative(8.89f)
                lineTo(8f, 24f)
                verticalLineToRelative(-8.89f)
                curveToRelative(0f, -0.93f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineToRelative(5.45f, -4.26f)
                curveToRelative(0.82f, -0.65f, 1.98f, -0.65f, 2.8f, 0f)
                lineToRelative(5.45f, 4.26f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.43f, 1.15f, 2.36f)
                close()
                moveTo(18f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _HouseNight = it}
