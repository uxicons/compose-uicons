package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarChargerBolt: ImageVector? = null

val Icons.Ss.CarChargerBolt: ImageVector
    get() = _CarChargerBolt ?: UXIcon(name = "CarChargerBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-10f)
                close()
                moveTo(11.14f, 1f)
                horizontalLineToRelative(7.86f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-8.94f)
                lineToRelative(-1.54f, 2.51f)
                curveToRelative(-0.76f, 1.39f, -2.71f, 1.92f, -4.08f, 1.09f)
                lineToRelative(-0.6f, -0.34f)
                lineToRelative(-2.13f, 3.73f)
                lineToRelative(-1.74f, -0.99f)
                lineToRelative(2.13f, -3.73f)
                lineToRelative(-0.6f, -0.34f)
                curveToRelative(-1.44f, -0.82f, -1.94f, -2.66f, -1.12f, -4.09f)
                lineToRelative(6.39f, -11.3f)
                curveToRelative(0.89f, -1.57f, 2.55f, -2.54f, 4.35f, -2.54f)
                close()
                moveTo(12.71f, 4.38f)
                lineTo(10.27f, 7.51f)
                curveToRelative(-0.33f, 0.49f, -0.36f, 1.12f, -0.08f, 1.65f)
                reflectiveCurveToRelative(0.82f, 0.85f, 1.41f, 0.85f)
                horizontalLineToRelative(0.97f)
                lineToRelative(-1.87f, 2.38f)
                lineToRelative(1.57f, 1.23f)
                lineToRelative(2.44f, -3.13f)
                curveToRelative(0.33f, -0.49f, 0.36f, -1.12f, 0.08f, -1.65f)
                reflectiveCurveToRelative(-0.82f, -0.85f, -1.41f, -0.85f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(1.87f, -2.38f)
                close()
            }
        }.also { _CarChargerBolt = it}
