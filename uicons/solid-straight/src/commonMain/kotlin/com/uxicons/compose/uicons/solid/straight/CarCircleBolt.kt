package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarCircleBolt: ImageVector? = null

val Icons.Ss.CarCircleBolt: ImageVector
    get() = _CarCircleBolt ?: UXIcon(name = "CarCircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(19.77f, 18.43f)
                lineToRelative(-1.76f, 3.53f)
                lineToRelative(-1.79f, -0.89f)
                lineToRelative(1.53f, -3.07f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.4f, -0.94f, -0.25f, -1.43f)
                lineToRelative(2.22f, -4.16f)
                lineToRelative(1.76f, 0.95f)
                lineToRelative(-1.78f, 3.29f)
                horizontalLineToRelative(2.12f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.84f)
                curveToRelative(0.27f, 0.5f, 0.25f, 1.1f, -0.04f, 1.58f)
                close()
                moveTo(3f, 21f)
                lineTo(7f, 21f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10.3f, 11f)
                lineTo(0.78f, 11f)
                curveToRelative(0.19f, -0.72f, 0.4f, -1.43f, 0.66f, -2.13f)
                lineTo(3.58f, 2.98f)
                curveToRelative(0.43f, -1.18f, 1.56f, -1.98f, 2.82f, -1.98f)
                horizontalLineToRelative(11.2f)
                curveToRelative(1.26f, 0f, 2.39f, 0.79f, 2.82f, 1.98f)
                lineToRelative(2.14f, 5.89f)
                curveToRelative(0.18f, 0.48f, 0.33f, 0.97f, 0.47f, 1.47f)
                curveToRelative(-1.6f, -1.45f, -3.71f, -2.33f, -6.03f, -2.33f)
                curveToRelative(-2.66f, 0f, -5.05f, 1.16f, -6.7f, 3f)
                close()
                moveTo(8f, 17f)
                curveToRelative(0f, -1.44f, 0.35f, -2.79f, 0.95f, -4f)
                lineTo(0.35f, 13f)
                curveToRelative(-0.23f, 1.33f, -0.35f, 2.67f, -0.35f, 4.03f)
                verticalLineToRelative(1.97f)
                lineTo(8.23f, 19f)
                curveToRelative(-0.15f, -0.64f, -0.23f, -1.31f, -0.23f, -2f)
                close()
                moveTo(6f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _CarCircleBolt = it}
