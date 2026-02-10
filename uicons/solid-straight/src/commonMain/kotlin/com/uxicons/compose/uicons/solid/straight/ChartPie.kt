package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPie: ImageVector? = null

val Icons.Ss.ChartPie: ImageVector
    get() = _ChartPie ?: UXIcon(name = "ChartPie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.41f, 13f)
                lineToRelative(6.75f, 6.75f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.95f, 13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.29f, 12.71f)
                horizontalLineToRelative(0f)
                lineTo(11f, 12.41f)
                verticalLineTo(0.05f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.74f, 21.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                horizontalLineTo(23.95f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 0.05f)
                close()
            }
        }.also { _ChartPie = it}
