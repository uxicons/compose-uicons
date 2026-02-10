package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailFeedback: ImageVector? = null

val Icons.Rs.EmailFeedback: ImageVector
    get() = _EmailFeedback ?: UXIcon(name = "EmailFeedback") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-18f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(2.12f, -2.12f)
                horizontalLineToRelative(2.83f)
                lineToRelative(-3.54f, 3.54f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineToRelative(-6.46f, -6.47f)
                verticalLineToRelative(12.93f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13.0f, 10.77f)
                lineTo(13f, 2.0f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2.0f, -2.0f)
                lineToRelative(7f, -0.0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-6.87f)
                lineToRelative(-2.45f, 1.69f)
                curveToRelative(-0.19f, 0.12f, -0.39f, 0.17f, -0.58f, 0.17f)
                curveToRelative(-0.57f, 0f, -1.09f, -0.45f, -1.09f, -1.09f)
                close()
                moveTo(15.0f, 4.52f)
                lineTo(16.93f, 5.6f)
                lineTo(16.18f, 7.98f)
                lineTo(16.6f, 8.3f)
                lineTo(18.51f, 6.82f)
                lineTo(20.41f, 8.29f)
                lineTo(20.85f, 7.99f)
                lineTo(20.08f, 5.63f)
                lineTo(22f, 4.52f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(-2.52f)
                lineToRelative(-0.69f, -2.64f)
                horizontalLineToRelative(-0.57f)
                lineToRelative(-0.69f, 2.64f)
                horizontalLineToRelative(-2.54f)
                verticalLineToRelative(0.52f)
                close()
            }
        }.also { _EmailFeedback = it}
