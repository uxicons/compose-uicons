package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPie: ImageVector? = null

val Icons.Br.ChartPie: ImageVector
    get() = _ChartPie ?: UXIcon(name = "ChartPie") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(20.41f, 8.84f)
            lineTo(12.91f, 10.29f)
            curveToRelative(-0.04f, -0.09f, -0.09f, -0.17f, -0.13f, -0.26f)
            lineTo(9.85f, 3.27f)
            arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.41f, 8.84f)
            close()
            moveTo(3f, 12f)
            arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.09f, 4.46f)
            lineToRelative(2.94f, 6.77f)
            arcTo(7.25f, 7.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.27f, 14.1f)
            lineToRelative(5.86f, 4.48f)
            arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
            close()
            moveTo(19.95f, 16.2f)
            lineTo(15.56f, 12.84f)
            lineToRelative(5.43f, -1.05f)
            curveToRelative(0f, 0.07f, 0.01f, 0.14f, 0.01f, 0.22f)
            arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.95f, 16.2f)
            close()
        }
    }.also { _ChartPie = it }
