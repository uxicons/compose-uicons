package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yen: ImageVector? = null

val Icons.Tc.Yen: ImageVector
    get() = _Yen ?: UXIcon(name = "Yen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.01f, 1.57f)
                curveToRelative(0.04f, -0.27f, -0.15f, -0.53f, -0.43f, -0.56f)
                curveToRelative(-0.27f, -0.04f, -0.53f, 0.15f, -0.56f, 0.43f)
                curveToRelative(-0.01f, 0.1f, -1.39f, 9.68f, -8.02f, 11.12f)
                curveTo(5.38f, 11.12f, 4.0f, 1.53f, 3.98f, 1.43f)
                curveToRelative(-0.04f, -0.27f, -0.3f, -0.47f, -0.56f, -0.43f)
                curveToRelative(-0.27f, 0.04f, -0.47f, 0.29f, -0.43f, 0.56f)
                curveToRelative(0.05f, 0.38f, 1.19f, 8.26f, 6.55f, 11.14f)
                horizontalLineToRelative(-2.88f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.84f)
                verticalLineToRelative(1.91f)
                horizontalLineTo(6.66f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.84f)
                verticalLineToRelative(5.89f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.89f)
                horizontalLineToRelative(4.84f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.84f)
                verticalLineToRelative(-1.91f)
                horizontalLineToRelative(4.84f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.88f)
                curveToRelative(5.36f, -2.88f, 6.5f, -10.76f, 6.55f, -11.14f)
                close()
            }
        }.also { _Yen = it}
