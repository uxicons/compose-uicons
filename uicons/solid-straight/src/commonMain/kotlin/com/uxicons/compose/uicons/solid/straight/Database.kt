package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Database: ImageVector? = null

val Icons.Ss.Database: ImageVector
    get() = _Database ?: UXIcon(name = "Database") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 1f)
                horizontalLineTo(10.04f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(3.96f)
                verticalLineTo(1f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                horizontalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                horizontalLineTo(10.04f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineTo(3.96f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                horizontalLineTo(10.04f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineTo(3.96f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                close()
            }
        }.also { _Database = it}
