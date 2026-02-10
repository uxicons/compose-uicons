package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSlash: ImageVector? = null

val Icons.Ts.LaptopSlash: ImageVector
    get() = _LaptopSlash ?: UXIcon(name = "LaptopSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.46f, 20f)
                lineToRelative(1f, 1f)
                lineTo(2.5f, 21f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                lineTo(2f, 5.54f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(9.46f)
                horizontalLineToRelative(5.71f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(3.76f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-5.17f)
                lineToRelative(-1f, -1f)
                lineTo(1f, 17f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(13.96f)
                close()
                moveTo(24.0f, 23.3f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(-0.0f, 0.7f)
                lineTo(0.7f, -0.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(18.29f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.31f, -1.01f, 2.39f, -2.3f, 2.49f)
                lineToRelative(2.31f, 2.31f)
                close()
                moveTo(16.71f, 16f)
                horizontalLineToRelative(4.29f)
                lineTo(21f, 4f)
                lineTo(4.71f, 4f)
                lineToRelative(12f, 12f)
                close()
                moveTo(21.5f, 20f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.29f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(0.79f)
                close()
            }
        }.also { _LaptopSlash = it}
