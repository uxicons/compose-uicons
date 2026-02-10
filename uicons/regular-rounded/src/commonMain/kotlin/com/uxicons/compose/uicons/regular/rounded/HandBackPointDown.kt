package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Rr.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.01f, 24f)
                curveToRelative(-0.71f, 0f, -1.4f, -0.25f, -1.95f, -0.71f)
                curveToRelative(-0.67f, -0.57f, -1.06f, -1.4f, -1.06f, -2.29f)
                lineToRelative(0.02f, -7.27f)
                lineToRelative(-3.94f, -3.92f)
                curveToRelative(-0.69f, -0.69f, -1.07f, -1.6f, -1.07f, -2.58f)
                curveToRelative(-0.0f, -0.97f, 0.38f, -1.89f, 1.07f, -2.58f)
                lineToRelative(2.31f, -2.31f)
                curveTo(5.88f, 0.83f, 7.89f, 0f, 10.03f, 0f)
                horizontalLineToRelative(6.97f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(4.72f)
                curveToRelative(0f, 2.38f, -1.69f, 4.44f, -4.02f, 4.9f)
                lineToRelative(-5.98f, 1.2f)
                verticalLineToRelative(5.07f)
                curveToRelative(0f, 1.52f, -1.08f, 2.83f, -2.5f, 3.07f)
                curveToRelative(-0.16f, 0.03f, -0.33f, 0.04f, -0.49f, 0.04f)
                close()
                moveTo(7.04f, 6f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                lineToRelative(-0.04f, 14f)
                curveToRelative(0f, 0.29f, 0.13f, 0.57f, 0.35f, 0.76f)
                curveToRelative(0.23f, 0.19f, 0.52f, 0.27f, 0.82f, 0.22f)
                curveToRelative(0.46f, -0.08f, 0.82f, -0.56f, 0.82f, -1.09f)
                verticalLineToRelative(-5.89f)
                curveToRelative(0f, -0.48f, 0.34f, -0.89f, 0.8f, -0.98f)
                lineToRelative(6.79f, -1.36f)
                curveToRelative(1.4f, -0.28f, 2.41f, -1.52f, 2.41f, -2.94f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-6.97f)
                curveToRelative(-1.6f, 0f, -3.11f, 0.62f, -4.24f, 1.76f)
                lineToRelative(-2.31f, 2.31f)
                curveToRelative(-0.31f, 0.31f, -0.48f, 0.72f, -0.48f, 1.16f)
                curveToRelative(0f, 0.44f, 0.17f, 0.85f, 0.48f, 1.16f)
                lineToRelative(2.54f, 2.53f)
                lineToRelative(0.01f, -3.92f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1f, -1.0f)
                close()
            }
        }.also { _HandBackPointDown = it}
