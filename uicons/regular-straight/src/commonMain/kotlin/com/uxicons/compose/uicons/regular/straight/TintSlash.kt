package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TintSlash: ImageVector? = null

val Icons.Rs.TintSlash: ImageVector
    get() = _TintSlash ?: UXIcon(name = "TintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.57f, 19.16f)
                curveToRelative(2.34f, -3.88f, 1.77f, -8.95f, -1.51f, -12.24f)
                lineTo(12f, 0.01f)
                lineToRelative(-5.34f, 5.23f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.39f, -3.39f)
                close()
                moveTo(12f, 2.81f)
                lineToRelative(5.66f, 5.53f)
                curveToRelative(2.5f, 2.5f, 3.02f, 6.31f, 1.45f, 9.35f)
                lineTo(8.07f, 6.66f)
                lineToRelative(3.93f, -3.84f)
                close()
                moveTo(16.43f, 20.67f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(-1.7f, 1.23f, -3.73f, 1.9f, -5.86f, 1.9f)
                curveToRelative(-2.67f, 0f, -5.18f, -1.04f, -7.07f, -2.93f)
                curveToRelative(-3.52f, -3.52f, -3.86f, -9.03f, -1.03f, -12.93f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(-2.06f, 3.1f, -1.73f, 7.34f, 1.01f, 10.08f)
                curveToRelative(1.51f, 1.51f, 3.52f, 2.34f, 5.66f, 2.34f)
                curveToRelative(1.6f, 0f, 3.12f, -0.47f, 4.42f, -1.33f)
                close()
            }
        }.also { _TintSlash = it}
