package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CannedFood: ImageVector? = null

val Icons.Ss.CannedFood: ImageVector
    get() = _CannedFood ?: UXIcon(name = "CannedFood") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(18.44f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(19f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(6f)
                horizontalLineTo(19f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineTo(22f)
                horizontalLineTo(23f)
                verticalLineTo(8f)
                close()
            }
        }.also { _CannedFood = it}
