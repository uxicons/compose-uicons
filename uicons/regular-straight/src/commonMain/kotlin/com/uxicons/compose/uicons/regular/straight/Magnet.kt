package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Magnet: ImageVector? = null

val Icons.Rs.Magnet: ImageVector
    get() = _Magnet ?: UXIcon(name = "Magnet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0f)
                verticalLineToRelative(11.79f)
                curveToRelative(0f, 2.16f, -1.58f, 4.0f, -3.6f, 4.2f)
                curveToRelative(-1.15f, 0.11f, -2.24f, -0.25f, -3.09f, -1.02f)
                curveToRelative(-0.83f, -0.76f, -1.31f, -1.84f, -1.31f, -2.96f)
                lineTo(8f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(11.64f)
                curveToRelative(0f, 6.7f, 5.28f, 12.24f, 11.78f, 12.36f)
                curveToRelative(0.08f, 0f, 0.15f, 0.0f, 0.23f, 0.0f)
                curveToRelative(3.17f, 0f, 6.14f, -1.22f, 8.4f, -3.44f)
                curveToRelative(2.32f, -2.27f, 3.59f, -5.32f, 3.59f, -8.56f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(22f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(6f, 2f)
                verticalLineToRelative(3f)
                lineTo(2f, 5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(19.01f, 19.14f)
                curveToRelative(-1.93f, 1.9f, -4.47f, 2.93f, -7.19f, 2.86f)
                curveToRelative(-5.41f, -0.1f, -9.81f, -4.75f, -9.81f, -10.36f)
                verticalLineToRelative(-4.64f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.69f, 0.72f, 3.31f, 1.97f, 4.44f)
                curveToRelative(1.25f, 1.13f, 2.93f, 1.69f, 4.62f, 1.53f)
                curveToRelative(3.04f, -0.29f, 5.41f, -3.01f, 5.41f, -6.19f)
                verticalLineToRelative(-4.79f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5.0f)
                curveToRelative(0f, 2.71f, -1.06f, 5.24f, -2.99f, 7.14f)
                close()
            }
        }.also { _Magnet = it}
