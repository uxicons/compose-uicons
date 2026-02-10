package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Massage: ImageVector? = null

val Icons.Sr.Massage: ImageVector
    get() = _Massage ?: UXIcon(name = "Massage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 22f)
                curveTo(5.66f, 22f, 1.03f, 18.04f, 0.03f, 12.99f)
                curveToRelative(-0.22f, -1.13f, 0.8f, -2.16f, 1.94f, -1.94f)
                curveToRelative(5.05f, 1.0f, 9.03f, 5.6f, 9.03f, 10.94f)
                close()
                moveTo(17.0f, 11.05f)
                curveToRelative(-0.17f, -2.64f, -1.64f, -5.56f, -3.54f, -7.93f)
                curveToRelative(-0.74f, -0.93f, -2.16f, -0.93f, -2.9f, 0f)
                curveToRelative(-1.9f, 2.37f, -3.38f, 5.29f, -3.54f, 7.93f)
                curveToRelative(2.21f, 1.42f, 3.97f, 3.5f, 5.0f, 5.95f)
                curveToRelative(1.03f, -2.45f, 2.78f, -4.53f, 5.0f, -5.95f)
                close()
                moveTo(22.03f, 11.06f)
                curveToRelative(-5.05f, 1.0f, -9.03f, 5.6f, -9.03f, 10.94f)
                curveToRelative(5.34f, 0f, 9.97f, -3.96f, 10.97f, -9.01f)
                curveToRelative(0.22f, -1.13f, -0.8f, -2.16f, -1.94f, -1.94f)
                close()
            }
        }.also { _Massage = it}
