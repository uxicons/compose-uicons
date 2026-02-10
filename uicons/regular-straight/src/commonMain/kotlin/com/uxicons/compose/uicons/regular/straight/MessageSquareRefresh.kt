package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSquareRefresh: ImageVector? = null

val Icons.Rs.MessageSquareRefresh: ImageVector
    get() = _MessageSquareRefresh ?: UXIcon(name = "MessageSquareRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.64f)
                curveToRelative(-0.72f, -0.63f, -1.64f, -1f, -2.64f, -1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(1.86f, 0f, 3.41f, -1.28f, 3.86f, -3f)
                horizontalLineToRelative(2.05f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                curveToRelative(1.5f, 0f, 2.91f, 0.58f, 4f, 1.55f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-16.15f)
                lineToRelative(-4.44f, 3.58f)
                curveToRelative(-0.41f, 0.28f, -0.85f, 0.42f, -1.29f, 0.42f)
                curveToRelative(-1.23f, 0f, -2.12f, -0.99f, -2.12f, -2.15f)
                verticalLineToRelative(-18.85f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(18.85f)
                curveToRelative(0f, 0.15f, 0.14f, 0.18f, 0.23f, 0.12f)
                lineToRelative(4.92f, -3.97f)
                horizontalLineToRelative(14.85f)
                verticalLineToRelative(-15f)
                close()
            }
        }.also { _MessageSquareRefresh = it}
