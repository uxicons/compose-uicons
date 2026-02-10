package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CannedFood: ImageVector? = null

val Icons.Br.CannedFood: ImageVector
    get() = _CannedFood ?: UXIcon(name = "CannedFood") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 21.09f)
            verticalLineTo(8.91f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 6f)
            horizontalLineTo(19.72f)
            arcTo(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8.91f)
            verticalLineTo(21.09f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 24f)
            horizontalLineToRelative(21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -2.91f)
            close()
            moveTo(4f, 19f)
            horizontalLineTo(16.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(4f)
            verticalLineTo(14f)
            horizontalLineTo(16.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(4f)
            verticalLineTo(9f)
            horizontalLineTo(20f)
            verticalLineTo(21f)
            horizontalLineTo(4f)
            close()
        }
    }.also { _CannedFood = it }
