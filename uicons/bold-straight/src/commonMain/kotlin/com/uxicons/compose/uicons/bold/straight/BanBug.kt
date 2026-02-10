package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BanBug: ImageVector? = null

val Icons.Bs.BanBug: ImageVector
    get() = _BanBug ?: UXIcon(name = "BanBug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.09f, 13f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.09f)
                lineToRelative(2f, 2f)
                close()
                moveTo(8.1f, 13.01f)
                curveToRelative(-0.06f, 0.37f, -0.1f, 0.72f, -0.1f, 0.99f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.55f)
                curveToRelative(0.69f, 1.19f, 1.97f, 2f, 3.45f, 2f)
                curveToRelative(0.33f, 0f, 0.65f, -0.05f, 0.96f, -0.13f)
                lineToRelative(-4.86f, -4.86f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(12f, 3f)
                curveToRelative(-1.94f, 0f, -3.73f, 0.62f, -5.21f, 1.67f)
                lineToRelative(2.78f, 2.78f)
                curveToRelative(0.52f, -0.96f, 1.28f, -1.45f, 2.42f, -1.45f)
                curveToRelative(1.35f, 0f, 2.15f, 0.67f, 2.68f, 2f)
                horizontalLineToRelative(1.32f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-0.74f)
                curveToRelative(0.08f, 0.3f, 0.16f, 0.64f, 0.24f, 1f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.62f, 0.09f, 0.87f)
                lineToRelative(0.14f, 0.14f)
                curveToRelative(0.99f, 0.07f, 1.78f, 0.86f, 1.85f, 1.85f)
                lineToRelative(1.34f, 1.34f)
                curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(12f, 21f)
                curveToRelative(1.94f, 0f, 3.73f, -0.62f, 5.21f, -1.67f)
                lineTo(4.67f, 6.79f)
                curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                close()
            }
        }.also { _BanBug = it}
