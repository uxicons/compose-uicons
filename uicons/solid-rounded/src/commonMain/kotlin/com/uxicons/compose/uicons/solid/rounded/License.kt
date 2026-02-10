package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _License: ImageVector? = null

val Icons.Sr.License: ImageVector
    get() = _License ?: UXIcon(name = "License") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                lineTo(14f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.24f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(18f, 17f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.48f, 0.8f, 2.77f, 2f, 3.46f)
                verticalLineToRelative(2.81f)
                curveToRelative(0f, 0.64f, 0.78f, 0.96f, 1.23f, 0.51f)
                lineToRelative(0.77f, -0.77f)
                lineToRelative(0.77f, 0.77f)
                curveToRelative(0.45f, 0.45f, 1.23f, 0.13f, 1.23f, -0.51f)
                verticalLineToRelative(-2.81f)
                curveToRelative(1.2f, -0.69f, 2f, -1.98f, 2f, -3.46f)
                close()
                moveTo(21.98f, 10f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(12f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.49f, -0.02f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.53f)
                curveToRelative(-1.23f, -1.1f, -2f, -2.69f, -2f, -4.47f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.78f, -0.77f, 3.37f, -2f, 4.47f)
                verticalLineToRelative(2.43f)
                curveToRelative(2.28f, -0.46f, 4f, -2.48f, 4f, -4.9f)
                lineTo(22f, 10.49f)
                curveToRelative(0f, -0.16f, -0.01f, -0.32f, -0.02f, -0.49f)
                close()
            }
        }.also { _License = it}
