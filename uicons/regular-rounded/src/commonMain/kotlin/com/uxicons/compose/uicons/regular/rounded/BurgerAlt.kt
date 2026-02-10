package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Rr.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 12f)
                lineTo(3.06f, 12f)
                curveToRelative(-0.57f, 0f, -1.11f, -0.24f, -1.49f, -0.67f)
                curveToRelative(-0.38f, -0.43f, -0.56f, -1f, -0.5f, -1.56f)
                curveTo(1.69f, 4.2f, 6.39f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10.32f, 4.2f, 10.93f, 9.77f)
                curveToRelative(0.06f, 0.57f, -0.12f, 1.14f, -0.5f, 1.57f)
                curveToRelative(-0.38f, 0.42f, -0.92f, 0.67f, -1.49f, 0.67f)
                close()
                moveTo(12f, 2f)
                curveTo(7.41f, 2f, 3.57f, 5.43f, 3.06f, 9.99f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(17.88f, 0.01f, 17.88f, 0.01f)
                curveToRelative(-0.49f, -4.57f, -4.34f, -8f, -8.94f, -8f)
                close()
                moveTo(23f, 15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(2f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(22f, 16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineTo(21f, 18f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _BurgerAlt = it}
