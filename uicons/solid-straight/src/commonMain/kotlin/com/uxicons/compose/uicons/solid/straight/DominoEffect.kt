package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DominoEffect: ImageVector? = null

val Icons.Ss.DominoEffect: ImageVector
    get() = _DominoEffect ?: UXIcon(name = "DominoEffect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 20f)
                horizontalLineToRelative(2f)
                lineTo(20f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(16f)
                close()
                moveTo(10.55f, 19.18f)
                lineToRelative(1.9f, 0.63f)
                lineToRelative(5f, -15f)
                lineToRelative(-1.9f, -0.63f)
                lineToRelative(-5f, 15f)
                close()
                moveTo(11.5f, 11f)
                curveToRelative(0.75f, 0f, 1.44f, -0.54f, 1.56f, -1.27f)
                curveToRelative(0.15f, -0.94f, -0.57f, -1.74f, -1.48f, -1.74f)
                lineToRelative(-7.58f, 0.01f)
                lineToRelative(1.14f, -1.43f)
                curveToRelative(0.55f, -0.66f, 0.46f, -1.65f, -0.2f, -2.2f)
                curveToRelative(-0.66f, -0.55f, -1.65f, -0.46f, -2.2f, 0.2f)
                lineToRelative(-2.73f, 3.94f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(4.69f)
                lineToRelative(3f, -8f)
                horizontalLineToRelative(3.81f)
                close()
            }
        }.also { _DominoEffect = it}
