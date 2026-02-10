package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SplitScreen: ImageVector? = null

val Icons.Ts.SplitScreen: ImageVector
    get() = _SplitScreen ?: UXIcon(name = "SplitScreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11.5f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11.5f, 13f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11.5f, 17f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(6.2f, 6f)
                lineTo(3.85f, 8.43f)
                lineTo(4.57f, 9.12f)
                lineTo(6f, 7.64f)
                verticalLineToRelative(6.36f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-8f)
                close()
                moveTo(18.06f, 11.81f)
                curveToRelative(1.09f, -0.72f, 2.44f, -1.61f, 2.44f, -3.31f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 1.16f, -0.97f, 1.8f, -1.99f, 2.48f)
                curveToRelative(-0.99f, 0.65f, -2.01f, 1.33f, -2.01f, 2.52f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.85f)
                curveToRelative(0.25f, -0.42f, 0.8f, -0.79f, 1.41f, -1.19f)
                close()
                moveTo(12.5f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-11.5f)
                close()
                moveTo(1.0f, 18f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
            }
        }.also { _SplitScreen = it}
