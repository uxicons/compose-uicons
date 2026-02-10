package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunset: ImageVector? = null

val Icons.Sr.Sunset: ImageVector
    get() = _Sunset ?: UXIcon(name = "Sunset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 24f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(5.07f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 20.39f)
                lineTo(1.98f, 18.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1.73f)
                lineTo(6.51f, 18.66f)
                arcTo(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.66f, 17.51f)
                lineTo(5.62f, 13.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.73f, -1f)
                lineTo(9.39f, 16.5f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16.07f)
                verticalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(4.07f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, 0.43f)
                lineToRelative(2.04f, -3.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.73f, 1f)
                lineTo(16.34f, 17.51f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 1.15f)
                lineToRelative(3.53f, -2.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1.73f)
                lineTo(18.5f, 20.39f)
                arcTo(6.89f, 6.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.93f, 22f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 24f)
                close()
                moveTo(8.3f, 5.71f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(3f, -3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.3f, 4.29f)
                lineTo(13f, 5.59f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(5.59f)
                lineTo(9.7f, 4.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.29f, 5.71f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _Sunset = it}
