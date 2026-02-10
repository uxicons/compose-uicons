package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellConcierge: ImageVector? = null

val Icons.Tr.BellConcierge: ImageVector
    get() = _BellConcierge ?: UXIcon(name = "BellConcierge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.25f, -1.28f, -6.29f, -3.59f, -8.56f)
                curveToRelative(-2.14f, -2.11f, -4.92f, -3.32f, -7.91f, -3.43f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.51f)
                curveTo(5.13f, 3.28f, 0f, 8.77f, 0f, 15.38f)
                verticalLineToRelative(0.98f)
                curveToRelative(0f, 1.48f, 1.1f, 2.64f, 2.5f, 2.64f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(23f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                close()
                moveTo(1f, 16.36f)
                verticalLineToRelative(-0.98f)
                curveToRelative(0f, -6.17f, 5f, -11.38f, 11.02f, -11.38f)
                curveToRelative(2.9f, 0.0f, 5.62f, 1.12f, 7.69f, 3.15f)
                curveToRelative(2.12f, 2.08f, 3.29f, 4.87f, 3.29f, 7.85f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.85f, 0f, -1.5f, -0.7f, -1.5f, -1.64f)
                close()
            }
        }.also { _BellConcierge = it}
