package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitchOn: ImageVector? = null

val Icons.Ss.LightSwitchOn: ImageVector
    get() = _LightSwitchOn ?: UXIcon(name = "LightSwitchOn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11f)
                lineTo(9f, 6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(15f, 13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22f, 3f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17f, 4f)
                lineTo(7f, 4f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(17f, 4f)
                close()
            }
        }.also { _LightSwitchOn = it}
