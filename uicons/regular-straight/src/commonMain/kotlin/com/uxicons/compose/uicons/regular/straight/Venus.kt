package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Venus: ImageVector? = null

val Icons.Rs.Venus: ImageVector
    get() = _Venus ?: UXIcon(name = "Venus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 7.93f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(21f)
                horizontalLineToRelative(3f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(15.93f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 8f)
                close()
                moveTo(6f, 8f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                close()
            }
        }.also { _Venus = it}
