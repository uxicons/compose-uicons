package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPie: ImageVector? = null

val Icons.Sr.ChartPie: ImageVector
    get() = _ChartPie ?: UXIcon(name = "ChartPie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.3f, 10.18f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, 0.67f)
                lineTo(23.52f, 8.69f)
                arcTo(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.22f, 0.62f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.63f, 13.74f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.17f, -2.77f)
                lineTo(6.38f, 1.41f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.89f, 20.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.37f, 12.55f)
                lineToRelative(7.74f, 5.9f)
                arcTo(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, -1.35f)
                close()
            }
        }.also { _ChartPie = it}
