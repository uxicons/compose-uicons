package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUp: ImageVector? = null

val Icons.Rs.LevelUp: ImageVector
    get() = _LevelUp ?: UXIcon(name = "LevelUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.75f, 6.71f)
                lineTo(13f, 2.96f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(2.96f)
                lineTo(7.25f, 6.71f)
                lineTo(5.84f, 5.29f)
                lineTo(10.51f, 0.62f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.97f, 0f)
                lineToRelative(4.68f, 4.68f)
                close()
            }
        }.also { _LevelUp = it}
