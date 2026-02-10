package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDown: ImageVector? = null

val Icons.Ts.LevelDown: ImageVector
    get() = _LevelDown ?: UXIcon(name = "LevelDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 22.76f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(0f)
                verticalLineTo(1f)
                horizontalLineTo(10.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(22.76f)
                lineToRelative(-4.76f, -4.76f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.81f, 4.81f)
                curveToRelative(0.32f, 0.32f, 0.74f, 0.48f, 1.16f, 0.48f)
                reflectiveCurveToRelative(0.84f, -0.16f, 1.16f, -0.48f)
                lineToRelative(4.81f, -4.81f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.76f, 4.76f)
                close()
            }
        }.also { _LevelDown = it}
