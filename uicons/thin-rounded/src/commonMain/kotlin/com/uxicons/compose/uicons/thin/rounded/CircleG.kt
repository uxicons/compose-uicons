package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleG: ImageVector? = null

val Icons.Tr.CircleG: ImageVector
    get() = _CircleG ?: UXIcon(name = "CircleG") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(17.15f, 13.03f)
                curveToRelative(0.41f, 0.63f, 0.46f, 1.42f, 0.15f, 2.1f)
                curveToRelative(-0.83f, 1.84f, -2.91f, 3.12f, -5.05f, 3.12f)
                curveToRelative(-2.9f, 0f, -5.25f, -2.41f, -5.25f, -5.37f)
                verticalLineToRelative(-1.77f)
                curveToRelative(0f, -2.96f, 2.35f, -5.37f, 5.25f, -5.37f)
                curveToRelative(1.78f, 0f, 3.43f, 0.91f, 4.4f, 2.44f)
                curveToRelative(0.15f, 0.23f, 0.08f, 0.54f, -0.15f, 0.69f)
                curveToRelative(-0.23f, 0.15f, -0.54f, 0.08f, -0.69f, -0.15f)
                curveToRelative(-0.79f, -1.24f, -2.12f, -1.98f, -3.56f, -1.98f)
                curveToRelative(-2.34f, 0f, -4.25f, 1.96f, -4.25f, 4.37f)
                verticalLineToRelative(1.77f)
                curveToRelative(0f, 2.41f, 1.91f, 4.37f, 4.25f, 4.37f)
                curveToRelative(1.73f, 0f, 3.47f, -1.06f, 4.14f, -2.53f)
                curveToRelative(0.17f, -0.38f, 0.14f, -0.8f, -0.08f, -1.15f)
                curveToRelative(-0.23f, -0.36f, -0.63f, -0.57f, -1.06f, -0.57f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.77f, 0f, 1.48f, 0.39f, 1.9f, 1.03f)
                close()
            }
        }.also { _CircleG = it}
