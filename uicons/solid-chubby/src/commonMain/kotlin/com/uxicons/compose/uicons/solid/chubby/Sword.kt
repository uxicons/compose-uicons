package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Sc.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 2.02f)
                curveToRelative(-0.04f, -0.48f, -0.43f, -0.86f, -0.91f, -0.91f)
                curveToRelative(-4.53f, -0.4f, -8.91f, 1.5f, -11.69f, 5.08f)
                lineToRelative(-5.44f, 6.84f)
                curveToRelative(-0.53f, -0.2f, -1.07f, -0.36f, -1.63f, -0.47f)
                curveToRelative(-0.81f, -0.16f, -1.6f, 0.36f, -1.77f, 1.17f)
                curveToRelative(-0.17f, 0.81f, 0.36f, 1.6f, 1.17f, 1.77f)
                curveToRelative(0.94f, 0.19f, 1.82f, 0.56f, 2.59f, 1.06f)
                lineToRelative(-1.14f, 1.13f)
                lineToRelative(-0.58f, -0.58f)
                curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
                curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.01f, 2.12f)
                lineToRelative(3.27f, 3.25f)
                curveToRelative(0.29f, 0.29f, 1.27f, 0.81f, 2.12f, -0.01f)
                curveToRelative(0.6f, -0.57f, 0.58f, -1.54f, -0.01f, -2.12f)
                lineToRelative(-0.57f, -0.56f)
                lineToRelative(1.14f, -1.13f)
                curveToRelative(0.51f, 0.77f, 0.87f, 1.65f, 1.08f, 2.59f)
                curveToRelative(0.3f, 1.37f, 1.67f, 1.19f, 1.77f, 1.17f)
                curveToRelative(0.81f, -0.17f, 1.33f, -0.96f, 1.17f, -1.77f)
                curveToRelative(-0.12f, -0.56f, -0.27f, -1.1f, -0.47f, -1.62f)
                lineToRelative(6.87f, -5.4f)
                curveToRelative(3.62f, -2.77f, 5.53f, -7.11f, 5.13f, -11.63f)
                close()
            }
        }.also { _Sword = it}
