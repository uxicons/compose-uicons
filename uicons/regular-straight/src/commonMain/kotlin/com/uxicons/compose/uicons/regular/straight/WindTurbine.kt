package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindTurbine: ImageVector? = null

val Icons.Rs.WindTurbine: ImageVector
    get() = _WindTurbine ?: UXIcon(name = "WindTurbine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.2f, 13.95f)
                curveToRelative(-0.16f, -0.13f, -3.76f, -3.09f, -6.67f, -4.98f)
                curveToRelative(-0.39f, -3.46f, -1.43f, -8.0f, -1.48f, -8.2f)
                lineToRelative(-0.18f, -0.78f)
                horizontalLineToRelative(-3.73f)
                lineToRelative(-0.18f, 0.78f)
                curveToRelative(-0.05f, 0.2f, -1.09f, 4.74f, -1.48f, 8.2f)
                curveToRelative(-2.92f, 1.89f, -6.52f, 4.85f, -6.67f, 4.98f)
                lineToRelative(-0.61f, 0.51f)
                lineToRelative(1.66f, 3.34f)
                lineToRelative(0.77f, -0.19f)
                curveToRelative(0.19f, -0.05f, 4.2f, -1.01f, 7.39f, -2.12f)
                verticalLineToRelative(6.51f)
                horizontalLineToRelative(-4.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.02f)
                verticalLineToRelative(-6.5f)
                curveToRelative(3.19f, 1.1f, 7.17f, 2.06f, 7.36f, 2.11f)
                lineToRelative(0.77f, 0.19f)
                lineToRelative(1.66f, -3.34f)
                lineToRelative(-0.61f, -0.51f)
                close()
                moveTo(20.07f, 15.47f)
                curveToRelative(-1.59f, -0.4f, -5.28f, -1.38f, -7.7f, -2.34f)
                lineToRelative(-0.37f, -0.15f)
                lineToRelative(-0.37f, 0.15f)
                curveToRelative(-2.42f, 0.96f, -6.11f, 1.93f, -7.7f, 2.34f)
                lineToRelative(-0.24f, -0.48f)
                curveToRelative(1.23f, -0.99f, 4.07f, -3.22f, 6.26f, -4.59f)
                lineToRelative(0.42f, -0.26f)
                lineToRelative(0.05f, -0.49f)
                curveToRelative(0.25f, -2.58f, 0.98f, -6.11f, 1.32f, -7.65f)
                horizontalLineToRelative(0.53f)
                curveToRelative(0.34f, 1.54f, 1.06f, 5.08f, 1.32f, 7.65f)
                lineToRelative(0.05f, 0.49f)
                lineToRelative(0.42f, 0.26f)
                curveToRelative(2.19f, 1.37f, 5.03f, 3.6f, 6.26f, 4.59f)
                lineToRelative(-0.24f, 0.48f)
                close()
            }
        }.also { _WindTurbine = it}
