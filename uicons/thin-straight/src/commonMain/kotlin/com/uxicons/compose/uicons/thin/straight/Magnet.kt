package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Magnet: ImageVector? = null

val Icons.Ts.Magnet: ImageVector
    get() = _Magnet ?: UXIcon(name = "Magnet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                verticalLineToRelative(11.76f)
                curveToRelative(0f, 2.68f, -1.98f, 4.97f, -4.51f, 5.21f)
                curveToRelative(-1.43f, 0.14f, -2.8f, -0.32f, -3.85f, -1.28f)
                curveToRelative(-1.04f, -0.95f, -1.64f, -2.29f, -1.64f, -3.7f)
                lineTo(7f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(11.62f)
                curveToRelative(0f, 6.71f, 5.28f, 12.26f, 11.78f, 12.38f)
                curveToRelative(0.08f, 0.0f, 0.15f, 0.0f, 0.23f, 0.0f)
                curveToRelative(3.17f, 0f, 6.14f, -1.22f, 8.41f, -3.44f)
                curveToRelative(2.32f, -2.27f, 3.59f, -5.32f, 3.59f, -8.56f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(23f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                lineTo(18f, 1f)
                horizontalLineToRelative(5f)
                close()
                moveTo(6f, 1f)
                verticalLineToRelative(4f)
                lineTo(1f, 5f)
                lineTo(1f, 1f)
                horizontalLineToRelative(5f)
                close()
                moveTo(19.71f, 19.85f)
                curveToRelative(-2.12f, 2.08f, -4.94f, 3.21f, -7.91f, 3.15f)
                curveToRelative(-5.95f, -0.11f, -10.79f, -5.21f, -10.79f, -11.38f)
                verticalLineToRelative(-5.62f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.69f, 0.72f, 3.31f, 1.97f, 4.44f)
                curveToRelative(1.27f, 1.15f, 2.91f, 1.69f, 4.62f, 1.53f)
                curveToRelative(3.04f, -0.29f, 5.41f, -3.02f, 5.41f, -6.21f)
                verticalLineToRelative(-5.76f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0f, 2.98f, -1.17f, 5.76f, -3.29f, 7.85f)
                close()
            }
        }.also { _Magnet = it}
