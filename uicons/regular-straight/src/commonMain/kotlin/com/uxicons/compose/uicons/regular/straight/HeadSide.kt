package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSide: ImageVector? = null

val Icons.Rs.HeadSide: ImageVector
    get() = _HeadSide ?: UXIcon(name = "HeadSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0f, -0.46f, -0.16f, -0.91f, -0.46f, -1.26f)
                curveTo(0.67f, 15.78f, -0.22f, 12.92f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.55f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.18f, 1.46f, 2.3f, 4.02f, 3.48f, 6.72f)
                lineToRelative(0.72f, 1.65f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-0.45f, 3.39f)
                curveToRelative(-0.2f, 1.49f, -1.47f, 2.61f, -2.97f, 2.61f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 22f)
                lineTo(14f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.5f, 0f, 0.93f, -0.37f, 0.99f, -0.87f)
                lineToRelative(0.68f, -5.13f)
                horizontalLineToRelative(1.99f)
                lineToRelative(-0.46f, -1.06f)
                curveToRelative(-1.08f, -2.46f, -2.19f, -5.01f, -3.22f, -6.29f)
                curveToRelative(-2.02f, -2.69f, -5.19f, -4.01f, -8.5f, -3.56f)
                curveToRelative(-4.08f, 0.56f, -7.31f, 3.96f, -7.69f, 8.07f)
                curveToRelative(-0.22f, 2.4f, 0.51f, 4.74f, 2.04f, 6.59f)
                curveToRelative(0.59f, 0.71f, 0.92f, 1.62f, 0.92f, 2.54f)
                verticalLineToRelative(2.71f)
                close()
            }
        }.also { _HeadSide = it}
