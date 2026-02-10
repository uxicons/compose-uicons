package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSlash: ImageVector? = null

val Icons.Sc.BellSlash: ImageVector
    get() = _BellSlash ?: UXIcon(name = "BellSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 22.56f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(1.68f, 1.68f)
                curveToRelative(1.31f, -1.21f, 3.01f, -1.98f, 4.88f, -2.07f)
                curveToRelative(1.17f, -0.06f, 2.59f, -0.06f, 3.77f, 0f)
                curveToRelative(3.52f, 0.18f, 6.53f, 2.71f, 7.32f, 6.16f)
                curveToRelative(0.19f, 0.81f, 0.35f, 1.65f, 0.47f, 2.5f)
                curveToRelative(0.75f, 4.89f, 0.32f, 7.17f, 0.3f, 7.27f)
                curveToRelative(-0.08f, 0.4f, -0.37f, 0.73f, -0.76f, 0.85f)
                curveToRelative(-0.04f, 0.01f, -0.4f, 0.13f, -1.01f, 0.27f)
                lineToRelative(2.35f, 2.35f)
                curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
                close()
                moveTo(8.27f, 20.81f)
                curveToRelative(0.51f, 1.47f, 1.74f, 2.19f, 3.73f, 2.19f)
                reflectiveCurveToRelative(3.23f, -0.72f, 3.73f, -2.19f)
                curveToRelative(-1.1f, 0.11f, -2.35f, 0.19f, -3.73f, 0.19f)
                reflectiveCurveToRelative(-2.63f, -0.08f, -3.73f, -0.19f)
                close()
                moveTo(14.01f, 18.95f)
                lineTo(2.71f, 7.65f)
                curveToRelative(-0.14f, 0.67f, -0.28f, 1.36f, -0.39f, 2.05f)
                curveToRelative(-0.75f, 4.89f, -0.32f, 7.17f, -0.3f, 7.27f)
                curveToRelative(0.08f, 0.4f, 0.37f, 0.73f, 0.76f, 0.85f)
                curveToRelative(0.15f, 0.05f, 3.71f, 1.18f, 9.22f, 1.18f)
                curveToRelative(0.7f, 0f, 1.37f, -0.02f, 2.01f, -0.05f)
                close()
            }
        }.also { _BellSlash = it}
