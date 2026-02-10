package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupiahSign: ImageVector? = null

val Icons.Bs.RupiahSign: ImageVector
    get() = _RupiahSign ?: UXIcon(name = "RupiahSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 12f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.5f, 18f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15f, 8f)
                curveTo(15f, 3.59f, 11.41f, 0f, 7f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 16f)
                horizontalLineToRelative(3.85f)
                lineToRelative(4.31f, 8f)
                horizontalLineToRelative(3.41f)
                lineToRelative(-4.62f, -8.57f)
                curveToRelative(2.95f, -1.18f, 5.05f, -4.06f, 5.05f, -7.43f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                lineTo(3f, 13f)
                lineTo(3f, 3.5f)
                close()
            }
        }.also { _RupiahSign = it}
