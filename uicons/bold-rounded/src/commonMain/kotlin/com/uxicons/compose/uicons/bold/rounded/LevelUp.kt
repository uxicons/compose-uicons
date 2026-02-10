package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUp: ImageVector? = null

val Icons.Br.LevelUp: ImageVector
    get() = _LevelUp ?: UXIcon(name = "LevelUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.53f, 7.12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0.02f)
            lineTo(13.5f, 4.28f)
            verticalLineTo(18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 24f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineTo(8f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -2.5f)
            verticalLineTo(4.28f)
            lineTo(7.59f, 7.14f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.49f, 5f)
            lineToRelative(3.13f, -3.08f)
            curveToRelative(0.22f, -0.22f, 0.57f, -0.56f, 0.93f, -0.91f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.88f, 0f)
            curveToRelative(0.36f, 0.35f, 0.71f, 0.69f, 0.93f, 0.91f)
            lineTo(18.51f, 5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.53f, 7.12f)
            close()
        }
    }.also { _LevelUp = it }
