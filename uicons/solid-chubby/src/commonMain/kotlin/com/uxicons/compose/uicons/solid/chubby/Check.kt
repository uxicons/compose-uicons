package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Check: ImageVector? = null

val Icons.Sc.Check: ImageVector
    get() = _Check ?: UXIcon(name = "Check") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.99f, 19.9f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.07f, -0.76f, -0.2f)
                curveToRelative(-0.21f, -0.12f, -5.12f, -3.02f, -7.95f, -6.9f)
                curveToRelative(-0.49f, -0.67f, -0.34f, -1.61f, 0.33f, -2.1f)
                curveToRelative(0.67f, -0.49f, 1.61f, -0.34f, 2.1f, 0.33f)
                curveToRelative(1.85f, 2.55f, 4.91f, 4.71f, 6.3f, 5.62f)
                curveToRelative(1.77f, -1.13f, 6.53f, -4.66f, 10.15f, -11.72f)
                curveToRelative(0.38f, -0.74f, 1.28f, -1.03f, 2.02f, -0.65f)
                curveToRelative(0.74f, 0.38f, 1.03f, 1.28f, 0.65f, 2.02f)
                curveToRelative(-4.99f, 9.72f, -11.88f, 13.3f, -12.17f, 13.45f)
                curveToRelative(-0.21f, 0.11f, -0.45f, 0.16f, -0.68f, 0.16f)
                close()
            }
        }.also { _Check = it}
