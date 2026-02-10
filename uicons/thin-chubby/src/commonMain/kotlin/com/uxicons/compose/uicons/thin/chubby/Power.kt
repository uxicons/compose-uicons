package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Power: ImageVector? = null

val Icons.Tc.Power: ImageVector
    get() = _Power ?: UXIcon(name = "Power") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.73f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(6.23f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.96f, 2.44f)
                curveToRelative(-0.27f, -0.08f, -0.55f, 0.06f, -0.63f, 0.32f)
                reflectiveCurveToRelative(0.06f, 0.54f, 0.32f, 0.63f)
                curveToRelative(3.44f, 1.11f, 5.04f, 3.97f, 5.04f, 9.01f)
                curveToRelative(0f, 6.82f, -2.81f, 9.61f, -9.69f, 9.61f)
                reflectiveCurveTo(2.31f, 19.22f, 2.31f, 12.39f)
                curveToRelative(0f, -5.02f, 1.6f, -7.88f, 5.04f, -9.0f)
                curveToRelative(0.26f, -0.09f, 0.41f, -0.37f, 0.32f, -0.63f)
                curveToRelative(-0.09f, -0.26f, -0.37f, -0.41f, -0.63f, -0.32f)
                curveTo(3.18f, 3.71f, 1.31f, 6.96f, 1.31f, 12.39f)
                curveToRelative(0f, 7.43f, 3.2f, 10.61f, 10.69f, 10.61f)
                curveToRelative(4.98f, 0f, 10.69f, -1.21f, 10.69f, -10.61f)
                curveToRelative(0f, -5.53f, -1.82f, -8.69f, -5.73f, -9.96f)
                close()
            }
        }.also { _Power = it}
