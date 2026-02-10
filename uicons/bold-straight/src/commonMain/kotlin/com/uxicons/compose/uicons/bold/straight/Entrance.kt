package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Entrance: ImageVector? = null

val Icons.Bs.Entrance: ImageVector
    get() = _Entrance ?: UXIcon(name = "Entrance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 4.7f)
                verticalLineToRelative(19.3f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-3.16f)
                lineToRelative(3f, -3.07f)
                verticalLineToRelative(3.23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.73f)
                lineToRelative(-3f, -3.07f)
                verticalLineToRelative(-2.66f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.84f)
                curveToRelative(0.22f, -0.46f, 0.54f, -0.87f, 0.94f, -1.21f)
                curveToRelative(0.81f, -0.67f, 1.88f, -0.93f, 2.9f, -0.72f)
                lineToRelative(6f, 1.2f)
                curveToRelative(1.63f, 0.33f, 2.81f, 1.77f, 2.81f, 3.43f)
                close()
                moveTo(21f, 4.7f)
                curveToRelative(0f, -0.24f, -0.17f, -0.44f, -0.4f, -0.49f)
                lineToRelative(-6f, -1.2f)
                curveToRelative(-0.2f, -0.04f, -0.35f, 0.05f, -0.42f, 0.1f)
                curveToRelative(-0.07f, 0.06f, -0.18f, 0.18f, -0.18f, 0.39f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(7f)
                close()
                moveTo(8.71f, 15.21f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.71f, -3.79f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Entrance = it}
