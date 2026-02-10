package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lamp: ImageVector? = null

val Icons.Ts.Lamp: ImageVector
    get() = _Lamp ?: UXIcon(name = "Lamp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 19f)
                curveToRelative(-0.12f, 0f, -3.0f, -0.04f, -3.0f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(11.51f)
                lineToRelative(-2.1f, -12.9f)
                curveToRelative(-0.2f, -1.22f, -1.23f, -2.1f, -2.47f, -2.1f)
                lineTo(4.58f, -0f)
                curveToRelative(-1.23f, 0f, -2.27f, 0.88f, -2.47f, 2.1f)
                lineTo(0.01f, 15f)
                horizontalLineToRelative(11.49f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.46f, -2.88f, 2.5f, -3f, 2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1.18f, 14f)
                lineTo(3.1f, 2.26f)
                curveToRelative(0.12f, -0.73f, 0.74f, -1.26f, 1.48f, -1.26f)
                horizontalLineToRelative(14.87f)
                curveToRelative(0.74f, 0f, 1.36f, 0.53f, 1.48f, 1.26f)
                lineToRelative(1.91f, 11.74f)
                lineTo(1.18f, 14f)
                close()
                moveTo(15.5f, 23f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.01f, 0f, 2.67f, -0.39f, 3.5f, -1.67f)
                curveToRelative(0.83f, 1.28f, 2.49f, 1.67f, 3.5f, 1.67f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Lamp = it}
