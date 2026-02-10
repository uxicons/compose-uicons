package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Auction: ImageVector? = null

val Icons.Br.Auction: ImageVector
    get() = _Auction ?: UXIcon(name = "Auction") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.15f, 14.88f)
            lineToRelative(-0.15f, 0.15f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(7f, -7f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(-1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-0.27f, 0.27f)
            lineToRelative(-5.46f, -5.45f)
            lineToRelative(0.29f, -0.29f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(-1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-7f, 7f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(0.13f, -0.13f)
            lineToRelative(1.68f, 1.68f)
            lineTo(0.45f, 19.93f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
            curveToRelative(0.29f, 0.3f, 0.68f, 0.45f, 1.07f, 0.45f)
            curveToRelative(0.38f, 0f, 0.76f, -0.14f, 1.05f, -0.43f)
            lineToRelative(8.94f, -8.84f)
            lineToRelative(1.66f, 1.66f)
            close()
            moveTo(12.15f, 4.97f)
            lineToRelative(5.46f, 5.45f)
            lineToRelative(-2.33f, 2.33f)
            lineToRelative(-5.46f, -5.45f)
            lineToRelative(2.33f, -2.33f)
            close()
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-12f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -0.67f, 0.44f, -1.23f, 1.04f, -1.42f)
            curveToRelative(0.2f, -1.18f, 1.22f, -2.08f, 2.46f, -2.08f)
            horizontalLineToRelative(8f)
            curveToRelative(1.24f, 0f, 2.26f, 0.9f, 2.46f, 2.08f)
            curveToRelative(0.6f, 0.19f, 1.04f, 0.75f, 1.04f, 1.42f)
            close()
        }
    }.also { _Auction = it }
