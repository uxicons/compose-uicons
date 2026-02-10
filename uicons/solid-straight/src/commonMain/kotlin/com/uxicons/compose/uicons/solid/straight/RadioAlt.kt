package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioAlt: ImageVector? = null

val Icons.Ss.RadioAlt: ImageVector
    get() = _RadioAlt ?: UXIcon(name = "RadioAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-11.96f)
                lineTo(21.31f, 1.95f)
                lineToRelative(-0.63f, -1.9f)
                lineTo(2.51f, 6.05f)
                curveToRelative(-1.42f, 0.23f, -2.51f, 1.46f, -2.51f, 2.95f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                lineTo(0f, 24f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(24f)
                close()
                moveTo(10f, 19f)
                lineTo(3f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 15f)
                lineTo(3f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 18f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _RadioAlt = it}
