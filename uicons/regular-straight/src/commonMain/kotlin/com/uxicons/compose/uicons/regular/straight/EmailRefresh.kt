package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailRefresh: ImageVector? = null

val Icons.Rs.EmailRefresh: ImageVector
    get() = _EmailRefresh ?: UXIcon(name = "EmailRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12.92f)
                curveToRelative(0.75f, -0.44f, 1.43f, -0.99f, 2f, -1.64f)
                verticalLineToRelative(12.72f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.59f)
                curveToRelative(-0.26f, 0.63f, -0.43f, 1.3f, -0.52f, 2f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(0.76f, -0.76f)
                curveToRelative(0.7f, 0.3f, 1.46f, 0.5f, 2.25f, 0.58f)
                lineToRelative(-1.59f, 1.59f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineTo(2f, 9.07f)
                verticalLineToRelative(12.93f)
                lineTo(22f, 22f)
                lineTo(22f, 12.92f)
                close()
                moveTo(22.23f, 1.77f)
                curveToRelative(-1.08f, -1.09f, -2.58f, -1.77f, -4.23f, -1.77f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(2.97f, 0f, 5.43f, -2.17f, 5.91f, -5f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3f, -3.86f, 3f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(1.1f, 0f, 2.1f, 0.46f, 2.82f, 1.18f)
                lineToRelative(-1.82f, 1.82f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(24f, 0f)
                lineToRelative(-1.77f, 1.77f)
                close()
            }
        }.also { _EmailRefresh = it}
