package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diamond: ImageVector? = null

val Icons.Br.Diamond: ImageVector
    get() = _Diamond ?: UXIcon(name = "Diamond") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.15f, 5.7f)
            lineToRelative(-2.87f, -3.87f)
            arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.55f, -1.83f)
            horizontalLineToRelative(-9.46f)
            arcToRelative(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.53f, 1.8f)
            lineToRelative(-2.94f, 3.92f)
            arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, 5.2f)
            lineToRelative(8.41f, 11.79f)
            arcToRelative(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.67f, 1.29f)
            arcToRelative(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, -1.35f)
            lineToRelative(8.3f, -11.61f)
            arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, -5.34f)
            close()
            moveTo(3.23f, 7.49f)
            lineTo(6.16f, 3.57f)
            arcToRelative(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, -0.57f)
            horizontalLineToRelative(2.39f)
            lineToRelative(-1.48f, 5.18f)
            lineToRelative(0.09f, 0.32f)
            horizontalLineToRelative(7.47f)
            lineToRelative(0.09f, -0.32f)
            lineToRelative(-1.48f, -5.18f)
            horizontalLineToRelative(2.39f)
            arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.12f, 0.59f)
            lineToRelative(2.88f, 3.89f)
            arcToRelative(1.32f, 1.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.22f, 1.02f)
            horizontalLineToRelative(-5.22f)
            lineToRelative(-3.22f, 12.07f)
            lineToRelative(-0.19f, 0.27f)
            arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.32f, 0.15f)
            arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, -0.09f)
            lineToRelative(-0.24f, -0.34f)
            lineToRelative(-3.22f, -12.07f)
            horizontalLineToRelative(-5.23f)
            arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.19f, -1.01f)
            close()
        }
    }.also { _Diamond = it }
