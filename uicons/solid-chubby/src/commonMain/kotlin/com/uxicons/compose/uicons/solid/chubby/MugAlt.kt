package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugAlt: ImageVector? = null

val Icons.Sc.MugAlt: ImageVector
    get() = _MugAlt ?: UXIcon(name = "MugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.36f, 5.12f)
                lineToRelative(0.23f, -1.86f)
                curveToRelative(0.07f, -0.52f, -0.28f, -1.0f, -0.79f, -1.1f)
                curveToRelative(-0.15f, -0.03f, -3.64f, -0.72f, -7.75f, -0.72f)
                reflectiveCurveToRelative(-7.6f, 0.69f, -7.75f, 0.72f)
                curveToRelative(-0.51f, 0.1f, -0.86f, 0.58f, -0.79f, 1.1f)
                lineToRelative(1.71f, 13.61f)
                curveToRelative(0.04f, 0.36f, 0.28f, 0.67f, 0.62f, 0.81f)
                curveToRelative(0.08f, 0.03f, 2.0f, 0.77f, 6.21f, 0.77f)
                reflectiveCurveToRelative(6.13f, -0.74f, 6.21f, -0.77f)
                curveToRelative(0.34f, -0.13f, 0.58f, -0.44f, 0.62f, -0.81f)
                lineToRelative(0.29f, -2.31f)
                curveToRelative(0.01f, 0f, 0.02f, 0f, 0.03f, 0f)
                curveToRelative(2.65f, 0f, 4.8f, -2.15f, 4.8f, -4.79f)
                curveToRelative(0f, -2.25f, -1.52f, -4.14f, -3.64f, -4.65f)
                close()
                moveTo(18.55f, 11.53f)
                lineToRelative(0.42f, -3.38f)
                curveToRelative(0.61f, 0.29f, 1.02f, 0.91f, 1.02f, 1.62f)
                curveToRelative(0f, 0.87f, -0.62f, 1.59f, -1.45f, 1.76f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.6f, 19.56f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(19.6f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _MugAlt = it}
