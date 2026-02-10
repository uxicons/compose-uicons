package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPie: ImageVector? = null

val Icons.Bs.ChartPie: ImageVector
    get() = _ChartPie ?: UXIcon(name = "ChartPie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(15.62f, 13.5f)
                horizontalLineToRelative(5.24f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.54f, 3.71f)
                close()
                moveTo(20.86f, 10.5f)
                lineTo(13.5f, 10.5f)
                lineTo(13.5f, 3.13f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.86f, 10.5f)
                close()
                moveTo(3f, 12f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, -8.87f)
                verticalLineToRelative(9.49f)
                lineToRelative(6.71f, 6.71f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                close()
            }
        }.also { _ChartPie = it}
