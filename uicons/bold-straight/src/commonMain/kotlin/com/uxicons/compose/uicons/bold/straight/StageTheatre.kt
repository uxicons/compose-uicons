package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StageTheatre: ImageVector? = null

val Icons.Bs.StageTheatre: ImageVector
    get() = _StageTheatre ?: UXIcon(name = "StageTheatre") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(8.66f)
                lineToRelative(-0.17f, -1.65f)
                curveToRelative(-0.28f, -2.84f, -1.78f, -5.08f, -3.23f, -6.64f)
                curveToRelative(2.34f, -1.22f, 5.24f, -3.53f, 6.74f, -7.82f)
                curveToRelative(1.5f, 4.29f, 4.4f, 6.6f, 6.74f, 7.82f)
                curveToRelative(-1.45f, 1.56f, -2.95f, 3.8f, -3.23f, 6.64f)
                lineToRelative(-0.17f, 1.65f)
                horizontalLineToRelative(8.66f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-3.31f)
                curveToRelative(0.81f, 0.86f, 1.65f, 1.98f, 2.13f, 3.31f)
                horizontalLineToRelative(-2.13f)
                close()
                moveTo(3f, 13.49f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.25f)
                curveToRelative(1.41f, -1.34f, 2.6f, -3.35f, 2.92f, -6.25f)
                horizontalLineToRelative(2.01f)
                curveToRelative(-0.52f, 6.89f, -4.55f, 9.53f, -6.93f, 10.49f)
                close()
                moveTo(14.07f, 3f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.31f, 2.9f, 1.5f, 4.91f, 2.92f, 6.25f)
                lineTo(19.0f, 3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(9.99f)
                curveToRelative(-2.38f, -0.96f, -6.41f, -3.61f, -6.93f, -10.49f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(0.48f, -1.33f, 1.31f, -2.46f, 2.13f, -3.31f)
                verticalLineToRelative(3.31f)
                close()
            }
        }.also { _StageTheatre = it}
