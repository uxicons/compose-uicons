package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUp: ImageVector? = null

val Icons.Ts.ArrowUp: ImageVector
    get() = _ArrowUp ?: UXIcon(name = "ArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.82f, 5.17f)
                lineTo(13.11f, 0.46f)
                curveToRelative(-0.61f, -0.61f, -1.6f, -0.61f, -2.21f, 0f)
                lineToRelative(-4.72f, 4.72f)
                lineToRelative(0.71f, 0.71f)
                lineTo(11.5f, 1.27f)
                verticalLineToRelative(22.73f)
                horizontalLineToRelative(1f)
                verticalLineTo(1.26f)
                lineToRelative(4.62f, 4.62f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _ArrowUp = it}
