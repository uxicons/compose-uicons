package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudRainbow: ImageVector? = null

val Icons.Sr.CloudRainbow: ImageVector
    get() = _CloudRainbow ?: UXIcon(name = "CloudRainbow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, -1.6f)
                curveToRelative(0.66f, -1.36f, 5.49f, -3.85f, 5.8f, -1.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.2f, 1.6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16f)
                close()
                moveTo(16.29f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.74f, -1.67f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.96f, 2.67f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.29f, 13f)
                close()
                moveTo(13.62f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.9f, 8.31f)
                arcTo(13.88f, 13.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcToRelative(11.9f, 11.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.66f, 3.69f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.62f, 10f)
                close()
                moveTo(10f, 8.04f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.24f, 6.4f)
                arcTo(17.97f, 17.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcTo(15.98f, 15.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.76f, 7.69f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8.04f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.9f, 23.98f)
                curveToRelative(-3.69f, -0.11f, -6.61f, 0.71f, -7.77f, -2.59f)
                arcToRelative(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -4.26f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.42f, -3.47f)
                curveToRelative(0.14f, 0.33f, 0.29f, 0.36f, 0.59f, 0.43f)
                lineToRelative(0.18f, 0.04f)
                horizontalLineToRelative(0f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.56f, 6f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.7f, 3.7f)
                arcToRelative(5.28f, 5.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.07f, 0.13f)
                curveTo(12.23f, 23.98f, 10.02f, 23.98f, 7.9f, 23.98f)
                close()
            }
        }.also { _CloudRainbow = it}
