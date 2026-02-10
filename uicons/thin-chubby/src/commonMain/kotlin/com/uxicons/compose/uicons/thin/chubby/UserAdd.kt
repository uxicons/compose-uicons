package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAdd: ImageVector? = null

val Icons.Tc.UserAdd: ImageVector
    get() = _UserAdd ?: UXIcon(name = "UserAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.45f, 11.77f)
                curveToRelative(3.5f, -0.02f, 5.3f, -1.83f, 5.37f, -5.39f)
                curveToRelative(-0.06f, -3.45f, -1.97f, -5.38f, -5.37f, -5.38f)
                curveToRelative(-3.49f, 0f, -5.37f, 1.99f, -5.37f, 5.4f)
                curveToRelative(0f, 3.5f, 1.92f, 5.36f, 5.37f, 5.38f)
                close()
                moveTo(9.44f, 2f)
                curveToRelative(2.85f, 0.02f, 4.32f, 1.5f, 4.37f, 4.38f)
                curveToRelative(-0.06f, 2.98f, -1.44f, 4.38f, -4.37f, 4.4f)
                curveToRelative(-2.93f, -0.02f, -4.32f, -1.41f, -4.37f, -4.39f)
                curveToRelative(0.06f, -2.93f, 1.49f, -4.37f, 4.37f, -4.39f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.44f, 14.29f)
                curveToRelative(-5.26f, 0.03f, -8.08f, 2.87f, -8.18f, 8.2f)
                curveToRelative(-0.01f, 0.28f, 0.21f, 0.5f, 0.49f, 0.51f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.27f, 0f, 0.49f, -0.22f, 0.5f, -0.49f)
                curveToRelative(0.09f, -4.83f, 2.44f, -7.18f, 7.18f, -7.21f)
                curveToRelative(4.68f, 0.03f, 7.1f, 2.46f, 7.18f, 7.21f)
                curveToRelative(0.01f, 0.28f, 0.22f, 0.5f, 0.51f, 0.49f)
                curveToRelative(0.28f, -0.01f, 0.5f, -0.23f, 0.49f, -0.51f)
                curveToRelative(-0.09f, -5.25f, -3.0f, -8.16f, -8.18f, -8.2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.24f, 12.24f)
                horizontalLineToRelative(-2.41f)
                verticalLineToRelative(-2.4f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(-2.41f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.41f)
                verticalLineToRelative(2.4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(2.41f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _UserAdd = it}
