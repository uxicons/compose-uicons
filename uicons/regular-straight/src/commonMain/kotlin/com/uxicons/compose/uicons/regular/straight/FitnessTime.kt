package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FitnessTime: ImageVector? = null

val Icons.Rs.FitnessTime: ImageVector
    get() = _FitnessTime ?: UXIcon(name = "FitnessTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 14f)
                verticalLineToRelative(4f)
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
                close()
                moveTo(10f, 0f)
                curveToRelative(-5.51f, 0f, -10f, 4.49f, -10f, 10f)
                curveToRelative(0f, 3.26f, 1.58f, 6.15f, 4f, 7.98f)
                verticalLineToRelative(-2.71f)
                curveToRelative(-1.24f, -1.41f, -2f, -3.25f, -2f, -5.27f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                curveToRelative(0f, 0.69f, -0.1f, 1.36f, -0.26f, 2f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.13f, -0.65f, 0.2f, -1.31f, 0.2f, -2f)
                curveToRelative(-0.0f, -5.51f, -4.49f, -10f, -10.0f, -10f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _FitnessTime = it}
