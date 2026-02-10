package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Sc.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.29f, 14.02f)
                curveToRelative(-0.04f, 0.09f, -0.07f, 0.18f, -0.1f, 0.27f)
                curveToRelative(-0.4f, 1.13f, -0.66f, 3.73f, -0.79f, 5.24f)
                curveToRelative(-0.04f, 0.04f, -0.1f, 0.05f, -0.14f, 0.09f)
                lineToRelative(-0.81f, 0.81f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                curveToRelative(0.38f, 0f, 0.77f, -0.14f, 1.06f, -0.44f)
                lineToRelative(0.81f, -0.81f)
                curveToRelative(0.03f, -0.03f, 0.05f, -0.08f, 0.08f, -0.12f)
                curveToRelative(1.55f, -0.09f, 4.27f, -0.3f, 5.41f, -0.74f)
                curveToRelative(0.08f, -0.03f, 0.15f, -0.06f, 0.23f, -0.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.16f, 1.92f)
                curveToRelative(-1.02f, -1.02f, -4.25f, -2.62f, -12.16f, 4.35f)
                curveToRelative(-3.19f, 2.82f, -4.79f, 4.34f, -5.78f, 5.87f)
                lineToRelative(7.72f, 7.7f)
                curveToRelative(1.48f, -1.0f, 2.94f, -2.58f, 5.82f, -5.8f)
                curveToRelative(5.68f, -6.34f, 6.0f, -10.41f, 4.39f, -12.12f)
                close()
            }
        }.also { _Highlighter = it}
