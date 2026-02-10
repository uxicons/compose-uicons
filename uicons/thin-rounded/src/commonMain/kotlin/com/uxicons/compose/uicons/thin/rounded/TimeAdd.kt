package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeAdd: ImageVector? = null

val Icons.Tr.TimeAdd: ImageVector
    get() = _TimeAdd ?: UXIcon(name = "TimeAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(15.35f, 22.48f)
                curveToRelative(-1.08f, 0.34f, -2.21f, 0.52f, -3.35f, 0.52f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 1.14f, -0.17f, 2.27f, -0.52f, 3.35f)
                curveToRelative(-0.08f, 0.26f, 0.06f, 0.55f, 0.32f, 0.63f)
                curveToRelative(0.27f, 0.08f, 0.54f, -0.06f, 0.63f, -0.32f)
                curveToRelative(0.38f, -1.18f, 0.57f, -2.4f, 0.57f, -3.65f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.25f, 0f, 2.47f, -0.19f, 3.65f, -0.56f)
                curveToRelative(0.26f, -0.08f, 0.41f, -0.36f, 0.33f, -0.63f)
                curveToRelative(-0.08f, -0.26f, -0.37f, -0.41f, -0.63f, -0.33f)
                close()
                moveTo(11f, 6.5f)
                verticalLineToRelative(5.22f)
                lineToRelative(-3.77f, 2.35f)
                curveToRelative(-0.23f, 0.15f, -0.3f, 0.46f, -0.16f, 0.69f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.23f, 0.42f, 0.23f)
                curveToRelative(0.09f, 0f, 0.18f, -0.02f, 0.27f, -0.08f)
                lineToRelative(4f, -2.5f)
                curveToRelative(0.15f, -0.09f, 0.23f, -0.25f, 0.23f, -0.42f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                close()
            }
        }.also { _TimeAdd = it}
