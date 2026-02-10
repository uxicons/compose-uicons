package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dailymotion: ImageVector? = null

val Icons.Brand.Dailymotion: ImageVector
    get() = _Dailymotion ?: UXIcon(name = "Dailymotion") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.07f, 1.04f)
            verticalLineToRelative(7.52f)
            curveToRelative(-1.14f, -1.48f, -2.71f, -2.18f, -4.76f, -2.18f)
            curveToRelative(-2.16f, 0f, -4.09f, 0.8f, -5.66f, 2.38f)
            curveToRelative(-1.76f, 1.72f, -2.71f, 3.96f, -2.71f, 6.43f)
            curveToRelative(0f, 2.72f, 1.0f, 5.02f, 2.95f, 6.79f)
            curveTo(7.36f, 23.32f, 9.15f, 24f, 11.19f, 24f)
            curveToRelative(2.02f, 0f, 3.54f, -0.53f, 5.02f, -2.01f)
            verticalLineToRelative(1.94f)
            horizontalLineToRelative(4.85f)
            verticalLineTo(0f)
            lineTo(16.07f, 1.04f)
            close()
            moveTo(12.31f, 19.44f)
            curveToRelative(-2.54f, 0f, -4.38f, -1.84f, -4.38f, -4.27f)
            curveToRelative(0f, -2.31f, 1.83f, -4.27f, 4.18f, -4.27f)
            curveToRelative(2.33f, 0f, 4.14f, 1.87f, 4.14f, 4.34f)
            curveTo(16.26f, 17.62f, 14.47f, 19.44f, 12.31f, 19.44f)
            close()
        }
    }.also { _Dailymotion = it }
