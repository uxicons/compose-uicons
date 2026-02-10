package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Tc.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.87f, 3.2f)
                curveToRelative(-0.03f, -0.15f, -0.12f, -0.27f, -0.25f, -0.35f)
                curveToRelative(-0.01f, -0.06f, -3.38f, -1.85f, -8.62f, -1.85f)
                reflectiveCurveToRelative(-8.49f, 1.77f, -8.62f, 1.85f)
                curveToRelative(-0.13f, 0.07f, -0.22f, 0.2f, -0.25f, 0.35f)
                curveToRelative(-0.91f, 4.4f, -1.86f, 13.41f, -0.09f, 15.29f)
                curveToRelative(1.92f, 2.04f, 6.44f, 3.78f, 8.81f, 4.49f)
                curveToRelative(0.1f, 0.03f, 0.21f, 0.03f, 0.31f, 0f)
                curveToRelative(2.37f, -0.71f, 6.88f, -2.45f, 8.81f, -4.49f)
                curveToRelative(1.77f, -1.88f, 0.81f, -10.88f, -0.09f, -15.29f)
                close()
                moveTo(4.11f, 3.65f)
                curveToRelative(0.72f, -0.36f, 3.36f, -1.5f, 7.37f, -1.59f)
                lineToRelative(-0.0f, 19.7f)
                curveToRelative(-2.27f, -0.75f, -6.07f, -2.29f, -7.67f, -3.99f)
                curveToRelative(-1.16f, -1.24f, -0.78f, -8.66f, 0.31f, -14.12f)
                close()
                moveTo(20.2f, 17.77f)
                curveToRelative(-1.6f, 1.7f, -5.41f, 3.25f, -7.68f, 4.0f)
                lineToRelative(0.0f, -19.7f)
                curveToRelative(4.01f, 0.08f, 6.65f, 1.23f, 7.37f, 1.59f)
                curveToRelative(1.09f, 5.46f, 1.47f, 12.88f, 0.31f, 14.12f)
                close()
            }
        }.also { _ShieldAlt = it}
