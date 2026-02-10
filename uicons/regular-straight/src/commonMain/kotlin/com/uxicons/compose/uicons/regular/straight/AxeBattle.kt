package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AxeBattle: ImageVector? = null

val Icons.Rs.AxeBattle: ImageVector
    get() = _AxeBattle ?: UXIcon(name = "AxeBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.39f, 1.01f)
                lineToRelative(-0.7f, -0.69f)
                lineToRelative(-0.7f, 0.69f)
                curveToRelative(-1.71f, 1.68f, -3.81f, 2.7f, -5.99f, 2.94f)
                verticalLineToRelative(-1.94f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.94f)
                curveToRelative(-2.18f, -0.24f, -4.28f, -1.26f, -5.99f, -2.94f)
                lineToRelative(-0.7f, -0.69f)
                lineToRelative(-0.7f, 0.69f)
                curveTo(1.38f, 3.19f, 0f, 6.63f, 0f, 10.0f)
                curveToRelative(0f, 3.3f, 1.35f, 6.59f, 3.61f, 8.8f)
                lineToRelative(0.7f, 0.69f)
                lineToRelative(0.7f, -0.69f)
                curveToRelative(1.61f, -1.58f, 3.71f, -2.54f, 5.99f, -2.76f)
                verticalLineToRelative(7.95f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.95f)
                curveToRelative(2.28f, 0.22f, 4.38f, 1.18f, 5.99f, 2.76f)
                lineToRelative(0.7f, 0.69f)
                lineToRelative(0.7f, -0.69f)
                curveToRelative(2.26f, -2.21f, 3.61f, -5.5f, 3.61f, -8.8f)
                curveToRelative(0f, -3.37f, -1.38f, -6.82f, -3.61f, -9.0f)
                close()
                moveTo(4.38f, 16.69f)
                curveToRelative(-1.5f, -1.8f, -2.38f, -4.24f, -2.38f, -6.68f)
                curveToRelative(0f, -2.47f, 0.91f, -5.07f, 2.38f, -6.87f)
                curveToRelative(1.94f, 1.63f, 4.24f, 2.61f, 6.62f, 2.82f)
                verticalLineToRelative(8.09f)
                curveToRelative(-2.46f, 0.2f, -4.76f, 1.11f, -6.62f, 2.65f)
                close()
                moveTo(19.62f, 16.69f)
                curveToRelative(-1.87f, -1.53f, -4.17f, -2.45f, -6.62f, -2.65f)
                lineTo(13.0f, 5.96f)
                curveToRelative(2.38f, -0.21f, 4.68f, -1.19f, 6.62f, -2.82f)
                curveToRelative(1.46f, 1.81f, 2.38f, 4.4f, 2.38f, 6.87f)
                curveToRelative(0f, 2.44f, -0.88f, 4.88f, -2.38f, 6.68f)
                close()
            }
        }.also { _AxeBattle = it}
