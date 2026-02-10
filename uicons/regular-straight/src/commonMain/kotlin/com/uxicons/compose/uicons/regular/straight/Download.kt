package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Download: ImageVector? = null

val Icons.Rs.Download: ImageVector
    get() = _Download ?: UXIcon(name = "Download") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.03f, 19f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineTo(18.07f, 14.2f)
                lineTo(16.66f, 12.79f)
                lineToRelative(-3.63f, 3.63f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineToRelative(0.03f, 16.41f)
                lineToRelative(-3.62f, -3.62f)
                lineTo(5.99f, 14.2f)
                lineToRelative(3.92f, 3.92f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.03f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
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
