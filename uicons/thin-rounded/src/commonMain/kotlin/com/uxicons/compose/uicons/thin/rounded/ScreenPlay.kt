package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenPlay: ImageVector? = null

val Icons.Tr.ScreenPlay: ImageVector
    get() = _ScreenPlay ?: UXIcon(name = "ScreenPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                lineTo(0f, 13.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 13.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(23f, 13.5f)
                close()
                moveTo(15.66f, 7.57f)
                lineToRelative(-5.21f, -2.85f)
                curveToRelative(-1.04f, -0.64f, -2.5f, 0.2f, -2.46f, 1.43f)
                verticalLineToRelative(5.71f)
                curveToRelative(0f, 0.59f, 0.31f, 1.12f, 0.82f, 1.42f)
                curveToRelative(0.51f, 0.3f, 1.12f, 0.3f, 1.63f, 0.01f)
                lineToRelative(5.22f, -2.86f)
                curveToRelative(1.09f, -0.58f, 1.09f, -2.28f, -0.01f, -2.86f)
                close()
                moveTo(15.19f, 9.55f)
                lineToRelative(-5.22f, 2.86f)
                curveToRelative(-0.56f, 0.2f, -0.86f, 0.03f, -0.96f, -0.56f)
                lineTo(9.0f, 6.14f)
                curveToRelative(0.07f, -0.6f, 0.51f, -0.76f, 0.97f, -0.55f)
                lineToRelative(5.21f, 2.85f)
                curveToRelative(0.46f, 0.38f, 0.46f, 0.73f, 0.01f, 1.11f)
                close()
                moveTo(23.5f, 21.5f)
                lineTo(9.93f, 21.5f)
                curveToRelative(-0.22f, -0.86f, -1f, -1.5f, -1.93f, -1.5f)
                reflectiveCurveToRelative(-1.71f, 0.64f, -1.93f, 1.5f)
                lineTo(0.5f, 21.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(6.07f, 22.5f)
                curveToRelative(0.22f, 0.86f, 1f, 1.5f, 1.93f, 1.5f)
                reflectiveCurveToRelative(1.71f, -0.64f, 1.93f, -1.5f)
                horizontalLineToRelative(13.57f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(8.0f, 23.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _ScreenPlay = it}
