package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sailboat: ImageVector? = null

val Icons.Sc.Sailboat: ImageVector
    get() = _Sailboat ?: UXIcon(name = "Sailboat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.06f, 10.32f)
                curveToRelative(1.56f, -2.9f, 3.68f, -5.31f, 6.3f, -7.17f)
                curveToRelative(0.63f, -0.47f, 1.6f, 0.03f, 1.58f, 0.81f)
                verticalLineToRelative(6.1f)
                curveToRelative(0f, 0.53f, -0.41f, 0.96f, -0.93f, 1.0f)
                curveToRelative(-1.91f, 0.11f, -3.92f, 0.4f, -6.06f, 0.72f)
                curveToRelative(-0.73f, 0.02f, -1.25f, -0.84f, -0.88f, -1.47f)
                close()
                moveTo(22.0f, 14.02f)
                curveToRelative(-1.24f, -0.24f, -3.98f, -0.73f, -7.07f, -0.95f)
                verticalLineToRelative(-2.0f)
                curveToRelative(2.61f, 0.17f, 5.15f, 0.54f, 7.0f, 0.84f)
                curveToRelative(0.69f, 0.02f, 1.22f, -0.77f, 0.92f, -1.4f)
                curveToRelative(-1.75f, -4.0f, -4.94f, -7.17f, -9.46f, -9.43f)
                curveToRelative(-0.64f, -0.34f, -1.47f, 0.17f, -1.45f, 0.89f)
                verticalLineToRelative(10.99f)
                curveToRelative(-4.19f, 0f, -8.44f, 0.74f, -10.07f, 1.06f)
                curveToRelative(-0.51f, 0.1f, -0.86f, 0.58f, -0.8f, 1.1f)
                curveToRelative(0.65f, 5.42f, 4.0f, 7.83f, 10.87f, 7.83f)
                reflectiveCurveToRelative(10.22f, -2.42f, 10.87f, -7.83f)
                curveToRelative(0.06f, -0.52f, -0.29f, -1.0f, -0.8f, -1.1f)
                close()
            }
        }.also { _Sailboat = it}
