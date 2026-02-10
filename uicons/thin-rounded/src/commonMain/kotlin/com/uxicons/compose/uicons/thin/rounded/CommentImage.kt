package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentImage: ImageVector? = null

val Icons.Tr.CommentImage: ImageVector
    get() = _CommentImage ?: UXIcon(name = "CommentImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 19.5f)
                verticalLineToRelative(-7.14f)
                curveToRelative(0f, -3.4f, -1.39f, -6.69f, -3.82f, -9.03f)
                curveTo(17.86f, 1.08f, 14.82f, -0.12f, 11.63f, 0.01f)
                curveTo(5.31f, 0.23f, 0.09f, 5.54f, 0.0f, 11.86f)
                curveToRelative(-0.04f, 3.1f, 1.13f, 6.03f, 3.31f, 8.24f)
                curveToRelative(2.47f, 2.51f, 5.96f, 3.89f, 9.81f, 3.89f)
                horizontalLineToRelative(6.37f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(19.48f, 4.04f)
                curveToRelative(2.23f, 2.16f, 3.52f, 5.19f, 3.52f, 8.31f)
                verticalLineToRelative(7.14f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.37f)
                curveToRelative(-3.58f, 0f, -6.82f, -1.28f, -9.1f, -3.6f)
                curveToRelative(-1.99f, -2.02f, -3.07f, -4.7f, -3.03f, -7.53f)
                curveTo(1.09f, 6.08f, 5.87f, 1.21f, 11.66f, 1.01f)
                curveToRelative(0.12f, -0.0f, 0.25f, -0.01f, 0.37f, -0.01f)
                curveToRelative(2.78f, 0f, 5.42f, 1.07f, 7.45f, 3.04f)
                close()
                moveTo(5.35f, 16.85f)
                lineToRelative(5.29f, -5.29f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(2.59f, 2.59f)
                curveToRelative(0.58f, 0.58f, 1.54f, 0.58f, 2.12f, 0f)
                lineToRelative(4.29f, -4.29f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-4.29f, 4.29f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-2.59f, -2.59f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0f)
                lineToRelative(-5.29f, 5.29f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                close()
            }
        }.also { _CommentImage = it}
