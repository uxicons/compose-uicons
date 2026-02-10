package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSquareRefresh: ImageVector? = null

val Icons.Ss.MessageSquareRefresh: ImageVector
    get() = _MessageSquareRefresh ?: UXIcon(name = "MessageSquareRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(18.85f)
                curveToRelative(0f, 0.79f, 0.43f, 1.52f, 1.14f, 1.89f)
                curveToRelative(0.31f, 0.17f, 0.65f, 0.25f, 0.99f, 0.25f)
                curveToRelative(0.43f, 0f, 0.88f, -0.13f, 1.29f, -0.41f)
                lineToRelative(4.44f, -3.58f)
                horizontalLineToRelative(16.15f)
                verticalLineToRelative(-17.0f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 7.5f)
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
                verticalLineToRelative(-1.55f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _MessageSquareRefresh = it}
