package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupiahSign: ImageVector? = null

val Icons.Ss.RupiahSign: ImageVector
    get() = _RupiahSign ?: UXIcon(name = "RupiahSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7.5f)
                curveTo(15f, 3.36f, 11.64f, 0f, 7.5f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 15f)
                lineTo(7.5f, 15f)
                curveToRelative(0.13f, 0f, 0.25f, -0.01f, 0.37f, -0.02f)
                lineToRelative(4.86f, 9.02f)
                horizontalLineToRelative(2.27f)
                lineToRelative(-5.07f, -9.41f)
                curveToRelative(2.94f, -1.01f, 5.07f, -3.8f, 5.07f, -7.09f)
                close()
                moveTo(7.5f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7.5f, 2f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(20.5f, 13f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 18f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _RupiahSign = it}
