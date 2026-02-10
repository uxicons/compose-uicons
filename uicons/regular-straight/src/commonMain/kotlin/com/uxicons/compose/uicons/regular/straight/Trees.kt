package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trees: ImageVector? = null

val Icons.Rs.Trees: ImageVector
    get() = _Trees ?: UXIcon(name = "Trees") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 21f)
                lineToRelative(-3.48f, -6f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-3.96f, -6f)
                horizontalLineToRelative(2.15f)
                lineTo(16.38f, 0.99f)
                curveToRelative(-0.5f, -0.63f, -1.27f, -0.99f, -2.11f, -0.99f)
                reflectiveCurveToRelative(-1.61f, 0.36f, -2.11f, 0.99f)
                lineToRelative(-0.14f, 0.23f)
                lineToRelative(-0.15f, -0.23f)
                curveToRelative(-0.5f, -0.63f, -1.26f, -0.99f, -2.11f, -0.99f)
                reflectiveCurveToRelative(-1.61f, 0.36f, -2.11f, 0.99f)
                lineTo(2.93f, 9f)
                horizontalLineToRelative(2.15f)
                lineToRelative(-3.96f, 6f)
                horizontalLineToRelative(2.38f)
                lineTo(0.03f, 21f)
                horizontalLineToRelative(8.47f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.51f)
                close()
                moveTo(9.27f, 2.19f)
                curveToRelative(0.23f, -0.24f, 0.78f, -0.24f, 1.01f, 0f)
                lineToRelative(0.59f, 1.0f)
                lineToRelative(-2.25f, 3.81f)
                horizontalLineToRelative(-2.18f)
                lineToRelative(2.83f, -4.81f)
                close()
                moveTo(7.48f, 9f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-2.64f, 4f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(2.64f, -4f)
                close()
                moveTo(3.5f, 19f)
                lineToRelative(2.32f, -4f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-2.32f, 4f)
                horizontalLineToRelative(-2.19f)
                close()
                moveTo(11.48f, 13f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(3.96f, -6f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(2.83f, -4.81f)
                curveToRelative(0.23f, -0.24f, 0.78f, -0.24f, 1.01f, 0f)
                lineToRelative(2.83f, 4.81f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(3.96f, 6f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(3.48f, 6f)
                horizontalLineToRelative(-12.53f)
                lineToRelative(3.48f, -6f)
                close()
            }
        }.also { _Trees = it}
