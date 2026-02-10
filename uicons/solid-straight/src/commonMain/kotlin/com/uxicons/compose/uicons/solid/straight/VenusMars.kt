package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusMars: ImageVector? = null

val Icons.Ss.VenusMars: ImageVector
    get() = _VenusMars ?: UXIcon(name = "VenusMars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(3.41f)
                lineToRelative(-2.4f, 2.4f)
                arcTo(7.03f, 7.03f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.18f, 4.4f)
                lineToRelative(2.4f, -2.4f)
                horizontalLineTo(18f)
                verticalLineTo(0f)
                horizontalLineToRelative(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2f)
                close()
                moveTo(8f, 16.68f)
                arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.21f, 3.12f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16.92f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineToRelative(3f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                close()
            }
        }.also { _VenusMars = it}
