package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoFoodCircle: ImageVector? = null

val Icons.Rs.NoFoodCircle: ImageVector
    get() = _NoFoodCircle ?: UXIcon(name = "NoFoodCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.69f, 10.66f)
                lineToRelative(-0.14f, -0.87f)
                lineToRelative(2.36f, 2.36f)
                lineToRelative(0.51f, 3.85f)
                horizontalLineToRelative(1.63f)
                curveToRelative(-0.03f, -0.16f, -0.05f, -0.33f, -0.05f, -0.5f)
                verticalLineToRelative(-1.26f)
                lineToRelative(3.76f, 3.76f)
                horizontalLineToRelative(-7.09f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18.32f, 19.74f)
                lineTo(4.26f, 5.68f)
                curveToRelative(-1.41f, 1.73f, -2.26f, 3.93f, -2.26f, 6.32f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                close()
                moveTo(12.28f, 10.86f)
                lineTo(12.38f, 10.0f)
                horizontalLineToRelative(-0.97f)
                close()
                moveTo(16.99f, 15.57f)
                curveToRelative(0.0f, -0.02f, 0.01f, -0.05f, 0.01f, -0.07f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(2.57f, 2.57f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                curveToRelative(-2.4f, 0f, -4.6f, 0.85f, -6.32f, 2.26f)
                lineToRelative(3.74f, 3.74f)
                horizontalLineToRelative(0.33f)
                lineToRelative(0.38f, -3f)
                horizontalLineToRelative(3.88f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(-0.12f, 1f)
                horizontalLineToRelative(1.57f)
                curveToRelative(0.75f, 0f, 1.3f, 0.7f, 1.14f, 1.44f)
                lineToRelative(-0.2f, 1.56f)
                horizontalLineToRelative(2.23f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.58f, -0.22f, 1.1f, -0.56f, 1.53f)
                lineToRelative(1.3f, 1.3f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                close()
            }
        }.also { _NoFoodCircle = it}
