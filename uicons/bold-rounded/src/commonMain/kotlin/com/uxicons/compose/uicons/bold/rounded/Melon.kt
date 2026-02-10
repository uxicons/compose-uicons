package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Br.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.39f, 2.52f)
            arcTo(4.57f, 4.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 0.06f)
            arcToRelative(4.71f, 4.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.04f, 1.31f)
            lineTo(1.38f, 14.95f)
            arcTo(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, 19f)
            arcToRelative(4.56f, 4.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, 3.39f)
            arcTo(14.78f, 14.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.39f, 2.52f)
            close()
            moveTo(17.55f, 17.55f)
            arcTo(11.74f, 11.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.88f, 19.72f)
            arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.85f, -1.19f)
            arcTo(1.67f, 1.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 17.07f)
            lineTo(6.21f, 14.36f)
            arcToRelative(6.08f, 6.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.15f, -8.15f)
            lineTo(17.07f, 3.5f)
            horizontalLineToRelative(0f)
            arcToRelative(1.67f, 1.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, -0.47f)
            arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.19f, 0.85f)
            arcTo(11.74f, 11.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.55f, 17.55f)
            close()
        }
    }.also { _Melon = it }
