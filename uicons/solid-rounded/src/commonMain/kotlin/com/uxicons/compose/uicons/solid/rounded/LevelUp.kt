package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUp: ImageVector? = null

val Icons.Sr.LevelUp: ImageVector
    get() = _LevelUp ?: UXIcon(name = "LevelUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.71f, 5.77f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0.01f)
                lineTo(13.41f, 2.94f)
                curveToRelative(-0.11f, -0.11f, -0.26f, -0.24f, -0.41f, -0.39f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(2.56f)
                curveToRelative(-0.16f, 0.15f, -0.31f, 0.28f, -0.42f, 0.4f)
                lineTo(7.7f, 5.78f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.3f, 4.35f)
                lineTo(9.17f, 1.53f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.49f, 0.84f, -0.78f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.98f, 0f)
                curveToRelative(0.33f, 0.29f, 0.64f, 0.57f, 0.83f, 0.77f)
                lineTo(17.7f, 4.35f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.71f, 5.77f)
                close()
            }
        }.also { _LevelUp = it}
