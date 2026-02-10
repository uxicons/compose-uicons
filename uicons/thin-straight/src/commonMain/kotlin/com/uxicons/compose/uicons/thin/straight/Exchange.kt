package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exchange: ImageVector? = null

val Icons.Ts.Exchange: ImageVector
    get() = _Exchange ?: UXIcon(name = "Exchange") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.73f, 7f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineTo(22.73f)
                lineToRelative(-3.73f, -3.73f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.83f, 3.83f)
                curveToRelative(0.61f, 0.61f, 0.61f, 1.6f, 0f, 2.21f)
                lineToRelative(-3.81f, 3.81f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.71f, -3.71f)
                close()
                moveTo(4.97f, 13.29f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0.46f, 16.39f)
                curveToRelative(-0.61f, 0.61f, -0.61f, 1.6f, 0f, 2.21f)
                lineToRelative(3.83f, 3.83f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.73f, -3.73f)
                horizontalLineTo(24f)
                verticalLineToRelative(-1f)
                horizontalLineTo(1.26f)
                lineToRelative(3.71f, -3.71f)
                close()
            }
        }.also { _Exchange = it}
