package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Sc.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 22.56f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(0.93f, 0.93f)
                curveToRelative(1.39f, -0.56f, 4.15f, -1.44f, 7.6f, -1.37f)
                curveToRelative(5.18f, 0f, 8.25f, 1.76f, 8.38f, 1.83f)
                curveToRelative(0.24f, 0.14f, 0.42f, 0.38f, 0.47f, 0.66f)
                curveToRelative(0.53f, 2.6f, 2.09f, 12.77f, -0.04f, 15.04f)
                curveToRelative(-0.04f, 0.04f, -0.09f, 0.08f, -0.13f, 0.12f)
                lineToRelative(1.78f, 1.78f)
                curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
                close()
                moveTo(3.09f, 18.53f)
                curveToRelative(2.35f, 2.49f, 7.99f, 4.23f, 8.62f, 4.42f)
                curveToRelative(0.19f, 0.06f, 0.39f, 0.06f, 0.58f, 0f)
                curveToRelative(0.35f, -0.1f, 2.19f, -0.68f, 4.18f, -1.58f)
                lineToRelative(-14.03f, -14.03f)
                curveToRelative(-0.52f, 4.04f, -0.85f, 9.58f, 0.65f, 11.18f)
                close()
            }
        }.also { _ShieldSlash = it}
