package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThumbtackSlash: ImageVector? = null

val Icons.Ss.ThumbtackSlash: ImageVector
    get() = _ThumbtackSlash ?: UXIcon(name = "ThumbtackSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.23f, 8.68f)
                lineToRelative(11.1f, 11.1f)
                curveToRelative(-0.36f, 0.5f, -1.1f, 1.21f, -1.55f, 1.66f)
                lineToRelative(-4.9f, -4.9f)
                lineTo(1.71f, 23.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(7.17f, -7.17f)
                lineTo(2.57f, 10.22f)
                curveToRelative(0.45f, -0.45f, 1.15f, -1.19f, 1.66f, -1.55f)
                close()
                moveTo(24.01f, 22.66f)
                lineToRelative(-7.18f, -7.18f)
                curveToRelative(0.23f, -1.34f, -0.12f, -2.81f, -0.47f, -4.12f)
                lineToRelative(2.73f, -2.75f)
                lineToRelative(0.57f, 0.57f)
                curveToRelative(0.9f, 0.9f, 2.32f, 1.05f, 3.29f, 0.35f)
                curveToRelative(1.25f, -0.85f, 1.41f, -2.77f, 0.32f, -3.81f)
                lineTo(18.34f, 0.79f)
                curveToRelative(-0.9f, -0.9f, -2.32f, -1.05f, -3.29f, -0.35f)
                curveToRelative(-1.25f, 0.85f, -1.41f, 2.77f, -0.32f, 3.81f)
                lineToRelative(0.65f, 0.65f)
                lineToRelative(-2.73f, 2.75f)
                curveToRelative(-1.31f, -0.35f, -2.78f, -0.71f, -4.12f, -0.47f)
                lineTo(1.41f, 0.06f)
                lineTo(-0.01f, 1.47f)
                lineTo(22.59f, 24.07f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _ThumbtackSlash = it}
