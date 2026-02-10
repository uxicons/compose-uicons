package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoothCurtain: ImageVector? = null

val Icons.Ts.BoothCurtain: ImageVector
    get() = _BoothCurtain ?: UXIcon(name = "BoothCurtain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(12f)
                lineTo(12f, 6.8f)
                curveToRelative(2.01f, 5.75f, 6.52f, 8.11f, 8.46f, 8.87f)
                curveToRelative(-1.22f, 1.06f, -3.46f, 3.59f, -3.46f, 7.83f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(7f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 1f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(11f)
                lineTo(1f, 12f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                lineTo(1f, 23f)
                close()
                moveTo(12.02f, 1f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.2f, 6.25f, 4.13f, 9.68f, 6.98f, 11f)
                verticalLineToRelative(-1.11f)
                curveToRelative(-2.56f, -1.29f, -5.79f, -4.47f, -5.98f, -9.89f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.17f, 3.76f, 2.1f, 6.35f, 3.97f, 7.54f)
                verticalLineToRelative(-1.18f)
                curveToRelative(-1.46f, -1.1f, -2.83f, -3.37f, -2.97f, -6.37f)
                horizontalLineToRelative(3.47f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-1.44f)
                curveToRelative(-0.86f, -0.23f, -9.29f, -2.85f, -9.54f, -14f)
                close()
                moveTo(18.01f, 23f)
                curveToRelative(0.21f, -4.42f, 3.1f, -6.63f, 3.66f, -7.01f)
                lineToRelative(1.33f, 0.01f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.99f)
                close()
                moveTo(3f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                lineTo(3f, 15f)
                verticalLineToRelative(3f)
                close()
                moveTo(4f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _BoothCurtain = it}
