package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUpAlt: ImageVector? = null

val Icons.Br.LevelUpAlt: ImageVector
    get() = _LevelUpAlt ?: UXIcon(name = "LevelUpAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.09f, 7f)
            horizontalLineTo(13.5f)
            verticalLineTo(18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 24f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineTo(8f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -2.5f)
            verticalLineTo(7f)
            horizontalLineTo(6.91f)
            arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.64f, -1.57f)
            lineTo(11.36f, 0.27f)
            arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.29f, 0f)
            lineToRelative(5.09f, 5.16f)
            arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.09f, 7f)
            close()
        }
    }.also { _LevelUpAlt = it }
