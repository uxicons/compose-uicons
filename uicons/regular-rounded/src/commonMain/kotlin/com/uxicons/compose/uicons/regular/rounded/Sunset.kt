package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunset: ImageVector? = null

val Icons.Rr.Sunset: ImageVector
    get() = _Sunset ?: UXIcon(name = "Sunset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 24f)
                horizontalLineTo(18.92f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.97f, -1.71f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.9f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.08f, 24f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(5.08f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, -1.61f)
                lineTo(1.98f, 18.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1.73f)
                lineToRelative(3.53f, 2.04f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, -1.15f)
                lineTo(5.62f, 13.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.73f, -1f)
                lineTo(9.39f, 16.51f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16.07f)
                verticalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(4.07f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, 0.44f)
                lineToRelative(2.04f, -3.53f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.73f, 1f)
                lineToRelative(-2.05f, 3.53f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 1.15f)
                lineToRelative(3.53f, -2.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1.73f)
                lineTo(18.5f, 20.39f)
                arcToRelative(6.87f, 6.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, 1.62f)
                lineTo(23f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
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
