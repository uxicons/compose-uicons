package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Download: ImageVector? = null

val Icons.Bs.Download: ImageVector
    get() = _Download ?: UXIcon(name = "Download") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.03f, 19.01f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.48f, -1.02f)
                lineToRelative(3.92f, -3.92f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.78f, 2.78f)
                lineTo(13.5f, 0f)
                lineToRelative(-3f, 0f)
                lineToRelative(0.02f, 14.71f)
                lineTo(7.76f, 11.95f)
                lineTo(5.64f, 14.07f)
                lineToRelative(3.92f, 3.92f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.03f, 19.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(16f)
                close()
            }
        }.also { _Download = it}
