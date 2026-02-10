package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Magnet: ImageVector? = null

val Icons.Rr.Magnet: ImageVector
    get() = _Magnet ?: UXIcon(name = "Magnet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8.79f)
                curveToRelative(0f, 2.16f, -1.58f, 4.0f, -3.6f, 4.2f)
                curveToRelative(-1.15f, 0.11f, -2.24f, -0.25f, -3.09f, -1.02f)
                curveToRelative(-0.83f, -0.76f, -1.31f, -1.84f, -1.31f, -2.96f)
                lineTo(8f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(8.64f)
                curveToRelative(0f, 6.7f, 5.5f, 12.37f, 12.0f, 12.37f)
                curveToRelative(3.17f, 0f, 6.14f, -1.22f, 8.4f, -3.44f)
                curveToRelative(2.32f, -2.27f, 3.59f, -5.32f, 3.59f, -8.56f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                lineTo(2f, 5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 12.0f)
                curveToRelative(0f, 2.71f, -1.06f, 5.24f, -2.99f, 7.14f)
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
                close()
                moveTo(22f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Magnet = it}
