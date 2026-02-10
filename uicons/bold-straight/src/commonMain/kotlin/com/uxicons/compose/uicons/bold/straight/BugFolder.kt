package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BugFolder: ImageVector? = null

val Icons.Bs.BugFolder: ImageVector
    get() = _BugFolder ?: UXIcon(name = "BugFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 3f)
                horizontalLineToRelative(-8.15f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-4.85f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-16.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 20f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.15f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.85f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(15f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(0.09f, 0.3f, 0.18f, 0.64f, 0.27f, 1f)
                horizontalLineToRelative(2.14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.73f)
                curveToRelative(0.06f, 0.4f, 0.08f, 0.68f, 0.02f, 1.03f)
                curveToRelative(0.96f, 0.14f, 1.7f, 0.97f, 1.7f, 1.97f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-0.6f, 0.62f, -1.45f, 1f, -2.38f, 1f)
                reflectiveCurveToRelative(-1.77f, -0.38f, -2.38f, -1f)
                horizontalLineToRelative(-0.62f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.0f, 0.74f, -1.82f, 1.7f, -1.97f)
                curveToRelative(-0.06f, -0.35f, -0.03f, -0.63f, 0.02f, -1.03f)
                horizontalLineToRelative(-1.73f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.15f)
                curveToRelative(0.09f, -0.36f, 0.18f, -0.7f, 0.27f, -1f)
                horizontalLineToRelative(-0.42f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.19f)
                curveToRelative(0.4f, -0.61f, 0.96f, -1f, 1.81f, -1f)
                curveToRelative(0.9f, 0f, 1.43f, 0.32f, 1.84f, 1f)
                horizontalLineToRelative(1.16f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _BugFolder = it}
