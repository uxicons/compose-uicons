package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartConnected: ImageVector? = null

val Icons.Br.ChartConnected: ImageVector
    get() = _ChartConnected ?: UXIcon(name = "ChartConnected") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 7f)
            lineToRelative(-0.12f, 0f)
            arcTo(8.49f, 8.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5.12f)
            curveToRelative(0f, -0.04f, 0f, -0.08f, 0f, -0.12f)
            arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 5f)
            curveToRelative(0f, 0.04f, 0f, 0.08f, 0f, 0.12f)
            arcTo(8.49f, 8.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.12f, 7f)
            lineTo(5f, 7f)
            arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17f)
            lineToRelative(0.13f, 0f)
            arcTo(8.61f, 8.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18.87f)
            curveToRelative(0f, 0.04f, 0f, 0.09f, 0f, 0.13f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
            curveToRelative(0f, -0.04f, 0f, -0.08f, 0f, -0.12f)
            arcTo(8.43f, 8.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.88f, 17f)
            lineTo(19f, 17f)
            arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
            close()
            moveTo(8.99f, 8.99f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.02f, 0f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.02f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.02f, 0f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6.02f)
            close()
            moveTo(12f, 3f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
            moveTo(3f, 12f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
            close()
            moveTo(12f, 21f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
            moveTo(19f, 14f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
            close()
        }
    }.also { _ChartConnected = it }
