package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toothpaste: ImageVector? = null

val Icons.Rs.Toothpaste: ImageVector
    get() = _Toothpaste ?: UXIcon(name = "Toothpaste") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.3f)
                curveToRelative(1.31f, -1.17f, 2f, -2.96f, 2f, -4.7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(9f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.54f, 0f, 1.04f, -0.08f, 1.5f, -0.21f)
                close()
                moveTo(3f, 15.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.2f, 0f, 0.4f, -0.02f, 0.59f, -0.06f)
                curveToRelative(-0.53f, 1.18f, -1.57f, 2.06f, -3.09f, 2.06f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(3f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(24f, 4.73f)
                verticalLineToRelative(2.83f)
                lineToRelative(-2.16f, 2.16f)
                lineToRelative(-4.39f, -0.66f)
                lineToRelative(-2.36f, 1.89f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(1.74f, -2.46f)
                lineToRelative(-0.65f, -4.44f)
                lineToRelative(1.66f, -1.66f)
                horizontalLineToRelative(2.83f)
                lineToRelative(-2.37f, 2.37f)
                lineToRelative(0.51f, 3.46f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(3.47f, 0.52f)
                lineToRelative(2.86f, -2.86f)
                close()
            }
        }.also { _Toothpaste = it}
