package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromLeft: ImageVector? = null

val Icons.Ts.ArrowFromLeft: ImageVector
    get() = _ArrowFromLeft ?: UXIcon(name = "ArrowFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.56f, 10.94f)
                lineToRelative(-5.79f, -5.79f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(5.65f, 5.65f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineToRelative(14f)
                horizontalLineTo(1f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(22.71f)
                lineToRelative(-5.65f, 5.65f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(5.79f, -5.79f)
                curveToRelative(0.28f, -0.28f, 0.43f, -0.64f, 0.44f, -1.03f)
                curveToRelative(0.01f, -0.41f, -0.15f, -0.8f, -0.44f, -1.09f)
                close()
            }
        }.also { _ArrowFromLeft = it}
