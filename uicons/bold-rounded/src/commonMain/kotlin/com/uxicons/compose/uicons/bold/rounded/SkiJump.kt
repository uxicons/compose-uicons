package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiJump: ImageVector? = null

val Icons.Br.SkiJump: ImageVector
    get() = _SkiJump ?: UXIcon(name = "SkiJump") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.73f, 12.31f)
            arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.33f, 2.54f)
            lineTo(2.14f, 23.86f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.86f, 21.14f)
            lineToRelative(4.12f, -1.93f)
            verticalLineToRelative(-6.02f)
            arcTo(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.22f, 10.1f)
            lineTo(9.15f, 7f)
            horizontalLineTo(3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineTo(9.9f)
            arcToRelative(4.81f, 4.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.85f, 0.92f)
            lineToRelative(0.15f, 0.13f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, 5.01f)
            lineToRelative(-4.97f, 5f)
            verticalLineToRelative(2.75f)
            lineToRelative(12.15f, -5.68f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.72f, -1.99f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.72f, -1.27f)
            arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.73f, 12.31f)
            close()
            moveTo(16.49f, 5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.5f, -2.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.49f, 5f)
            close()
        }
    }.also { _SkiJump = it }
