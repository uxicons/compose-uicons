package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Tc.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.12f, 10.37f)
                curveToRelative(0.0f, -0.07f, 0.0f, -0.15f, 0.0f, -0.22f)
                curveToRelative(0f, -4.02f, -3.2f, -7.3f, -7.13f, -7.3f)
                reflectiveCurveToRelative(-7.13f, 3.27f, -7.13f, 7.3f)
                curveToRelative(0f, 0.43f, 0.04f, 0.85f, 0.11f, 1.27f)
                curveToRelative(-2.26f, 0.4f, -3.96f, 2.42f, -3.96f, 4.83f)
                curveToRelative(0f, 2.7f, 2.15f, 4.9f, 4.79f, 4.9f)
                horizontalLineToRelative(11.83f)
                curveToRelative(2.97f, 0f, 5.38f, -2.47f, 5.38f, -5.5f)
                curveToRelative(0f, -2.46f, -1.61f, -4.61f, -3.88f, -5.28f)
                close()
                moveTo(17.62f, 20.15f)
                lineTo(5.79f, 20.15f)
                curveToRelative(-2.09f, 0f, -3.79f, -1.75f, -3.79f, -3.9f)
                curveToRelative(0f, -2.07f, 1.58f, -3.79f, 3.59f, -3.9f)
                curveToRelative(0.15f, -0.01f, 0.29f, -0.08f, 0.38f, -0.2f)
                curveToRelative(0.09f, -0.12f, 0.12f, -0.27f, 0.08f, -0.42f)
                curveToRelative(-0.13f, -0.52f, -0.2f, -1.05f, -0.2f, -1.58f)
                curveToRelative(0f, -3.47f, 2.75f, -6.3f, 6.13f, -6.3f)
                reflectiveCurveToRelative(6.13f, 2.83f, 6.13f, 6.3f)
                curveToRelative(0f, 0.19f, -0.01f, 0.38f, -0.02f, 0.56f)
                curveToRelative(-0.02f, 0.25f, 0.15f, 0.48f, 0.4f, 0.53f)
                curveToRelative(2.03f, 0.42f, 3.51f, 2.27f, 3.51f, 4.41f)
                curveToRelative(0f, 2.48f, -1.97f, 4.5f, -4.38f, 4.5f)
                close()
            }
        }.also { _Cloud = it}
