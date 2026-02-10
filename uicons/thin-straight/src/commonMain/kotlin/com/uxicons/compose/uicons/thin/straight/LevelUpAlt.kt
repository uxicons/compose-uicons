package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUpAlt: ImageVector? = null

val Icons.Ts.LevelUpAlt: ImageVector
    get() = _LevelUpAlt ?: UXIcon(name = "LevelUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.71f, 7f)
                lineTo(13.87f, 0.61f)
                curveToRelative(-0.69f, -0.77f, -2.04f, -0.77f, -2.73f, -0.0f)
                lineTo(5.29f, 7f)
                horizontalLineToRelative(6.71f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineTo(10.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(6.71f)
                close()
                moveTo(11.88f, 1.28f)
                curveToRelative(0.32f, -0.36f, 0.93f, -0.36f, 1.25f, 0f)
                lineToRelative(4.32f, 4.72f)
                horizontalLineTo(7.56f)
                lineTo(11.88f, 1.28f)
                close()
            }
        }.also { _LevelUpAlt = it}
