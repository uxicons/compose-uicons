package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Rr.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.93f, 9.89f)
                curveToRelative(-0.59f, -0.56f, -0.93f, -1.35f, -0.93f, -2.17f)
                lineTo(17f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(6f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.72f)
                curveToRelative(0f, 0.82f, -0.34f, 1.61f, -0.93f, 2.17f)
                curveTo(3.8f, 12.04f, 0f, 16.19f, 0f, 19.86f)
                curveToRelative(0f, 0.86f, 0.23f, 1.65f, 0.69f, 2.33f)
                curveToRelative(0.75f, 1.13f, 2.06f, 1.81f, 3.51f, 1.81f)
                horizontalLineToRelative(15.62f)
                curveToRelative(1.45f, 0f, 2.76f, -0.68f, 3.51f, -1.81f)
                curveToRelative(0.46f, -0.69f, 0.69f, -1.47f, 0.69f, -2.33f)
                curveToRelative(0f, -3.67f, -3.8f, -7.82f, -6.07f, -9.97f)
                close()
                moveTo(21.65f, 21.09f)
                curveToRelative(-0.37f, 0.56f, -1.07f, 0.91f, -1.84f, 0.91f)
                lineTo(4.19f, 22f)
                curveToRelative(-0.76f, 0f, -1.47f, -0.35f, -1.84f, -0.91f)
                curveToRelative(-0.24f, -0.36f, -0.35f, -0.76f, -0.35f, -1.23f)
                curveToRelative(0f, -0.9f, 0.34f, -1.88f, 0.85f, -2.86f)
                horizontalLineToRelative(14.15f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(4.14f, 15f)
                curveToRelative(1.15f, -1.54f, 2.49f, -2.89f, 3.3f, -3.66f)
                curveToRelative(0.99f, -0.94f, 1.55f, -2.25f, 1.55f, -3.62f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5.72f)
                curveToRelative(0f, 1.37f, 0.57f, 2.69f, 1.55f, 3.62f)
                curveToRelative(1.64f, 1.55f, 5.45f, 5.49f, 5.45f, 8.52f)
                curveToRelative(0f, 0.47f, -0.12f, 0.87f, -0.35f, 1.23f)
                close()
            }
        }.also { _Flask = it}
