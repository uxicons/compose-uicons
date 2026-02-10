package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleBolt: ImageVector? = null

val Icons.Bs.PlugCircleBolt: ImageVector
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
                moveTo(10.46f, 15.35f)
                curveToRelative(-0.29f, 0.83f, -0.46f, 1.72f, -0.46f, 2.65f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.52f)
                curveToRelative(-3.35f, -0.26f, -6f, -3.06f, -6f, -6.48f)
                verticalLineToRelative(-4f)
                lineTo(0f, 8f)
                verticalLineToRelative(-3f)
                lineTo(4f, 5f)
                lineTo(4f, 0f)
                horizontalLineToRelative(3f)
                lineTo(7f, 5f)
                horizontalLineToRelative(3f)
                lineTo(10f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.26f)
                curveToRelative(-1.11f, 0.29f, -2.13f, 0.8f, -3f, 1.5f)
                verticalLineToRelative(-3.76f)
                lineTo(4f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.34f, 0f, 0.65f, -0.06f, 0.96f, -0.15f)
                close()
            }
        }.also { _PlugCircleBolt = it}
