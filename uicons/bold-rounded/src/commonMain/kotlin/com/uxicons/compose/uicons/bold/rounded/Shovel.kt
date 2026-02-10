package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shovel: ImageVector? = null

val Icons.Br.Shovel: ImageVector
    get() = _Shovel ?: UXIcon(name = "Shovel") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 5.44f)
            lineTo(18.56f, 0.44f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(1.44f, 1.44f)
            lineToRelative(-8.13f, 8.13f)
            lineToRelative(-1.37f, -1.37f)
            curveToRelative(-1.0f, -1.0f, -2.62f, -1.0f, -3.62f, 0f)
            lineToRelative(-2.27f, 2.27f)
            curveToRelative(-1.6f, 1.6f, -2.49f, 3.74f, -2.49f, 6.01f)
            verticalLineToRelative(1.46f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(1.46f)
            curveToRelative(2.27f, 0f, 4.41f, -0.88f, 6.01f, -2.49f)
            lineToRelative(2.27f, -2.27f)
            curveToRelative(1.0f, -1.0f, 1.0f, -2.62f, 0f, -3.62f)
            lineToRelative(-1.37f, -1.37f)
            lineToRelative(8.13f, -8.13f)
            lineToRelative(1.44f, 1.44f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            close()
            moveTo(8.85f, 19.39f)
            curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
            horizontalLineToRelative(-1.46f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-1.46f)
            curveToRelative(0f, -1.47f, 0.57f, -2.85f, 1.61f, -3.89f)
            lineToRelative(1.96f, -1.96f)
            lineToRelative(4.24f, 4.24f)
            lineToRelative(-1.96f, 1.96f)
            close()
        }
    }.also { _Shovel = it }
