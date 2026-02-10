package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareInfo: ImageVector? = null

val Icons.Rc.SquareInfo: ImageVector
    get() = _SquareInfo ?: UXIcon(name = "SquareInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 11f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.89f)
                curveToRelative(-0.85f, 0.2f, -1.28f, 0.59f, -1.3f, 0.61f)
                curveToRelative(-0.4f, 0.37f, -1.03f, 0.36f, -1.41f, -0.03f)
                curveToRelative(-0.38f, -0.39f, -0.38f, -1.01f, 0.01f, -1.4f)
                curveToRelative(0.13f, -0.13f, 1.36f, -1.29f, 3.71f, -1.29f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-4.5f, 0f, -9.02f, -0.98f, -9.21f, -1.02f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.04f, -0.19f, -1.02f, -4.71f, -1.02f, -9.21f)
                reflectiveCurveToRelative(0.98f, -9.02f, 1.02f, -9.21f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.19f, -0.04f, 4.71f, -1.02f, 9.21f, -1.02f)
                reflectiveCurveToRelative(9.02f, 0.98f, 9.21f, 1.02f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                reflectiveCurveToRelative(-0.98f, 9.02f, -1.02f, 9.21f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.19f, 0.04f, -4.71f, 1.02f, -9.21f, 1.02f)
                close()
                moveTo(3.85f, 20.15f)
                curveToRelative(1.39f, 0.27f, 4.82f, 0.85f, 8.15f, 0.85f)
                reflectiveCurveToRelative(6.76f, -0.58f, 8.15f, -0.85f)
                curveToRelative(0.27f, -1.39f, 0.85f, -4.82f, 0.85f, -8.15f)
                reflectiveCurveToRelative(-0.58f, -6.76f, -0.85f, -8.15f)
                curveToRelative(-1.39f, -0.27f, -4.82f, -0.85f, -8.15f, -0.85f)
                reflectiveCurveToRelative(-6.76f, 0.58f, -8.15f, 0.85f)
                curveToRelative(-0.27f, 1.39f, -0.85f, 4.82f, -0.85f, 8.15f)
                reflectiveCurveToRelative(0.58f, 6.76f, 0.85f, 8.15f)
                close()
            }
        }.also { _SquareInfo = it}
