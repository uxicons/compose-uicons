package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonFalling: ImageVector? = null

val Icons.Bs.PersonFalling: ImageVector
    get() = _PersonFalling ?: UXIcon(name = "PersonFalling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.99f, 16.87f)
                lineToRelative(-1.98f, 2.26f)
                lineToRelative(-3.58f, -3.13f)
                horizontalLineToRelative(-3.85f)
                lineToRelative(3.54f, 8f)
                horizontalLineToRelative(-3.28f)
                lineTo(7.62f, 9.93f)
                lineToRelative(-4.27f, 6.4f)
                lineToRelative(-2.5f, -1.66f)
                lineToRelative(4.34f, -6.51f)
                curveToRelative(0.59f, -0.89f, 1.43f, -1.58f, 2.41f, -2.0f)
                lineToRelative(5.54f, -2.37f)
                lineTo(15.91f, 0.1f)
                lineToRelative(2.4f, 1.8f)
                lineToRelative(-3.24f, 4.32f)
                lineToRelative(-3.17f, 1.36f)
                lineToRelative(2.4f, 5.42f)
                horizontalLineToRelative(4.27f)
                lineToRelative(4.42f, 3.87f)
                close()
                moveTo(6.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(7.88f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _PersonFalling = it}
