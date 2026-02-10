package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModeLandscape: ImageVector? = null

val Icons.Ss.ModeLandscape: ImageVector
    get() = _ModeLandscape ?: UXIcon(name = "ModeLandscape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 7f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(20f)
                verticalLineTo(18.59f)
                lineTo(11.12f, 9.71f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineTo(4f, 12.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 8f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 24f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.also { _ModeLandscape = it}
