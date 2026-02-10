package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RightFromBracket: ImageVector? = null

val Icons.Ts.RightFromBracket: ImageVector
    get() = _RightFromBracket ?: UXIcon(name = "RightFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.24f, 10.16f)
                lineTo(13f, 0.33f)
                lineTo(13f, 7f)
                lineTo(4f, 7f)
                verticalLineToRelative(10f)
                lineTo(13f, 17f)
                verticalLineToRelative(6.67f)
                lineToRelative(10.24f, -9.84f)
                curveToRelative(0.49f, -0.49f, 0.76f, -1.14f, 0.76f, -1.84f)
                reflectiveCurveToRelative(-0.27f, -1.35f, -0.76f, -1.83f)
                close()
                moveTo(22.54f, 13.12f)
                lineToRelative(-8.54f, 8.2f)
                verticalLineToRelative(-5.33f)
                lineTo(5f, 16f)
                lineTo(5f, 8f)
                lineTo(14f, 8f)
                lineTo(14f, 2.67f)
                lineToRelative(8.53f, 8.2f)
                curveToRelative(0.3f, 0.3f, 0.47f, 0.7f, 0.47f, 1.12f)
                curveToRelative(0f, 0.43f, -0.17f, 0.83f, -0.46f, 1.12f)
                close()
                moveTo(2.5f, 23f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(6.5f)
                lineTo(9f, 1f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _RightFromBracket = it}
