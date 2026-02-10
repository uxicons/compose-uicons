package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardFinger: ImageVector? = null

val Icons.Rs.KeyboardFinger: ImageVector
    get() = _KeyboardFinger ?: UXIcon(name = "KeyboardFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(20f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(4f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(15f, 12.11f)
                curveToRelative(0f, -1.52f, -1.08f, -2.83f, -2.5f, -3.07f)
                curveToRelative(-1.78f, -0.33f, -3.54f, 1.16f, -3.5f, 2.96f)
                verticalLineToRelative(6.69f)
                lineToRelative(-0.44f, -0.36f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-1.21f, -1.08f, -3.07f, -1.01f, -4.18f, 0.18f)
                curveToRelative(-1.13f, 1.21f, -1.07f, 3.11f, 0.13f, 4.23f)
                lineToRelative(1.38f, 1.25f)
                horizontalLineToRelative(2.88f)
                lineToRelative(-2.88f, -2.7f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.42f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.41f, -0.05f)
                curveToRelative(0.07f, 0.06f, 3.69f, 3.01f, 3.75f, 3.07f)
                verticalLineToRelative(-10.9f)
                curveToRelative(-0.01f, -0.6f, 0.57f, -1.1f, 1.18f, -0.98f)
                curveToRelative(0.46f, 0.07f, 0.82f, 0.56f, 0.82f, 1.09f)
                verticalLineToRelative(6.05f)
                lineToRelative(8f, 3f)
                verticalLineToRelative(2.85f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.23f)
                lineToRelative(-8f, -3f)
                verticalLineToRelative(-4.66f)
                close()
            }
        }.also { _KeyboardFinger = it}
