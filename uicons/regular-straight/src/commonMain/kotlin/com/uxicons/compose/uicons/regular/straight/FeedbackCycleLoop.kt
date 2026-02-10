package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeedbackCycleLoop: ImageVector? = null

val Icons.Rs.FeedbackCycleLoop: ImageVector
    get() = _FeedbackCycleLoop ?: UXIcon(name = "FeedbackCycleLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-4.05f, 0f, -7.79f, -2.06f, -9.99f, -5.37f)
                lineToRelative(-0.01f, 2.37f)
                lineTo(0f, 21f)
                verticalLineToRelative(-3.99f)
                curveToRelative(0f, -1.11f, 0.9f, -2.01f, 2.01f, -2.01f)
                horizontalLineToRelative(3.99f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(1.78f, 3.06f, 5.05f, 5f, 8.64f, 5f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                close()
                moveTo(22f, 3f)
                lineToRelative(-0.01f, 2.35f)
                curveTo(19.81f, 2.04f, 16.11f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(2f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(3.64f, 0f, 6.9f, 1.92f, 8.66f, 5f)
                horizontalLineToRelative(-2.67f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.99f)
                curveToRelative(1.11f, 0f, 2.01f, -0.9f, 2.01f, -2.01f)
                verticalLineToRelative(-3.99f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(15f, 6.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineToRelative(-0.0f, 7.71f)
                curveToRelative(0f, 0.46f, -0.38f, 0.79f, -0.79f, 0.79f)
                curveToRelative(-0.14f, 0f, -0.29f, -0.04f, -0.42f, -0.13f)
                lineToRelative(-2.31f, -1.87f)
                horizontalLineToRelative(-5.47f)
                verticalLineToRelative(-4.07f)
                lineToRelative(-1.78f, 1.44f)
                curveToRelative(-0.14f, 0.09f, -0.28f, 0.13f, -0.42f, 0.13f)
                curveToRelative(-0.41f, 0f, -0.79f, -0.33f, -0.79f, -0.79f)
                lineToRelative(-0.0f, -7.21f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _FeedbackCycleLoop = it}
