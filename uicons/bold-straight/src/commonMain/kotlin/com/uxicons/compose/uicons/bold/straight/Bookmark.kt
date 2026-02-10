package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bookmark: ImageVector? = null

val Icons.Bs.Bookmark: ImageVector
    get() = _Bookmark ?: UXIcon(name = "Bookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 24.17f)
                lineTo(12f, 13.46f)
                lineTo(1.5f, 24.17f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(12f, 9.18f)
                lineToRelative(7.5f, 7.65f)
                verticalLineTo(3f)
                horizontalLineTo(4.5f)
                verticalLineTo(16.83f)
                close()
            }
        }.also { _Bookmark = it}
