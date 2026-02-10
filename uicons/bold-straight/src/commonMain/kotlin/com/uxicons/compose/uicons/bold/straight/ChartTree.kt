package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartTree: ImageVector? = null

val Icons.Bs.ChartTree: ImageVector
    get() = _ChartTree ?: UXIcon(name = "ChartTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 18.4f)
                verticalLineTo(16.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.79f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(1.9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                verticalLineTo(16.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2.4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(1.9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                close()
                moveTo(9.5f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 8f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 5.5f)
                close()
            }
        }.also { _ChartTree = it}
