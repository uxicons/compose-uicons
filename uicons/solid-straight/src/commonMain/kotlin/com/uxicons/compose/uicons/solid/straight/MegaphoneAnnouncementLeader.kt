package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MegaphoneAnnouncementLeader: ImageVector? = null

val Icons.Ss.MegaphoneAnnouncementLeader: ImageVector
    get() = _MegaphoneAnnouncementLeader ?: UXIcon(name = "MegaphoneAnnouncementLeader") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
                verticalLineTo(0f)
                reflectiveCurveToRelative(-1.89f, 0f, -1.89f, 0f)
                lineToRelative(-0.21f, 0.72f)
                curveToRelative(-0.24f, 0.82f, -0.91f, 1.28f, -1.91f, 1.28f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.74f, 0.41f, 1.38f, 1.01f, 1.73f)
                lineToRelative(1.41f, 3.23f)
                lineToRelative(-1.97f, 2.05f)
                horizontalLineTo(3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8f)
                lineToRelative(4.3f, -1f)
                reflectiveCurveToRelative(3.45f, -3.62f, 3.47f, -3.64f)
                curveToRelative(0.26f, -0.4f, 0.3f, -0.9f, 0.11f, -1.34f)
                lineToRelative(-0.87f, -2.02f)
                horizontalLineToRelative(0.99f)
                curveToRelative(0.99f, 0f, 1.67f, 0.45f, 1.91f, 1.28f)
                lineToRelative(0.21f, 0.72f)
                horizontalLineToRelative(1.89f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0.58f, -0.21f, 1.0f, -0.76f, 1.0f, -1.41f)
                close()
                moveTo(7f, 11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(9.76f, 1f, 7f, 1f)
                reflectiveCurveTo(2f, 3.24f, 2f, 6f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
            }
        }.also { _MegaphoneAnnouncementLeader = it}
