package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CannedFood: ImageVector? = null

val Icons.Bs.CannedFood: ImageVector
    get() = _CannedFood ?: UXIcon(name = "CannedFood") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                verticalLineTo(6f)
                horizontalLineTo(19.72f)
                arcTo(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineTo(21f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                close()
                moveTo(20f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                close()
            }
        }.also { _CannedFood = it}
