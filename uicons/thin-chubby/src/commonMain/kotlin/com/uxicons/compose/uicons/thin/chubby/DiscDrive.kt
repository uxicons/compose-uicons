package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiscDrive: ImageVector? = null

val Icons.Tc.DiscDrive: ImageVector
    get() = _DiscDrive ?: UXIcon(name = "DiscDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(-4.91f, 0f, -7f, 2.09f, -7f, 7f)
                reflectiveCurveToRelative(2.09f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -2.09f, 7f, -7f)
                reflectiveCurveToRelative(-2.09f, -7f, -7f, -7f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-4.37f, 0f, -6f, -1.63f, -6f, -6f)
                reflectiveCurveToRelative(1.63f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 1.63f, 6f, 6f)
                reflectiveCurveToRelative(-1.63f, 6f, -6f, 6f)
                close()
                moveTo(12.75f, 12f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
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
        }.also { _DiscDrive = it}
