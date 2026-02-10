package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brand: ImageVector? = null

val Icons.Bs.Brand: ImageVector
    get() = _Brand ?: UXIcon(name = "Brand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.11f, 12.71f)
                lineTo(12.22f, 1.99f)
                lineToRelative(-7.28f, 0.79f)
                lineTo(2.17f, 0f)
                lineTo(0.04f, 2.12f)
                lineToRelative(2.75f, 2.75f)
                lineToRelative(-0.86f, 7.61f)
                lineToRelative(10.76f, 10.56f)
                curveToRelative(0.62f, 0.61f, 1.43f, 0.92f, 2.24f, 0.92f)
                curveToRelative(0.82f, 0f, 1.65f, -0.32f, 2.28f, -0.95f)
                lineToRelative(5.95f, -6.08f)
                curveToRelative(1.15f, -1.17f, 1.13f, -3.07f, -0.03f, -4.23f)
                close()
                moveTo(15.07f, 20.91f)
                curveToRelative(-0.07f, 0.07f, -0.2f, 0.07f, -0.27f, 0f)
                lineTo(5.08f, 11.37f)
                lineToRelative(0.43f, -3.78f)
                lineToRelative(1.53f, 1.53f)
                curveToRelative(-0.02f, 0.11f, -0.04f, 0.23f, -0.04f, 0.34f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.12f, 0f, -0.23f, 0.02f, -0.34f, 0.04f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(3.47f, -0.38f)
                lineToRelative(9.88f, 9.72f)
                lineToRelative(-5.94f, 6.07f)
                close()
                moveTo(15.06f, 18.03f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(3f, -3f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3f, 3f)
                close()
            }
        }.also { _Brand = it}
