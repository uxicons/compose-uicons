package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NairaSign: ImageVector? = null

val Icons.Bs.NairaSign: ImageVector
    get() = _NairaSign ?: UXIcon(name = "NairaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 10.5f)
                horizontalLineToRelative(-6.17f)
                lineTo(6.93f, 1.2f)
                curveTo(6.29f, 0.19f, 5.08f, -0.27f, 3.94f, 0.06f)
                curveToRelative(-1.16f, 0.34f, -1.94f, 1.38f, -1.94f, 2.59f)
                verticalLineToRelative(7.85f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(2f, 13.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(3f)
                lineTo(5f, 13.5f)
                horizontalLineToRelative(6.17f)
                lineToRelative(5.89f, 9.3f)
                curveToRelative(0.5f, 0.79f, 1.35f, 1.25f, 2.25f, 1.25f)
                curveToRelative(0.25f, 0f, 0.5f, -0.04f, 0.75f, -0.11f)
                curveToRelative(1.16f, -0.34f, 1.94f, -1.38f, 1.94f, -2.59f)
                verticalLineToRelative(-7.85f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 10.5f)
                lineTo(5f, 3.76f)
                lineToRelative(4.27f, 6.74f)
                lineTo(5f, 10.5f)
                close()
                moveTo(19f, 20.24f)
                lineToRelative(-4.27f, -6.74f)
                horizontalLineToRelative(4.27f)
                verticalLineToRelative(6.74f)
                close()
            }
        }.also { _NairaSign = it}
