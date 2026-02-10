package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beard: ImageVector? = null

val Icons.Ss.Beard: ImageVector
    get() = _Beard ?: UXIcon(name = "Beard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.84f, 2f)
                lineToRelative(-0.26f, 0.61f)
                curveToRelative(-0.98f, 2.28f, -3.05f, 4.14f, -4.16f, 5.02f)
                curveToRelative(-0.99f, -1.0f, -2.45f, -1.62f, -3.92f, -1.62f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.47f, 0f, -2.93f, 0.62f, -3.92f, 1.62f)
                curveToRelative(-1.11f, -0.88f, -3.19f, -2.74f, -4.16f, -5.02f)
                lineToRelative(-0.26f, -0.61f)
                lineTo(0f, 2f)
                verticalLineToRelative(7.83f)
                curveToRelative(-0.07f, 4.77f, 4.94f, 9.96f, 12f, 12.75f)
                curveToRelative(7.06f, -2.79f, 12.07f, -7.97f, 12f, -12.75f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-2.16f)
                close()
                moveTo(15.22f, 11.34f)
                curveToRelative(-1.01f, 0.42f, -2.26f, 0.66f, -3.22f, 0.66f)
                curveToRelative(-0.96f, 0f, -2.29f, -0.24f, -3.29f, -0.66f)
                curveToRelative(-0.03f, -1.27f, 1.01f, -2.35f, 2.29f, -2.35f)
                horizontalLineToRelative(1.96f)
                curveToRelative(1.25f, -0.01f, 2.37f, 1.08f, 2.26f, 2.34f)
                close()
            }
        }.also { _Beard = it}
