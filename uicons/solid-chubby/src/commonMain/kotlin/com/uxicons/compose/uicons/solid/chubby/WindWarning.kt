package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindWarning: ImageVector? = null

val Icons.Sc.WindWarning: ImageVector
    get() = _WindWarning ?: UXIcon(name = "WindWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.58f, 14.32f)
                curveToRelative(0f, -2.23f, -1.8f, -4.05f, -4.01f, -4.05f)
                curveToRelative(-1.41f, 0f, -2.73f, 0.76f, -3.45f, 1.98f)
                curveToRelative(-0.42f, 0.71f, -0.18f, 1.63f, 0.53f, 2.05f)
                curveToRelative(0.71f, 0.42f, 1.63f, 0.18f, 2.05f, -0.53f)
                curveToRelative(0.19f, -0.32f, 0.51f, -0.51f, 0.87f, -0.51f)
                curveToRelative(0.56f, 0f, 1.01f, 0.47f, 1.01f, 1.05f)
                reflectiveCurveToRelative(-0.46f, 1.05f, -1.01f, 1.05f)
                horizontalLineTo(8.65f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.56f)
                curveToRelative(0.43f, 0f, 0.78f, 0.36f, 0.78f, 0.81f)
                reflectiveCurveToRelative(-0.35f, 0.81f, -0.78f, 0.81f)
                curveToRelative(-0.24f, 0f, -0.41f, -0.11f, -0.51f, -0.2f)
                curveToRelative(-0.61f, -0.56f, -1.56f, -0.52f, -2.12f, 0.1f)
                curveToRelative(-0.56f, 0.61f, -0.51f, 1.56f, 0.1f, 2.12f)
                curveToRelative(0.69f, 0.63f, 1.59f, 0.98f, 2.53f, 0.98f)
                curveToRelative(2.08f, 0f, 3.78f, -1.71f, 3.78f, -3.81f)
                curveToRelative(0f, -0.28f, -0.03f, -0.56f, -0.09f, -0.83f)
                curveToRelative(2.06f, -0.17f, 3.68f, -1.92f, 3.68f, -4.04f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.35f, 7.5f)
                curveTo(14.35f, 1.67f, 10.66f, 1f, 7.89f, 1f)
                reflectiveCurveTo(1.42f, 1.67f, 1.42f, 7.5f)
                reflectiveCurveToRelative(3.69f, 6.5f, 6.46f, 6.5f)
                reflectiveCurveToRelative(6.46f, -0.67f, 6.46f, -6.5f)
                close()
                moveTo(6.88f, 4.22f)
                curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.23f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.23f)
                close()
                moveTo(6.88f, 10.78f)
                curveToRelative(0f, -0.56f, 0.45f, -1.0f, 1.01f, -1.0f)
                reflectiveCurveToRelative(1.01f, 0.45f, 1.01f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.01f, 1.0f)
                reflectiveCurveToRelative(-1.01f, -0.45f, -1.01f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.96f, 19.41f)
                horizontalLineToRelative(-3.75f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _WindWarning = it}
