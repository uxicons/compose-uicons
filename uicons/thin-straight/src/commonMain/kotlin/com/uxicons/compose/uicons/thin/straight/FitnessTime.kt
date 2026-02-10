package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FitnessTime: ImageVector? = null

val Icons.Ts.FitnessTime: ImageVector
    get() = _FitnessTime ?: UXIcon(name = "FitnessTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 16.69f)
                verticalLineToRelative(1.29f)
                curveToRelative(-2.42f, -1.83f, -4f, -4.72f, -4f, -7.98f)
                curveToRelative(0f, -5.51f, 4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 0.34f, -0.02f, 0.67f, -0.05f, 1f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(0.04f, -0.33f, 0.06f, -0.66f, 0.06f, -1f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 2.66f, 1.16f, 5.04f, 3f, 6.69f)
                close()
                moveTo(24f, 19f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(9f, 21f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _FitnessTime = it}
