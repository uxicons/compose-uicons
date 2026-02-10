package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grid: ImageVector? = null

val Icons.Ss.Grid: ImageVector
    get() = _Grid ?: UXIcon(name = "Grid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 17.5f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(6.5f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(24f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 8.75f)
                horizontalLineTo(0f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.75f)
                horizontalLineTo(17.5f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(24f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.25f, 17.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(24f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.25f, 8.75f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.25f, 0f)
                horizontalLineTo(8.75f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
            }
        }.also { _Grid = it}
