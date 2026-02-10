package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpMedical: ImageVector? = null

val Icons.Ss.PumpMedical: ImageVector
    get() = _PumpMedical ?: UXIcon(name = "PumpMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.24f)
                curveToRelative(0.79f, 0f, 1.56f, 0.23f, 2.22f, 0.67f)
                lineToRelative(2.5f, 1.67f)
                lineToRelative(-1.11f, 1.66f)
                lineToRelative(-2.5f, -1.67f)
                curveToRelative(-0.33f, -0.22f, -0.71f, -0.34f, -1.11f, -0.34f)
                horizontalLineToRelative(-4.24f)
                verticalLineToRelative(3f)
                close()
                moveTo(15.83f, 7f)
                horizontalLineToRelative(-7.65f)
                curveToRelative(-2.51f, 1.38f, -4.17f, 4.06f, -4.17f, 7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.94f, -1.66f, -5.62f, -4.17f, -7f)
                close()
                moveTo(16f, 17f)
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
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _PumpMedical = it}
