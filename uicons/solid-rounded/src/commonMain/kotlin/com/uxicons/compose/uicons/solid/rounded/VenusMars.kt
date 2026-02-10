package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusMars: ImageVector? = null

val Icons.Sr.VenusMars: ImageVector
    get() = _VenusMars ?: UXIcon(name = "VenusMars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(16.68f)
                arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.21f, 3.12f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16.92f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(21f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-2.4f, 2.4f)
                arcTo(7.03f, 7.03f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19.6f, 5.82f)
                lineToRelative(2.4f, -2.4f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 0f)
                close()
            }
        }.also { _VenusMars = it}
