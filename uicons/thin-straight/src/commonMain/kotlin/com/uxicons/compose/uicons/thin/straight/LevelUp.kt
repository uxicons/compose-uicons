package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUp: ImageVector? = null

val Icons.Ts.LevelUp: ImageVector
    get() = _LevelUp ?: UXIcon(name = "LevelUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.46f, 5.29f)
                lineTo(13.65f, 0.48f)
                curveToRelative(-0.64f, -0.64f, -1.67f, -0.64f, -2.31f, 0f)
                lineTo(6.54f, 5.29f)
                lineToRelative(0.71f, 0.71f)
                lineTo(12f, 1.24f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineTo(10.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(1.24f)
                lineToRelative(4.76f, 4.76f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _LevelUp = it}
