package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandMiddleFinger: ImageVector? = null

val Icons.Bs.HandMiddleFinger: ImageVector
    get() = _HandMiddleFinger ?: UXIcon(name = "HandMiddleFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9.27f)
                verticalLineToRelative(-5.27f)
                curveToRelative(0f, -1.13f, -0.48f, -2.21f, -1.32f, -2.97f)
                curveTo(14.85f, 0.28f, 13.72f, -0.09f, 12.59f, 0.02f)
                curveToRelative(-2.02f, 0.2f, -3.59f, 2.01f, -3.59f, 4.12f)
                verticalLineToRelative(3.86f)
                curveToRelative(-0.6f, 0.13f, -1.17f, 0.41f, -1.65f, 0.82f)
                curveToRelative(-0.39f, 0.33f, -0.7f, 0.73f, -0.93f, 1.17f)
                lineToRelative(-4.4f, 4.4f)
                curveToRelative(-1.31f, 1.31f, -1.31f, 3.45f, 0f, 4.76f)
                lineToRelative(4.86f, 4.86f)
                lineToRelative(15.12f, -0.01f)
                verticalLineToRelative(-13.73f)
                lineToRelative(-5f, -1f)
                close()
                moveTo(19f, 21.0f)
                lineToRelative(-10.88f, 0.01f)
                lineToRelative(-3.98f, -3.98f)
                curveToRelative(-0.14f, -0.14f, -0.14f, -0.38f, 0f, -0.52f)
                lineToRelative(1.86f, -1.86f)
                verticalLineToRelative(2.35f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.26f)
                curveToRelative(0f, -0.33f, 0.18f, -0.53f, 0.29f, -0.62f)
                curveToRelative(0.11f, -0.09f, 0.33f, -0.23f, 0.66f, -0.18f)
                lineToRelative(2.05f, 0.34f)
                verticalLineToRelative(-7.13f)
                curveToRelative(0f, -0.58f, 0.4f, -1.09f, 0.89f, -1.14f)
                curveToRelative(0.39f, -0.04f, 0.66f, 0.14f, 0.78f, 0.25f)
                curveToRelative(0.21f, 0.19f, 0.33f, 0.46f, 0.33f, 0.74f)
                verticalLineToRelative(7.73f)
                lineToRelative(5f, 1f)
                verticalLineToRelative(8.27f)
                close()
            }
        }.also { _HandMiddleFinger = it}
