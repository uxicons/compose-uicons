package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Utensils: ImageVector? = null

val Icons.Ss.Utensils: ImageVector
    get() = _Utensils ?: UXIcon(name = "Utensils") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.61f, 0.81f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 2f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(19.67f)
                curveTo(21.8f, 14.41f, 24.4f, 8.16f, 18.61f, 0.81f)
                close()
                moveTo(12f, 0f)
                verticalLineTo(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(24f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                verticalLineTo(0f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(0f)
                close()
            }
        }.also { _Utensils = it}
