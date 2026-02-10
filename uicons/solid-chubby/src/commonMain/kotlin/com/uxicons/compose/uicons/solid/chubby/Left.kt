package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Left: ImageVector? = null

val Icons.Sc.Left: ImageVector
    get() = _Left ?: UXIcon(name = "Left") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 22f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.06f, -0.55f, -0.16f)
                curveToRelative(-3.82f, -2.5f, -6.95f, -5.63f, -9.29f, -9.3f)
                curveToRelative(-0.21f, -0.33f, -0.21f, -0.75f, 0f, -1.08f)
                curveToRelative(2.35f, -3.67f, 5.47f, -6.8f, 9.29f, -9.3f)
                curveToRelative(0.26f, -0.17f, 0.58f, -0.21f, 0.88f, -0.11f)
                reflectiveCurveToRelative(0.52f, 0.33f, 0.62f, 0.63f)
                curveToRelative(0.02f, 0.07f, 0.5f, 1.53f, 0.8f, 4.37f)
                curveToRelative(0.71f, -0.04f, 1.38f, -0.05f, 2.0f, -0.05f)
                curveToRelative(3.25f, 0f, 6.74f, 0.49f, 6.89f, 0.51f)
                curveToRelative(0.34f, 0.05f, 0.63f, 0.27f, 0.77f, 0.58f)
                curveToRelative(0.06f, 0.13f, 0.59f, 1.37f, 0.59f, 3.91f)
                reflectiveCurveToRelative(-0.53f, 3.78f, -0.59f, 3.91f)
                curveToRelative(-0.14f, 0.31f, -0.43f, 0.53f, -0.77f, 0.58f)
                curveToRelative(-0.15f, 0.02f, -3.63f, 0.51f, -6.89f, 0.51f)
                curveToRelative(-0.62f, 0f, -1.29f, -0.02f, -2.0f, -0.05f)
                curveToRelative(-0.3f, 2.84f, -0.78f, 4.3f, -0.8f, 4.37f)
                curveToRelative(-0.13f, 0.4f, -0.53f, 0.69f, -0.95f, 0.69f)
                close()
            }
        }.also { _Left = it}
