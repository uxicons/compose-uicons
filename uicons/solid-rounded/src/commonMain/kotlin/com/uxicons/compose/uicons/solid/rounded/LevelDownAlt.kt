package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDownAlt: ImageVector? = null

val Icons.Sr.LevelDownAlt: ImageVector
    get() = _LevelDownAlt ?: UXIcon(name = "LevelDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.09f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2f)
                horizontalLineTo(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineTo(17f)
                horizontalLineTo(6.91f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, 1.57f)
                lineToRelative(5.09f, 5.16f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.29f, 0f)
                lineToRelative(5.09f, -5.16f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.09f, 17f)
                close()
            }
        }.also { _LevelDownAlt = it}
