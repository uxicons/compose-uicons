package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SafeBattery: ImageVector? = null

val Icons.Rs.SafeBattery: ImageVector
    get() = _SafeBattery ?: UXIcon(name = "SafeBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 7.5f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.72f)
                curveToRelative(-0.52f, -0.45f, -1.22f, -0.72f, -2f, -0.72f)
                curveToRelative(-1.65f, 0f, -3f, 1.42f, -3f, 3.16f)
                curveToRelative(0.23f, 3.13f, 3.8f, 5.36f, 5f, 6.26f)
                curveToRelative(1.19f, -0.89f, 4.78f, -3.13f, 5f, -6.26f)
                curveToRelative(0f, -1.74f, -1.35f, -3.16f, -3f, -3.16f)
                close()
                moveTo(11f, 14.46f)
                curveToRelative(-1.4f, -1.09f, -3f, -2.75f, -3f, -3.8f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                curveToRelative(0.46f, 0f, 1f, 0.25f, 1f, 0.96f)
                verticalLineToRelative(0.54f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.54f)
                curveToRelative(0f, -0.71f, 0.54f, -0.96f, 1f, -0.96f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                curveToRelative(0f, 1.05f, -1.6f, 2.71f, -3f, 3.8f)
                close()
                moveTo(22f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-19f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(19f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(20f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-17f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(17f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SafeBattery = it}
