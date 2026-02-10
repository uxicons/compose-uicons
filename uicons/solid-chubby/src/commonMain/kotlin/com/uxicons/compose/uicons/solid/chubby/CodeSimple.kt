package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Sc.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.93f, 6.78f)
                curveToRelative(0.71f, -0.43f, 0.93f, -1.36f, 0.5f, -2.06f)
                curveToRelative(-0.43f, -0.71f, -1.36f, -0.93f, -2.06f, -0.5f)
                curveTo(3.64f, 7.12f, 1.3f, 11.08f, 1.2f, 11.25f)
                curveToRelative(-0.27f, 0.47f, -0.27f, 1.04f, 0f, 1.51f)
                curveToRelative(0.1f, 0.17f, 2.44f, 4.13f, 7.16f, 7.03f)
                curveToRelative(0.24f, 0.15f, 1.29f, 0.65f, 2.06f, -0.5f)
                curveToRelative(0.43f, -0.63f, 0.21f, -1.63f, -0.5f, -2.06f)
                curveToRelative(-2.91f, -1.78f, -4.79f, -4.06f, -5.63f, -5.22f)
                curveToRelative(0.83f, -1.16f, 2.7f, -3.43f, 5.63f, -5.22f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.8f, 11.25f)
                curveToRelative(-0.1f, -0.17f, -2.44f, -4.13f, -7.16f, -7.03f)
                curveToRelative(-0.71f, -0.43f, -1.63f, -0.21f, -2.06f, 0.5f)
                curveToRelative(-0.43f, 0.71f, -0.21f, 1.63f, 0.5f, 2.06f)
                curveToRelative(2.93f, 1.79f, 4.8f, 4.06f, 5.63f, 5.22f)
                curveToRelative(-0.84f, 1.16f, -2.72f, 3.44f, -5.63f, 5.22f)
                curveToRelative(-0.71f, 0.43f, -0.93f, 1.43f, -0.5f, 2.06f)
                curveToRelative(0.78f, 1.15f, 1.82f, 0.65f, 2.06f, 0.5f)
                curveToRelative(4.73f, -2.9f, 7.07f, -6.86f, 7.16f, -7.03f)
                curveToRelative(0.27f, -0.47f, 0.27f, -1.04f, 0f, -1.51f)
                close()
            }
        }.also { _CodeSimple = it}
