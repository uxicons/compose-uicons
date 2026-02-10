package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grid: ImageVector? = null

val Icons.Rs.Grid: ImageVector
    get() = _Grid ?: UXIcon(name = "Grid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 19.5f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(19.5f)
                horizontalLineTo(4.5f)
                moveToRelative(2f, -2f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(6.5f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19.5f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(22f)
                moveToRelative(2f, -2f)
                horizontalLineTo(17.5f)
                verticalLineTo(24f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 10.75f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(4.5f)
                moveToRelative(2f, -2f)
                horizontalLineTo(0f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10.75f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(19.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(22f)
                moveToRelative(2f, -2f)
                horizontalLineTo(17.5f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(24f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 2f)
                verticalLineTo(4.5f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(4.5f)
                moveToRelative(2f, -2f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.25f, 19.5f)
                verticalLineTo(22f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(19.5f)
                horizontalLineToRelative(2.5f)
                moveToRelative(2f, -2f)
                horizontalLineTo(8.75f)
                verticalLineTo(24f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.25f, 10.75f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                moveToRelative(2f, -2f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.25f, 2f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(2.5f)
                moveToRelative(2f, -2f)
                horizontalLineTo(8.75f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(2f)
                horizontalLineTo(21f)
                moveToRelative(0f, -2f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
            }
        }.also { _Grid = it}
