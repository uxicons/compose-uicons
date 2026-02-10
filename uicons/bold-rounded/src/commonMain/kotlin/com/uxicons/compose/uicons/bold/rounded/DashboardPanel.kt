package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DashboardPanel: ImageVector? = null

val Icons.Br.DashboardPanel: ImageVector
    get() = _DashboardPanel ?: UXIcon(name = "DashboardPanel") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 2f)
            lineTo(5.5f, 2f)
            curveTo(2.47f, 2f, 0f, 4.47f, 0f, 7.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 16.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 19f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(19f, 9.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(13.5f, 12.5f)
            curveToRelative(0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f)
            lineToRelative(-2.51f, -2.51f)
            curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
            verticalLineToRelative(-3.55f)
            curveToRelative(2.0f, 0.46f, 3.5f, 2.24f, 3.5f, 4.38f)
            close()
            moveTo(8.59f, 13.5f)
            lineToRelative(2.8f, 2.8f)
            curveToRelative(-0.9f, 0.57f, -2.01f, 0.84f, -3.2f, 0.62f)
            curveToRelative(-1.85f, -0.34f, -3.35f, -1.86f, -3.63f, -3.72f)
            curveToRelative(-0.37f, -2.44f, 1.23f, -4.58f, 3.45f, -5.08f)
            verticalLineToRelative(3.96f)
            curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
            close()
        }
    }.also { _DashboardPanel = it }
