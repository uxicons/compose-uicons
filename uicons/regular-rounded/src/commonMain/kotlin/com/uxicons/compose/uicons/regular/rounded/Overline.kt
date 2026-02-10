package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Overline: ImageVector? = null

val Icons.Rr.Overline: ImageVector
    get() = _Overline ?: UXIcon(name = "Overline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(22f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Overline = it}
