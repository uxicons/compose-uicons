package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LuggageRolling: ImageVector? = null

val Icons.Rs.LuggageRolling: ImageVector
    get() = _LuggageRolling ?: UXIcon(name = "LuggageRolling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                horizontalLineToRelative(2f)
                verticalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 8f)
                close()
                moveTo(9f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                close()
                moveTo(22f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
            }
        }.also { _LuggageRolling = it}
