package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopCode: ImageVector? = null

val Icons.Ss.LaptopCode: ImageVector
    get() = _LaptopCode ?: UXIcon(name = "LaptopCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.01f, 18f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(8.14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 21f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                lineTo(8.14f, 17f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(6.02f)
                close()
                moveTo(22f, 3f)
                lineTo(22f, 15f)
                horizontalLineToRelative(-7.07f)
                lineToRelative(-0.85f, 1f)
                horizontalLineToRelative(-4.16f)
                lineToRelative(-0.85f, -1f)
                lineTo(2f, 15f)
                lineTo(2f, 3f)
                lineTo(22f, 3f)
                close()
                moveTo(10.21f, 11.47f)
                lineToRelative(-2.26f, -2.24f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.25f, 2.25f)
                curveToRelative(-0.77f, 0.78f, -0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(2.26f, 2.26f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(17.46f, 7.82f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.25f, 2.24f)
                lineToRelative(-2.26f, 2.26f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.26f, -2.26f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.04f, 0f, -2.81f)
                close()
            }
        }.also { _LaptopCode = it}
