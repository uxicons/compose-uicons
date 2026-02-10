package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Tr.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 8.35f)
                lineToRelative(-13.59f, 13.62f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.94f, -0.0f, -1.82f, -0.37f, -2.48f, -1.03f)
                lineTo(0.15f, 16.86f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.0f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                lineToRelative(5.16f, 5.11f)
                curveToRelative(0.47f, 0.48f, 1.1f, 0.74f, 1.77f, 0.74f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.67f, 0f, 1.29f, -0.26f, 1.77f, -0.73f)
                lineToRelative(13.59f, -13.62f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(5.73f, 12.06f)
                curveToRelative(0.6f, 0.6f, 1.39f, 0.94f, 2.24f, 0.94f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.85f, 0f, 1.64f, -0.33f, 2.24f, -0.93f)
                lineTo(20.36f, 1.85f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.19f, -0.71f, 0.0f)
                lineToRelative(-10.13f, 10.22f)
                curveToRelative(-0.41f, 0.41f, -0.95f, 0.64f, -1.53f, 0.64f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.58f, 0f, -1.13f, -0.23f, -1.53f, -0.64f)
                lineTo(1.86f, 6.65f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                lineToRelative(4.59f, 4.71f)
                close()
            }
        }.also { _CheckDouble = it}
