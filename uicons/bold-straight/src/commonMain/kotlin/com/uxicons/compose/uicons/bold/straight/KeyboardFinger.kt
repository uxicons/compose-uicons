package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardFinger: ImageVector? = null

val Icons.Bs.KeyboardFinger: ImageVector
    get() = _KeyboardFinger ?: UXIcon(name = "KeyboardFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(14f, 11.62f)
                curveToRelative(0f, -0.75f, -0.54f, -1.44f, -1.27f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.74f, 0.57f, -1.74f, 1.48f)
                verticalLineToRelative(7.27f)
                lineToRelative(-1.64f, -1.33f)
                curveToRelative(-0.87f, -0.72f, -2.15f, -0.6f, -2.87f, 0.26f)
                curveToRelative(-0.72f, 0.87f, -0.6f, 2.15f, 0.26f, 2.87f)
                lineToRelative(4.27f, 3.39f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.06f)
                lineToRelative(6f, 2.12f)
                verticalLineToRelative(2.94f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.06f)
                lineToRelative(-9f, -3.18f)
                verticalLineToRelative(-4.15f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(4.15f)
                curveToRelative(0.14f, -0.55f, 0.4f, -1.08f, 0.79f, -1.55f)
                curveToRelative(0.79f, -0.94f, 1.92f, -1.45f, 3.06f, -1.45f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3.15f)
                lineToRelative(6.15f, 2.17f)
                verticalLineToRelative(-14.17f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _KeyboardFinger = it}
