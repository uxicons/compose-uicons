package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDownAlt: ImageVector? = null

val Icons.Rs.LevelDownAlt: ImageVector
    get() = _LevelDownAlt ?: UXIcon(name = "LevelDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(18f)
                horizontalLineTo(5.92f)
                lineTo(11f, 23.55f)
                arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, 0f)
                lineTo(18.08f, 18f)
                close()
            }
        }.also { _LevelDownAlt = it}
