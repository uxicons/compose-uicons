package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMoon: ImageVector? = null

val Icons.Rr.YogaMoon: ImageVector
    get() = _YogaMoon ?: UXIcon(name = "YogaMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(18f, 2f)
                lineTo(18f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-5.38f)
                lineToRelative(3.28f, 6.55f)
                curveToRelative(0.25f, 0.49f, 0.05f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.48f, 0.24f, -1.09f, 0.05f, -1.34f, -0.45f)
                lineToRelative(-3.72f, -7.45f)
                horizontalLineToRelative(-2.76f)
                lineToRelative(-3.72f, 7.45f)
                curveToRelative(-0.25f, 0.5f, -0.86f, 0.69f, -1.34f, 0.45f)
                curveToRelative(-0.49f, -0.25f, -0.69f, -0.85f, -0.45f, -1.34f)
                lineTo(5f, 10.76f)
                curveToRelative(0.78f, -1.59f, 2.32f, -2.56f, 4.03f, -2.76f)
                horizontalLineToRelative(6.97f)
                lineTo(16f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-1.14f, 0f, -2.17f, 0.64f, -2.68f, 1.66f)
                lineToRelative(-0.17f, 0.34f)
                horizontalLineToRelative(9.38f)
                close()
            }
        }.also { _YogaMoon = it}
