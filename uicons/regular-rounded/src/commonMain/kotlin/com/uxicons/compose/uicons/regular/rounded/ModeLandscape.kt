package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModeLandscape: ImageVector? = null

val Icons.Rr.ModeLandscape: ImageVector
    get() = _ModeLandscape ?: UXIcon(name = "ModeLandscape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.71f)
                lineToRelative(-6.17f, -6.17f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, 0f)
                lineTo(3.29f, 13.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(2.17f, -2.17f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                lineToRelative(6.17f, 6.17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.5f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10.5f)
                close()
                moveTo(16f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 22f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 0f)
                close()
            }
        }.also { _ModeLandscape = it}
