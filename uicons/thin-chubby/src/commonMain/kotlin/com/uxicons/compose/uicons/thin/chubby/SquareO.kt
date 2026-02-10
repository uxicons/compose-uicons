package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareO: ImageVector? = null

val Icons.Tc.SquareO: ImageVector
    get() = _SquareO ?: UXIcon(name = "SquareO") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-3.5f, 0f, -5f, 1.79f, -5f, 6f)
                reflectiveCurveToRelative(1.5f, 6f, 5f, 6f)
                reflectiveCurveToRelative(5f, -1.79f, 5f, -6f)
                reflectiveCurveToRelative(-1.5f, -6f, -5f, -6f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.92f, 0f, -4f, -1.35f, -4f, -5f)
                reflectiveCurveToRelative(1.08f, -5f, 4f, -5f)
                reflectiveCurveToRelative(4f, 1.35f, 4f, 5f)
                reflectiveCurveToRelative(-1.08f, 5f, -4f, 5f)
                close()
                moveTo(21.94f, 2.44f)
                curveToRelative(-0.04f, -0.19f, -0.19f, -0.34f, -0.38f, -0.38f)
                curveToRelative(-0.05f, -0.01f, -4.89f, -1.06f, -9.56f, -1.06f)
                reflectiveCurveToRelative(-9.51f, 1.05f, -9.56f, 1.06f)
                curveToRelative(-0.19f, 0.04f, -0.34f, 0.19f, -0.38f, 0.38f)
                curveToRelative(-0.01f, 0.05f, -1.06f, 4.89f, -1.06f, 9.56f)
                reflectiveCurveToRelative(1.05f, 9.51f, 1.06f, 9.56f)
                curveToRelative(0.04f, 0.19f, 0.19f, 0.34f, 0.38f, 0.38f)
                curveToRelative(0.05f, 0.01f, 4.89f, 1.06f, 9.56f, 1.06f)
                reflectiveCurveToRelative(9.51f, -1.05f, 9.56f, -1.06f)
                curveToRelative(0.19f, -0.04f, 0.34f, -0.19f, 0.38f, -0.38f)
                curveToRelative(0.01f, -0.05f, 1.06f, -4.89f, 1.06f, -9.56f)
                reflectiveCurveToRelative(-1.05f, -9.51f, -1.06f, -9.56f)
                close()
                moveTo(21.03f, 21.03f)
                curveToRelative(-1.14f, 0.23f, -5.15f, 0.97f, -9.03f, 0.97f)
                reflectiveCurveToRelative(-7.89f, -0.74f, -9.03f, -0.97f)
                curveToRelative(-0.23f, -1.14f, -0.97f, -5.15f, -0.97f, -9.03f)
                reflectiveCurveToRelative(0.74f, -7.89f, 0.97f, -9.03f)
                curveToRelative(1.14f, -0.23f, 5.15f, -0.97f, 9.03f, -0.97f)
                reflectiveCurveToRelative(7.89f, 0.74f, 9.03f, 0.97f)
                curveToRelative(0.23f, 1.14f, 0.97f, 5.15f, 0.97f, 9.03f)
                reflectiveCurveToRelative(-0.74f, 7.89f, -0.97f, 9.03f)
                close()
            }
        }.also { _SquareO = it}
