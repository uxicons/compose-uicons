package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneySimpleFromBracket: ImageVector? = null

val Icons.Bs.MoneySimpleFromBracket: ImageVector
    get() = _MoneySimpleFromBracket ?: UXIcon(name = "MoneySimpleFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 11f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
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
            }
        }.also { _MoneySimpleFromBracket = it}
