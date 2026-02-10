package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fork: ImageVector? = null

val Icons.Tr.Fork: ImageVector
    get() = _Fork ?: UXIcon(name = "Fork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 6.27f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-4.6f, 4.6f)
                curveToRelative(-1.33f, 1.33f, -3.56f, 1.44f, -5.04f, 0.33f)
                lineToRelative(7.35f, -7.35f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-7.35f, 7.35f)
                curveToRelative(-0.51f, -0.67f, -0.79f, -1.48f, -0.79f, -2.33f)
                curveToRelative(0f, -1.02f, 0.4f, -1.99f, 1.12f, -2.71f)
                lineTo(17.73f, 0.85f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-4.6f, 4.6f)
                curveToRelative(-0.91f, 0.91f, -1.42f, 2.13f, -1.42f, 3.42f)
                curveToRelative(0f, 1.12f, 0.38f, 2.19f, 1.08f, 3.04f)
                lineTo(0.15f, 23.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineTo(12.79f, 11.92f)
                curveToRelative(0.86f, 0.7f, 1.92f, 1.08f, 3.04f, 1.08f)
                curveToRelative(1.29f, 0f, 2.5f, -0.5f, 3.42f, -1.42f)
                lineToRelative(4.6f, -4.6f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
            }
        }.also { _Fork = it}
