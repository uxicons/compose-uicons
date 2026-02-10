package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerAd: ImageVector? = null

val Icons.Ts.ComputerAd: ImageVector
    get() = _ComputerAd ?: UXIcon(name = "ComputerAd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(2.5f, 2f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 15f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-22f)
                close()
                moveTo(18f, 9.48f)
                verticalLineToRelative(-2.98f)
                curveToRelative(0f, -1.39f, -1.12f, -2.51f, -2.5f, -2.51f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.13f, 2.5f, -2.51f)
                close()
                moveTo(14f, 4.99f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.68f, 1.5f, 1.51f)
                verticalLineToRelative(2.98f)
                curveToRelative(0f, 0.83f, -0.67f, 1.51f, -1.5f, 1.51f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(7.83f, 10f)
                horizontalLineToRelative(2.36f)
                lineToRelative(0.41f, 2.0f)
                lineToRelative(1.0f, 0.01f)
                lineToRelative(-1.39f, -6.88f)
                curveToRelative(-0.13f, -0.64f, -0.59f, -1.11f, -1.21f, -1.12f)
                curveToRelative(-0.6f, 0f, -1.08f, 0.49f, -1.2f, 1.09f)
                lineToRelative(-1.39f, 6.89f)
                lineToRelative(1.01f, 0.01f)
                close()
                moveTo(8.78f, 5.28f)
                curveToRelative(0.03f, -0.13f, 0.11f, -0.27f, 0.22f, -0.28f)
                curveToRelative(0.11f, 0.02f, 0.17f, 0.09f, 0.23f, 0.32f)
                lineToRelative(0.76f, 3.68f)
                horizontalLineToRelative(-1.95f)
                close()
            }
        }.also { _ComputerAd = it}
