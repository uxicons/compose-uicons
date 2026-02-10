package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarPanel: ImageVector? = null

val Icons.Ss.SolarPanel: ImageVector
    get() = _SolarPanel ?: UXIcon(name = "SolarPanel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2.17f)
                lineToRelative(0.27f, -8f)
                horizontalLineToRelative(5.8f)
                lineToRelative(0.27f, 8f)
                horizontalLineToRelative(-2.17f)
                verticalLineToRelative(4f)
                close()
                moveTo(14.57f, 0f)
                horizontalLineToRelative(-5.13f)
                lineToRelative(-0.27f, 8f)
                horizontalLineToRelative(5.67f)
                lineToRelative(-0.27f, -8f)
                close()
                moveTo(22.64f, 8f)
                lineToRelative(-0.71f, -5.39f)
                curveToRelative(-0.2f, -1.49f, -1.48f, -2.6f, -2.97f, -2.6f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(0.27f, 8f)
                horizontalLineToRelative(5.8f)
                close()
                moveTo(7.43f, 0f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-1.5f, 0f, -2.78f, 1.12f, -2.97f, 2.61f)
                lineToRelative(-0.71f, 5.39f)
                horizontalLineToRelative(5.8f)
                lineToRelative(0.27f, -8f)
                close()
                moveTo(17.17f, 18f)
                horizontalLineToRelative(6.79f)
                lineToRelative(-1.06f, -8f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(0.27f, 8f)
                close()
                moveTo(7.1f, 10f)
                lineTo(1.1f, 10f)
                lineTo(0.04f, 18f)
                horizontalLineToRelative(6.79f)
                lineToRelative(0.27f, -8f)
                close()
            }
        }.also { _SolarPanel = it}
