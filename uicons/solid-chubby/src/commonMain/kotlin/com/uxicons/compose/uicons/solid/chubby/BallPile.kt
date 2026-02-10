package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BallPile: ImageVector? = null

val Icons.Sc.BallPile: ImageVector
    get() = _BallPile ?: UXIcon(name = "BallPile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 19.99f)
                curveToRelative(0f, 2.14f, -0.86f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -0.86f, -3.0f, -3.0f)
                reflectiveCurveToRelative(0.86f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 0.86f, 3.0f, 3.0f)
                close()
                moveTo(12f, 17.0f)
                curveToRelative(-2.14f, 0f, -3.0f, 0.86f, -3.0f, 3.0f)
                reflectiveCurveToRelative(0.86f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -0.86f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-0.86f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(4.01f, 17.0f)
                curveToRelative(-2.14f, 0f, -3.0f, 0.86f, -3.0f, 3.0f)
                reflectiveCurveToRelative(0.86f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -0.86f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-0.86f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.99f, 12f)
                curveToRelative(0f, -2.14f, -0.86f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 0.86f, -3.0f, 3.0f)
                reflectiveCurveToRelative(0.86f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -0.86f, 3.0f, -3.0f)
                close()
                moveTo(11.0f, 12f)
                curveToRelative(0f, -2.14f, -0.86f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 0.86f, -3.0f, 3.0f)
                reflectiveCurveToRelative(0.86f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -0.86f, 3.0f, -3.0f)
                close()
                moveTo(12f, 7.0f)
                curveToRelative(2.14f, 0f, 3.0f, -0.86f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-0.86f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 0.86f, -3.0f, 3.0f)
                reflectiveCurveToRelative(0.86f, 3.0f, 3.0f, 3.0f)
                close()
            }
        }.also { _BallPile = it}
