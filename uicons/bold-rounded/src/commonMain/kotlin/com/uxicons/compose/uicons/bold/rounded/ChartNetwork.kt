package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartNetwork: ImageVector? = null

val Icons.Br.ChartNetwork: ImageVector
    get() = _ChartNetwork ?: UXIcon(name = "ChartNetwork") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 13.5f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, 0.5f)
            lineToRelative(-1.02f, -0.51f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.89f, -7.8f)
            lineToRelative(-0.6f, -1.08f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.17f, 6f)
            lineToRelative(0.6f, 1.07f)
            arcToRelative(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 8.3f)
            lineTo(3.64f, 18.07f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.86f, 20.1f)
            lineToRelative(2.69f, -2.59f)
            arcToRelative(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.43f, -1.34f)
            lineToRelative(1.02f, 0.51f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 13.5f)
            close()
            moveTo(12f, 15.5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.5f, 12f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.5f)
            close()
        }
    }.also { _ChartNetwork = it }
