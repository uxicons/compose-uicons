package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailRefresh: ImageVector? = null

val Icons.Rr.EmailRefresh: ImageVector
    get() = _EmailRefresh ?: UXIcon(name = "EmailRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineTo(5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(8f)
                curveTo(0f, 5.24f, 2.24f, 3f, 5f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(5f)
                curveToRelative(-1.15f, 0f, -2.13f, 0.66f, -2.64f, 1.6f)
                lineToRelative(7.52f, 7.52f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(0.33f, -0.33f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.42f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-0.33f, 0.33f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineTo(2f, 9.07f)
                verticalLineToRelative(9.93f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(22.57f, 0.24f)
                lineToRelative(-0.98f, 0.96f)
                curveToRelative(-1.02f, -0.77f, -2.27f, -1.2f, -3.59f, -1.2f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(2.39f, 0f, 4.54f, -1.41f, 5.5f, -3.6f)
                curveToRelative(0.22f, -0.51f, -0.01f, -1.1f, -0.52f, -1.32f)
                curveToRelative(-0.51f, -0.22f, -1.09f, 0.01f, -1.32f, 0.52f)
                curveToRelative(-0.64f, 1.46f, -2.08f, 2.4f, -3.67f, 2.4f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(0.77f, 0f, 1.49f, 0.24f, 2.12f, 0.64f)
                lineToRelative(-0.99f, 0.97f)
                curveToRelative(-0.53f, 0.52f, -0.15f, 1.4f, 0.59f, 1.4f)
                horizontalLineToRelative(3.02f)
                curveToRelative(0.7f, 0f, 1.26f, -0.55f, 1.26f, -1.23f)
                verticalLineTo(0.82f)
                curveToRelative(0f, -0.73f, -0.9f, -1.09f, -1.43f, -0.58f)
                close()
            }
        }.also { _EmailRefresh = it}
