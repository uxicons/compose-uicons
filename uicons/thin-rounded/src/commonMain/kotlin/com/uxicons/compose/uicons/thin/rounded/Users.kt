package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Users: ImageVector? = null

val Icons.Tr.Users: ImageVector
    get() = _Users ?: UXIcon(name = "Users") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 13f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(7.5f, 5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(15f, 22.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 2.92f, -6.5f, 6.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                close()
                moveTo(24f, 17.86f)
                verticalLineToRelative(0.64f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.64f)
                curveToRelative(0f, -3.23f, -2.63f, -5.86f, -5.86f, -5.86f)
                curveToRelative(-1.36f, 0f, -2.48f, 0.31f, -3.35f, 0.91f)
                curveToRelative(-0.23f, 0.16f, -0.54f, 0.1f, -0.7f, -0.12f)
                reflectiveCurveToRelative(-0.1f, -0.54f, 0.12f, -0.7f)
                curveToRelative(1.04f, -0.72f, 2.36f, -1.09f, 3.92f, -1.09f)
                curveToRelative(3.78f, 0f, 6.86f, 3.08f, 6.86f, 6.86f)
                close()
                moveTo(17.5f, 9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveTo(19.98f, 0f, 17.5f, 0f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(17.5f, 1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
            }
        }.also { _Users = it}
