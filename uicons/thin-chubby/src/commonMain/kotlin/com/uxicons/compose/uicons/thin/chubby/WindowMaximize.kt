package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowMaximize: ImageVector? = null

val Icons.Tc.WindowMaximize: ImageVector
    get() = _WindowMaximize ?: UXIcon(name = "WindowMaximize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.94f, 3.44f)
                curveToRelative(-0.04f, -0.17f, -0.17f, -0.3f, -0.33f, -0.35f)
                curveToRelative(-0.13f, -0.04f, -3.3f, -1.08f, -9.61f, -1.08f)
                reflectiveCurveToRelative(-9.48f, 1.04f, -9.61f, 1.08f)
                curveToRelative(-0.16f, 0.05f, -0.28f, 0.19f, -0.33f, 0.35f)
                curveToRelative(-0.04f, 0.17f, -1.06f, 4.33f, -1.06f, 8.56f)
                reflectiveCurveToRelative(1.02f, 8.39f, 1.06f, 8.56f)
                curveToRelative(0.04f, 0.17f, 0.17f, 0.3f, 0.33f, 0.35f)
                curveToRelative(0.13f, 0.04f, 3.3f, 1.08f, 9.61f, 1.08f)
                reflectiveCurveToRelative(9.48f, -1.04f, 9.61f, -1.08f)
                curveToRelative(0.16f, -0.05f, 0.28f, -0.19f, 0.33f, -0.35f)
                curveToRelative(0.04f, -0.17f, 1.06f, -4.33f, 1.06f, -8.56f)
                reflectiveCurveToRelative(-1.02f, -8.39f, -1.06f, -8.56f)
                close()
                moveTo(12f, 3f)
                curveToRelative(5.13f, 0f, 8.16f, 0.71f, 9.03f, 0.95f)
                curveToRelative(0.11f, 0.49f, 0.35f, 1.62f, 0.56f, 3.05f)
                horizontalLineToRelative(-19.19f)
                curveToRelative(0.21f, -1.43f, 0.45f, -2.55f, 0.56f, -3.05f)
                curveToRelative(0.87f, -0.24f, 3.9f, -0.95f, 9.03f, -0.95f)
                close()
                moveTo(21.03f, 20.05f)
                curveToRelative(-0.87f, 0.24f, -3.9f, 0.95f, -9.03f, 0.95f)
                reflectiveCurveToRelative(-8.16f, -0.71f, -9.03f, -0.95f)
                curveToRelative(-0.23f, -1f, -0.97f, -4.55f, -0.97f, -8.05f)
                curveToRelative(0f, -1.38f, 0.12f, -2.77f, 0.27f, -4f)
                horizontalLineToRelative(19.46f)
                curveToRelative(0.15f, 1.24f, 0.27f, 2.62f, 0.27f, 4f)
                curveToRelative(0f, 3.5f, -0.74f, 7.05f, -0.97f, 8.05f)
                close()
            }
        }.also { _WindowMaximize = it}
