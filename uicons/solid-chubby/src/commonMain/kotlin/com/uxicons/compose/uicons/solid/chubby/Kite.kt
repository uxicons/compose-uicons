package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kite: ImageVector? = null

val Icons.Sc.Kite: ImageVector
    get() = _Kite ?: UXIcon(name = "Kite") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.06f, 3.0f)
                lineToRelative(-4.81f, 4.8f)
                lineToRelative(4.6f, 4.59f)
                curveToRelative(0.47f, -1.46f, 1.44f, -5.29f, 0.21f, -9.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.64f, 1.59f)
                curveToRelative(-4.1f, -1.22f, -7.93f, -0.26f, -9.4f, 0.21f)
                lineToRelative(4.59f, 4.58f)
                lineTo(18.64f, 1.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.96f, 15.07f)
                curveToRelative(1.51f, 0.21f, 5.92f, 0.59f, 10.48f, -1.25f)
                lineToRelative(-4.62f, -4.61f)
                lineToRelative(-5.87f, 5.85f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.28f, 21.17f)
                lineToRelative(-0.86f, -0.86f)
                curveToRelative(-1.94f, -1.93f, -5.09f, -1.93f, -7.02f, 0f)
                curveToRelative(-0.92f, 0.92f, -2.43f, 0.92f, -3.35f, 0f)
                curveToRelative(-0.46f, -0.44f, -0.69f, -1.04f, -0.69f, -1.67f)
                reflectiveCurveToRelative(0.25f, -1.22f, 0.69f, -1.67f)
                lineToRelative(1.95f, -1.94f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5.84f, -5.82f)
                lineTo(7.8f, 3.2f)
                curveToRelative(-1.84f, 4.55f, -1.47f, 8.94f, -1.25f, 10.45f)
                lineToRelative(-1.92f, 1.91f)
                curveToRelative(-0.83f, 0.82f, -1.28f, 1.92f, -1.28f, 3.08f)
                curveToRelative(0f, 1.16f, 0.45f, 2.25f, 1.28f, 3.08f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(1.7f, 1.7f, 4.47f, 1.7f, 6.18f, 0f)
                curveToRelative(1.16f, -1.15f, 3.04f, -1.15f, 4.2f, 0f)
                lineToRelative(0.86f, 0.86f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, -0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.0f, -1.41f)
                horizontalLineToRelative(-0.0f)
                close()
            }
        }.also { _Kite = it}
