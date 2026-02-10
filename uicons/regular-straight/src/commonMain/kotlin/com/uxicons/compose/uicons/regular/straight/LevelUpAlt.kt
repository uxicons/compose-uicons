package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUpAlt: ImageVector? = null

val Icons.Rs.LevelUpAlt: ImageVector
    get() = _LevelUpAlt ?: UXIcon(name = "LevelUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(6f)
                horizontalLineTo(5.92f)
                lineTo(11f, 0.45f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 0.45f)
                lineTo(18.08f, 6f)
                close()
            }
        }.also { _LevelUpAlt = it}
