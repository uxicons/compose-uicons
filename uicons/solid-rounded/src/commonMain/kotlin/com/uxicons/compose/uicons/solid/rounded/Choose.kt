package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Choose: ImageVector? = null

val Icons.Sr.Choose: ImageVector
    get() = _Choose ?: UXIcon(name = "Choose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 8f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(5.5f, 18f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(15.5f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(15f, 4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(15f, 12.11f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(8.82f)
                curveToRelative(-1.08f, -0.89f, -2.11f, -1.75f, -2.15f, -1.78f)
                curveToRelative(-0.92f, -0.86f, -2.37f, -0.81f, -3.23f, 0.11f)
                curveToRelative(-0.86f, 0.92f, -0.82f, 2.37f, 0.1f, 3.23f)
                lineToRelative(1.82f, 1.63f)
                horizontalLineToRelative(16.46f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -2.06f, -1.26f, -3.9f, -3.17f, -4.65f)
                lineToRelative(-5.83f, -2.29f)
                verticalLineToRelative(-4.36f)
                close()
            }
        }.also { _Choose = it}
