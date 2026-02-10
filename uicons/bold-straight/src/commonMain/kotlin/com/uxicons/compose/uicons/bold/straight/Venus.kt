package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Venus: ImageVector? = null

val Icons.Bs.Venus: ImageVector
    get() = _Venus ?: UXIcon(name = "Venus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9.5f, 7.85f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.85f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 8f)
                close()
                moveTo(7f, 8f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                close()
            }
        }.also { _Venus = it}
