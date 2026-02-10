package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyFromBracket: ImageVector? = null

val Icons.Br.MoneyFromBracket: ImageVector
    get() = _MoneyFromBracket ?: UXIcon(name = "MoneyFromBracket") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 14f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
            close()
            moveTo(21f, 7.86f)
            verticalLineToRelative(10.64f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(3f, 7.86f)
            curveTo(1.28f, 7.42f, 0f, 5.86f, 0f, 4f)
            curveTo(0f, 1.8f, 1.79f, 0f, 4f, 0f)
            lineTo(20f, 0f)
            curveTo(22.21f, 0f, 24f, 1.8f, 24f, 4f)
            curveToRelative(0f, 1.86f, -1.28f, 3.41f, -3f, 3.86f)
            close()
            moveTo(18f, 18.5f)
            lineTo(18f, 3f)
            lineTo(6f, 3f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveTo(14.5f, 16f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(9.5f, 16f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _MoneyFromBracket = it }
