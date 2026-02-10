package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scissors: ImageVector? = null

val Icons.Br.Scissors: ImageVector
    get() = _Scissors ?: UXIcon(name = "Scissors") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 14f)
            arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, 0.38f)
            lineToRelative(-3.16f, -3.81f)
            lineToRelative(6.71f, -8.11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.31f, -1.91f)
            lineToRelative(-6.34f, 7.67f)
            lineToRelative(-6.34f, -7.67f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, 1.91f)
            lineToRelative(6.71f, 8.11f)
            lineToRelative(-3.15f, 3.82f)
            arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.3f, 1.92f)
            lineToRelative(2.8f, -3.38f)
            lineToRelative(2.8f, 3.38f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.2f, -2.3f)
            close()
            moveTo(5f, 21f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
            close()
            moveTo(19f, 21f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
            close()
        }
    }.also { _Scissors = it }
