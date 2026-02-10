package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoFoodCircle: ImageVector? = null

val Icons.Ss.NoFoodCircle: ImageVector
    get() = _NoFoodCircle ?: UXIcon(name = "NoFoodCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(19.74f, 18.32f)
                lineTo(18.44f, 17.03f)
                curveToRelative(0.34f, -0.42f, 0.56f, -0.94f, 0.56f, -1.53f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.23f)
                lineToRelative(0.2f, -1.56f)
                curveToRelative(0.16f, -0.74f, -0.39f, -1.44f, -1.14f, -1.44f)
                horizontalLineToRelative(-1.57f)
                lineToRelative(0.12f, -1f)
                horizontalLineToRelative(2.12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(-0.38f, 3f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-3.74f, -3.74f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                close()
                moveTo(13.76f, 18f)
                horizontalLineToRelative(-7.09f)
                lineToRelative(-1.12f, -8.21f)
                lineToRelative(8.21f, 8.21f)
                close()
            }
        }.also { _NoFoodCircle = it}
