package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binoculars: ImageVector? = null

val Icons.Sc.Binoculars: ImageVector
    get() = _Binoculars ?: UXIcon(name = "Binoculars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 18f)
                moveToRelative(-5f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                moveToRelative(-5f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.11f, 6.84f)
                curveToRelative(-1.84f, -0.84f, -4.75f, -1.84f, -8.11f, -1.84f)
                curveToRelative(-3.38f, 0f, -6.28f, 1.0f, -8.12f, 1.83f)
                curveToRelative(-1.75f, 0.8f, -2.88f, 2.58f, -2.88f, 4.53f)
                verticalLineToRelative(1.79f)
                curveToRelative(1.28f, -1.32f, 3.06f, -2.16f, 5f, -2.16f)
                reflectiveCurveToRelative(3.72f, 0.83f, 5f, 2.16f)
                verticalLineToRelative(-2.16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.16f)
                curveToRelative(1.28f, -1.32f, 3.06f, -2.16f, 5f, -2.16f)
                reflectiveCurveToRelative(3.72f, 0.83f, 5f, 2.16f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0f, -1.96f, -1.14f, -3.74f, -2.89f, -4.54f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.24f, 1f)
                curveToRelative(-1.79f, 0f, -3.24f, 1.47f, -3.24f, 3.27f)
                verticalLineToRelative(0.34f)
                curveToRelative(1.63f, -0.66f, 3.79f, -1.31f, 6.28f, -1.53f)
                curveToRelative(-0.48f, -1.22f, -1.66f, -2.08f, -3.03f, -2.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 4.27f)
                curveToRelative(0f, -1.8f, -1.46f, -3.27f, -3.24f, -3.27f)
                curveToRelative(-1.38f, 0f, -2.56f, 0.86f, -3.03f, 2.08f)
                curveToRelative(2.47f, 0.22f, 4.64f, 0.88f, 6.28f, 1.54f)
                verticalLineToRelative(-0.34f)
                close()
            }
        }.also { _Binoculars = it}
