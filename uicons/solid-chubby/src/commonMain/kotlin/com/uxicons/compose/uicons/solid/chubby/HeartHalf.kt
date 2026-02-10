package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Sc.HeartHalf: ImageVector
    get() = _HeartHalf ?: UXIcon(name = "HeartHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20.98f)
                curveToRelative(-1.4f, 0f, -2.77f, -0.36f, -3.98f, -1.04f)
                curveToRelative(-1.22f, -0.69f, -2.23f, -1.4f, -3.09f, -2.16f)
                curveToRelative(-2.57f, -2.29f, -3.9f, -4.75f, -3.93f, -7.34f)
                curveToRelative(0.13f, -4.37f, 2.9f, -7.42f, 6.74f, -7.44f)
                curveToRelative(1.46f, 0.06f, 2.67f, 0.62f, 3.63f, 1.68f)
                lineToRelative(1.4f, 1.68f)
                curveToRelative(0.15f, 0.18f, 0.23f, 0.41f, 0.23f, 0.64f)
                verticalLineToRelative(12.98f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _HeartHalf = it}
