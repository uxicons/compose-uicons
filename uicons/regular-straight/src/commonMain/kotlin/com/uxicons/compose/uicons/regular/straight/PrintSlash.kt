package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintSlash: ImageVector? = null

val Icons.Rs.PrintSlash: ImageVector
    get() = _PrintSlash ?: UXIcon(name = "PrintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.76f, 22f)
                lineToRelative(1.24f, 1.24f)
                verticalLineToRelative(0.76f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3f)
                lineTo(0f, 21f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.29f, 0.81f, -2.38f, 1.95f, -2.81f)
                lineToRelative(1.81f, 1.81f)
                horizontalLineToRelative(-0.76f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4.76f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-4.76f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10.76f)
                close()
                moveTo(24f, 21f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.54f, 3.54f)
                lineTo(5f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(12f)
                close()
                moveTo(7f, 5.59f)
                lineToRelative(0.41f, 0.41f)
                horizontalLineToRelative(9.59f)
                lineTo(17f, 2f)
                lineTo(7f, 2f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(20.41f, 19f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-11.59f)
                lineToRelative(11f, 11f)
                close()
                moveTo(15f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _PrintSlash = it}
