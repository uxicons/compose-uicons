package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comet: ImageVector? = null

val Icons.Sc.Comet: ImageVector
    get() = _Comet ?: UXIcon(name = "Comet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.61f, 10.5f)
                curveToRelative(-0.22f, -0.18f, -1.01f, -0.43f, -2.23f, -0.33f)
                curveToRelative(2.03f, -3.52f, 2.12f, -7.48f, 2.12f, -7.68f)
                curveToRelative(0.0f, -0.27f, -0.1f, -0.53f, -0.29f, -0.72f)
                reflectiveCurveToRelative(-0.47f, -0.28f, -0.72f, -0.29f)
                curveToRelative(-0.2f, 0.0f, -4.15f, 0.07f, -7.67f, 2.12f)
                curveToRelative(0.1f, -1.22f, -0.14f, -2.0f, -0.32f, -2.23f)
                curveToRelative(-0.23f, -0.29f, -0.61f, -0.43f, -0.98f, -0.36f)
                curveTo(7.48f, 2.01f, 4.65f, 5.84f, 2.96f, 8.14f)
                curveTo(0.1f, 12.01f, 0.44f, 16.88f, 3.8f, 20.24f)
                curveToRelative(4.88f, 4.88f, 10.29f, 2.11f, 12.04f, 0.81f)
                curveToRelative(2.29f, -1.69f, 6.12f, -4.53f, 7.12f, -9.58f)
                curveToRelative(0.07f, -0.36f, -0.06f, -0.73f, -0.35f, -0.97f)
                close()
                moveTo(12.56f, 17.43f)
                curveToRelative(-1.0f, 0.97f, -2.04f, 1.45f, -3.06f, 1.45f)
                curveToRelative(-1.01f, 0f, -2.02f, -0.47f, -2.97f, -1.41f)
                curveToRelative(-1.89f, -1.92f, -1.88f, -4.13f, 0.03f, -6.04f)
                curveToRelative(1.9f, -1.9f, 4.12f, -1.88f, 6.0f, -0.01f)
                curveToRelative(1.86f, 1.9f, 1.86f, 4.08f, -0.01f, 6.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.97f, 12.85f)
                curveToRelative(-1.13f, 1.18f, -1.13f, 2.08f, -0.02f, 3.21f)
                curveToRelative(1.12f, 1.11f, 2.02f, 1.1f, 3.2f, -0.04f)
                curveToRelative(1.07f, -1.11f, 1.08f, -2.1f, 0.0f, -3.19f)
                curveToRelative(-1.1f, -1.09f, -2.03f, -1.09f, -3.18f, 0.02f)
                close()
            }
        }.also { _Comet = it}
