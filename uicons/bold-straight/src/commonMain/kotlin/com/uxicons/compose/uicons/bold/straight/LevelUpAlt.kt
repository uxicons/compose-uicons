package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUpAlt: ImageVector? = null

val Icons.Bs.LevelUpAlt: ImageVector
    get() = _LevelUpAlt ?: UXIcon(name = "LevelUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 6f)
                verticalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
                verticalLineTo(6f)
                horizontalLineTo(6.42f)
                lineTo(11.5f, 0.45f)
                arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.99f, 0f)
                lineTo(18.58f, 6f)
                close()
            }
        }.also { _LevelUpAlt = it}
