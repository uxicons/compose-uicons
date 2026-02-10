package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Sc.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.96f, 12.08f)
                curveToRelative(-0.24f, -0.08f, -0.96f, -0.32f, -0.96f, -1.95f)
                curveToRelative(0f, -2.55f, 0.83f, -4.13f, 4.98f, -4.13f)
                curveToRelative(4.44f, 0f, 5.05f, 1.98f, 5.05f, 4.13f)
                curveToRelative(0f, 1.63f, -0.74f, 1.86f, -0.99f, 1.94f)
                curveToRelative(-0.79f, 0.25f, -1.23f, 1.09f, -0.98f, 1.88f)
                reflectiveCurveToRelative(1.09f, 1.23f, 1.88f, 0.98f)
                curveToRelative(1.96f, -0.62f, 3.08f, -2.37f, 3.08f, -4.8f)
                curveToRelative(0f, -3.25f, -1.4f, -7.13f, -8.05f, -7.13f)
                curveToRelative(-5.22f, -0.0f, -7.98f, 2.46f, -7.98f, 7.13f)
                curveToRelative(0f, 2.41f, 1.1f, 4.17f, 3.02f, 4.79f)
                curveToRelative(0.89f, 0.29f, 1.67f, -0.24f, 1.9f, -0.95f)
                curveToRelative(0.25f, -0.79f, -0.17f, -1.64f, -0.95f, -1.9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.97f, 9.09f)
                curveToRelative(-0.79f, -0.26f, -1.64f, 0.17f, -1.9f, 0.95f)
                curveToRelative(-0.26f, 0.79f, 0.17f, 1.64f, 0.95f, 1.9f)
                curveToRelative(0.24f, 0.08f, 0.97f, 0.32f, 0.97f, 1.93f)
                curveToRelative(0f, 2.55f, -0.83f, 4.13f, -4.97f, 4.13f)
                curveToRelative(-4.45f, 0f, -5.06f, -1.98f, -5.06f, -4.13f)
                curveToRelative(0f, -1.62f, 0.73f, -1.85f, 0.98f, -1.93f)
                curveToRelative(0.79f, -0.25f, 1.23f, -1.09f, 0.98f, -1.88f)
                curveToRelative(-0.25f, -0.79f, -1.09f, -1.23f, -1.88f, -0.98f)
                curveToRelative(-1.95f, 0.62f, -3.07f, 2.36f, -3.07f, 4.79f)
                curveToRelative(0f, 3.25f, 1.4f, 7.13f, 8.06f, 7.13f)
                curveToRelative(5.29f, 0f, 7.97f, -2.4f, 7.97f, -7.13f)
                curveToRelative(0f, -2.4f, -1.1f, -4.14f, -3.03f, -4.78f)
                close()
            }
        }.also { _LinkHorizontal = it}
