package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorText: ImageVector? = null

val Icons.Ss.CursorText: ImageVector
    get() = _CursorText ?: UXIcon(name = "CursorText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 2.03f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -2.03f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 24f)
                horizontalLineToRelative(3f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(16f)
                horizontalLineToRelative(4f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2f)
                close()
            }
        }.also { _CursorText = it}
