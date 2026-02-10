package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedPulse: ImageVector? = null

val Icons.Ss.BedPulse: ImageVector
    get() = _BedPulse ?: UXIcon(name = "BedPulse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(-2.45f, 3.68f)
                lineToRelative(-3.17f, -5.75f)
                lineToRelative(-1.38f, 2.07f)
                horizontalLineToRelative(-5.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.96f)
                lineTo(14.58f, 0.07f)
                lineToRelative(3.17f, 5.75f)
                lineToRelative(1.22f, -1.83f)
                horizontalLineToRelative(5.04f)
                close()
                moveTo(5.5f, 14f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(2f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 24f)
                lineTo(2f, 24f)
                verticalLineToRelative(-3f)
                lineTo(22f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                lineTo(2f, 16f)
                lineTo(2f, 4f)
                close()
                moveTo(21.1f, 8.01f)
                lineToRelative(-2.66f, 3.99f)
                horizontalLineToRelative(-1.86f)
                lineToRelative(-2.2f, -4f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.62f, -1.29f, -2.94f, -2.9f, -2.99f)
                close()
            }
        }.also { _BedPulse = it}
