package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDotsFromLine: ImageVector? = null

val Icons.Rs.PersonDotsFromLine: ImageVector
    get() = _PersonDotsFromLine ?: UXIcon(name = "PersonDotsFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(12f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(1f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(14f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 18.04f)
                verticalLineToRelative(-2.26f)
                lineToRelative(-6.38f, -3.31f)
                curveToRelative(-0.57f, -0.3f, -1.22f, -0.46f, -1.87f, -0.46f)
                horizontalLineToRelative(-7.51f)
                curveToRelative(-0.65f, 0f, -1.3f, 0.16f, -1.87f, 0.47f)
                lineToRelative(-6.37f, 3.39f)
                verticalLineToRelative(2.26f)
                lineToRelative(6f, -3.19f)
                verticalLineToRelative(7.07f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-7.09f)
                lineToRelative(6f, 3.12f)
                close()
                moveTo(8f, 22f)
                verticalLineToRelative(-7.97f)
                curveToRelative(0.08f, -0.01f, 0.16f, -0.03f, 0.24f, -0.03f)
                horizontalLineToRelative(7.51f)
                curveToRelative(0.08f, 0f, 0.16f, 0.02f, 0.24f, 0.03f)
                verticalLineToRelative(7.97f)
                close()
            }
        }.also { _PersonDotsFromLine = it}
