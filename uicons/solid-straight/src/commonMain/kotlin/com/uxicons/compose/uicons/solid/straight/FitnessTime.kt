package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FitnessTime: ImageVector? = null

val Icons.Ss.FitnessTime: ImageVector
    get() = _FitnessTime ?: UXIcon(name = "FitnessTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(18f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 10f)
                curveToRelative(0f, 0.69f, -0.07f, 1.35f, -0.2f, 2f)
                horizontalLineToRelative(-3.8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.99f)
                curveToRelative(-2.42f, -1.82f, -4f, -4.72f, -4f, -7.99f)
                curveToRelative(0f, -5.52f, 4.48f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.48f, 10f, 10f)
                close()
                moveTo(11f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _FitnessTime = it}
