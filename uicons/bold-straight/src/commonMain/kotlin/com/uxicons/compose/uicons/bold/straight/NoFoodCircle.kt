package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoFoodCircle: ImageVector? = null

val Icons.Bs.NoFoodCircle: ImageVector
    get() = _NoFoodCircle ?: UXIcon(name = "NoFoodCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
                lineToRelative(12.53f, 12.53f)
                curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                close()
                moveTo(19.33f, 17.21f)
                lineTo(16.12f, 14f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(0.21f, -1.56f)
                curveToRelative(0.16f, -0.74f, -0.39f, -1.44f, -1.14f, -1.44f)
                horizontalLineToRelative(-1.57f)
                lineToRelative(0.12f, -1f)
                horizontalLineToRelative(2.12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(-0.33f, 2.66f)
                lineToRelative(-2.99f, -2.99f)
                curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
                close()
                moveTo(13.03f, 18f)
                horizontalLineToRelative(-6.36f)
                lineToRelative(-0.98f, -7.34f)
                close()
            }
        }.also { _NoFoodCircle = it}
