package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateLeft: ImageVector? = null

val Icons.Rc.RotateLeft: ImageVector
    get() = _RotateLeft ?: UXIcon(name = "RotateLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.85f, 1.84f)
                curveToRelative(-3.77f, 0f, -8.69f, 0.78f, -9.88f, 7.01f)
                curveToRelative(-0.02f, -0.04f, -0.05f, -0.09f, -0.07f, -0.14f)
                curveToRelative(-0.25f, -0.49f, -0.85f, -0.7f, -1.34f, -0.45f)
                curveToRelative(-0.49f, 0.25f, -0.7f, 0.85f, -0.45f, 1.34f)
                curveToRelative(0.6f, 1.2f, 0.94f, 1.61f, 1.99f, 2.46f)
                curveToRelative(0.28f, 0.23f, 0.7f, 0.29f, 1.06f, 0.12f)
                curveToRelative(1.23f, -0.59f, 1.65f, -0.92f, 2.52f, -1.96f)
                curveToRelative(0.35f, -0.42f, 0.3f, -1.05f, -0.13f, -1.41f)
                curveToRelative(-0.42f, -0.35f, -1.05f, -0.3f, -1.41f, 0.13f)
                curveToRelative(-0.08f, 0.09f, -0.14f, 0.17f, -0.21f, 0.25f)
                curveToRelative(0.7f, -3.82f, 3.06f, -5.35f, 7.92f, -5.35f)
                curveToRelative(4.89f, 0f, 8.15f, 1.39f, 8.15f, 8.16f)
                reflectiveCurveToRelative(-3.26f, 8.16f, -8.15f, 8.16f)
                curveToRelative(-4.47f, 0f, -6.77f, -1.31f, -7.69f, -4.38f)
                curveToRelative(-0.16f, -0.53f, -0.72f, -0.83f, -1.24f, -0.67f)
                curveToRelative(-0.53f, 0.16f, -0.83f, 0.71f, -0.67f, 1.24f)
                curveToRelative(1.55f, 5.21f, 6.22f, 5.81f, 9.6f, 5.81f)
                curveToRelative(4.36f, 0f, 10.15f, -1.05f, 10.15f, -10.16f)
                curveTo(23f, 3.0f, 17.57f, 1.84f, 12.85f, 1.84f)
                close()
            }
        }.also { _RotateLeft = it}
