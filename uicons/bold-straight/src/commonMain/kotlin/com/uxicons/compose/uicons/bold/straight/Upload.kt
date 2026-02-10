package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Upload: ImageVector? = null

val Icons.Bs.Upload: ImageVector
    get() = _Upload ?: UXIcon(name = "Upload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.54f, 4.32f)
                lineTo(10.56f, 19f)
                lineToRelative(3f, 0f)
                lineTo(13.54f, 4.34f)
                lineTo(16.31f, 7.1f)
                lineToRelative(2.12f, -2.12f)
                lineTo(14.51f, 1.06f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
                lineTo(5.64f, 4.98f)
                lineTo(7.76f, 7.1f)
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
        }.also { _Upload = it}
