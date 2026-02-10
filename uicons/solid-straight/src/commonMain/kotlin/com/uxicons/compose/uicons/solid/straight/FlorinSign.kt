package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Ss.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.38f, 2.59f)
                lineToRelative(-3.37f, 7.41f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.9f)
                lineToRelative(-4.66f, 10.24f)
                curveToRelative(-0.49f, 1.07f, -1.56f, 1.76f, -2.73f, 1.76f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5.71f)
                curveToRelative(0.39f, 0f, 0.75f, -0.23f, 0.91f, -0.59f)
                lineToRelative(4.28f, -9.41f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.81f)
                lineTo(15.56f, 1.76f)
                curveToRelative(0.49f, -1.07f, 1.56f, -1.76f, 2.73f, -1.76f)
                horizontalLineToRelative(5.71f)
                verticalLineTo(2f)
                horizontalLineToRelative(-5.71f)
                curveToRelative(-0.39f, 0f, -0.75f, 0.23f, -0.91f, 0.59f)
                close()
            }
        }.also { _FlorinSign = it}
