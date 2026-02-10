package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chalkboard: ImageVector? = null

val Icons.Rc.Chalkboard: ImageVector
    get() = _Chalkboard ?: UXIcon(name = "Chalkboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.16f, 19.03f)
                curveToRelative(0.3f, -1.23f, 0.84f, -3.84f, 0.84f, -7.03f)
                curveToRelative(0f, -4.4f, -1.02f, -7.17f, -1.06f, -7.28f)
                curveToRelative(-0.1f, -0.28f, -0.32f, -0.49f, -0.6f, -0.59f)
                curveToRelative(-0.13f, -0.05f, -3.23f, -1.12f, -9.34f, -1.12f)
                reflectiveCurveToRelative(-9.21f, 1.08f, -9.34f, 1.12f)
                curveToRelative(-0.28f, 0.1f, -0.5f, 0.32f, -0.6f, 0.59f)
                curveToRelative(-0.04f, 0.12f, -1.06f, 2.89f, -1.06f, 7.28f)
                curveToRelative(0f, 3.19f, 0.53f, 5.8f, 0.84f, 7.03f)
                curveToRelative(-0.47f, 0.08f, -0.84f, 0.47f, -0.84f, 0.97f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.49f, -0.37f, -0.89f, -0.84f, -0.97f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-10.1f)
                curveToRelative(-0.2f, -0.75f, -0.9f, -3.53f, -0.9f, -7f)
                curveToRelative(0f, -3.02f, 0.53f, -5.22f, 0.79f, -6.12f)
                curveToRelative(1.03f, -0.28f, 3.78f, -0.88f, 8.21f, -0.88f)
                reflectiveCurveToRelative(7.18f, 0.6f, 8.21f, 0.88f)
                curveToRelative(0.26f, 0.91f, 0.79f, 3.1f, 0.79f, 6.12f)
                curveToRelative(0f, 3.47f, -0.69f, 6.25f, -0.9f, 7f)
                horizontalLineToRelative(-2.1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Chalkboard = it}
