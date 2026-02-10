package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDotsFromLine: ImageVector? = null

val Icons.Ts.PersonDotsFromLine: ImageVector
    get() = _PersonDotsFromLine ?: UXIcon(name = "PersonDotsFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(2f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(14f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(20f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 16.73f)
                verticalLineToRelative(-1.13f)
                lineToRelative(-5.68f, -2.97f)
                curveToRelative(-0.79f, -0.41f, -1.67f, -0.63f, -2.55f, -0.63f)
                horizontalLineToRelative(-7.54f)
                curveToRelative(-0.89f, 0f, -1.77f, 0.22f, -2.55f, 0.63f)
                lineToRelative(-5.68f, 2.97f)
                verticalLineToRelative(1.13f)
                lineToRelative(6f, -3.14f)
                verticalLineToRelative(9.41f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-9.41f)
                close()
                moveTo(7f, 23f)
                verticalLineToRelative(-9.82f)
                curveToRelative(0.4f, -0.11f, 0.81f, -0.18f, 1.23f, -0.18f)
                horizontalLineToRelative(7.54f)
                curveToRelative(0.42f, 0f, 0.83f, 0.07f, 1.23f, 0.18f)
                verticalLineToRelative(9.82f)
                close()
            }
        }.also { _PersonDotsFromLine = it}
