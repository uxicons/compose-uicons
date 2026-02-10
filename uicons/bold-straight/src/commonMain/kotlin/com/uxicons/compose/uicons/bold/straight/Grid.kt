package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grid: ImageVector? = null

val Icons.Bs.Grid: ImageVector
    get() = _Grid ?: UXIcon(name = "Grid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 24f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(17.5f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(17.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 8.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 6.5f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 17.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 8.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(0f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.also { _Grid = it}
