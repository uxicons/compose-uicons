package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSlash: ImageVector? = null

val Icons.Rs.LaptopSlash: ImageVector
    get() = _LaptopSlash ?: UXIcon(name = "LaptopSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 3f)
                lineTo(4.41f, 3f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.78f, -1.78f)
                curveToRelative(1.07f, -0.46f, 1.83f, -1.52f, 1.83f, -2.76f)
                close()
                moveTo(6.41f, 5f)
                horizontalLineToRelative(13.59f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3.59f)
                lineTo(6.41f, 5f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(1f)
                close()
                moveTo(14.76f, 19f)
                lineToRelative(2f, 2f)
                lineTo(3f, 21f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                lineTo(2f, 6.24f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(6.76f)
                horizontalLineToRelative(4.91f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(1.84f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-4.67f)
                lineToRelative(-1f, -1f)
                lineTo(2f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.76f)
                close()
            }
        }.also { _LaptopSlash = it}
