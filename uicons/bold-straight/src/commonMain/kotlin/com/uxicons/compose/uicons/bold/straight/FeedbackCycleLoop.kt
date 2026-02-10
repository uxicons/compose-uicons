package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeedbackCycleLoop: ImageVector? = null

val Icons.Bs.FeedbackCycleLoop: ImageVector
    get() = _FeedbackCycleLoop ?: UXIcon(name = "FeedbackCycleLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 12f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(3.2f, 0f, 6.24f, 1.3f, 8.47f, 3.53f)
                lineToRelative(2.53f, -2.53f)
                verticalLineToRelative(5.91f)
                curveToRelative(0f, 0.6f, -0.49f, 1.09f, -1.09f, 1.09f)
                horizontalLineToRelative(-5.91f)
                lineToRelative(2.35f, -2.35f)
                curveToRelative(-1.67f, -1.67f, -3.95f, -2.65f, -6.35f, -2.65f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                close()
                moveTo(16.78f, 17.87f)
                curveToRelative(0.53f, 0.34f, 1.22f, -0.04f, 1.22f, -0.67f)
                lineToRelative(0.0f, -5.71f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineToRelative(-5.0f, -0.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.5f)
                lineToRelative(2.28f, 1.87f)
                close()
                moveTo(11.5f, 8f)
                horizontalLineToRelative(2.5f)
                reflectiveCurveToRelative(0f, -0.5f, 0f, -0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineToRelative(-5.0f, 0.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.71f)
                curveToRelative(0.0f, 0.62f, 0.69f, 1.0f, 1.22f, 0.67f)
                lineToRelative(0.78f, -0.64f)
                verticalLineToRelative(-1.73f)
                curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.03f, -2.48f)
                curveToRelative(0.66f, -0.66f, 1.54f, -1.02f, 2.47f, -1.02f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                curveToRelative(-2.4f, 0f, -4.68f, -0.98f, -6.35f, -2.65f)
                lineToRelative(2.35f, -2.35f)
                lineTo(2.09f, 16f)
                curveToRelative(-0.6f, 0f, -1.09f, 0.49f, -1.09f, 1.09f)
                verticalLineToRelative(5.91f)
                lineToRelative(2.53f, -2.53f)
                curveToRelative(2.23f, 2.23f, 5.27f, 3.53f, 8.47f, 3.53f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _FeedbackCycleLoop = it}
