package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheese: ImageVector? = null

val Icons.Br.Cheese: ImageVector
    get() = _Cheese ?: UXIcon(name = "Cheese") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 15f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15f)
            close()
            moveTo(8f, 12f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
            close()
            moveTo(24f, 11.01f)
            lineTo(24f, 18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            lineTo(6.03f, 24f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.21f, -3.73f)
            arcTo(14.37f, 14.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 10.78f)
            arcTo(19.45f, 19.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.74f, 1.06f)
            arcTo(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.03f, 0.93f)
            lineToRelative(7.29f, 4.82f)
            arcTo(6.56f, 6.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11.01f)
            close()
            moveTo(6.05f, 7f)
            lineTo(17.77f, 7f)
            lineToRelative(-5.4f, -3.57f)
            arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0.03f)
            arcTo(16.68f, 16.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.05f, 7f)
            close()
            moveTo(21f, 11.01f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.85f, 10f)
            lineTo(6.03f, 10f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.37f, 1.7f)
            arcToRelative(11.37f, 11.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.6f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.03f, 21f)
            lineTo(9f, 21f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            horizontalLineToRelative(3.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            close()
        }
    }.also { _Cheese = it }
