package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorText: ImageVector? = null

val Icons.Bs.CursorText: ImageVector
    get() = _CursorText ?: UXIcon(name = "CursorText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 3f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                arcToRelative(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 1.74f)
                arcTo(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                horizontalLineTo(5.5f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 2.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                arcToRelative(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -1.74f)
                arcTo(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 24f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -2.5f)
                verticalLineTo(16f)
                horizontalLineToRelative(4f)
                verticalLineTo(13f)
                horizontalLineToRelative(-4f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 3f)
                close()
            }
        }.also { _CursorText = it}
