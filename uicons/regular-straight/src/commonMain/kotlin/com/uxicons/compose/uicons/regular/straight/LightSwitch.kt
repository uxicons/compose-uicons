package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitch: ImageVector? = null

val Icons.Rs.LightSwitch: ImageVector
    get() = _LightSwitch ?: UXIcon(name = "LightSwitch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(20f, 22f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(10f)
                lineTo(17f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 20f)
                close()
                moveTo(9f, 18f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(15f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 6f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _LightSwitch = it}
