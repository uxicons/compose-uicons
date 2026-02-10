package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandDryer: ImageVector? = null

val Icons.Ts.HandDryer: ImageVector
    get() = _HandDryer ?: UXIcon(name = "HandDryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                close()
                moveTo(16f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                close()
                moveTo(9f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(18f)
                close()
                moveTo(21.5f, 14f)
                horizontalLineToRelative(-10.86f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.82f, -2.53f, 1.93f)
                lineToRelative(-3.74f, -4.11f)
                curveToRelative(-0.89f, -1.02f, -2.57f, -1.09f, -3.55f, -0.17f)
                curveToRelative(-1.01f, 0.92f, -1.09f, 2.5f, -0.18f, 3.53f)
                lineToRelative(7.86f, 8.82f)
                horizontalLineToRelative(1.34f)
                lineToRelative(-8.45f, -9.48f)
                curveToRelative(-0.55f, -0.61f, -0.5f, -1.57f, 0.11f, -2.12f)
                curveToRelative(0.59f, -0.56f, 1.6f, -0.51f, 2.13f, 0.1f)
                lineToRelative(4.51f, 4.96f)
                curveToRelative(0.31f, 0.94f, 1.12f, 1.66f, 2.14f, 1.81f)
                lineToRelative(5.66f, 0.74f)
                lineToRelative(0.13f, -0.99f)
                lineToRelative(-5.65f, -0.74f)
                curveToRelative(-0.8f, -0.12f, -1.41f, -0.81f, -1.41f, -1.62f)
                curveToRelative(0f, -0.91f, 0.74f, -1.64f, 1.64f, -1.64f)
                horizontalLineToRelative(10.86f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _HandDryer = it}
