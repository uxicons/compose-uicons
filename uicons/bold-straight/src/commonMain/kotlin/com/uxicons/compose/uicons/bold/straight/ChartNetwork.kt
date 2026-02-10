package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartNetwork: ImageVector? = null

val Icons.Bs.ChartNetwork: ImageVector
    get() = _ChartNetwork ?: UXIcon(name = "ChartNetwork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.08f, 0.84f)
                lineToRelative(-1.56f, -0.63f)
                arcTo(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 12f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.54f, -5.4f)
                lineTo(9.93f, 4.76f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.17f, 5.98f)
                lineTo(8.28f, 7.95f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.17f, 6.57f)
                lineTo(4.04f, 17.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 20f)
                arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, -0.51f)
                lineToRelative(3.21f, -2.78f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, -0.85f)
                lineToRelative(2.17f, 0.88f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 13f)
                close()
                moveTo(12f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.5f)
                close()
            }
        }.also { _ChartNetwork = it}
