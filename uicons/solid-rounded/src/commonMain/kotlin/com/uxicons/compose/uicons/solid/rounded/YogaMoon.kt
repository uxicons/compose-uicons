package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMoon: ImageVector? = null

val Icons.Sr.YogaMoon: ImageVector
    get() = _YogaMoon ?: UXIcon(name = "YogaMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(17f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6.97f)
                curveToRelative(-1.71f, 0.2f, -3.25f, 1.17f, -4.03f, 2.76f)
                lineTo(0.1f, 20.55f)
                curveToRelative(-0.25f, 0.49f, -0.05f, 1.09f, 0.45f, 1.34f)
                curveToRelative(0.48f, 0.24f, 1.09f, 0.05f, 1.34f, -0.45f)
                lineTo(6.12f, 13f)
                horizontalLineToRelative(1.71f)
                lineToRelative(4.28f, 8.45f)
                curveToRelative(0.25f, 0.5f, 0.86f, 0.69f, 1.34f, 0.45f)
                curveToRelative(0.49f, -0.25f, 0.69f, -0.85f, 0.45f, -1.34f)
                lineToRelative(-3.78f, -7.55f)
                horizontalLineToRelative(5.88f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _YogaMoon = it}
