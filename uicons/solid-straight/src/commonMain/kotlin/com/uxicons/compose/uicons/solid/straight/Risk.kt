package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Risk: ImageVector? = null

val Icons.Ss.Risk: ImageVector
    get() = _Risk ?: UXIcon(name = "Risk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                close()
                moveTo(20.71f, 13.45f)
                lineToRelative(3.22f, 1.81f)
                lineToRelative(-2.94f, 5.23f)
                lineToRelative(-3.19f, -1.79f)
                curveToRelative(-0.82f, 0.73f, -1.77f, 1.3f, -2.8f, 1.69f)
                verticalLineToRelative(3.61f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3.5f)
                curveToRelative(-1.09f, -0.36f, -2.11f, -0.94f, -2.99f, -1.69f)
                lineToRelative(-3.0f, 1.69f)
                lineTo(0.07f, 15.27f)
                lineToRelative(2.94f, -1.66f)
                curveToRelative(-0.1f, -0.54f, -0.15f, -1.08f, -0.15f, -1.63f)
                curveToRelative(0f, -0.54f, 0.05f, -1.07f, 0.14f, -1.6f)
                lineTo(0.07f, 8.73f)
                lineTo(3.01f, 3.5f)
                lineToRelative(2.98f, 1.67f)
                curveToRelative(0.89f, -0.76f, 1.91f, -1.35f, 3.02f, -1.72f)
                lineTo(9.0f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3.57f)
                curveToRelative(1.04f, 0.39f, 2.0f, 0.97f, 2.83f, 1.71f)
                lineToRelative(3.16f, -1.78f)
                lineToRelative(2.94f, 5.23f)
                lineToRelative(-3.22f, 1.81f)
                curveToRelative(0.08f, 0.47f, 0.12f, 0.95f, 0.12f, 1.44f)
                curveToRelative(0f, 0.49f, -0.04f, 0.99f, -0.12f, 1.47f)
                close()
                moveTo(18f, 16f)
                lineToRelative(-6f, -10.29f)
                lineToRelative(-6f, 10.29f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _Risk = it}
