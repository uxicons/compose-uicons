package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRight: ImageVector? = null

val Icons.Sc.ArrowUpRight: ImageVector
    get() = _ArrowUpRight ?: UXIcon(name = "ArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.56f, 22.56f)
                lineTo(19.9f, 6.23f)
                curveToRelative(0.2f, 1.47f, 0.2f, 3.57f, -0.61f, 6.12f)
                curveToRelative(-0.25f, 0.79f, 0.18f, 1.63f, 0.97f, 1.89f)
                curveToRelative(0.79f, 0.25f, 1.63f, -0.18f, 1.89f, -0.97f)
                curveToRelative(1.95f, -6.13f, -0.02f, -10.4f, -0.1f, -10.58f)
                curveToRelative(-0.15f, -0.31f, -0.4f, -0.56f, -0.71f, -0.71f)
                curveToRelative(-0.18f, -0.09f, -4.45f, -2.06f, -10.58f, -0.1f)
                curveToRelative(-0.64f, 0.2f, -1.06f, 0.79f, -1.04f, 1.43f)
                curveToRelative(0.02f, 1.22f, 1.17f, 1.68f, 1.96f, 1.43f)
                curveToRelative(2.55f, -0.81f, 4.65f, -0.81f, 6.12f, -0.61f)
                lineTo(1.44f, 20.44f)
                curveToRelative(-0.29f, 0.29f, -0.83f, 1.19f, 0f, 2.12f)
                curveToRelative(0.52f, 0.58f, 1.54f, 0.59f, 2.12f, 0f)
                close()
            }
        }.also { _ArrowUpRight = it}
