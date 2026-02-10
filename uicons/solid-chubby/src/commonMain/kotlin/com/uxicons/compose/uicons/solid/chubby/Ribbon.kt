package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ribbon: ImageVector? = null

val Icons.Sc.Ribbon: ImageVector
    get() = _Ribbon ?: UXIcon(name = "Ribbon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.51f, 19.99f)
                curveToRelative(-1.3f, 1.05f, -2.62f, 2.01f, -3.94f, 2.85f)
                curveToRelative(-0.25f, 0.16f, -0.57f, 0.2f, -0.85f, 0.1f)
                curveToRelative(-1.84f, -0.61f, -4.08f, -2.92f, -4.64f, -5.73f)
                curveToRelative(-0.09f, -0.44f, 0.13f, -0.88f, 0.53f, -1.08f)
                curveToRelative(1.12f, -0.56f, 2.27f, -1.19f, 3.42f, -1.85f)
                curveToRelative(0.35f, 0.47f, 1.98f, 2.59f, 5.49f, 5.71f)
                close()
                moveTo(22.4f, 16.04f)
                curveToRelative(-5.83f, -2.94f, -11.09f, -6.75f, -12.05f, -7.73f)
                curveToRelative(-0.56f, -0.58f, -1.14f, -1.34f, -1.29f, -2.63f)
                curveToRelative(0.22f, -1.45f, 1.9f, -1.69f, 2.94f, -1.69f)
                reflectiveCurveToRelative(2.73f, 0.24f, 2.94f, 1.69f)
                curveToRelative(-0.17f, 1.33f, -0.73f, 2.08f, -1.35f, 2.68f)
                curveToRelative(1.17f, 0.85f, 2.81f, 1.96f, 4.73f, 3.13f)
                curveToRelative(0.44f, -1.04f, 0.65f, -2.18f, 0.65f, -3.52f)
                curveToRelative(0f, -4.82f, -2.15f, -6.97f, -6.97f, -6.97f)
                reflectiveCurveToRelative(-6.97f, 2.15f, -6.97f, 6.97f)
                curveToRelative(0f, 2.15f, 0.53f, 3.78f, 1.7f, 5.3f)
                curveToRelative(0.04f, 0.05f, 4.15f, 5.31f, 10.7f, 9.48f)
                curveToRelative(0.25f, 0.16f, 0.57f, 0.2f, 0.85f, 0.1f)
                curveToRelative(1.84f, -0.61f, 4.08f, -2.92f, 4.64f, -5.73f)
                curveToRelative(0.09f, -0.44f, -0.13f, -0.88f, -0.53f, -1.08f)
                close()
            }
        }.also { _Ribbon = it}
