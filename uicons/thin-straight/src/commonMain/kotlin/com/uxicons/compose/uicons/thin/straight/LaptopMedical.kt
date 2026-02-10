package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMedical: ImageVector? = null

val Icons.Ts.LaptopMedical: ImageVector
    get() = _LaptopMedical ?: UXIcon(name = "LaptopMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 16f)
                lineTo(22f, 3f)
                lineTo(2f, 3f)
                verticalLineToRelative(13f)
                lineTo(0f, 16f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3f, 4f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-5.71f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(-1f, -1f)
                lineTo(3f, 16f)
                lineTo(3f, 4f)
                close()
                moveTo(23f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.29f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(5.41f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(7.29f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(11.5f, 10.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _LaptopMedical = it}
