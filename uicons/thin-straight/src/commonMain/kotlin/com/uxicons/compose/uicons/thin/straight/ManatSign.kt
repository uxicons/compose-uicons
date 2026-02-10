package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManatSign: ImageVector? = null

val Icons.Ts.ManatSign: ImageVector
    get() = _ManatSign ?: UXIcon(name = "ManatSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(13.5f)
                curveToRelative(0f, -4.8f, -3.77f, -8.73f, -8.5f, -8.99f)
                verticalLineTo(24f)
                horizontalLineToRelative(-1f)
                verticalLineTo(4.51f)
                curveToRelative(-4.73f, 0.26f, -8.5f, 4.19f, -8.5f, 8.99f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(13.5f)
                curveTo(2f, 8.15f, 6.22f, 3.77f, 11.5f, 3.51f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineTo(3.51f)
                curveToRelative(5.28f, 0.26f, 9.5f, 4.64f, 9.5f, 9.99f)
                close()
            }
        }.also { _ManatSign = it}
