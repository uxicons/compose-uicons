package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartTree: ImageVector? = null

val Icons.Br.ChartTree: ImageVector
    get() = _ChartTree ?: UXIcon(name = "ChartTree") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.86f, 18.13f)
            arcTo(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.67f, 14f)
            horizontalLineTo(13.5f)
            verticalLineTo(12.38f)
            arcToRelative(6.28f, 6.28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
            verticalLineTo(14f)
            horizontalLineTo(7.33f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.19f, 4.13f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.92f, 0.69f)
            arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.33f, 17f)
            horizontalLineTo(10.5f)
            verticalLineToRelative(1.4f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
            verticalLineTo(17f)
            horizontalLineToRelative(3.17f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.27f, 1.82f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.92f, -0.69f)
            close()
            moveTo(8.72f, 6.28f)
            arcTo(3.28f, 3.28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 9.56f)
            arcTo(3.29f, 3.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.72f, 6.28f)
            close()
        }
    }.also { _ChartTree = it }
