package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleBolt: ImageVector? = null

val Icons.Ss.PlugCircleBolt: ImageVector
    get() = _PlugCircleBolt ?: UXIcon(name = "PlugCircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(20.73f, 19.49f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-2.38f, 3.45f, -2.38f, 3.45f)
                lineToRelative(-1.66f, -1.12f)
                lineToRelative(1.96f, -2.82f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.46f, -0.97f, -0.25f, -1.43f)
                curveToRelative(0.48f, -1.04f, 2.48f, -3.85f, 2.48f, -3.85f)
                lineToRelative(1.66f, 1.11f)
                lineToRelative(-1.84f, 2.83f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.85f)
                curveToRelative(0.28f, 0.52f, 0.25f, 1.15f, -0.08f, 1.65f)
                close()
                moveTo(10f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-4f)
                lineTo(0f, 8f)
                verticalLineToRelative(-2f)
                lineTo(4f, 6f)
                lineTo(4f, 0f)
                horizontalLineToRelative(2f)
                lineTo(6f, 6f)
                horizontalLineToRelative(6f)
                lineTo(12f, 0f)
                horizontalLineToRelative(2f)
                lineTo(14f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.07f)
                curveToRelative(-3.94f, 0.49f, -7f, 3.85f, -7f, 7.93f)
                close()
            }
        }.also { _PlugCircleBolt = it}
