package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpMedical: ImageVector? = null

val Icons.Bs.PumpMedical: ImageVector
    get() = _PumpMedical ?: UXIcon(name = "PumpMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.74f, 3f)
                curveToRelative(0.3f, 0f, 0.58f, 0.09f, 0.83f, 0.25f)
                lineToRelative(2.5f, 1.67f)
                lineToRelative(1.66f, -2.5f)
                lineToRelative(-2.5f, -1.67f)
                curveToRelative(-0.74f, -0.49f, -1.6f, -0.76f, -2.5f, -0.76f)
                horizontalLineToRelative(-6.24f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.51f)
                curveToRelative(-3.56f, 1.26f, -6f, 4.68f, -6f, 8.49f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -3.8f, -2.44f, -7.23f, -6f, -8.49f)
                verticalLineToRelative(-2.01f)
                horizontalLineToRelative(3.74f)
                close()
                moveTo(18f, 13.5f)
                verticalLineToRelative(7.5f)
                lineTo(6f, 21f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -2.39f, 1.45f, -4.56f, 3.6f, -5.5f)
                horizontalLineToRelative(4.8f)
                curveToRelative(2.15f, 0.94f, 3.6f, 3.11f, 3.6f, 5.5f)
                close()
                moveTo(13.5f, 13.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _PumpMedical = it}
