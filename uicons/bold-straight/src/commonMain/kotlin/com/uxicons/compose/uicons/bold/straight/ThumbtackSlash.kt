package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThumbtackSlash: ImageVector? = null

val Icons.Bs.ThumbtackSlash: ImageVector
    get() = _ThumbtackSlash ?: UXIcon(name = "ThumbtackSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.71f, 13.22f)
                lineToRelative(3.34f, -3.35f)
                lineToRelative(0.49f, 0.49f)
                curveToRelative(0.7f, 0.7f, 1.82f, 0.87f, 2.62f, 0.29f)
                curveToRelative(1.02f, -0.74f, 1.1f, -2.17f, 0.25f, -3.03f)
                lineTo(16.45f, 0.64f)
                curveToRelative(-0.7f, -0.7f, -1.82f, -0.87f, -2.62f, -0.29f)
                curveToRelative(-1.02f, 0.74f, -1.1f, 2.17f, -0.25f, 3.03f)
                lineToRelative(0.56f, 0.56f)
                lineToRelative(-3.35f, 3.36f)
                lineToRelative(-0.07f, -0.02f)
                curveToRelative(-0.51f, -0.13f, -1.03f, -0.2f, -1.56f, -0.23f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-7f, -7f)
                curveToRelative(-0.04f, -0.53f, -0.11f, -1.06f, -0.25f, -1.62f)
                close()
                moveTo(16.26f, 6.06f)
                lineToRelative(1.68f, 1.68f)
                lineToRelative(-4.03f, 4.04f)
                lineToRelative(-1.68f, -1.68f)
                lineToRelative(4.03f, -4.04f)
                close()
                moveTo(3.56f, 8.72f)
                lineToRelative(11.72f, 11.72f)
                curveToRelative(-0.47f, 0.73f, -1.4f, 1.59f, -2.02f, 2.22f)
                lineToRelative(-4.9f, -4.9f)
                lineToRelative(-6.24f, 6.24f)
                lineTo(0.0f, 21.88f)
                lineToRelative(6.24f, -6.24f)
                lineTo(1.35f, 10.74f)
                curveToRelative(0.63f, -0.62f, 1.48f, -1.55f, 2.22f, -2.02f)
                close()
            }
        }.also { _ThumbtackSlash = it}
