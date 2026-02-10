package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarCommentAlt: ImageVector? = null

val Icons.Ts.StarCommentAlt: ImageVector
    get() = _StarCommentAlt ?: UXIcon(name = "StarCommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 20f)
                lineTo(7.11f, 20f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.29f, 0.25f, 0.64f, 0.38f, 1f, 0.38f)
                reflectiveCurveToRelative(0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.99f, -3.3f)
                horizontalLineToRelative(7.03f)
                lineTo(24.01f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-6.39f)
                lineToRelative(-4.28f, 3.54f)
                curveToRelative(-0.19f, 0.17f, -0.48f, 0.17f, -0.67f, 0f)
                lineToRelative(-4.19f, -3.53f)
                lineTo(1f, 19.01f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 19f)
                close()
                moveTo(12.42f, 3.66f)
                horizontalLineToRelative(-0.85f)
                lineToRelative(-1.52f, 4.34f)
                lineTo(5.71f, 8f)
                verticalLineToRelative(0.83f)
                lineToRelative(3.13f, 2.52f)
                lineToRelative(-1.17f, 3.9f)
                lineToRelative(0.67f, 0.51f)
                lineToRelative(3.66f, -2.37f)
                lineToRelative(3.65f, 2.37f)
                lineToRelative(0.67f, -0.51f)
                lineToRelative(-1.17f, -3.91f)
                lineToRelative(3.13f, -2.52f)
                verticalLineToRelative(-0.83f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(-1.52f, -4.34f)
                close()
                moveTo(14.01f, 10.99f)
                lineToRelative(0.93f, 3.12f)
                lineToRelative(-2.94f, -1.91f)
                lineToRelative(-2.94f, 1.91f)
                lineToRelative(0.93f, -3.12f)
                lineToRelative(-2.47f, -1.99f)
                horizontalLineToRelative(3.25f)
                lineToRelative(1.24f, -3.53f)
                lineToRelative(1.24f, 3.53f)
                horizontalLineToRelative(3.25f)
                lineToRelative(-2.47f, 1.99f)
                close()
            }
        }.also { _StarCommentAlt = it}
