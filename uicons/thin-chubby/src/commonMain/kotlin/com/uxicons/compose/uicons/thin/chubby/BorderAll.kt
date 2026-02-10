package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BorderAll: ImageVector? = null

val Icons.Tc.BorderAll: ImageVector
    get() = _BorderAll ?: UXIcon(name = "BorderAll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.94f, 2.44f)
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
                moveTo(21.99f, 11.5f)
                horizontalLineToRelative(-9.49f)
                verticalLineToRelative(-9.49f)
                curveToRelative(3.72f, 0.06f, 7.44f, 0.75f, 8.53f, 0.97f)
                curveToRelative(0.22f, 1.09f, 0.91f, 4.81f, 0.97f, 8.53f)
                close()
                moveTo(2.97f, 2.97f)
                curveToRelative(1.09f, -0.22f, 4.81f, -0.91f, 8.53f, -0.97f)
                verticalLineToRelative(9.49f)
                horizontalLineToRelative(-9.49f)
                curveToRelative(0.06f, -3.72f, 0.75f, -7.44f, 0.97f, -8.53f)
                close()
                moveTo(2.01f, 12.5f)
                horizontalLineToRelative(9.49f)
                verticalLineToRelative(9.49f)
                curveToRelative(-3.72f, -0.06f, -7.44f, -0.75f, -8.53f, -0.97f)
                curveToRelative(-0.22f, -1.09f, -0.91f, -4.81f, -0.97f, -8.53f)
                close()
                moveTo(21.03f, 21.03f)
                curveToRelative(-1.09f, 0.22f, -4.81f, 0.91f, -8.53f, 0.97f)
                verticalLineToRelative(-9.49f)
                horizontalLineToRelative(9.49f)
                curveToRelative(-0.06f, 3.72f, -0.75f, 7.44f, -0.97f, 8.53f)
                close()
            }
        }.also { _BorderAll = it}
