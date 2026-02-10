package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDown: ImageVector? = null

val Icons.Br.LevelDown: ImageVector
    get() = _LevelDown ?: UXIcon(name = "LevelDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.53f, 16.88f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -0.02f)
            lineTo(13.5f, 19.72f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(8f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 2.5f)
            verticalLineTo(19.72f)
            lineTo(7.59f, 16.86f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.1f, 2.14f)
            lineToRelative(3.13f, 3.08f)
            curveToRelative(0.22f, 0.22f, 0.57f, 0.56f, 0.93f, 0.91f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.88f, 0f)
            curveToRelative(0.36f, -0.35f, 0.71f, -0.69f, 0.93f, -0.91f)
            lineToRelative(3.14f, -3.09f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.53f, 16.88f)
            close()
        }
    }.also { _LevelDown = it }
