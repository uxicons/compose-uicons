package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeDown: ImageVector? = null

val Icons.Sr.SwipeDown: ImageVector
    get() = _SwipeDown ?: UXIcon(name = "SwipeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 10f)
                curveToRelative(-0.59f, -0.0f, -1.19f, -0.23f, -1.63f, -0.68f)
                lineTo(0.29f, 7.25f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                lineTo(3f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6.13f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.2f, -0.2f, 0.45f, -0.29f, 0.71f, -0.29f)
                reflectiveCurveToRelative(0.51f, 0.1f, 0.71f, 0.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.07f, 2.07f)
                curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.63f, 0.68f)
                close()
                moveTo(21.11f, 11.86f)
                lineToRelative(-8.12f, -2.35f)
                lineTo(13f, 2.11f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(14.9f)
                lineToRelative(-2.25f, -2.29f)
                curveToRelative(-0.1f, -0.1f, -0.27f, -0.22f, -0.49f, -0.37f)
                curveToRelative(-0.93f, -0.52f, -2.16f, -0.31f, -2.85f, 0.62f)
                curveToRelative(-0.67f, 0.89f, -0.48f, 2.17f, 0.3f, 2.96f)
                lineToRelative(3.98f, 4.07f)
                curveToRelative(1.32f, 1.35f, 3.12f, 2.11f, 5.01f, 2.11f)
                horizontalLineToRelative(7.3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0f, -1.78f, -1.18f, -3.35f, -2.88f, -3.84f)
                close()
            }
        }.also { _SwipeDown = it}
