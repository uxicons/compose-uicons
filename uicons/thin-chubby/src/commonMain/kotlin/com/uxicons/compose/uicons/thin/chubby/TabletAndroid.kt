package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabletAndroid: ImageVector? = null

val Icons.Tc.TabletAndroid: ImageVector
    get() = _TabletAndroid ?: UXIcon(name = "TabletAndroid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.84f, 2.38f)
                curveToRelative(-0.05f, -0.14f, -0.16f, -0.25f, -0.3f, -0.3f)
                curveToRelative(-0.12f, -0.04f, -2.97f, -1.08f, -7.54f, -1.08f)
                reflectiveCurveToRelative(-7.42f, 1.04f, -7.54f, 1.08f)
                curveToRelative(-0.14f, 0.05f, -0.25f, 0.16f, -0.3f, 0.3f)
                curveToRelative(-0.05f, 0.13f, -1.16f, 3.31f, -1.16f, 9.62f)
                reflectiveCurveToRelative(1.11f, 9.49f, 1.16f, 9.62f)
                curveToRelative(0.05f, 0.14f, 0.16f, 0.25f, 0.3f, 0.3f)
                curveToRelative(0.12f, 0.04f, 2.97f, 1.08f, 7.54f, 1.08f)
                reflectiveCurveToRelative(7.42f, -1.04f, 7.54f, -1.08f)
                curveToRelative(0.14f, -0.05f, 0.25f, -0.16f, 0.3f, -0.3f)
                curveToRelative(0.05f, -0.13f, 1.16f, -3.31f, 1.16f, -9.62f)
                reflectiveCurveToRelative(-1.12f, -9.49f, -1.16f, -9.62f)
                close()
                moveTo(18.97f, 21.06f)
                curveToRelative(-0.75f, 0.23f, -3.3f, 0.94f, -6.97f, 0.94f)
                reflectiveCurveToRelative(-6.22f, -0.71f, -6.97f, -0.94f)
                curveToRelative(-0.24f, -0.82f, -1.03f, -3.86f, -1.03f, -9.06f)
                reflectiveCurveToRelative(0.79f, -8.24f, 1.03f, -9.06f)
                curveToRelative(0.75f, -0.23f, 3.3f, -0.94f, 6.97f, -0.94f)
                reflectiveCurveToRelative(6.22f, 0.71f, 6.97f, 0.94f)
                curveToRelative(0.24f, 0.82f, 1.03f, 3.86f, 1.03f, 9.06f)
                reflectiveCurveToRelative(-0.79f, 8.24f, -1.03f, 9.06f)
                close()
                moveTo(14f, 18.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _TabletAndroid = it}
