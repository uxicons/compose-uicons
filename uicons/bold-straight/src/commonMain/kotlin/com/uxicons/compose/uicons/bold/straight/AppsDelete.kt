package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsDelete: ImageVector? = null

val Icons.Bs.AppsDelete: ImageVector
    get() = _AppsDelete ?: UXIcon(name = "AppsDelete") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                moveToRelative(3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 16f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                moveToRelative(3f, -3f)
                horizontalLineTo(0f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(8f)
                verticalLineTo(13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineToRelative(5f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineToRelative(5f)
                moveToRelative(3f, -3f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(13f)
                close()
            }
        }.also { _AppsDelete = it}
