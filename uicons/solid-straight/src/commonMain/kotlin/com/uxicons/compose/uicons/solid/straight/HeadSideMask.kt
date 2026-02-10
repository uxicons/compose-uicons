package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMask: ImageVector? = null

val Icons.Ss.HeadSideMask: ImageVector
    get() = _HeadSideMask ?: UXIcon(name = "HeadSideMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.35f, 13f)
                horizontalLineToRelative(1.41f)
                curveToRelative(2.56f, 0f, 5.01f, -0.8f, 7.08f, -2.31f)
                lineToRelative(1.7f, -1.24f)
                curveToRelative(-0.91f, -2.05f, -1.8f, -3.88f, -2.73f, -5.03f)
                curveTo(17.36f, 1.16f, 13.5f, -0.45f, 9.45f, 0.11f)
                curveTo(6.36f, 0.53f, 3.68f, 2.28f, 1.96f, 4.75f)
                lineTo(12.35f, 13f)
                close()
                moveTo(3f, 24f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0f, -0.46f, -0.16f, -0.91f, -0.46f, -1.26f)
                curveTo(0.67f, 15.78f, -0.22f, 12.92f, 0.05f, 9.98f)
                curveToRelative(0.11f, -1.22f, 0.43f, -2.39f, 0.92f, -3.47f)
                lineTo(11.15f, 14.6f)
                lineToRelative(3.13f, 9.4f)
                horizontalLineTo(3f)
                close()
                moveTo(23.91f, 12.59f)
                lineToRelative(0.09f, 0.19f)
                verticalLineToRelative(6.21f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-2.61f)
                lineToRelative(-3f, -9f)
                horizontalLineToRelative(0.37f)
                curveToRelative(2.99f, 0f, 5.85f, -0.93f, 8.26f, -2.7f)
                lineToRelative(1.34f, -0.98f)
                curveToRelative(0.19f, 0.43f, 0.37f, 0.85f, 0.56f, 1.27f)
                close()
            }
        }.also { _HeadSideMask = it}
