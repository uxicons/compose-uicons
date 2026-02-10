package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SafeBattery: ImageVector? = null

val Icons.Ts.SafeBattery: ImageVector
    get() = _SafeBattery ?: UXIcon(name = "SafeBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-19.5f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(19.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-18.5f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(18.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13.25f, 8f)
                curveToRelative(-0.96f, 0f, -1.76f, 0.41f, -2.25f, 1.09f)
                curveToRelative(-0.48f, -0.68f, -1.29f, -1.09f, -2.25f, -1.09f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.31f, -2.75f, 2.93f)
                curveToRelative(0.13f, 3.02f, 4.59f, 5.96f, 5f, 6.28f)
                curveToRelative(0.4f, -0.31f, 4.88f, -3.26f, 5f, -6.28f)
                curveToRelative(0f, -1.62f, -1.23f, -2.93f, -2.75f, -2.93f)
                close()
                moveTo(11f, 15.98f)
                curveToRelative(-1.34f, -0.99f, -4f, -3.32f, -4f, -5.05f)
                curveToRelative(0f, -1.06f, 0.79f, -1.93f, 1.75f, -1.93f)
                curveToRelative(1.03f, 0f, 1.75f, 0.7f, 1.75f, 1.71f)
                verticalLineToRelative(0.66f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.66f)
                curveToRelative(0f, -1.01f, 0.72f, -1.71f, 1.75f, -1.71f)
                curveToRelative(0.96f, 0f, 1.75f, 0.87f, 1.75f, 1.93f)
                curveToRelative(0f, 1.74f, -2.66f, 4.07f, -4f, 5.05f)
                close()
            }
        }.also { _SafeBattery = it}
