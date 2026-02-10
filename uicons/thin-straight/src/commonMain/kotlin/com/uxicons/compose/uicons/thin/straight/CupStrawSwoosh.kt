package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStrawSwoosh: ImageVector? = null

val Icons.Ts.CupStrawSwoosh: ImageVector
    get() = _CupStrawSwoosh ?: UXIcon(name = "CupStrawSwoosh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 5f)
                horizontalLineToRelative(-9.38f)
                lineToRelative(0.5f, -4f)
                horizontalLineToRelative(5.88f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(-0.63f, 5f)
                lineTo(1f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.56f)
                lineToRelative(1.86f, 15.79f)
                curveToRelative(0.15f, 1.26f, 1.22f, 2.21f, 2.48f, 2.21f)
                horizontalLineToRelative(10.19f)
                curveToRelative(1.27f, 0f, 2.33f, -0.95f, 2.48f, -2.21f)
                lineToRelative(1.86f, -15.79f)
                horizontalLineToRelative(1.56f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18.59f, 21.68f)
                curveToRelative(-0.09f, 0.76f, -0.73f, 1.32f, -1.49f, 1.32f)
                lineTo(6.9f, 23f)
                curveToRelative(-0.76f, 0f, -1.4f, -0.57f, -1.49f, -1.32f)
                lineToRelative(-0.71f, -6.05f)
                curveToRelative(0.79f, -0.53f, 2.62f, -1.62f, 4.1f, -1.62f)
                curveToRelative(0.95f, 0f, 1.94f, 0.46f, 2.99f, 0.95f)
                curveToRelative(1.1f, 0.52f, 2.23f, 1.05f, 3.41f, 1.05f)
                curveToRelative(1.52f, 0f, 3.23f, -0.9f, 4.24f, -1.52f)
                lineToRelative(-0.85f, 7.2f)
                close()
                moveTo(19.59f, 13.18f)
                curveToRelative(-0.5f, 0.36f, -2.67f, 1.82f, -4.39f, 1.82f)
                curveToRelative(-0.95f, 0f, -1.94f, -0.46f, -2.99f, -0.95f)
                curveToRelative(-1.1f, -0.52f, -2.23f, -1.05f, -3.41f, -1.05f)
                curveToRelative(-1.52f, 0f, -3.23f, 0.9f, -4.23f, 1.52f)
                lineToRelative(-1.01f, -8.52f)
                horizontalLineToRelative(16.88f)
                lineToRelative(-0.85f, 7.18f)
                close()
            }
        }.also { _CupStrawSwoosh = it}
