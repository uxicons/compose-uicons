package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMedical: ImageVector? = null

val Icons.Bs.LaptopMedical: ImageVector
    get() = _LaptopMedical ?: UXIcon(name = "LaptopMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 16f)
                lineTo(22f, 3f)
                lineTo(2f, 3f)
                verticalLineToRelative(13f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(14.77f, 17f)
                horizontalLineToRelative(-5.54f)
                lineToRelative(-0.92f, -1f)
                horizontalLineToRelative(-3.31f)
                lineTo(5f, 6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3.31f)
                lineToRelative(-0.92f, 1f)
                close()
                moveTo(13.5f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _LaptopMedical = it}
