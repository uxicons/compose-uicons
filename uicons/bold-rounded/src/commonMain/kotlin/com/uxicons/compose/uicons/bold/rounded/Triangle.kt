package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Br.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.59f, 23.05f)
            horizontalLineTo(4.41f)
            arcTo(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, 20.96f)
            arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.2f, -4.22f)
            lineTo(8.06f, 3.35f)
            arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.89f, 0.04f)
            lineTo(23.5f, 16.67f)
            arcToRelative(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, 4.29f)
            arcTo(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.59f, 23.05f)
            close()
            moveTo(12f, 3.96f)
            arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.27f, 0.77f)
            lineToRelative(-0.04f, 0.07f)
            lineTo(3.1f, 18.16f)
            arcToRelative(1.29f, 1.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, 1.23f)
            arcToRelative(1.39f, 1.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.21f, 0.66f)
            horizontalLineTo(19.59f)
            arcToRelative(1.39f, 1.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.21f, -0.66f)
            arcToRelative(1.32f, 1.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, -1.3f)
            lineTo(13.31f, 4.8f)
            arcTo(1.45f, 1.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.96f)
            close()
        }
    }.also { _Triangle = it }
