package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rugby: ImageVector? = null

val Icons.Sr.Rugby: ImageVector
    get() = _Rugby ?: UXIcon(name = "Rugby") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 23.91f)
                curveToRelative(-0.45f, 0.04f, -0.9f, 0.07f, -1.33f, 0.07f)
                arcToRelative(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.77f, -1.88f)
                curveToRelative(-1.52f, -1.52f, -2.07f, -4.19f, -1.82f, -7.1f)
                close()
                moveTo(23.95f, 8.53f)
                curveToRelative(0.15f, -2.73f, -0.41f, -5.19f, -1.84f, -6.63f)
                reflectiveCurveToRelative(-3.9f, -2f, -6.63f, -1.85f)
                close()
                moveTo(23.61f, 11.02f)
                arcToRelative(16.89f, 16.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.26f, 8.32f)
                arcToRelative(16.74f, 16.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.92f, 4.16f)
                lineToRelative(-10.95f, -10.95f)
                arcToRelative(16.77f, 16.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.18f, -7.91f)
                arcToRelative(16.89f, 16.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.32f, -4.26f)
                close()
                moveTo(17.71f, 10.29f)
                lineTo(13.71f, 6.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(-1.29f, -1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(-1.29f, -1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(1.29f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(1.29f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                close()
            }
        }.also { _Rugby = it}
