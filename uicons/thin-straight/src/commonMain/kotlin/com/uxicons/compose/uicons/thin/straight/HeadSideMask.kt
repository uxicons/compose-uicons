package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMask: ImageVector? = null

val Icons.Ts.HeadSideMask: ImageVector
    get() = _HeadSideMask ?: UXIcon(name = "HeadSideMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 10.71f)
                curveToRelative(-1.07f, -2.57f, -2.08f, -5f, -3.14f, -6.31f)
                curveTo(17.11f, 0.92f, 12.83f, -0.66f, 8.53f, 0.26f)
                curveTo(4.14f, 1.21f, 0.84f, 4.71f, 0.14f, 9.18f)
                curveToRelative(-0.51f, 3.27f, 0.33f, 6.52f, 2.3f, 8.9f)
                curveToRelative(0.36f, 0.43f, 0.56f, 0.99f, 0.56f, 1.56f)
                verticalLineToRelative(4.35f)
                lineTo(12.54f, 23.99f)
                lineToRelative(-0.28f, -1f)
                lineTo(4f, 22.99f)
                verticalLineToRelative(-3.35f)
                curveToRelative(0f, -0.81f, -0.28f, -1.59f, -0.79f, -2.2f)
                curveTo(1.42f, 15.28f, 0.66f, 12.33f, 1.13f, 9.34f)
                curveToRelative(0.15f, -0.97f, 0.44f, -1.88f, 0.84f, -2.73f)
                lineTo(12.06f, 14.79f)
                lineToRelative(2.56f, 9.21f)
                horizontalLineToRelative(4.88f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-6f)
                reflectiveCurveToRelative(-0.77f, -1.91f, -1.14f, -2.79f)
                close()
                moveTo(8.74f, 1.24f)
                curveToRelative(3.91f, -0.84f, 7.81f, 0.6f, 10.19f, 3.78f)
                curveToRelative(0.98f, 1.21f, 2.01f, 3.69f, 3.01f, 6.08f)
                curveToRelative(0.02f, 0.05f, 0.04f, 0.1f, 0.06f, 0.15f)
                lineToRelative(-0.33f, 0.25f)
                curveToRelative(-2.15f, 1.61f, -4.81f, 2.5f, -7.5f, 2.5f)
                horizontalLineToRelative(-1.49f)
                lineTo(2.44f, 5.72f)
                curveTo(3.81f, 3.46f, 6.05f, 1.82f, 8.74f, 1.24f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(-2.22f, -8f)
                horizontalLineToRelative(1.01f)
                curveToRelative(2.9f, 0f, 5.78f, -0.96f, 8.1f, -2.7f)
                lineToRelative(0.13f, -0.1f)
                curveToRelative(0.2f, 0.48f, 0.4f, 0.95f, 0.6f, 1.4f)
                verticalLineToRelative(5.89f)
                close()
            }
        }.also { _HeadSideMask = it}
