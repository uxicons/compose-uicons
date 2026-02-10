package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintSlash: ImageVector? = null

val Icons.Ts.PrintSlash: ImageVector
    get() = _PrintSlash ?: UXIcon(name = "PrintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 21.54f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(1.47f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3f)
                lineTo(0f, 21f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -1.37f, 1.1f, -2.48f, 2.47f, -2.5f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(-0.96f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5.46f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-5.46f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.47f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 21f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(2.25f, 2.25f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(0.05f, 0.75f)
                lineTo(0.75f, 0.05f)
                lineToRelative(4.25f, 4.25f)
                lineTo(5f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(6.71f, 6f)
                horizontalLineToRelative(11.29f)
                lineTo(18f, 1f)
                lineTo(6f, 1f)
                verticalLineToRelative(4.29f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(23f, 8.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(7.71f, 7f)
                lineToRelative(13f, 13f)
                horizontalLineToRelative(2.29f)
                verticalLineToRelative(-11.5f)
                close()
            }
        }.also { _PrintSlash = it}
