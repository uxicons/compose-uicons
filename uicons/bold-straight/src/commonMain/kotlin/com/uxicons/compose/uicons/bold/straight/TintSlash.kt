package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TintSlash: ImageVector? = null

val Icons.Bs.TintSlash: ImageVector
    get() = _TintSlash ?: UXIcon(name = "TintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.82f, 18.7f)
                curveToRelative(2.06f, -3.84f, 1.39f, -8.64f, -1.77f, -11.79f)
                lineTo(12f, 0.01f)
                lineToRelative(-4.99f, 4.88f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.14f, -3.14f)
                close()
                moveTo(12f, 4.2f)
                lineToRelative(4.95f, 4.84f)
                curveToRelative(1.98f, 1.98f, 2.55f, 4.88f, 1.61f, 7.4f)
                lineTo(9.13f, 7.01f)
                lineToRelative(2.87f, -2.81f)
                close()
                moveTo(15.25f, 20.2f)
                lineToRelative(2.19f, 2.19f)
                curveToRelative(-1.6f, 1.04f, -3.48f, 1.6f, -5.44f, 1.6f)
                curveToRelative(-2.67f, 0f, -5.18f, -1.04f, -7.07f, -2.93f)
                curveToRelative(-1.89f, -1.89f, -2.93f, -4.4f, -2.93f, -7.07f)
                curveToRelative(0f, -1.96f, 0.56f, -3.83f, 1.6f, -5.44f)
                lineToRelative(2.19f, 2.19f)
                curveToRelative(-0.52f, 0.99f, -0.8f, 2.1f, -0.8f, 3.25f)
                curveToRelative(0f, 1.87f, 0.73f, 3.63f, 2.05f, 4.95f)
                curveToRelative(1.32f, 1.32f, 3.08f, 2.05f, 4.95f, 2.05f)
                curveToRelative(1.15f, 0f, 2.26f, -0.28f, 3.25f, -0.8f)
                close()
            }
        }.also { _TintSlash = it}
