package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowDown: ImageVector? = null

val Icons.Tr.CommentArrowDown: ImageVector
    get() = _CommentArrowDown ?: UXIcon(name = "CommentArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.85f, 13.53f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-3.04f, 3.04f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.62f, -0.02f, -1.24f, -0.26f, -1.71f, -0.73f)
                lineToRelative(-3.14f, -3.14f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(3.14f, 3.14f)
                curveToRelative(0.15f, 0.15f, 0.32f, 0.26f, 0.51f, 0.33f)
                lineTo(11.5f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10.43f)
                curveToRelative(0.22f, -0.07f, 0.43f, -0.19f, 0.61f, -0.37f)
                lineToRelative(3.04f, -3.04f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                close()
                moveTo(24f, 12.36f)
                verticalLineToRelative(7.14f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-6.37f)
                curveToRelative(-3.85f, 0f, -7.34f, -1.38f, -9.81f, -3.89f)
                curveTo(1.14f, 17.89f, -0.04f, 14.96f, 0.0f, 11.86f)
                curveTo(0.09f, 5.54f, 5.31f, 0.23f, 11.63f, 0.01f)
                curveToRelative(3.2f, -0.11f, 6.23f, 1.07f, 8.55f, 3.31f)
                curveToRelative(2.43f, 2.35f, 3.82f, 5.64f, 3.82f, 9.03f)
                close()
                moveTo(23f, 12.36f)
                curveToRelative(0f, -3.13f, -1.28f, -6.16f, -3.52f, -8.31f)
                curveToRelative(-2.04f, -1.97f, -4.67f, -3.04f, -7.45f, -3.04f)
                curveToRelative(-0.12f, 0f, -0.25f, 0.0f, -0.37f, 0.01f)
                curveTo(5.87f, 1.21f, 1.09f, 6.08f, 1.0f, 11.88f)
                curveToRelative(-0.04f, 2.83f, 1.03f, 5.51f, 3.03f, 7.53f)
                curveToRelative(2.29f, 2.32f, 5.52f, 3.6f, 9.1f, 3.6f)
                horizontalLineToRelative(6.37f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-7.14f)
                close()
            }
        }.also { _CommentArrowDown = it}
