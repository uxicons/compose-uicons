package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageCircleRefresh: ImageVector? = null

val Icons.Bs.MessageCircleRefresh: ImageVector
    get() = _MessageCircleRefresh ?: UXIcon(name = "MessageCircleRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.82f, 13f)
                horizontalLineToRelative(3.09f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                curveToRelative(1.37f, 0f, 2.66f, 0.47f, 3.71f, 1.29f)
                lineToRelative(1.29f, -1.29f)
                verticalLineToRelative(4.23f)
                curveToRelative(0f, 0.42f, -0.34f, 0.77f, -0.77f, 0.77f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(1.55f, -1.55f)
                curveToRelative(-0.46f, -0.28f, -0.99f, -0.45f, -1.55f, -0.45f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -6.62f, 5.38f, -12f, 12f, -12f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 4.04f, -9f, 9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(9f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _MessageCircleRefresh = it}
