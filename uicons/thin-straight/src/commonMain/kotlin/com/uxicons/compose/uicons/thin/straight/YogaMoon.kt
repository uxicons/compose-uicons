package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMoon: ImageVector? = null

val Icons.Ts.YogaMoon: ImageVector
    get() = _YogaMoon ?: UXIcon(name = "YogaMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.03f, 9f)
                lineTo(8.5f, 9f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-1.29f, 0f, -2.48f, 0.71f, -3.09f, 1.85f)
                lineTo(0.45f, 22f)
                lineTo(1.65f, 22f)
                lineToRelative(3.48f, -8f)
                horizontalLineToRelative(4.07f)
                lineToRelative(3.09f, 8f)
                horizontalLineToRelative(1.22f)
                lineToRelative(-3.2f, -8f)
                horizontalLineToRelative(6.73f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                lineTo(18.03f, 1f)
                horizontalLineToRelative(-1f)
                lineTo(17.03f, 9f)
                close()
                moveTo(5.56f, 13f)
                lineToRelative(0.69f, -1.59f)
                curveToRelative(0.47f, -0.9f, 1.31f, -1.41f, 2.25f, -1.41f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(8.53f, 0f, 8.53f, 0f)
                verticalLineToRelative(3f)
                lineTo(5.56f, 13f)
                close()
            }
        }.also { _YogaMoon = it}
