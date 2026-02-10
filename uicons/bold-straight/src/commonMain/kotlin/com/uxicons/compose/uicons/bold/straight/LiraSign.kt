package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LiraSign: ImageVector? = null

val Icons.Bs.LiraSign: ImageVector
    get() = _LiraSign ?: UXIcon(name = "LiraSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                curveToRelative(0f, 4.56f, -3.65f, 8f, -8.5f, 8f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-6.72f)
                lineToRelative(8f, -2.19f)
                verticalLineToRelative(-3.09f)
                lineToRelative(-8f, 2.19f)
                verticalLineToRelative(-2.12f)
                lineToRelative(8f, -2.19f)
                verticalLineTo(3.8f)
                lineToRelative(-8f, 2.19f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(6.81f)
                lineToRelative(-4f, 1.1f)
                verticalLineToRelative(3.09f)
                lineToRelative(4f, -1.1f)
                verticalLineToRelative(2.12f)
                lineToRelative(-4f, 1.1f)
                verticalLineToRelative(3.09f)
                lineToRelative(4f, -1.1f)
                verticalLineToRelative(8.89f)
                horizontalLineToRelative(4.5f)
                curveToRelative(6.45f, 0f, 11.5f, -4.83f, 11.5f, -11f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _LiraSign = it}
