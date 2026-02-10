package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Process: ImageVector? = null

val Icons.Bs.Process: ImageVector
    get() = _Process ?: UXIcon(name = "Process") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-2.7f, 0f, -5.3f, -0.94f, -7.39f, -2.57f)
                lineToRelative(-2.57f, 2.57f)
                verticalLineToRelative(-6.02f)
                curveToRelative(0f, -0.53f, 0.43f, -0.95f, 0.95f, -0.95f)
                horizontalLineToRelative(6.02f)
                lineToRelative(-2.27f, 2.27f)
                curveToRelative(1.52f, 1.09f, 3.35f, 1.71f, 5.25f, 1.71f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.91f, 0f, 3.74f, 0.62f, 5.25f, 1.71f)
                lineToRelative(-2.27f, 2.27f)
                horizontalLineToRelative(5.83f)
                curveToRelative(0.63f, 0f, 1.15f, -0.51f, 1.15f, -1.15f)
                lineTo(21.96f, 0f)
                lineToRelative(-2.57f, 2.57f)
                curveToRelative(-2.09f, -1.64f, -4.67f, -2.57f, -7.39f, -2.57f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(3f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                close()
                moveTo(17.95f, 10.3f)
                lineToRelative(-1.53f, 0.88f)
                curveToRelative(0.05f, 0.27f, 0.08f, 0.54f, 0.08f, 0.81f)
                reflectiveCurveToRelative(-0.03f, 0.55f, -0.08f, 0.81f)
                lineToRelative(1.53f, 0.88f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(-1.54f, -0.89f)
                curveToRelative(-0.41f, 0.35f, -0.89f, 0.63f, -1.41f, 0.82f)
                verticalLineToRelative(1.78f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.78f)
                curveToRelative(-0.52f, -0.19f, -0.99f, -0.46f, -1.41f, -0.82f)
                lineToRelative(-1.54f, 0.89f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(1.53f, -0.88f)
                curveToRelative(-0.05f, -0.27f, -0.08f, -0.54f, -0.08f, -0.81f)
                reflectiveCurveToRelative(0.03f, -0.55f, 0.08f, -0.81f)
                lineToRelative(-1.53f, -0.88f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(1.54f, 0.89f)
                curveToRelative(0.41f, -0.35f, 0.89f, -0.63f, 1.41f, -0.82f)
                verticalLineToRelative(-1.78f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.78f)
                curveToRelative(0.52f, 0.19f, 0.99f, 0.46f, 1.41f, 0.82f)
                lineToRelative(1.54f, -0.89f)
                lineToRelative(1.5f, 2.6f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Process = it}
