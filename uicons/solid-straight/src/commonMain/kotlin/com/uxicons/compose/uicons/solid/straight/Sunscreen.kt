package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunscreen: ImageVector? = null

val Icons.Ss.Sunscreen: ImageVector
    get() = _Sunscreen ?: UXIcon(name = "Sunscreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.09f)
                curveToRelative(-0.07f, -0.38f, -0.16f, -0.76f, -0.29f, -1.11f)
                lineToRelative(2.66f, -1.55f)
                lineToRelative(-1.01f, -1.73f)
                lineToRelative(-2.67f, 1.55f)
                curveToRelative(-0.23f, -0.28f, -0.48f, -0.53f, -0.76f, -0.76f)
                lineToRelative(1.56f, -2.67f)
                lineToRelative(-1.73f, -1.01f)
                lineToRelative(-1.56f, 2.68f)
                curveToRelative(-0.38f, -0.14f, -0.77f, -0.26f, -1.17f, -0.32f)
                curveToRelative(-0.0f, 0.0f, -0.01f, 0.01f, -0.01f, 0.02f)
                curveToRelative(-0.29f, 4.72f, -1.29f, 11.15f, -1.76f, 14.01f)
                lineToRelative(-0.15f, 0.89f)
                horizontalLineToRelative(1.99f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0.38f, -0.06f, 0.74f, -0.17f, 1.09f, -0.3f)
                lineToRelative(1.55f, 2.67f)
                lineToRelative(1.73f, -1.0f)
                lineToRelative(-1.55f, -2.66f)
                curveToRelative(0.28f, -0.23f, 0.54f, -0.5f, 0.78f, -0.78f)
                lineToRelative(2.67f, 1.55f)
                lineToRelative(1.01f, -1.73f)
                lineToRelative(-2.66f, -1.55f)
                curveToRelative(0.14f, -0.36f, 0.23f, -0.73f, 0.3f, -1.12f)
                horizontalLineToRelative(3.09f)
                close()
                moveTo(0f, 1f)
                curveToRelative(0f, 4.54f, 1.31f, 12.91f, 1.82f, 16f)
                horizontalLineToRelative(10.37f)
                curveToRelative(0.51f, -3.09f, 1.82f, -11.46f, 1.82f, -16f)
                lineTo(14.0f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Sunscreen = it}
