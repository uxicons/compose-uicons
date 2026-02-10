package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopShield: ImageVector? = null

val Icons.Bs.LaptopShield: ImageVector
    get() = _LaptopShield ?: UXIcon(name = "LaptopShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1f)
                horizontalLineToRelative(5.54f)
                lineToRelative(0.92f, -1f)
                horizontalLineToRelative(3.31f)
                verticalLineToRelative(-3.5f)
                curveToRelative(1.09f, -0.45f, 1.72f, -0.63f, 3f, -1.46f)
                close()
                moveTo(24f, 3.58f)
                verticalLineToRelative(3.48f)
                curveToRelative(-0.26f, 4.57f, -3.74f, 5.72f, -5.57f, 6.51f)
                curveToRelative(-1.73f, -0.93f, -5.19f, -2.41f, -5.43f, -6.51f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -1.03f, 0.66f, -1.94f, 1.64f, -2.27f)
                lineToRelative(3.86f, -1.32f)
                lineToRelative(3.86f, 1.32f)
                curveToRelative(0.98f, 0.32f, 1.64f, 1.23f, 1.64f, 2.27f)
                close()
                moveTo(21f, 4.02f)
                lineTo(18.5f, 3.19f)
                lineTo(16f, 4.02f)
                verticalLineToRelative(3.03f)
                curveToRelative(0f, 1.52f, 1.69f, 2.7f, 2.56f, 3.21f)
                curveToRelative(0.9f, -0.45f, 2.44f, -1.46f, 2.44f, -3.21f)
                close()
            }
        }.also { _LaptopShield = it}
