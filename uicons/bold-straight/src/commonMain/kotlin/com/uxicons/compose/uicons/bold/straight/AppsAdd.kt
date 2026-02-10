package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsAdd: ImageVector? = null

val Icons.Bs.AppsAdd: ImageVector
    get() = _AppsAdd ?: UXIcon(name = "AppsAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                lineToRelative(0f, -4f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -4f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-4f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                close()
                moveTo(3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(8f)
                lineTo(11f, 13f)
                lineTo(0f, 13f)
                close()
                moveTo(3f, 16f)
                lineTo(8f, 16f)
                verticalLineToRelative(5f)
                lineTo(3f, 21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 13f)
                lineTo(13f, 13f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineTo(16f, 21f)
                close()
            }
        }.also { _AppsAdd = it}
