package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FacebookMessenger: ImageVector? = null

val Icons.Brand.FacebookMessenger: ImageVector
    get() = _FacebookMessenger ?: UXIcon(name = "FacebookMessenger") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12f, 0f)
            curveTo(5.24f, 0f, 0f, 4.95f, 0f, 11.64f)
            curveToRelative(0f, 3.5f, 1.43f, 6.52f, 3.77f, 8.61f)
            curveToRelative(0.2f, 0.17f, 0.31f, 0.42f, 0.32f, 0.68f)
            lineToRelative(0.07f, 2.13f)
            curveToRelative(0.02f, 0.68f, 0.72f, 1.12f, 1.35f, 0.85f)
            lineToRelative(2.38f, -1.05f)
            curveToRelative(0.2f, -0.09f, 0.43f, -0.1f, 0.64f, -0.05f)
            curveTo(9.62f, 23.12f, 10.79f, 23.28f, 12f, 23.28f)
            curveToRelative(6.76f, 0f, 12f, -4.95f, 12f, -11.64f)
            reflectiveCurveTo(18.76f, 0f, 12f, 0f)
            close()
            moveTo(19.21f, 8.96f)
            lineToRelative(-3.52f, 5.59f)
            curveToRelative(-0.56f, 0.89f, -1.76f, 1.11f, -2.6f, 0.48f)
            lineToRelative(-2.8f, -2.1f)
            curveToRelative(-0.26f, -0.19f, -0.61f, -0.19f, -0.87f, 0.0f)
            lineToRelative(-3.79f, 2.87f)
            curveToRelative(-0.51f, 0.38f, -1.17f, -0.22f, -0.83f, -0.76f)
            lineToRelative(3.52f, -5.59f)
            curveToRelative(0.56f, -0.89f, 1.76f, -1.11f, 2.6f, -0.48f)
            lineToRelative(2.8f, 2.1f)
            curveToRelative(0.26f, 0.19f, 0.61f, 0.19f, 0.87f, -0.0f)
            lineToRelative(3.79f, -2.87f)
            curveTo(18.89f, 7.82f, 19.54f, 8.42f, 19.21f, 8.96f)
            close()
        }
    }.also { _FacebookMessenger = it }
