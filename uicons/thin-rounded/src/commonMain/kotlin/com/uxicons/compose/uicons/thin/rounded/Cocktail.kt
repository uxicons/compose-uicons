package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Tr.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.49f, 1.79f)
                curveToRelative(-0.67f, -1.12f, -1.84f, -1.79f, -3.15f, -1.79f)
                lineTo(3.66f, 0f)
                curveTo(2.35f, 0f, 1.18f, 0.67f, 0.51f, 1.79f)
                curveToRelative(-0.66f, 1.1f, -0.68f, 2.43f, -0.07f, 3.55f)
                curveToRelative(0.89f, 1.64f, 4.29f, 6.92f, 11.06f, 7.17f)
                verticalLineToRelative(10.49f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-10.49f)
                curveToRelative(6.77f, -0.25f, 10.17f, -5.52f, 11.06f, -7.17f)
                curveToRelative(0.61f, -1.12f, 0.58f, -2.45f, -0.07f, -3.55f)
                close()
                moveTo(1.37f, 2.3f)
                curveToRelative(0.48f, -0.82f, 1.34f, -1.3f, 2.29f, -1.3f)
                horizontalLineToRelative(16.68f)
                curveToRelative(0.95f, 0f, 1.8f, 0.49f, 2.29f, 1.3f)
                curveToRelative(0.31f, 0.53f, 0.43f, 1.12f, 0.34f, 1.7f)
                lineTo(1.03f, 4f)
                curveToRelative(-0.08f, -0.58f, 0.03f, -1.17f, 0.34f, -1.7f)
                close()
                moveTo(12f, 11.52f)
                curveTo(5.63f, 11.52f, 2.35f, 6.7f, 1.39f, 5f)
                horizontalLineToRelative(21.22f)
                curveToRelative(-0.96f, 1.7f, -4.24f, 6.52f, -10.61f, 6.52f)
                close()
            }
        }.also { _Cocktail = it}
