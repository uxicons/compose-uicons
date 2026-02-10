package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneySimpleFromBracket: ImageVector? = null

val Icons.Ss.MoneySimpleFromBracket: ImageVector
    get() = _MoneySimpleFromBracket ?: UXIcon(name = "MoneySimpleFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(6f)
                lineTo(2f, 9f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                close()
                moveTo(20f, 24f)
                lineTo(4f, 24f)
                lineTo(4f, 4f)
                lineTo(20f, 4f)
                lineTo(20f, 24f)
                close()
                moveTo(10.91f, 8.14f)
                curveToRelative(-1.34f, 0.35f, -2.41f, 1.44f, -2.77f, 2.77f)
                curveToRelative(-0.8f, 3.04f, 1.91f, 5.75f, 4.94f, 4.94f)
                curveToRelative(1.34f, -0.35f, 2.41f, -1.44f, 2.77f, -2.77f)
                curveToRelative(0.8f, -3.04f, -1.91f, -5.75f, -4.94f, -4.94f)
                close()
            }
        }.also { _MoneySimpleFromBracket = it}
