package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromTop: ImageVector? = null

val Icons.Ts.ArrowFromTop: ImageVector
    get() = _ArrowFromTop ?: UXIcon(name = "ArrowFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.02f, 1f)
                verticalLineTo(0f)
                horizontalLineTo(5.02f)
                verticalLineTo(1f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(22.71f)
                lineToRelative(-5.65f, -5.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(5.79f, 5.79f)
                curveToRelative(0.28f, 0.28f, 0.64f, 0.43f, 1.03f, 0.44f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.4f, 0f, 0.78f, -0.15f, 1.06f, -0.44f)
                lineToRelative(5.79f, -5.79f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-5.65f, 5.65f)
                verticalLineTo(1f)
                horizontalLineToRelative(6.5f)
                close()
            }
        }.also { _ArrowFromTop = it}
