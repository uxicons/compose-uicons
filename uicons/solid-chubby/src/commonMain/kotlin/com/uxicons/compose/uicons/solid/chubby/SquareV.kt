package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareV: ImageVector? = null

val Icons.Sc.SquareV: ImageVector
    get() = _SquareV ?: UXIcon(name = "SquareV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 2.79f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.19f, -0.04f, -4.71f, -1.02f, -9.21f, -1.02f)
                reflectiveCurveToRelative(-9.03f, 0.98f, -9.21f, 1.02f)
                curveToRelative(-0.38f, 0.08f, -0.68f, 0.38f, -0.76f, 0.76f)
                curveToRelative(-0.04f, 0.19f, -1.02f, 4.71f, -1.02f, 9.21f)
                reflectiveCurveToRelative(0.98f, 9.02f, 1.02f, 9.21f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.19f, 0.04f, 4.71f, 1.02f, 9.21f, 1.02f)
                reflectiveCurveToRelative(9.02f, -0.98f, 9.21f, -1.02f)
                curveToRelative(0.38f, -0.08f, 0.68f, -0.38f, 0.76f, -0.76f)
                curveToRelative(0.04f, -0.19f, 1.02f, -4.71f, 1.02f, -9.21f)
                reflectiveCurveToRelative(-0.98f, -9.02f, -1.02f, -9.21f)
                close()
                moveTo(12.8f, 17.6f)
                curveToRelative(-0.19f, 0.25f, -0.49f, 0.4f, -0.8f, 0.4f)
                reflectiveCurveToRelative(-0.61f, -0.15f, -0.8f, -0.4f)
                curveToRelative(-0.14f, -0.18f, -3.33f, -4.56f, -3.69f, -10.54f)
                curveToRelative(-0.03f, -0.55f, 0.39f, -1.02f, 0.94f, -1.06f)
                curveToRelative(0.55f, -0.03f, 1.02f, 0.39f, 1.06f, 0.94f)
                curveToRelative(0.22f, 3.58f, 1.59f, 6.57f, 2.5f, 8.18f)
                curveToRelative(0.91f, -1.61f, 2.29f, -4.61f, 2.5f, -8.18f)
                curveToRelative(0.03f, -0.55f, 0.52f, -0.97f, 1.06f, -0.94f)
                curveToRelative(0.55f, 0.03f, 0.97f, 0.51f, 0.94f, 1.06f)
                curveToRelative(-0.36f, 5.98f, -3.56f, 10.35f, -3.69f, 10.54f)
                close()
            }
        }.also { _SquareV = it}
