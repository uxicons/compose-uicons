package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Tc.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.66f, 13.74f)
                curveToRelative(-1.13f, -0.92f, -1.66f, -2.1f, -1.66f, -3.7f)
                curveToRelative(0f, -4.18f, 2.12f, -6.04f, 6.87f, -6.04f)
                curveToRelative(4.69f, 0f, 6.87f, 1.92f, 6.87f, 6.04f)
                curveToRelative(0f, 1.6f, -0.53f, 2.78f, -1.66f, 3.7f)
                curveToRelative(-0.21f, 0.17f, -0.25f, 0.49f, -0.07f, 0.7f)
                curveToRelative(0.17f, 0.21f, 0.49f, 0.25f, 0.7f, 0.07f)
                curveToRelative(1.36f, -1.11f, 2.03f, -2.57f, 2.03f, -4.47f)
                curveToRelative(0f, -4.67f, -2.65f, -7.04f, -7.87f, -7.04f)
                curveToRelative(-5.29f, 0.0f, -7.87f, 2.3f, -7.87f, 7.04f)
                curveToRelative(0f, 1.9f, 0.66f, 3.36f, 2.03f, 4.47f)
                curveToRelative(0.09f, 0.08f, 0.41f, 0.26f, 0.7f, -0.07f)
                curveToRelative(0.18f, -0.21f, 0.14f, -0.53f, -0.07f, -0.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.97f, 9.49f)
                curveToRelative(-0.21f, -0.18f, -0.53f, -0.14f, -0.7f, 0.07f)
                curveToRelative(-0.17f, 0.21f, -0.14f, 0.53f, 0.07f, 0.7f)
                curveToRelative(1.13f, 0.92f, 1.66f, 2.1f, 1.66f, 3.7f)
                curveToRelative(0f, 4.18f, -2.12f, 6.04f, -6.87f, 6.04f)
                curveToRelative(-4.69f, 0f, -6.87f, -1.92f, -6.87f, -6.04f)
                curveToRelative(0f, -1.6f, 0.53f, -2.78f, 1.66f, -3.7f)
                curveToRelative(0.21f, -0.17f, 0.25f, -0.49f, 0.07f, -0.7f)
                curveToRelative(-0.17f, -0.21f, -0.49f, -0.25f, -0.7f, -0.07f)
                curveToRelative(-1.36f, 1.11f, -2.03f, 2.57f, -2.03f, 4.47f)
                curveToRelative(0f, 4.67f, 2.65f, 7.04f, 7.87f, 7.04f)
                curveToRelative(5.29f, 0f, 7.87f, -2.3f, 7.87f, -7.04f)
                curveToRelative(0f, -1.9f, -0.66f, -3.36f, -2.03f, -4.47f)
                close()
            }
        }.also { _LinkHorizontal = it}
