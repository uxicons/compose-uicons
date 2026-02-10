package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAdd: ImageVector? = null

val Icons.Bs.UserAdd: ImageVector
    get() = _UserAdd ?: UXIcon(name = "UserAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                horizontalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineTo(19f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                close()
                moveTo(8f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                lineToRelative(0f, -3f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-3f, 0f)
                close()
            }
        }.also { _UserAdd = it}
