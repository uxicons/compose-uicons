package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModeLandscape: ImageVector? = null

val Icons.Bs.ModeLandscape: ImageVector
    get() = _ModeLandscape ?: UXIcon(name = "ModeLandscape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.41f, 10.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                lineTo(5f, 13f)
                verticalLineToRelative(6f)
                horizontalLineTo(19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.55f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21.55f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineTo(2.45f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.46f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                horizontalLineTo(0f)
                verticalLineToRelative(5.54f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, 24f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.55f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineToRelative(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                verticalLineTo(2.46f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.55f, 0f)
                close()
            }
        }.also { _ModeLandscape = it}
