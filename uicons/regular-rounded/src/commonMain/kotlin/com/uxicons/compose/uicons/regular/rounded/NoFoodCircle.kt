package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoFoodCircle: ImageVector? = null

val Icons.Rr.NoFoodCircle: ImageVector
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
                moveTo(17f, 15f)
                curveToRelative(0f, 0.17f, -0.04f, 0.32f, -0.12f, 0.47f)
                lineToRelative(-2.47f, -2.47f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(12.74f, 11.03f)
                curveToRelative(-0.09f, 0.01f, -0.17f, 0.02f, -0.26f, 0.03f)
                lineToRelative(-1.06f, -1.06f)
                horizontalLineToRelative(0.89f)
                curveToRelative(0.2f, 0f, 0.32f, 0.11f, 0.38f, 0.17f)
                reflectiveCurveToRelative(0.15f, 0.2f, 0.12f, 0.39f)
                lineToRelative(-0.06f, 0.47f)
                close()
                moveTo(19.74f, 18.32f)
                lineTo(18.3f, 16.89f)
                curveToRelative(0.43f, -0.53f, 0.7f, -1.19f, 0.7f, -1.89f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(0.02f, -0.19f)
                curveToRelative(0.09f, -0.71f, -0.13f, -1.43f, -0.61f, -1.96f)
                curveToRelative(-0.47f, -0.54f, -1.16f, -0.85f, -1.88f, -0.85f)
                horizontalLineToRelative(-0.54f)
                lineToRelative(0.12f, -1f)
                horizontalLineToRelative(1.12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.12f)
                curveToRelative(-1.01f, 0f, -1.86f, 0.75f, -1.98f, 1.75f)
                lineToRelative(-0.16f, 1.25f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-3.74f, -3.74f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                close()
                moveTo(13.76f, 18f)
                horizontalLineToRelative(-4.99f)
                curveToRelative(-1.51f, 0f, -2.79f, -1.13f, -2.98f, -2.63f)
                lineToRelative(-0.57f, -4.56f)
                curveToRelative(-0.05f, -0.41f, 0.01f, -0.82f, 0.15f, -1.19f)
                lineToRelative(1.96f, 1.96f)
                lineToRelative(0.44f, 3.55f)
                curveToRelative(0.06f, 0.5f, 0.49f, 0.88f, 0.99f, 0.88f)
                horizontalLineToRelative(1.42f)
                curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1f)
                verticalLineToRelative(-0.76f)
                lineToRelative(3.76f, 3.76f)
                close()
            }
        }.also { _NoFoodCircle = it}
