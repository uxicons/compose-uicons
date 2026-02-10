package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyFromBracket: ImageVector? = null

val Icons.Bs.MoneyFromBracket: ImageVector
    get() = _MoneyFromBracket ?: UXIcon(name = "MoneyFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                close()
                moveTo(24f, 8f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(18f, 21f)
                lineTo(18f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 21f)
                horizontalLineToRelative(12f)
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
        }.also { _MoneyFromBracket = it}
