package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteVhs: ImageVector? = null

val Icons.Bs.CassetteVhs: ImageVector
    get() = _CassetteVhs ?: UXIcon(name = "CassetteVhs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                lineTo(24f, 21f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 18f)
                lineTo(3f, 8f)
                lineTo(21f, 8f)
                verticalLineToRelative(10f)
                lineTo(3f, 18f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 10f)
                reflectiveCurveToRelative(1f, 1.12f, 1f, 3f)
                reflectiveCurveToRelative(-1f, 3f, -1f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(-1f, -1.12f, -1f, -3f)
                reflectiveCurveToRelative(1f, -3f, 1f, -3f)
                close()
            }
        }.also { _CassetteVhs = it}
