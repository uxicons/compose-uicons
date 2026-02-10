package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAdd: ImageVector? = null

val Icons.Rr.UserAdd: ImageVector
    get() = _UserAdd ?: UXIcon(name = "UserAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                close()
                moveTo(9f, 2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14f)
                close()
            }
        }.also { _UserAdd = it}
