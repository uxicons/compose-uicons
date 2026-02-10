package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandMiddleFinger: ImageVector? = null

val Icons.Ss.HandMiddleFinger: ImageVector
    get() = _HandMiddleFinger ?: UXIcon(name = "HandMiddleFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 9.53f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.82f)
                lineToRelative(-0.47f, -0.11f)
                curveToRelative(-1.8f, -0.42f, -3.53f, 0.94f, -3.53f, 2.79f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.39f)
                lineToRelative(-3.12f, 3.02f)
                curveToRelative(-0.7f, 0.7f, -1.01f, 1.71f, -0.83f, 2.68f)
                curveToRelative(0.13f, 0.62f, 0.44f, 1.2f, 0.9f, 1.64f)
                lineToRelative(5.05f, 5.04f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-13f)
                lineToRelative(-6f, -1.47f)
                close()
            }
        }.also { _HandMiddleFinger = it}
