package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSquareRefresh: ImageVector? = null

val Icons.Bs.MessageSquareRefresh: ImageVector
    get() = _MessageSquareRefresh ?: UXIcon(name = "MessageSquareRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.53f, 6.47f)
                lineToRelative(1.47f, -1.47f)
                verticalLineToRelative(4.23f)
                curveToRelative(0f, 0.42f, -0.34f, 0.77f, -0.77f, 0.77f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(1.4f, -1.4f)
                curveToRelative(-0.37f, -0.37f, -0.86f, -0.6f, -1.4f, -0.6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4.58f)
                curveToRelative(-0.77f, 1.76f, -2.53f, 3f, -4.58f, 3f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                curveToRelative(1.35f, 0f, 2.61f, 0.55f, 3.53f, 1.47f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(-15.55f)
                lineToRelative(-5.55f, 3.69f)
                curveToRelative(-0.47f, 0.29f, -0.69f, 0.3f, -1.02f, 0.3f)
                curveToRelative(-1.03f, 0f, -1.87f, -0.84f, -1.87f, -1.87f)
                lineToRelative(-0.01f, -18.62f)
                curveToRelative(0f, -0.93f, 0.36f, -1.81f, 1.03f, -2.47f)
                curveToRelative(0.66f, -0.66f, 1.54f, -1.03f, 2.47f, -1.03f)
                lineToRelative(17f, -0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.93f, 0f, 1.81f, 0.36f, 2.47f, 1.02f)
                reflectiveCurveToRelative(1.02f, 1.54f, 1.02f, 2.48f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.18f, -0.09f, -0.3f, -0.15f, -0.35f)
                curveToRelative(-0.06f, -0.05f, -0.17f, -0.15f, -0.35f, -0.15f)
                lineToRelative(-17f, 0.0f)
                curveToRelative(-0.18f, 0f, -0.3f, 0.09f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.15f, 0.17f, -0.15f, 0.35f)
                lineToRelative(0.01f, 16.5f)
                lineToRelative(4.54f, -3.0f)
                horizontalLineToRelative(13.45f)
                verticalLineToRelative(-13.51f)
                close()
            }
        }.also { _MessageSquareRefresh = it}
