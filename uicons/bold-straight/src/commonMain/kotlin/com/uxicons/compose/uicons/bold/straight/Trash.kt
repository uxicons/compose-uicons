package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trash: ImageVector? = null

val Icons.Bs.Trash: ImageVector
    get() = _Trash ?: UXIcon(name = "Trash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
                horizontalLineToRelative(-7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Trash = it}
