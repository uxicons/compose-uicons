package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunset: ImageVector? = null

val Icons.Sc.Sunset: ImageVector
    get() = _Sunset ?: UXIcon(name = "Sunset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.2f, 20.07f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-0.12f, -1.01f, -0.37f, -1.87f, -0.76f, -2.6f)
                lineToRelative(0.69f, -0.69f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.58f, -2.12f, 0.0f)
                lineToRelative(-0.68f, 0.69f)
                curveToRelative(-0.72f, -0.38f, -1.57f, -0.63f, -2.55f, -0.75f)
                verticalLineToRelative(-1.28f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.28f)
                curveToRelative(-0.98f, 0.12f, -1.83f, 0.37f, -2.55f, 0.75f)
                lineToRelative(-0.68f, -0.69f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, -0.01f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
                lineToRelative(0.69f, 0.69f)
                curveToRelative(-0.39f, 0.73f, -0.64f, 1.6f, -0.76f, 2.6f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-0.81f, 0f, -1.46f, 0.66f, -1.46f, 1.46f)
                reflectiveCurveToRelative(0.66f, 1.46f, 1.46f, 1.46f)
                horizontalLineTo(20.2f)
                curveToRelative(0.81f, 0f, 1.46f, -0.66f, 1.46f, -1.46f)
                reflectiveCurveToRelative(-0.66f, -1.46f, -1.46f, -1.46f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.33f, 9.73f)
                curveToRelative(0.21f, 0.11f, 0.44f, 0.16f, 0.67f, 0.16f)
                reflectiveCurveToRelative(0.46f, -0.05f, 0.67f, -0.16f)
                curveToRelative(0.11f, -0.06f, 2.77f, -1.41f, 3.99f, -4.13f)
                curveToRelative(0.34f, -0.76f, 0.0f, -1.64f, -0.75f, -1.98f)
                curveToRelative(-0.75f, -0.34f, -1.64f, -0.0f, -1.98f, 0.75f)
                curveToRelative(-0.12f, 0.27f, -0.27f, 0.52f, -0.43f, 0.75f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.62f)
                curveToRelative(-0.16f, -0.23f, -0.31f, -0.48f, -0.43f, -0.75f)
                curveToRelative(-0.34f, -0.76f, -1.23f, -1.09f, -1.98f, -0.75f)
                curveToRelative(-0.76f, 0.34f, -1.09f, 1.23f, -0.75f, 1.98f)
                curveToRelative(1.22f, 2.72f, 3.88f, 4.08f, 3.99f, 4.13f)
                close()
            }
        }.also { _Sunset = it}
