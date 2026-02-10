package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scooter: ImageVector? = null

val Icons.Ss.Scooter: ImageVector
    get() = _Scooter ?: UXIcon(name = "Scooter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.29f, 18.03f)
                lineToRelative(-3.94f, -15.76f)
                curveToRelative(-0.33f, -1.34f, -1.53f, -2.27f, -2.91f, -2.27f)
                horizontalLineToRelative(-3.44f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.44f)
                curveToRelative(0.46f, 0f, 0.86f, 0.31f, 0.97f, 0.76f)
                lineToRelative(2.29f, 9.15f)
                lineToRelative(-4.17f, 5.1f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.78f)
                curveToRelative(-0.48f, 0.53f, -0.78f, 1.23f, -0.78f, 2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.77f, -0.3f, -1.47f, -0.78f, -2f)
                horizontalLineToRelative(8.25f)
                lineToRelative(3.83f, -4.68f)
                lineToRelative(1.04f, 4.18f)
                curveToRelative(-0.81f, 0.54f, -1.34f, 1.46f, -1.34f, 2.5f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -1.56f, -1.19f, -2.82f, -2.71f, -2.97f)
                close()
            }
        }.also { _Scooter = it}
