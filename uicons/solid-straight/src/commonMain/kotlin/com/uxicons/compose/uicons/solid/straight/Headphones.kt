package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Headphones: ImageVector? = null

val Icons.Ss.Headphones: ImageVector
    get() = _Headphones ?: UXIcon(name = "Headphones") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12.42f)
                verticalLineTo(11f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                verticalLineToRelative(1.42f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 0f)
                verticalLineToRelative(1f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineToRelative(2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -9.58f)
                close()
            }
        }.also { _Headphones = it}
