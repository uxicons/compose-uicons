package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumStar: ImageVector? = null

val Icons.Ts.PodiumStar: ImageVector
    get() = _PodiumStar ?: UXIcon(name = "PodiumStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                lineTo(3f, 10f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.55f)
                curveToRelative(0.23f, 1.14f, 1.24f, 2f, 2.45f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                horizontalLineToRelative(-1.55f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                lineTo(0f, 10f)
                verticalLineToRelative(1f)
                lineTo(2.07f, 11f)
                lineToRelative(2f, 13f)
                horizontalLineToRelative(15.86f)
                lineToRelative(2f, -13f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10.5f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(19.07f, 23f)
                lineTo(4.93f, 23f)
                lineToRelative(-1.85f, -12f)
                lineTo(20.92f, 11f)
                lineToRelative(-1.85f, 12f)
                close()
                moveTo(8.83f, 21.23f)
                lineToRelative(0.63f, 0.49f)
                lineToRelative(2.54f, -1.65f)
                lineToRelative(2.54f, 1.65f)
                lineToRelative(0.63f, -0.49f)
                lineToRelative(-0.81f, -2.7f)
                lineToRelative(2.14f, -1.72f)
                verticalLineToRelative(-0.8f)
                horizontalLineToRelative(-3.04f)
                lineToRelative(-1.05f, -3f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.05f, 3f)
                horizontalLineToRelative(-3.05f)
                verticalLineToRelative(0.8f)
                lineToRelative(2.14f, 1.72f)
                lineToRelative(-0.81f, 2.7f)
                close()
                moveTo(9.34f, 17f)
                horizontalLineToRelative(1.92f)
                lineToRelative(0.74f, -2.12f)
                lineToRelative(0.74f, 2.12f)
                horizontalLineToRelative(1.92f)
                lineToRelative(-1.45f, 1.17f)
                lineToRelative(0.56f, 1.86f)
                lineToRelative(-1.77f, -1.15f)
                lineToRelative(-1.77f, 1.15f)
                lineToRelative(0.56f, -1.86f)
                lineToRelative(-1.45f, -1.17f)
                close()
            }
        }.also { _PodiumStar = it}
