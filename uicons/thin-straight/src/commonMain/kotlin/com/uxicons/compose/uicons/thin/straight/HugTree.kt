package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HugTree: ImageVector? = null

val Icons.Ts.HugTree: ImageVector
    get() = _HugTree ?: UXIcon(name = "HugTree") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 13f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(4.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(10f, 17f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(24f, 1.42f)
                verticalLineToRelative(2.79f)
                lineToRelative(-6f, 6.18f)
                verticalLineToRelative(13.62f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-14.03f)
                lineToRelative(6f, -6.18f)
                verticalLineToRelative(-0.41f)
                lineToRelative(-2.0f, 1.47f)
                lineToRelative(-0.59f, -3.86f)
                horizontalLineToRelative(-0.41f)
                verticalLineToRelative(4.59f)
                lineToRelative(-3f, 2.2f)
                verticalLineToRelative(-7.8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.82f)
                lineToRelative(1f, -0.73f)
                verticalLineToRelative(-5.09f)
                horizontalLineToRelative(2.26f)
                lineToRelative(0.47f, 3.08f)
                close()
                moveTo(11f, 8.18f)
                lineTo(1f, 2.09f)
                verticalLineToRelative(-0.49f)
                lineToRelative(10f, 4.78f)
                verticalLineToRelative(-6.38f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.8f)
                lineToRelative(-10f, -4.78f)
                verticalLineToRelative(2.64f)
                lineToRelative(10f, 6.09f)
                verticalLineToRelative(5.26f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(6f, 23f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                close()
            }
        }.also { _HugTree = it}
