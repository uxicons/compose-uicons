package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusTicket: ImageVector? = null

val Icons.Ss.BusTicket: ImageVector
    get() = _BusTicket ?: UXIcon(name = "BusTicket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.79f)
                curveToRelative(0.04f, 0.02f, 0.07f, 0.06f, 0.09f, 0.1f)
                lineToRelative(0.85f, 1.9f)
                horizontalLineToRelative(-5.73f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(6f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 12.78f)
                curveToRelative(0f, -0.4f, -0.08f, -0.79f, -0.24f, -1.15f)
                lineToRelative(-1.04f, -2.35f)
                curveToRelative(-0.29f, -0.66f, -0.91f, -1.14f, -1.61f, -1.27f)
                lineToRelative(-5.1f, -0.02f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.22f)
                close()
            }
        }.also { _BusTicket = it}
