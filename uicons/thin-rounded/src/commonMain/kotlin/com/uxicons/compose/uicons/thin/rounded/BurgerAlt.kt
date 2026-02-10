package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Tr.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13f)
                lineTo(3f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveTo(1f, 4.93f, 5.93f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10.99f, 4.83f, 11f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(12f, 1f)
                curveTo(6.49f, 1f, 2f, 5.49f, 2f, 11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(21f, 12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(-0.01f, -5.61f, -4.41f, -10f, -10f, -10f)
                close()
                moveTo(23f, 15.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(1.5f, 15f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(22.5f, 16f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(18.5f, 24f)
                lineTo(5.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 18f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(2.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(2.5f, 19f)
                close()
            }
        }.also { _BurgerAlt = it}
