package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRight: ImageVector? = null

val Icons.Tc.ArrowUpRight: ImageVector
    get() = _ArrowUpRight ?: UXIcon(name = "ArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.86f, 22.86f)
                lineTo(21.42f, 3.29f)
                curveToRelative(0.43f, 1.38f, 1.14f, 4.73f, -0.25f, 9.1f)
                curveToRelative(-0.08f, 0.27f, 0.06f, 0.54f, 0.33f, 0.63f)
                curveToRelative(0.26f, 0.08f, 0.54f, -0.06f, 0.63f, -0.33f)
                curveToRelative(1.96f, -6.15f, 0.03f, -10.34f, -0.06f, -10.52f)
                curveToRelative(-0.05f, -0.1f, -0.13f, -0.19f, -0.24f, -0.24f)
                curveToRelative(-0.17f, -0.08f, -4.36f, -2.02f, -10.51f, -0.06f)
                curveToRelative(-0.21f, 0.07f, -0.36f, 0.27f, -0.35f, 0.48f)
                curveToRelative(0.01f, 0.41f, 0.39f, 0.56f, 0.65f, 0.48f)
                curveToRelative(4.36f, -1.39f, 7.71f, -0.68f, 9.09f, -0.25f)
                lineTo(1.16f, 22.15f)
                curveToRelative(-0.1f, 0.1f, -0.29f, 0.4f, 0f, 0.71f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                close()
            }
        }.also { _ArrowUpRight = it}
