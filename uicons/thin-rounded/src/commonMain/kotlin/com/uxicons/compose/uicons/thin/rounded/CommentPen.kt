package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentPen: ImageVector? = null

val Icons.Tr.CommentPen: ImageVector
    get() = _CommentPen ?: UXIcon(name = "CommentPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.24f, 18f)
                horizontalLineToRelative(-1.74f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -1.02f, 0.4f, -1.97f, 1.11f, -2.69f)
                lineToRelative(6.28f, -6.28f)
                curveToRelative(1.02f, -1.02f, 2.8f, -1.02f, 3.82f, 0f)
                curveToRelative(0.51f, 0.51f, 0.79f, 1.19f, 0.79f, 1.91f)
                reflectiveCurveToRelative(-0.28f, 1.4f, -0.79f, 1.91f)
                lineToRelative(-6.28f, 6.28f)
                curveToRelative(-0.72f, 0.72f, -1.67f, 1.11f, -2.69f, 1.11f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(1.24f)
                curveToRelative(0.74f, 0f, 1.46f, -0.3f, 1.98f, -0.82f)
                lineToRelative(6.28f, -6.28f)
                curveToRelative(0.32f, -0.32f, 0.5f, -0.75f, 0.5f, -1.2f)
                reflectiveCurveToRelative(-0.18f, -0.88f, -0.5f, -1.2f)
                curveToRelative(-0.66f, -0.66f, -1.74f, -0.66f, -2.4f, 0f)
                lineToRelative(-6.28f, 6.28f)
                curveToRelative(-0.53f, 0.53f, -0.82f, 1.23f, -0.82f, 1.98f)
                verticalLineToRelative(1.24f)
                close()
                moveTo(19.5f, 24f)
                horizontalLineToRelative(-6.37f)
                curveToRelative(-3.85f, 0f, -7.34f, -1.38f, -9.81f, -3.89f)
                curveTo(1.14f, 17.89f, -0.04f, 14.96f, 0.0f, 11.86f)
                curveTo(0.09f, 5.54f, 5.31f, 0.23f, 11.63f, 0.01f)
                curveToRelative(3.2f, -0.12f, 6.23f, 1.07f, 8.55f, 3.31f)
                curveToRelative(2.43f, 2.35f, 3.82f, 5.64f, 3.82f, 9.03f)
                verticalLineToRelative(7.14f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(12.03f, 1.0f)
                curveToRelative(-0.12f, 0f, -0.25f, 0.0f, -0.37f, 0.01f)
                curveTo(5.87f, 1.21f, 1.09f, 6.08f, 1.0f, 11.88f)
                curveToRelative(-0.04f, 2.83f, 1.03f, 5.51f, 3.03f, 7.53f)
                curveToRelative(2.28f, 2.32f, 5.52f, 3.6f, 9.1f, 3.6f)
                horizontalLineToRelative(6.37f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-7.14f)
                curveToRelative(0f, -3.13f, -1.28f, -6.16f, -3.52f, -8.31f)
                curveToRelative(-2.04f, -1.97f, -4.67f, -3.04f, -7.45f, -3.04f)
                close()
            }
        }.also { _CommentPen = it}
