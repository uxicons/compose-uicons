package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fork: ImageVector? = null

val Icons.Br.Fork: ImageVector
    get() = _Fork ?: UXIcon(name = "Fork") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.55f, 7.43f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0.02f)
            lineToRelative(-4.49f, 4.56f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.64f, 0.81f)
            lineTo(20.56f, 5.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(11.18f, 10.7f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -3.63f)
            lineToRelative(4.57f, -4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.45f, 0.43f)
            lineTo(9.87f, 4.94f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.93f, 8f)
            lineToRelative(-8.5f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(8.5f, -8.5f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.01f, -0.94f)
            lineToRelative(4.5f, -4.57f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.55f, 7.43f)
            close()
        }
    }.also { _Fork = it }
