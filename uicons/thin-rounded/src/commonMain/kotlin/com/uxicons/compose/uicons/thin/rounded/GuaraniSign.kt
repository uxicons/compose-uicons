package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GuaraniSign: ImageVector? = null

val Icons.Tr.GuaraniSign: ImageVector
    get() = _GuaraniSign ?: UXIcon(name = "GuaraniSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.54f, 13.07f)
                curveToRelative(-0.47f, -0.67f, -1.24f, -1.07f, -2.06f, -1.07f)
                horizontalLineToRelative(-6.99f)
                lineTo(12.49f, 3.01f)
                curveToRelative(3.24f, 0.17f, 6.12f, 2.05f, 7.57f, 4.99f)
                curveToRelative(0.12f, 0.25f, 0.43f, 0.35f, 0.67f, 0.23f)
                curveToRelative(0.25f, -0.12f, 0.35f, -0.42f, 0.23f, -0.67f)
                curveToRelative(-1.63f, -3.28f, -4.84f, -5.37f, -8.47f, -5.54f)
                lineTo(12.49f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.51f)
                curveTo(6.22f, 2.28f, 2.01f, 6.66f, 2.01f, 12f)
                reflectiveCurveToRelative(4.21f, 9.73f, 9.49f, 9.99f)
                verticalLineToRelative(1.51f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.51f)
                curveToRelative(4.15f, -0.21f, 8.03f, -2.95f, 9.36f, -6.67f)
                curveToRelative(0.27f, -0.76f, 0.16f, -1.58f, -0.31f, -2.24f)
                close()
                moveTo(3.01f, 12f)
                curveTo(3.01f, 7.21f, 6.77f, 3.28f, 11.5f, 3.01f)
                lineTo(11.5f, 20.99f)
                curveToRelative(-4.72f, -0.26f, -8.49f, -4.19f, -8.49f, -8.99f)
                close()
                moveTo(20.91f, 14.98f)
                curveToRelative(-1.19f, 3.34f, -4.68f, 5.8f, -8.42f, 6.01f)
                verticalLineToRelative(-7.99f)
                horizontalLineToRelative(6.99f)
                curveToRelative(0.49f, 0f, 0.96f, 0.24f, 1.24f, 0.65f)
                curveToRelative(0.28f, 0.4f, 0.35f, 0.88f, 0.19f, 1.33f)
                close()
            }
        }.also { _GuaraniSign = it}
