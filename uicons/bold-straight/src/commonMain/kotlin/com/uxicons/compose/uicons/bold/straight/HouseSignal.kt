package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseSignal: ImageVector? = null

val Icons.Bs.HouseSignal: ImageVector
    get() = _HouseSignal ?: UXIcon(name = "HouseSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(1.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.5f, 16f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(1.5f, 11f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -6.34f, -5.16f, -11.5f, -11.5f, -11.5f)
                close()
                moveTo(22.53f, 4.47f)
                lineToRelative(-4.67f, -3.65f)
                curveToRelative(-1.39f, -1.09f, -3.33f, -1.09f, -4.72f, 0f)
                lineToRelative(-4.67f, 3.65f)
                curveToRelative(-0.94f, 0.73f, -1.47f, 1.83f, -1.47f, 3.02f)
                verticalLineToRelative(2.6f)
                curveToRelative(1.07f, 0.44f, 2.07f, 1.01f, 3f, 1.68f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0f, -0.26f, 0.12f, -0.5f, 0.32f, -0.66f)
                lineToRelative(4.67f, -3.65f)
                curveToRelative(0.3f, -0.24f, 0.72f, -0.24f, 1.02f, 0f)
                lineToRelative(4.67f, 3.65f)
                curveToRelative(0.2f, 0.16f, 0.32f, 0.4f, 0.32f, 0.66f)
                verticalLineToRelative(6.51f)
                horizontalLineToRelative(-8.77f)
                curveToRelative(0.67f, 0.93f, 1.24f, 1.93f, 1.68f, 3f)
                horizontalLineToRelative(10.09f)
                lineTo(24.0f, 7.49f)
                curveToRelative(0f, -1.19f, -0.54f, -2.29f, -1.47f, -3.02f)
                close()
            }
        }.also { _HouseSignal = it}
