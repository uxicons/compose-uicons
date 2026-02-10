package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmokingBan: ImageVector? = null

val Icons.Br.SmokingBan: ImageVector
    get() = _SmokingBan ?: UXIcon(name = "SmokingBan") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
            lineToRelative(-2.21f, -2.21f)
            horizontalLineToRelative(0.88f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-4.88f)
            lineToRelative(-6.33f, -6.33f)
            curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
            curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
            close()
            moveTo(3f, 12f)
            curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
            lineToRelative(12.53f, 12.53f)
            curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            close()
            moveTo(12f, 6f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            curveToRelative(0.55f, 0f, 0.99f, 0.44f, 1f, 0.98f)
            curveToRelative(0.03f, 0.06f, 0.19f, 0.21f, 0.5f, 0.31f)
            lineToRelative(1.62f, 0.52f)
            curveToRelative(1.16f, 0.37f, 1.89f, 1.21f, 1.89f, 2.19f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            curveToRelative(-0.02f, -0.03f, -0.17f, -0.18f, -0.5f, -0.29f)
            lineToRelative(-1.62f, -0.52f)
            curveToRelative(-1.16f, -0.37f, -1.89f, -1.21f, -1.89f, -2.19f)
            close()
            moveTo(6.05f, 11f)
            lineToRelative(4f, 4f)
            horizontalLineToRelative(-4.05f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1f, 1.05f, -1f, 1.05f, -1f)
            close()
        }
    }.also { _SmokingBan = it }
