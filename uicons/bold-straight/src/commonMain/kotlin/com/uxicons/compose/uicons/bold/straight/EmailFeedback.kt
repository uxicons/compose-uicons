package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailFeedback: ImageVector? = null

val Icons.Bs.EmailFeedback: ImageVector
    get() = _EmailFeedback ?: UXIcon(name = "EmailFeedback") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(0.28f)
                lineToRelative(7.36f, 7.54f)
                curveToRelative(0.88f, 0.88f, 2.4f, 0.88f, 3.28f, 0f)
                lineToRelative(0.46f, -0.46f)
                curveToRelative(0.58f, -0.0f, 1.16f, -0.17f, 1.71f, -0.53f)
                lineToRelative(1.94f, -1.34f)
                horizontalLineToRelative(2.45f)
                lineToRelative(-4.44f, 4.44f)
                curveToRelative(-1.0f, 1.0f, -2.34f, 1.56f, -3.76f, 1.56f)
                reflectiveCurveToRelative(-2.76f, -0.55f, -3.76f, -1.56f)
                lineToRelative(-5.24f, -5.39f)
                verticalLineToRelative(9.95f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(3f)
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
