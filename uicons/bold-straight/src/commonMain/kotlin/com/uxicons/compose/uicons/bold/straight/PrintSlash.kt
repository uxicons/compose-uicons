package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintSlash: ImageVector? = null

val Icons.Bs.PrintSlash: ImageVector
    get() = _PrintSlash ?: UXIcon(name = "PrintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 20.95f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(0.05f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3f)
                lineTo(0f, 21f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.1f, 0.59f, -2.06f, 1.47f, -2.58f)
                lineToRelative(1.53f, 1.53f)
                verticalLineToRelative(10.05f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3.05f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-3.05f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-0.05f)
                close()
                moveTo(24f, 21f)
                horizontalLineToRelative(-0.88f)
                lineToRelative(0.84f, 0.84f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.84f, 2.84f)
                lineTo(5f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(12f)
                close()
                moveTo(8f, 5.88f)
                lineToRelative(0.12f, 0.12f)
                horizontalLineToRelative(7.88f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2.88f)
                close()
                moveTo(20.12f, 18f)
                horizontalLineToRelative(0.88f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-9.88f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(3.88f)
                verticalLineToRelative(3.88f)
                lineToRelative(1.12f, 1.12f)
                close()
            }
        }.also { _PrintSlash = it}
