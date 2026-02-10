package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUp: ImageVector? = null

val Icons.Tr.CommentArrowUp: ImageVector
    get() = _CommentArrowUp ?: UXIcon(name = "CommentArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.18f, 3.32f)
                curveTo(17.86f, 1.08f, 14.82f, -0.12f, 11.63f, 0.01f)
                curveTo(5.31f, 0.23f, 0.09f, 5.54f, 0.0f, 11.86f)
                curveToRelative(-0.04f, 3.1f, 1.13f, 6.03f, 3.31f, 8.24f)
                curveToRelative(2.48f, 2.51f, 5.96f, 3.89f, 9.81f, 3.89f)
                horizontalLineToRelative(6.37f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.14f)
                curveToRelative(0f, -3.4f, -1.39f, -6.69f, -3.82f, -9.03f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.37f)
                curveToRelative(-3.58f, 0f, -6.82f, -1.28f, -9.1f, -3.6f)
                curveToRelative(-1.99f, -2.02f, -3.07f, -4.7f, -3.03f, -7.53f)
                curveTo(1.09f, 6.08f, 5.87f, 1.21f, 11.66f, 1.01f)
                curveToRelative(0.12f, -0.0f, 0.25f, -0.01f, 0.37f, -0.01f)
                curveToRelative(2.78f, 0f, 5.42f, 1.07f, 7.45f, 3.04f)
                curveToRelative(2.23f, 2.16f, 3.52f, 5.19f, 3.52f, 8.31f)
                verticalLineToRelative(7.14f)
                close()
                moveTo(16.85f, 9.77f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(-0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-3.04f, -3.04f)
                curveToRelative(-0.18f, -0.18f, -0.39f, -0.3f, -0.61f, -0.37f)
                verticalLineToRelative(10.43f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(11.5f, 7.1f)
                curveToRelative(-0.19f, 0.07f, -0.36f, 0.18f, -0.51f, 0.33f)
                lineToRelative(-3.14f, 3.14f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.14f, -3.14f)
                curveToRelative(0.97f, -0.97f, 2.56f, -0.98f, 3.54f, 0f)
                lineToRelative(3.04f, 3.04f)
                close()
            }
        }.also { _CommentArrowUp = it}
