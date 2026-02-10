package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderboardTrophy: ImageVector? = null

val Icons.Br.LeaderboardTrophy: ImageVector
    get() = _LeaderboardTrophy ?: UXIcon(name = "LeaderboardTrophy") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(19f, 17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(6.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(10.34f, 12f)
            horizontalLineToRelative(0.66f)
            verticalLineToRelative(1f)
            reflectiveCurveToRelative(-1f, 0f, -1f, 0f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(0.66f)
            curveToRelative(2.55f, 0f, 4.5f, -1.26f, 5.23f, -3.37f)
            curveToRelative(0.21f, -0.6f, 0.11f, -1.27f, -0.26f, -1.79f)
            curveToRelative(-0.38f, -0.53f, -0.99f, -0.85f, -1.64f, -0.85f)
            horizontalLineToRelative(-1.01f)
            curveToRelative(0.07f, -0.53f, -0.35f, -1f, -0.89f, -1f)
            curveToRelative(-1.56f, 0f, -4.62f, 0f, -6.18f, 0f)
            curveToRelative(-0.54f, 0f, -0.96f, 0.47f, -0.89f, 1f)
            horizontalLineToRelative(-1.01f)
            curveToRelative(-0.65f, 0f, -1.26f, 0.32f, -1.64f, 0.85f)
            curveToRelative(-0.37f, 0.52f, -0.47f, 1.19f, -0.26f, 1.79f)
            curveToRelative(0.73f, 2.11f, 2.68f, 3.37f, 5.23f, 3.37f)
            close()
            moveTo(17.0f, 7.98f)
            curveToRelative(-0.44f, 1.28f, -1.66f, 2.02f, -3.34f, 2.02f)
            horizontalLineToRelative(-0.26f)
            curveToRelative(0.14f, -0.19f, 0.3f, -0.36f, 0.49f, -0.51f)
            curveToRelative(0.57f, -0.41f, 1f, -0.94f, 1.34f, -1.5f)
            lineToRelative(1.77f, -0.01f)
            close()
            moveTo(8.78f, 8f)
            curveToRelative(0.34f, 0.56f, 0.77f, 1.08f, 1.33f, 1.49f)
            curveToRelative(0.2f, 0.14f, 0.35f, 0.32f, 0.49f, 0.51f)
            horizontalLineToRelative(-0.26f)
            curveToRelative(-1.68f, 0f, -2.9f, -0.73f, -3.32f, -2f)
            horizontalLineToRelative(1.76f)
            close()
        }
    }.also { _LeaderboardTrophy = it }
