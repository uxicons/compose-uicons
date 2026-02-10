package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Sr.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.93f, 9.89f)
                curveToRelative(-0.59f, -0.56f, -0.93f, -1.35f, -0.93f, -2.17f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.72f)
                curveToRelative(0f, 0.82f, -0.34f, 1.61f, -0.93f, 2.17f)
                curveToRelative(-1.28f, 1.21f, -3.05f, 3.07f, -4.35f, 5.11f)
                horizontalLineToRelative(17.28f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(0.65f)
                curveToRelative(-0.41f, 0.96f, -0.65f, 1.92f, -0.65f, 2.86f)
                curveToRelative(0f, 0.86f, 0.23f, 1.65f, 0.69f, 2.33f)
                curveToRelative(0.75f, 1.13f, 2.06f, 1.81f, 3.51f, 1.81f)
                horizontalLineToRelative(15.62f)
                curveToRelative(1.45f, 0f, 2.76f, -0.68f, 3.51f, -1.81f)
                curveToRelative(0.46f, -0.69f, 0.69f, -1.47f, 0.69f, -2.33f)
                curveToRelative(0f, -3.67f, -3.8f, -7.82f, -6.07f, -9.97f)
                close()
            }
        }.also { _Flask = it}
