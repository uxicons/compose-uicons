package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsDelete: ImageVector? = null

val Icons.Ss.AppsDelete: ImageVector
    get() = _AppsDelete ?: UXIcon(name = "AppsDelete") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(8f)
                verticalLineTo(13f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                verticalLineTo(24f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _AppsDelete = it}
