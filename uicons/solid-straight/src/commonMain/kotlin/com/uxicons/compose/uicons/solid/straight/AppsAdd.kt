package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsAdd: ImageVector? = null

val Icons.Ss.AppsAdd: ImageVector
    get() = _AppsAdd ?: UXIcon(name = "AppsAdd") {
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
                moveTo(17f, 11f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -4f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, -4f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, 4f)
                close()
            }
        }.also { _AppsAdd = it}
