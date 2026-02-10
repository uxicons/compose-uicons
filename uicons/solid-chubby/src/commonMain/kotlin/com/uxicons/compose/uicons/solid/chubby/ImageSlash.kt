package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Sc.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.03f, 13.97f)
                lineToRelative(8.61f, 8.61f)
                curveToRelative(-1.63f, 0.22f, -3.62f, 0.42f, -5.63f, 0.42f)
                curveToRelative(-4.5f, 0f, -9.02f, -0.98f, -9.21f, -1.02f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.01f, -0.04f, -0.07f, -0.34f, -0.16f, -0.81f)
                curveToRelative(2.33f, -2.97f, 5.03f, -5.06f, 7.17f, -6.43f)
                close()
                moveTo(22.56f, 20.44f)
                curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19.0f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(0.35f, 0.35f)
                curveToRelative(1.87f, -0.32f, 5.23f, -0.79f, 8.09f, -0.79f)
                curveToRelative(4.5f, 0f, 9.02f, 0.98f, 9.21f, 1.02f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                curveToRelative(0f, 2.77f, -0.48f, 6.14f, -0.81f, 8.07f)
                lineToRelative(0.37f, 0.37f)
                close()
                moveTo(18f, 7.5f)
                curveToRelative(0f, -1.07f, -0.43f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.43f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.43f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.43f, 1.5f, -1.5f)
                close()
                moveTo(7.58f, 12.53f)
                lineTo(1.42f, 6.37f)
                curveToRelative(-0.22f, 1.63f, -0.42f, 3.62f, -0.42f, 5.63f)
                curveToRelative(0f, 2.07f, 0.21f, 4.14f, 0.44f, 5.8f)
                curveToRelative(2.06f, -2.31f, 4.28f, -4.04f, 6.14f, -5.27f)
                close()
            }
        }.also { _ImageSlash = it}
