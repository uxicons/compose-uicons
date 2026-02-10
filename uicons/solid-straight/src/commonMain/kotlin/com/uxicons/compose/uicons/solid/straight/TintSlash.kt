package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TintSlash: ImageVector? = null

val Icons.Ss.TintSlash: ImageVector
    get() = _TintSlash ?: UXIcon(name = "TintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.56f, 19.15f)
                curveToRelative(2.35f, -3.9f, 1.76f, -8.97f, -1.5f, -12.23f)
                lineTo(12f, 0.01f)
                lineToRelative(-5.34f, 5.23f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.39f, -3.39f)
                close()
                moveTo(17.85f, 22.1f)
                curveToRelative(-1.7f, 1.23f, -3.72f, 1.9f, -5.85f, 1.9f)
                curveToRelative(-2.67f, 0f, -5.18f, -1.04f, -7.07f, -2.93f)
                curveToRelative(-3.52f, -3.52f, -3.85f, -9.02f, -1.02f, -12.92f)
                lineToRelative(13.95f, 13.95f)
                close()
            }
        }.also { _TintSlash = it}
