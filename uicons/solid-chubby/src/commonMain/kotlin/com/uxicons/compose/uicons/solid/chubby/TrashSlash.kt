package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashSlash: ImageVector? = null

val Icons.Sc.TrashSlash: ImageVector
    get() = _TrashSlash ?: UXIcon(name = "TrashSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.19f, 8.14f)
                lineToRelative(14.09f, 14.09f)
                curveToRelative(-0.61f, 0.21f, -2.52f, 0.78f, -5.27f, 0.78f)
                curveToRelative(-2.85f, 0f, -4.82f, -0.61f, -5.35f, -0.8f)
                curveToRelative(-0.26f, -0.09f, -0.47f, -0.28f, -0.58f, -0.53f)
                curveToRelative(-0.28f, -0.63f, -1.74f, -4.09f, -2.58f, -10.53f)
                curveToRelative(-0.14f, -1.03f, -0.23f, -2.02f, -0.3f, -3.0f)
                close()
                moveTo(22.56f, 20.44f)
                lineTo(19.37f, 17.24f)
                curveToRelative(0.41f, -1.6f, 0.82f, -3.63f, 1.15f, -6.11f)
                curveToRelative(0.21f, -1.57f, 0.33f, -3.08f, 0.41f, -4.53f)
                curveToRelative(0.41f, 0.07f, 0.83f, -0.2f, 1.0f, -0.6f)
                curveToRelative(0.21f, -0.51f, -0.03f, -1.09f, -0.53f, -1.31f)
                curveToRelative(-0.11f, -0.05f, -1.83f, -0.76f, -4.48f, -1.25f)
                curveToRelative(-0.31f, -1.14f, -0.64f, -1.64f, -0.74f, -1.77f)
                curveToRelative(-0.15f, -0.19f, -0.35f, -0.32f, -0.59f, -0.37f)
                curveToRelative(-0.06f, -0.01f, -1.53f, -0.32f, -3.58f, -0.32f)
                reflectiveCurveToRelative(-3.49f, 0.3f, -3.55f, 0.32f)
                curveToRelative(-0.23f, 0.05f, -0.44f, 0.18f, -0.58f, 0.37f)
                curveToRelative(-0.1f, 0.13f, -0.43f, 0.63f, -0.74f, 1.76f)
                curveToRelative(-0.46f, 0.09f, -0.89f, 0.18f, -1.29f, 0.27f)
                lineToRelative(-2.28f, -2.28f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19.0f, 19.0f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _TrashSlash = it}
