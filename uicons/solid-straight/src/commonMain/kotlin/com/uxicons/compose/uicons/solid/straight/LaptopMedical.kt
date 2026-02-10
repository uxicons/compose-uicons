package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMedical: ImageVector? = null

val Icons.Ss.LaptopMedical: ImageVector
    get() = _LaptopMedical ?: UXIcon(name = "LaptopMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.99f, 18f)
                lineToRelative(-0.85f, -1f)
                lineTo(0f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8.14f)
                lineToRelative(-0.85f, 1f)
                horizontalLineToRelative(-6.02f)
                close()
                moveTo(2f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(4.16f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(7.07f)
                lineTo(22f, 3f)
                lineTo(2f, 3f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _LaptopMedical = it}
