package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromRight: ImageVector? = null

val Icons.Ts.ArrowFromRight: ImageVector
    get() = _ArrowFromRight ?: UXIcon(name = "ArrowFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(1.29f)
                lineTo(6.94f, 5.85f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0.44f, 10.94f)
                curveToRelative(-0.28f, 0.28f, -0.43f, 0.64f, -0.44f, 1.03f)
                curveToRelative(-0.01f, 0.41f, 0.15f, 0.8f, 0.44f, 1.09f)
                lineToRelative(5.79f, 5.79f)
                lineToRelative(0.71f, -0.71f)
                lineTo(1.29f, 12.5f)
                horizontalLineTo(23f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(5f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ArrowFromRight = it}
