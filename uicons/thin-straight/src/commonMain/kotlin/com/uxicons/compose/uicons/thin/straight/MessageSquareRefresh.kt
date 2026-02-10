package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSquareRefresh: ImageVector? = null

val Icons.Ts.MessageSquareRefresh: ImageVector
    get() = _MessageSquareRefresh ?: UXIcon(name = "MessageSquareRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.57f)
                curveToRelative(-0.79f, -1.81f, -2.56f, -3f, -4.57f, -3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(1.01f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                curveToRelative(2.06f, 0f, 3.91f, 1.05f, 5f, 2.7f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(-16.82f)
                lineToRelative(-4.58f, 3.69f)
                curveToRelative(-0.3f, 0.2f, -0.63f, 0.3f, -0.96f, 0.3f)
                curveToRelative(-0.97f, 0f, -1.64f, -0.76f, -1.64f, -1.65f)
                verticalLineToRelative(-19.85f)
                curveToRelative(-0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(19.85f)
                curveToRelative(0f, 0.24f, 0.13f, 0.46f, 0.34f, 0.57f)
                curveToRelative(0.21f, 0.12f, 0.46f, 0.1f, 0.67f, -0.03f)
                lineToRelative(4.82f, -3.89f)
                horizontalLineToRelative(16.18f)
                close()
            }
        }.also { _MessageSquareRefresh = it}
