package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TSquare: ImageVector? = null

val Icons.Ss.TSquare: ImageVector
    get() = _TSquare ?: UXIcon(name = "TSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.29f, 4.81f)
                curveToRelative(-1.28f, -0.39f, -3.69f, -1.34f, -5.35f, -3.37f)
                curveToRelative(-0.75f, -0.92f, -1.87f, -1.44f, -3.07f, -1.44f)
                horizontalLineToRelative(-5.75f)
                curveToRelative(-1.2f, 0f, -2.31f, 0.53f, -3.07f, 1.44f)
                curveToRelative(-1.67f, 2.03f, -4.07f, 2.98f, -5.35f, 3.37f)
                lineToRelative(-0.71f, 0.21f)
                verticalLineToRelative(3.97f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0.56f, -0.45f, 1.11f, -0.98f, 1.61f, -1.58f)
                curveToRelative(0.11f, -0.14f, 0.25f, -0.25f, 0.39f, -0.35f)
                verticalLineToRelative(21.64f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4.64f)
                curveToRelative(0.14f, 0.1f, 0.28f, 0.21f, 0.39f, 0.35f)
                curveToRelative(0.5f, 0.6f, 1.04f, 1.13f, 1.61f, 1.58f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3.97f)
                close()
            }
        }.also { _TSquare = it}
