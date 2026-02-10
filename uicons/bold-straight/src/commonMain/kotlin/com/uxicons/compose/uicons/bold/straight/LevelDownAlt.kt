package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDownAlt: ImageVector? = null

val Icons.Bs.LevelDownAlt: ImageVector
    get() = _LevelDownAlt ?: UXIcon(name = "LevelDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 18f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(18f)
                horizontalLineTo(6.42f)
                lineTo(11.5f, 23.55f)
                arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, 0f)
                lineTo(18.58f, 18f)
                close()
            }
        }.also { _LevelDownAlt = it}
