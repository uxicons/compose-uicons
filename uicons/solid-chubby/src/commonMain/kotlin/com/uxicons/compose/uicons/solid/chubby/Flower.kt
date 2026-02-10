package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flower: ImageVector? = null

val Icons.Sc.Flower: ImageVector
    get() = _Flower ?: UXIcon(name = "Flower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.32f, 12f)
                arcToRelative(2.68f, 2.68f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.36f, 0f)
                arcToRelative(2.68f, 2.68f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.36f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 6.44f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.25f, -2.12f, -2.7f, -3.21f, -4.43f, -3.29f)
                curveToRelative(-0.95f, -1.44f, -2.62f, -2.14f, -5.08f, -2.14f)
                reflectiveCurveToRelative(-4.13f, 0.7f, -5.08f, 2.14f)
                curveToRelative(-1.73f, 0.09f, -3.18f, 1.17f, -4.42f, 3.29f)
                curveToRelative(-1.27f, 2.17f, -1.49f, 3.99f, -0.66f, 5.56f)
                curveToRelative(-0.83f, 1.57f, -0.61f, 3.4f, 0.66f, 5.56f)
                curveToRelative(1.24f, 2.12f, 2.7f, 3.2f, 4.42f, 3.29f)
                curveToRelative(0.95f, 1.44f, 2.62f, 2.15f, 5.08f, 2.15f)
                reflectiveCurveToRelative(4.13f, -0.7f, 5.08f, -2.15f)
                curveToRelative(1.73f, -0.09f, 3.18f, -1.17f, 4.42f, -3.29f)
                curveToRelative(1.27f, -2.17f, 1.49f, -3.99f, 0.66f, -5.56f)
                curveToRelative(0.83f, -1.57f, 0.61f, -3.4f, -0.66f, -5.56f)
                close()
                moveTo(12f, 16.68f)
                curveToRelative(-3.15f, 0f, -4.68f, -1.53f, -4.68f, -4.68f)
                reflectiveCurveToRelative(1.53f, -4.68f, 4.68f, -4.68f)
                reflectiveCurveToRelative(4.68f, 1.53f, 4.68f, 4.68f)
                reflectiveCurveToRelative(-1.53f, 4.68f, -4.68f, 4.68f)
                close()
            }
        }.also { _Flower = it}
