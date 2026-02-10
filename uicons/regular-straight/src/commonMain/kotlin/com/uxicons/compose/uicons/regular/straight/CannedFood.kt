package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CannedFood: ImageVector? = null

val Icons.Rs.CannedFood: ImageVector
    get() = _CannedFood ?: UXIcon(name = "CannedFood") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(18.46f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 0f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineTo(22f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineTo(22f)
                horizontalLineTo(23f)
                verticalLineTo(8f)
                close()
                moveTo(21f, 22f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                close()
            }
        }.also { _CannedFood = it}
