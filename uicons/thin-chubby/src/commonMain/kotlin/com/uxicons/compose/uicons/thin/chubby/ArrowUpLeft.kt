package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeft: ImageVector? = null

val Icons.Tc.ArrowUpLeft: ImageVector
    get() = _ArrowUpLeft ?: UXIcon(name = "ArrowUpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 22.14f)
                lineTo(3.29f, 2.58f)
                curveToRelative(1.38f, -0.43f, 4.73f, -1.14f, 9.1f, 0.25f)
                curveToRelative(0.27f, 0.08f, 0.54f, -0.06f, 0.63f, -0.33f)
                curveToRelative(0.08f, -0.26f, -0.06f, -0.54f, -0.33f, -0.63f)
                curveToRelative(-6.15f, -1.96f, -10.34f, -0.03f, -10.52f, 0.06f)
                curveToRelative(-0.1f, 0.05f, -0.19f, 0.13f, -0.24f, 0.24f)
                curveToRelative(-0.08f, 0.17f, -2.02f, 4.36f, -0.06f, 10.51f)
                curveToRelative(0.07f, 0.21f, 0.27f, 0.36f, 0.48f, 0.35f)
                curveToRelative(0.41f, -0.01f, 0.56f, -0.39f, 0.48f, -0.65f)
                curveToRelative(-1.39f, -4.36f, -0.68f, -7.71f, -0.25f, -9.09f)
                lineTo(22.15f, 22.84f)
                curveToRelative(0.1f, 0.1f, 0.4f, 0.29f, 0.71f, 0f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0f, -0.71f)
                close()
            }
        }.also { _ArrowUpLeft = it}
