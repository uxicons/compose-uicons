package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandsHeart: ImageVector? = null

val Icons.Bs.HandsHeart: ImageVector
    get() = _HandsHeart ?: UXIcon(name = "HandsHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                verticalLineToRelative(14.12f)
                lineToRelative(-3.38f, 3.38f)
                horizontalLineToRelative(-4.24f)
                lineToRelative(4.62f, -4.62f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-3.33f, 3.3f)
                lineToRelative(-2.11f, -2.13f)
                lineToRelative(3.32f, -3.29f)
                curveToRelative(0.2f, -0.32f, 0.15f, -0.75f, -0.12f, -1.02f)
                curveToRelative(-0.31f, -0.31f, -0.86f, -0.31f, -1.17f, 0f)
                lineToRelative(-3.87f, 3.87f)
                curveToRelative(0.19f, 0.56f, 0.28f, 1.15f, 0.28f, 1.75f)
                verticalLineToRelative(5.14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.14f)
                curveToRelative(0f, -0.67f, -0.26f, -1.3f, -0.73f, -1.77f)
                lineToRelative(-3.77f, -3.77f)
                curveToRelative(-0.33f, -0.33f, -0.82f, -0.4f, -1.14f, -0.18f)
                curveToRelative(-0.24f, 0.17f, -0.33f, 0.4f, -0.35f, 0.56f)
                curveToRelative(-0.03f, 0.2f, 0.01f, 0.39f, 0.11f, 0.56f)
                lineToRelative(3.32f, 3.29f)
                lineToRelative(-2.11f, 2.13f)
                lineToRelative(-3.33f, -3.32f)
                verticalLineToRelative(3.02f)
                lineToRelative(4.62f, 4.62f)
                lineTo(3.38f, 24.0f)
                lineToRelative(-3.38f, -3.38f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.47f, 1.26f, -2.64f, 2.76f, -2.49f)
                curveToRelative(1.3f, 0.13f, 2.24f, 1.33f, 2.24f, 2.63f)
                verticalLineToRelative(3.46f)
                curveToRelative(1.26f, -0.26f, 2.65f, 0.12f, 3.62f, 1.1f)
                lineToRelative(3.38f, 3.38f)
                lineToRelative(3.46f, -3.46f)
                curveToRelative(0.93f, -0.93f, 2.29f, -1.26f, 3.54f, -1f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f)
                curveToRelative(1.5f, -0.15f, 2.76f, 1.02f, 2.76f, 2.49f)
                close()
                moveTo(12f, 9f)
                reflectiveCurveToRelative(5f, -3.47f, 5f, -6.3f)
                curveToRelative(0f, -1.49f, -1.12f, -2.7f, -2.5f, -2.7f)
                reflectiveCurveToRelative(-2.5f, 0.96f, -2.5f, 2.46f)
                curveToRelative(0f, -1.49f, -1.12f, -2.46f, -2.5f, -2.46f)
                reflectiveCurveToRelative(-2.5f, 1.21f, -2.5f, 2.7f)
                curveToRelative(0f, 2.83f, 5f, 6.3f, 5f, 6.3f)
                close()
            }
        }.also { _HandsHeart = it}
