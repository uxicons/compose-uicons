package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBattery: ImageVector? = null

val Icons.Ts.CarBattery: ImageVector
    get() = _CarBattery ?: UXIcon(name = "CarBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                lineTo(3f, 12f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(14.5f)
                lineTo(0f, 22f)
                lineTo(0f, 7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                lineTo(3f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                lineTo(14f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(20f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 3f)
                lineTo(4f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                lineTo(23f, 21f)
                lineTo(23f, 7.5f)
                close()
            }
        }.also { _CarBattery = it}
