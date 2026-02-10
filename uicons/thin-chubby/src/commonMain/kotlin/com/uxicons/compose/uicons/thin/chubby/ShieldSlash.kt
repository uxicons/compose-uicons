package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Tc.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 22.15f)
                lineToRelative(-2.82f, -2.82f)
                curveToRelative(0.37f, -0.28f, 0.71f, -0.56f, 0.97f, -0.84f)
                curveToRelative(1.78f, -1.88f, 0.81f, -10.89f, -0.1f, -15.3f)
                curveToRelative(-0.03f, -0.14f, -0.12f, -0.26f, -0.24f, -0.33f)
                curveToRelative(-0.13f, -0.08f, -3.29f, -1.84f, -8.66f, -1.85f)
                curveToRelative(-4.79f, -0.02f, -7.85f, 1.42f, -8.52f, 1.77f)
                lineToRelative(-1.63f, -1.63f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(4.23f, 3.52f)
                curveToRelative(0.9f, -0.45f, 3.77f, -1.52f, 7.86f, -1.52f)
                curveToRelative(4.32f, 0f, 7.15f, 1.25f, 7.88f, 1.62f)
                curveToRelative(1.1f, 5.48f, 1.48f, 12.94f, 0.3f, 14.18f)
                curveToRelative(-0.25f, 0.26f, -0.58f, 0.54f, -0.96f, 0.81f)
                close()
                moveTo(17.45f, 20.34f)
                curveToRelative(0.12f, 0.25f, 0.02f, 0.55f, -0.23f, 0.67f)
                curveToRelative(-1.8f, 0.88f, -3.8f, 1.6f, -5.07f, 1.97f)
                curveToRelative(-0.09f, 0.03f, -0.2f, 0.03f, -0.29f, 0f)
                curveToRelative(-2.38f, -0.71f, -6.92f, -2.45f, -8.86f, -4.5f)
                curveToRelative(-1.78f, -1.88f, -0.69f, -10.37f, -0.46f, -12.05f)
                curveToRelative(0.04f, -0.27f, 0.3f, -0.46f, 0.56f, -0.43f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.29f, 0.43f, 0.56f)
                curveToRelative(-0.78f, 5.57f, -0.7f, 10.29f, 0.19f, 11.23f)
                curveToRelative(1.75f, 1.85f, 6.1f, 3.52f, 8.28f, 4.18f)
                curveToRelative(1.24f, -0.38f, 3.1f, -1.05f, 4.78f, -1.87f)
                curveToRelative(0.24f, -0.12f, 0.55f, -0.02f, 0.67f, 0.23f)
                close()
            }
        }.also { _ShieldSlash = it}
