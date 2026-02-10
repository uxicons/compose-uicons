package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModePortrait: ImageVector? = null

val Icons.Bs.ModePortrait: ImageVector
    get() = _ModePortrait ?: UXIcon(name = "ModePortrait") {
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
                horizontalLineTo(2.46f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.46f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                horizontalLineTo(0f)
                verticalLineToRelative(5.54f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.46f, 24f)
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
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.5f)
                moveToRelative(-3.5f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 15f)
                verticalLineToRelative(4f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 15f)
                close()
            }
        }.also { _ModePortrait = it}
