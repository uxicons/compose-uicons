package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CentSign: ImageVector? = null

val Icons.Tc.CentSign: ImageVector
    get() = _CentSign ?: UXIcon(name = "CentSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.38f, 16.41f)
                curveToRelative(-1.09f, 3.12f, -3.62f, 4.53f, -8.18f, 4.58f)
                curveToRelative(0.16f, 0.88f, 0.28f, 1.38f, 0.28f, 1.39f)
                curveToRelative(0.07f, 0.27f, -0.1f, 0.54f, -0.36f, 0.61f)
                curveToRelative(-0.26f, 0.07f, -0.54f, -0.09f, -0.61f, -0.36f)
                curveToRelative(-0.01f, -0.03f, -0.15f, -0.61f, -0.33f, -1.64f)
                curveToRelative(-5.72f, -0.23f, -8.19f, -2.95f, -8.19f, -8.98f)
                reflectiveCurveToRelative(2.46f, -8.75f, 8.18f, -8.98f)
                curveToRelative(0.18f, -1.04f, 0.32f, -1.62f, 0.33f, -1.64f)
                curveToRelative(0.07f, -0.27f, 0.33f, -0.43f, 0.61f, -0.36f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.61f)
                curveToRelative(-0.0f, 0.01f, -0.12f, 0.5f, -0.28f, 1.39f)
                curveToRelative(4.55f, 0.04f, 7.09f, 1.45f, 8.18f, 4.58f)
                curveToRelative(0.09f, 0.26f, -0.05f, 0.55f, -0.31f, 0.64f)
                curveToRelative(-0.26f, 0.09f, -0.55f, -0.05f, -0.64f, -0.31f)
                curveToRelative(-0.96f, -2.74f, -3.19f, -3.92f, -7.44f, -3.92f)
                curveToRelative(-5.83f, 0f, -8f, 2.17f, -8f, 8f)
                reflectiveCurveToRelative(2.17f, 8f, 8f, 8f)
                curveToRelative(4.25f, 0f, 6.48f, -1.17f, 7.44f, -3.92f)
                curveToRelative(0.09f, -0.26f, 0.38f, -0.4f, 0.64f, -0.31f)
                curveToRelative(0.26f, 0.09f, 0.4f, 0.38f, 0.31f, 0.64f)
                close()
            }
        }.also { _CentSign = it}
