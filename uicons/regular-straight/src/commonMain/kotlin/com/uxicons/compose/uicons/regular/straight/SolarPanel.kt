package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarPanel: ImageVector? = null

val Icons.Rs.SolarPanel: ImageVector
    get() = _SolarPanel ?: UXIcon(name = "SolarPanel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 18f)
                horizontalLineToRelative(10.96f)
                lineToRelative(-2.04f, -15.39f)
                curveToRelative(-0.2f, -1.49f, -1.48f, -2.6f, -2.97f, -2.6f)
                lineTo(5.05f, -0f)
                curveToRelative(-1.5f, 0f, -2.78f, 1.12f, -2.97f, 2.61f)
                lineTo(0.04f, 18f)
                horizontalLineToRelative(10.96f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                close()
                moveTo(14.22f, 8f)
                horizontalLineToRelative(-4.43f)
                lineToRelative(0.2f, -6f)
                horizontalLineToRelative(4.03f)
                lineToRelative(0.2f, 6f)
                close()
                moveTo(14.28f, 10f)
                lineToRelative(0.2f, 6f)
                horizontalLineToRelative(-4.96f)
                lineToRelative(0.2f, -6f)
                horizontalLineToRelative(4.57f)
                close()
                moveTo(16.48f, 16f)
                lineToRelative(-0.2f, -6f)
                horizontalLineToRelative(4.6f)
                lineToRelative(0.79f, 6f)
                horizontalLineToRelative(-5.2f)
                close()
                moveTo(19.94f, 2.87f)
                lineToRelative(0.68f, 5.13f)
                horizontalLineToRelative(-4.4f)
                lineToRelative(-0.2f, -6f)
                horizontalLineToRelative(2.93f)
                curveToRelative(0.5f, 0f, 0.93f, 0.37f, 0.99f, 0.87f)
                close()
                moveTo(5.05f, 2f)
                horizontalLineToRelative(2.93f)
                lineToRelative(-0.2f, 6f)
                lineTo(3.38f, 8f)
                lineToRelative(0.68f, -5.13f)
                curveToRelative(0.07f, -0.5f, 0.49f, -0.87f, 0.99f, -0.87f)
                close()
                moveTo(3.12f, 10f)
                horizontalLineToRelative(4.6f)
                lineToRelative(-0.2f, 6f)
                lineTo(2.32f, 16f)
                lineToRelative(0.79f, -6f)
                close()
            }
        }.also { _SolarPanel = it}
