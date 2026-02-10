package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRight: ImageVector? = null

val Icons.Ts.ArrowRight: ImageVector
    get() = _ArrowRight ?: UXIcon(name = "ArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.54f, 10.89f)
                lineToRelative(-4.72f, -4.72f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.62f, 4.62f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(22.73f)
                lineToRelative(-4.62f, 4.62f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(4.72f, -4.72f)
                curveToRelative(0.61f, -0.61f, 0.61f, -1.6f, 0f, -2.21f)
                close()
            }
        }.also { _ArrowRight = it}
