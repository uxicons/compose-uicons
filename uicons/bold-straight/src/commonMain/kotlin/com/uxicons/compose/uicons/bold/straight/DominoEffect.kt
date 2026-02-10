package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DominoEffect: ImageVector? = null

val Icons.Bs.DominoEffect: ImageVector
    get() = _DominoEffect ?: UXIcon(name = "DominoEffect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.58f, 11.5f)
                lineToRelative(-2.5f, 7.5f)
                lineTo(0f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.92f)
                lineToRelative(1.5f, -4.5f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(-3f)
                lineToRelative(2.73f, -3.94f)
                curveToRelative(0.55f, -0.66f, 1.54f, -0.75f, 2.2f, -0.2f)
                curveToRelative(0.66f, 0.55f, 0.75f, 1.54f, 0.2f, 2.2f)
                lineToRelative(-1.48f, 1.93f)
                lineToRelative(6.84f, -0.0f)
                curveToRelative(0.91f, 0f, 1.63f, 0.8f, 1.48f, 1.74f)
                curveToRelative(-0.12f, 0.74f, -0.81f, 1.27f, -1.56f, 1.27f)
                horizontalLineToRelative(-2.84f)
                close()
                moveTo(21f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(3f)
                lineTo(24f, 4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(17f, 20f)
                horizontalLineToRelative(3f)
                lineTo(20f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(16f)
                close()
                moveTo(9.08f, 19.02f)
                lineToRelative(2.85f, 0.95f)
                lineToRelative(5f, -15f)
                lineToRelative(-2.85f, -0.95f)
                lineToRelative(-5f, 15f)
                close()
            }
        }.also { _DominoEffect = it}
