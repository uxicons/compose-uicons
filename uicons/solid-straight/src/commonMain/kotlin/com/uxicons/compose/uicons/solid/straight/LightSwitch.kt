package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitch: ImageVector? = null

val Icons.Ss.LightSwitch: ImageVector
    get() = _LightSwitch ?: UXIcon(name = "LightSwitch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                close()
                moveTo(15f, 11f)
                lineTo(15f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
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
                lineTo(7f, 20f)
                horizontalLineToRelative(10f)
                lineTo(17f, 4f)
                close()
            }
        }.also { _LightSwitch = it}
