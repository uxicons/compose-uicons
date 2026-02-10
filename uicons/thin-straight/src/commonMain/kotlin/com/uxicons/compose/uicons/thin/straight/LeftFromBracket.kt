package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeftFromBracket: ImageVector? = null

val Icons.Ts.LeftFromBracket: ImageVector
    get() = _LeftFromBracket ?: UXIcon(name = "LeftFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 0.33f)
                lineTo(0.76f, 10.16f)
                curveToRelative(-0.49f, 0.49f, -0.76f, 1.14f, -0.76f, 1.84f)
                curveToRelative(0f, 0.69f, 0.27f, 1.35f, 0.76f, 1.83f)
                lineToRelative(10.24f, 9.84f)
                verticalLineToRelative(-6.67f)
                horizontalLineToRelative(9f)
                lineTo(20f, 7f)
                close()
                moveTo(19f, 16f)
                lineTo(10f, 16f)
                verticalLineToRelative(5.33f)
                lineTo(1.47f, 13.12f)
                curveToRelative(-0.3f, -0.3f, -0.47f, -0.7f, -0.47f, -1.12f)
                reflectiveCurveToRelative(0.17f, -0.83f, 0.46f, -1.12f)
                lineTo(10f, 2.67f)
                verticalLineToRelative(5.33f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 2.5f)
                lineTo(24f, 21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(15f, 0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _LeftFromBracket = it}
