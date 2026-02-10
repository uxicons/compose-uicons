package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUpAlt: ImageVector? = null

val Icons.Rr.LevelUpAlt: ImageVector
    get() = _LevelUpAlt ?: UXIcon(name = "LevelUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.09f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(7f)
                horizontalLineTo(6.91f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.64f, -1.57f)
                lineTo(11.36f, 0.27f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.29f, 0f)
                lineToRelative(5.09f, 5.16f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.09f, 7f)
                close()
            }
        }.also { _LevelUpAlt = it}
