package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpMedical: ImageVector? = null

val Icons.Rs.PumpMedical: ImageVector
    get() = _PumpMedical ?: UXIcon(name = "PumpMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.46f, 0.67f)
                curveToRelative(-0.66f, -0.44f, -1.43f, -0.67f, -2.22f, -0.67f)
                horizontalLineToRelative(-7.24f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.86f)
                curveToRelative(-2.98f, 1.21f, -5f, 4.16f, -5f, 7.42f)
                verticalLineToRelative(10.72f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-10.72f)
                curveToRelative(0f, -3.26f, -2.02f, -6.21f, -5f, -7.42f)
                verticalLineToRelative(-3.86f)
                horizontalLineToRelative(4.24f)
                curveToRelative(0.4f, 0f, 0.78f, 0.12f, 1.11f, 0.34f)
                lineToRelative(2.5f, 1.67f)
                lineToRelative(1.11f, -1.66f)
                lineToRelative(-2.5f, -1.67f)
                close()
                moveTo(11f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18f, 13.28f)
                verticalLineToRelative(8.72f)
                lineTo(6f, 22f)
                verticalLineToRelative(-8.72f)
                curveToRelative(0f, -2.22f, 1.25f, -4.25f, 3.15f, -5.28f)
                horizontalLineToRelative(5.7f)
                curveToRelative(1.9f, 1.03f, 3.15f, 3.06f, 3.15f, 5.28f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _PumpMedical = it}
