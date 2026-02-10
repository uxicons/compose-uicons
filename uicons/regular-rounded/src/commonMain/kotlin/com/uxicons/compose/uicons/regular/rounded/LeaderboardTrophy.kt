package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderboardTrophy: ImageVector? = null

val Icons.Rr.LeaderboardTrophy: ImageVector
    get() = _LeaderboardTrophy ?: UXIcon(name = "LeaderboardTrophy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(19f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(10.34f, 11f)
                horizontalLineToRelative(0.67f)
                verticalLineToRelative(0.72f)
                curveToRelative(0f, 1.33f, -1.22f, 1.27f, -1.22f, 1.27f)
                curveToRelative(0f, 0f, -0.78f, 0.45f, -0.78f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.78f, -1f, -0.78f, -1f)
                curveToRelative(0f, 0f, -1.22f, 0.06f, -1.22f, -1.27f)
                verticalLineToRelative(-0.72f)
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
                moveTo(17.0f, 6.98f)
                curveToRelative(-0.44f, 1.28f, -1.66f, 2.02f, -3.34f, 2.02f)
                horizontalLineToRelative(-0.26f)
                curveToRelative(0.14f, -0.19f, 0.3f, -0.36f, 0.49f, -0.51f)
                curveToRelative(0.57f, -0.41f, 1.0f, -0.94f, 1.33f, -1.5f)
                lineToRelative(1.77f, -0.01f)
                close()
                moveTo(8.78f, 7f)
                curveToRelative(0.34f, 0.56f, 0.77f, 1.08f, 1.33f, 1.49f)
                curveToRelative(0.2f, 0.14f, 0.35f, 0.32f, 0.49f, 0.51f)
                horizontalLineToRelative(-0.26f)
                curveToRelative(-1.68f, 0f, -2.9f, -0.73f, -3.32f, -2f)
                horizontalLineToRelative(1.76f)
                close()
            }
        }.also { _LeaderboardTrophy = it}
