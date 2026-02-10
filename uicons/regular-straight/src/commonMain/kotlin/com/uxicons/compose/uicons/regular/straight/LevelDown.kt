package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDown: ImageVector? = null

val Icons.Rs.LevelDown: ImageVector
    get() = _LevelDown ?: UXIcon(name = "LevelDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.75f, 17.29f)
                lineTo(13f, 21.04f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(21.04f)
                lineTo(7.25f, 17.29f)
                lineTo(5.84f, 18.71f)
                lineToRelative(4.68f, 4.68f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.97f, 0f)
                lineToRelative(4.68f, -4.68f)
                close()
            }
        }.also { _LevelDown = it}
