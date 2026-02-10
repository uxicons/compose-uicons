package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPie: ImageVector? = null

val Icons.Rr.ChartPie: ImageVector
    get() = _ChartPie ?: UXIcon(name = "ChartPie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(21.57f, 9.12f)
                lineTo(12.66f, 10.85f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.37f, -0.68f)
                lineToRelative(-3.34f, -7.7f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.57f, 9.12f)
                close()
                moveTo(12f, 22f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.12f, 3.28f)
                lineToRelative(3.34f, 7.69f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.17f, 2.77f)
                lineToRelative(6.65f, 5.09f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(20.5f, 17.25f)
                lineTo(14.38f, 12.56f)
                lineTo(21.96f, 11.08f)
                curveToRelative(0.03f, 0.3f, 0.05f, 0.61f, 0.05f, 0.92f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 17.25f)
                close()
            }
        }.also { _ChartPie = it}
