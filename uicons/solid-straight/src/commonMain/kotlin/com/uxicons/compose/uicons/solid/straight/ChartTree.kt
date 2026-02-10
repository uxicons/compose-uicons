package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartTree: ImageVector? = null

val Icons.Ss.ChartTree: ImageVector
    get() = _ChartTree ?: UXIcon(name = "ChartTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.18f)
                verticalLineTo(16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(13f)
                verticalLineTo(9.9f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(2.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(15f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
            }
        }.also { _ChartTree = it}
