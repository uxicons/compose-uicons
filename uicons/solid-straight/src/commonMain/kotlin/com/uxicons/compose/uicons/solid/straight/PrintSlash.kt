package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintSlash: ImageVector? = null

val Icons.Ss.PrintSlash: ImageVector
    get() = _PrintSlash ?: UXIcon(name = "PrintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.76f, 15f)
                lineToRelative(7.24f, 7.24f)
                verticalLineToRelative(1.76f)
                lineTo(6f, 24f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(4.76f)
                close()
                moveTo(2.77f, 7.01f)
                curveToRelative(-1.55f, 0.12f, -2.77f, 1.41f, -2.77f, 2.99f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(4.76f)
                lineTo(2.77f, 7.01f)
                close()
                moveTo(24f, 20f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.54f, 3.54f)
                lineTo(5f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5f)
                lineTo(6.41f, 5f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(12.59f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(10f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 18.59f)
                verticalLineToRelative(-5.59f)
                horizontalLineToRelative(-5.59f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(1.59f)
                lineToRelative(2f, 2f)
                close()
            }
        }.also { _PrintSlash = it}
