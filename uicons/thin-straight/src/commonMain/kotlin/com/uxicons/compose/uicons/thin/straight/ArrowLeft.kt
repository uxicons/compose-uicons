package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeft: ImageVector? = null

val Icons.Ts.ArrowLeft: ImageVector
    get() = _ArrowLeft ?: UXIcon(name = "ArrowLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                horizontalLineTo(1.27f)
                lineToRelative(4.62f, -4.62f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0.46f, 10.89f)
                curveToRelative(-0.61f, 0.61f, -0.61f, 1.6f, 0f, 2.21f)
                lineToRelative(4.72f, 4.72f)
                lineToRelative(0.71f, -0.71f)
                lineTo(1.26f, 12.5f)
                horizontalLineToRelative(22.73f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ArrowLeft = it}
