package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailFeedback: ImageVector? = null

val Icons.Ss.EmailFeedback: ImageVector
    get() = _EmailFeedback ?: UXIcon(name = "EmailFeedback") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0f)
                lineToRelative(-7f, 0.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2.0f)
                lineToRelative(0.0f, 8.77f)
                curveToRelative(0f, 0.64f, 0.52f, 1.09f, 1.09f, 1.09f)
                curveToRelative(0.2f, 0f, 0.4f, -0.05f, 0.58f, -0.17f)
                lineToRelative(2.45f, -1.69f)
                horizontalLineToRelative(6.87f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22.0f, 4.52f)
                lineTo(20.08f, 5.63f)
                lineTo(20.85f, 7.99f)
                lineTo(20.41f, 8.29f)
                lineTo(18.51f, 6.82f)
                lineTo(16.59f, 8.3f)
                lineTo(16.17f, 7.98f)
                lineTo(16.93f, 5.6f)
                lineTo(15.0f, 4.52f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(2.54f)
                lineToRelative(0.69f, -2.64f)
                horizontalLineToRelative(0.57f)
                lineToRelative(0.69f, 2.64f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(0.52f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-16.93f)
                lineToRelative(8.46f, 8.46f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(3.54f, -3.54f)
                horizontalLineToRelative(4.93f)
                close()
                moveTo(9.88f, 14.12f)
                lineTo(0.36f, 4.6f)
                curveToRelative(0.5f, -0.95f, 1.49f, -1.6f, 2.64f, -1.6f)
                horizontalLineToRelative(8f)
                lineToRelative(0.0f, 7.78f)
                curveToRelative(0.0f, 1.7f, 1.39f, 3.09f, 3.09f, 3.09f)
                curveToRelative(0.1f, 0f, 0.21f, -0.01f, 0.31f, -0.02f)
                lineToRelative(-0.28f, 0.28f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                close()
            }
        }.also { _EmailFeedback = it}
