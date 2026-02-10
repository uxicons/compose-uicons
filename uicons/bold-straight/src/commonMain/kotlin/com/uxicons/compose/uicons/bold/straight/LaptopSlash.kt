package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSlash: ImageVector? = null

val Icons.Bs.LaptopSlash: ImageVector
    get() = _LaptopSlash ?: UXIcon(name = "LaptopSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.1f, 17f)
                lineToRelative(4f, 4f)
                lineTo(3f, 21f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(2f, 6.9f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(6.1f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1f)
                horizontalLineToRelative(2.87f)
                close()
                moveTo(22.64f, 20.51f)
                lineToRelative(1.32f, 1.32f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.96f, 2.96f)
                horizontalLineToRelative(16.88f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.05f, -0.54f, 1.98f, -1.36f, 2.51f)
                close()
                moveTo(8.12f, 6f)
                lineToRelative(10f, 10f)
                horizontalLineToRelative(0.88f)
                lineTo(19f, 6f)
                horizontalLineToRelative(-10.88f)
                close()
            }
        }.also { _LaptopSlash = it}
