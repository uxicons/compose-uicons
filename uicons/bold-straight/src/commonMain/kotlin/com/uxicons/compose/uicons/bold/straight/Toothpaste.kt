package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toothpaste: ImageVector? = null

val Icons.Bs.Toothpaste: ImageVector
    get() = _Toothpaste ?: UXIcon(name = "Toothpaste") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.02f)
                verticalLineToRelative(4.24f)
                lineToRelative(-2.49f, 2.49f)
                lineToRelative(-4.43f, -0.66f)
                lineToRelative(-2.54f, 2.03f)
                lineToRelative(-3.01f, -3.01f)
                lineToRelative(1.87f, -2.64f)
                lineToRelative(-0.66f, -4.49f)
                lineToRelative(1.99f, -1.99f)
                horizontalLineToRelative(4.24f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(0.45f, 3.05f)
                lineToRelative(1.02f, 1.02f)
                lineToRelative(3.06f, 0.46f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(14f, 21f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.39f)
                curveToRelative(2.61f, 0f, 4.1f, -1.99f, 4.11f, -2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.81f, -1.22f, 3.89f, -3f, 4.89f)
                verticalLineToRelative(3.61f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Toothpaste = it}
