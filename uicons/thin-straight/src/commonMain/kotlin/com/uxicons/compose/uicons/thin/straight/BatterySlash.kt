package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatterySlash: ImageVector? = null

val Icons.Ts.BatterySlash: ImageVector
    get() = _BatterySlash ?: UXIcon(name = "BatterySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.71f, 4f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineTo(23.25f, 23.95f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.46f, -3.46f)
                curveToRelative(0.88f, -0.39f, 1.5f, -1.27f, 1.5f, -2.29f)
                close()
                moveTo(21f, 17.5f)
                curveToRelative(0f, 0.76f, -0.57f, 1.39f, -1.31f, 1.49f)
                lineTo(5.71f, 5f)
                horizontalLineToRelative(13.79f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(15.46f, 19f)
                lineToRelative(1f, 1f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                lineTo(0.46f, 4f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-0.46f)
                verticalLineToRelative(14f)
                lineTo(15.46f, 19f)
                close()
            }
        }.also { _BatterySlash = it}
