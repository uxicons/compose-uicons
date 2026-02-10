package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitch: ImageVector? = null

val Icons.Bs.LightSwitch: ImageVector
    get() = _LightSwitch ?: UXIcon(name = "LightSwitch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 0f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineTo(19f, 21f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(10f)
                lineTo(17f, 5f)
                lineTo(7f, 5f)
                verticalLineToRelative(14f)
                close()
                moveTo(10f, 16f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(14f, 8f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _LightSwitch = it}
