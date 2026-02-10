package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LiraSign: ImageVector? = null

val Icons.Ts.LiraSign: ImageVector
    get() = _LiraSign ?: UXIcon(name = "LiraSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13f)
                curveToRelative(0f, 5.61f, -4.49f, 10f, -10.21f, 10f)
                horizontalLineToRelative(-3.79f)
                verticalLineTo(12.63f)
                lineToRelative(9f, -2.47f)
                verticalLineToRelative(-1.05f)
                lineToRelative(-9f, 2.47f)
                verticalLineToRelative(-3.05f)
                lineToRelative(9f, -2.47f)
                verticalLineToRelative(-1.05f)
                lineTo(7f, 7.47f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7.74f)
                lineToRelative(-4f, 1.1f)
                verticalLineToRelative(1.05f)
                lineToRelative(4f, -1.1f)
                verticalLineToRelative(3.05f)
                lineToRelative(-4f, 1.1f)
                verticalLineToRelative(1.05f)
                lineToRelative(4f, -1.1f)
                verticalLineToRelative(11.1f)
                horizontalLineToRelative(4.79f)
                curveToRelative(6.29f, 0f, 11.21f, -4.83f, 11.21f, -11f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _LiraSign = it}
