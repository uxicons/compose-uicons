package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BanBug: ImageVector? = null

val Icons.Ss.BanBug: ImageVector
    get() = _BanBug ?: UXIcon(name = "BanBug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.72f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                close()
                moveTo(19.74f, 18.32f)
                lineToRelative(-0.74f, -0.74f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                curveToRelative(0f, -0.3f, -0.02f, -0.64f, -0.07f, -1f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.41f)
                curveToRelative(-0.07f, -0.34f, -0.15f, -0.68f, -0.23f, -1f)
                horizontalLineToRelative(0.64f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.2f)
                curveToRelative(-0.11f, -0.36f, -0.2f, -0.62f, -0.23f, -0.69f)
                curveToRelative(-0.61f, -1.4f, -2f, -2.31f, -3.52f, -2.31f)
                reflectiveCurveToRelative(-2.82f, 0.85f, -3.46f, 2.18f)
                lineToRelative(-2.92f, -2.92f)
                curveToRelative(1.72f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                curveToRelative(0f, -0.26f, 0.03f, -0.6f, 0.07f, -1f)
                horizontalLineToRelative(-2.07f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.76f)
                lineToRelative(7.46f, 7.46f)
                curveToRelative(-0.68f, 0.34f, -1.44f, 0.54f, -2.22f, 0.54f)
                curveToRelative(-2.05f, 0f, -3.8f, -1.24f, -4.58f, -3f)
                horizontalLineToRelative(-0.42f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BanBug = it}
