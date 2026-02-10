package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSquareRefresh: ImageVector? = null

val Icons.Tr.MessageSquareRefresh: ImageVector
    get() = _MessageSquareRefresh ?: UXIcon(name = "MessageSquareRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                horizontalLineToRelative(-15f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(17.85f)
                curveToRelative(0f, 0.93f, 0.69f, 1.65f, 1.64f, 1.65f)
                curveToRelative(0.32f, 0f, 0.65f, -0.1f, 0.94f, -0.29f)
                lineToRelative(5.08f, -3.71f)
                horizontalLineToRelative(11.84f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 15.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.11f, 0f, -0.21f, 0.03f, -0.29f, 0.1f)
                lineToRelative(-5.2f, 3.79f)
                curveToRelative(-0.2f, 0.14f, -0.45f, 0.15f, -0.67f, 0.03f)
                reflectiveCurveToRelative(-0.34f, -0.33f, -0.34f, -0.57f)
                verticalLineToRelative(-17.85f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18f, 4.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.07f)
                curveToRelative(-0.79f, -1.81f, -2.56f, -3f, -4.57f, -3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(2.23f, 0f, 4.21f, -1.5f, 4.81f, -3.64f)
                curveToRelative(0.07f, -0.27f, 0.35f, -0.42f, 0.62f, -0.34f)
                curveToRelative(0.27f, 0.07f, 0.42f, 0.35f, 0.34f, 0.62f)
                curveToRelative(-0.73f, 2.57f, -3.1f, 4.36f, -5.77f, 4.36f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                curveToRelative(2.06f, 0f, 3.91f, 1.05f, 5f, 2.7f)
                verticalLineToRelative(-2.2f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _MessageSquareRefresh = it}
