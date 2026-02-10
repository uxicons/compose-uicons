package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Ts.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                curveToRelative(0f, -3.44f, -2.18f, -6.37f, -5.22f, -7.5f)
                curveToRelative(1.36f, -0.51f, 2.55f, -1.38f, 3.44f, -2.5f)
                horizontalLineToRelative(-1.36f)
                curveToRelative(-1.26f, 1.23f, -2.96f, 2f, -4.86f, 2f)
                reflectiveCurveToRelative(-3.6f, -0.77f, -4.86f, -2f)
                horizontalLineToRelative(-1.36f)
                curveToRelative(0.9f, 1.11f, 2.08f, 1.99f, 3.44f, 2.5f)
                curveToRelative(-3.05f, 1.13f, -5.22f, 4.07f, -5.22f, 7.5f)
                curveToRelative(0f, 4.24f, 3.32f, 7.72f, 7.5f, 7.98f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.02f)
                curveToRelative(4.18f, -0.26f, 7.5f, -3.74f, 7.5f, -7.98f)
                close()
                moveTo(5f, 10f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                close()
            }
        }.also { _Mercury = it}
