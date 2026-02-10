package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSquareRefresh: ImageVector? = null

val Icons.Sr.MessageSquareRefresh: ImageVector
    get() = _MessageSquareRefresh ?: UXIcon(name = "MessageSquareRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(16.85f)
                curveToRelative(0f, 1.2f, 0.93f, 2.14f, 2.12f, 2.14f)
                curveToRelative(0.43f, 0f, 0.88f, -0.13f, 1.29f, -0.41f)
                lineToRelative(4.44f, -3.58f)
                horizontalLineToRelative(11.15f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(18f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.64f)
                curveToRelative(-0.72f, -0.63f, -1.64f, -1f, -2.64f, -1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(1.59f, 0f, 3.03f, -0.94f, 3.67f, -2.4f)
                curveToRelative(0.22f, -0.51f, 0.81f, -0.74f, 1.32f, -0.52f)
                curveToRelative(0.51f, 0.22f, 0.74f, 0.81f, 0.52f, 1.32f)
                curveToRelative(-0.96f, 2.19f, -3.11f, 3.6f, -5.5f, 3.6f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                curveToRelative(1.5f, 0f, 2.91f, 0.58f, 4f, 1.55f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _MessageSquareRefresh = it}
