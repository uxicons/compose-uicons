package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Key: ImageVector? = null

val Icons.Sc.Key: ImageVector
    get() = _Key ?: UXIcon(name = "Key") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.52f, 2.47f)
                curveToRelative(-1.85f, -1.84f, -4.29f, -1.83f, -5.59f, -0.74f)
                curveToRelative(-1.09f, 0.91f, -2.35f, 2.08f, -3.75f, 3.49f)
                curveToRelative(-0.7f, 0.7f, -1.35f, 1.38f, -1.95f, 2.02f)
                curveToRelative(-2.11f, -0.5f, -4.21f, 0.34f, -6.41f, 2.53f)
                curveTo(0.19f, 13.39f, 0.13f, 17.05f, 3.49f, 20.51f)
                curveToRelative(3.87f, 3.99f, 7.86f, 2.6f, 10.74f, -0.33f)
                curveToRelative(2.17f, -2.21f, 3.02f, -4.29f, 2.53f, -6.41f)
                curveToRelative(0.25f, -0.24f, 0.51f, -0.49f, 0.78f, -0.74f)
                curveToRelative(0.22f, -0.21f, 0.33f, -0.52f, 0.3f, -0.82f)
                curveToRelative(-0.04f, -0.45f, -0.27f, -1.16f, -0.29f, -1.29f)
                curveToRelative(0.19f, -0.01f, 0.57f, 0.03f, 1.03f, 0.1f)
                curveToRelative(0.43f, 0.06f, 0.87f, 0.13f, 1.24f, -0.26f)
                curveToRelative(0.39f, -0.41f, 0.29f, -0.85f, 0.17f, -1.37f)
                curveToRelative(-0.17f, -0.76f, -0.26f, -1.29f, -0.25f, -1.6f)
                curveToRelative(0.19f, 0.04f, 0.46f, 0.13f, 0.64f, 0.19f)
                curveToRelative(0.33f, 0.11f, 0.66f, 0.21f, 0.97f, 0.27f)
                curveToRelative(0.38f, 0.07f, 0.78f, -0.1f, 1.0f, -0.41f)
                curveToRelative(0.91f, -1.27f, 1.04f, -3.49f, -0.84f, -5.36f)
                close()
                moveTo(8.7f, 16.82f)
                curveToRelative(-0.84f, 0f, -1.51f, -0.68f, -1.51f, -1.51f)
                reflectiveCurveToRelative(0.68f, -1.51f, 1.51f, -1.51f)
                reflectiveCurveToRelative(1.51f, 0.68f, 1.51f, 1.51f)
                reflectiveCurveToRelative(-0.68f, 1.51f, -1.51f, 1.51f)
                close()
            }
        }.also { _Key = it}
