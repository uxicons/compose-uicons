package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmergencyCall: ImageVector? = null

val Icons.Ss.EmergencyCall: ImageVector
    get() = _EmergencyCall ?: UXIcon(name = "EmergencyCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                close()
                moveTo(21f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(17f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(23.88f, 19.11f)
                lineToRelative(-3.17f, 3.17f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                curveToRelative(0f, -1.61f, 0.61f, -3.1f, 1.72f, -4.21f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.27f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                lineToRelative(4.13f, -4.13f)
                lineToRelative(6.26f, 6.26f)
                close()
            }
        }.also { _EmergencyCall = it}
