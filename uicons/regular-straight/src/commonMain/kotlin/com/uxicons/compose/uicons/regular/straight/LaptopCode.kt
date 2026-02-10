package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopCode: ImageVector? = null

val Icons.Rs.LaptopCode: ImageVector
    get() = _LaptopCode ?: UXIcon(name = "LaptopCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.21f, 12.47f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.26f, -2.26f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.04f, 0f, -2.81f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(2.26f, 2.24f)
                close()
                moveTo(15.21f, 13.89f)
                lineToRelative(2.26f, -2.26f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.04f, 0f, -2.81f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.25f, 2.24f)
                lineToRelative(-2.26f, 2.26f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 21f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(2f, 15f)
                lineTo(2f, 3f)
                lineTo(22f, 3f)
                lineTo(22f, 15f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4f, 15f)
                horizontalLineToRelative(4.91f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4.17f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(4.91f)
                lineTo(20f, 5f)
                lineTo(4f, 5f)
                lineTo(4f, 15f)
                close()
                moveTo(22f, 17f)
                horizontalLineToRelative(-6.09f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-5.83f)
                lineToRelative(-1f, -1f)
                lineTo(2f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(21f, 19f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _LaptopCode = it}
