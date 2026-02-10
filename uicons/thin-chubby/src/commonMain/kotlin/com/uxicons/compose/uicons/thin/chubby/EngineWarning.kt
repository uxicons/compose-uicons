package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Tc.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.28f)
                curveToRelative(-3.12f, 0f, -6.71f, 0.76f, -6.71f, 6.72f)
                reflectiveCurveToRelative(3.58f, 6.72f, 6.71f, 6.72f)
                reflectiveCurveToRelative(6.71f, -0.76f, 6.71f, -6.72f)
                reflectiveCurveToRelative(-3.58f, -6.72f, -6.71f, -6.72f)
                close()
                moveTo(12f, 17.72f)
                curveToRelative(-3.43f, 0f, -5.71f, -0.97f, -5.71f, -5.72f)
                curveToRelative(0f, -4.06f, 1.65f, -5.72f, 5.71f, -5.72f)
                curveToRelative(3.43f, 0f, 5.71f, 0.97f, 5.71f, 5.72f)
                curveToRelative(0f, 4.06f, -1.65f, 5.72f, -5.71f, 5.72f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.7f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.02f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.02f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.25f, 7.78f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(1.94f, 1.94f, 1.94f, 5.09f, 0f, 7.03f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(2.32f, -2.33f, 2.32f, -6.11f, 0f, -8.44f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.45f, 7.78f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                curveTo(0.42f, 10.11f, 0.42f, 13.89f, 2.75f, 16.22f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(-1.94f, -1.94f, -1.94f, -5.09f, 0f, -7.03f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14.82f)
                moveToRelative(-0.74f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.49f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.49f, 0f)
            }
        }.also { _EngineWarning = it}
