package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ankh: ImageVector? = null

val Icons.Tc.Ankh: ImageVector
    get() = _Ankh ?: UXIcon(name = "Ankh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.69f, 15.12f)
                curveToRelative(-0.1f, -0.04f, -2.26f, -0.92f, -5.59f, -1.09f)
                curveToRelative(1.31f, -1.52f, 3.9f, -4.91f, 3.9f, -8.03f)
                curveToRelative(0f, -3.5f, -1.5f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.5f, -5f, 5f)
                curveToRelative(0f, 3.12f, 2.58f, 6.51f, 3.9f, 8.03f)
                curveToRelative(-3.33f, 0.17f, -5.49f, 1.05f, -5.59f, 1.09f)
                curveToRelative(-0.26f, 0.11f, -0.38f, 0.4f, -0.27f, 0.65f)
                curveToRelative(0.11f, 0.25f, 0.4f, 0.38f, 0.65f, 0.27f)
                curveToRelative(0.02f, -0.01f, 2.34f, -0.95f, 5.81f, -1.04f)
                verticalLineToRelative(6.99f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.99f)
                curveToRelative(3.46f, 0.09f, 5.78f, 1.03f, 5.81f, 1.04f)
                curveToRelative(0.25f, 0.1f, 0.55f, -0.01f, 0.65f, -0.27f)
                curveToRelative(0.11f, -0.26f, -0.01f, -0.55f, -0.27f, -0.65f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.95f, 0f, 4f, 1.05f, 4f, 4f)
                curveToRelative(0f, 3.05f, -2.96f, 6.61f, -4f, 7.77f)
                curveToRelative(-1.04f, -1.16f, -4f, -4.71f, -4f, -7.77f)
                curveToRelative(0f, -2.95f, 1.05f, -4f, 4f, -4f)
                close()
            }
        }.also { _Ankh = it}
