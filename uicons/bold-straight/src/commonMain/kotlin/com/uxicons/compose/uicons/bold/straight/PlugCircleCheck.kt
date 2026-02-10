package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleCheck: ImageVector? = null

val Icons.Bs.PlugCircleCheck: ImageVector
    get() = _PlugCircleCheck ?: UXIcon(name = "PlugCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.75f, 20.44f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
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
        }.also { _PlugCircleCheck = it}
