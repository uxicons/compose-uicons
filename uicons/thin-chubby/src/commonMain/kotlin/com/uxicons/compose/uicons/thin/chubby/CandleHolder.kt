package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Tc.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 5.5f)
                curveToRelative(1.42f, 0f, 2f, -0.58f, 2f, -2f)
                curveToRelative(0f, -0.83f, -0.67f, -1.87f, -1.23f, -2.6f)
                curveToRelative(-0.37f, -0.48f, -1.16f, -0.48f, -1.53f, 0f)
                curveToRelative(-0.56f, 0.73f, -1.23f, 1.77f, -1.23f, 2.6f)
                curveToRelative(0f, 1.42f, 0.58f, 2f, 2f, 2f)
                close()
                moveTo(8f, 1.54f)
                curveToRelative(0.93f, 1.21f, 1f, 1.8f, 1f, 1.96f)
                curveToRelative(0f, 0.87f, -0.13f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.13f, -1f, -1f)
                curveToRelative(0f, -0.15f, 0.07f, -0.74f, 1f, -1.96f)
                close()
                moveTo(19.5f, 16f)
                curveToRelative(-1.03f, 0f, -1.81f, 0.19f, -2.36f, 0.59f)
                curveToRelative(-0.22f, 0.16f, -0.28f, 0.47f, -0.11f, 0.7f)
                curveToRelative(0.16f, 0.23f, 0.47f, 0.28f, 0.7f, 0.12f)
                curveToRelative(0.38f, -0.27f, 0.96f, -0.41f, 1.78f, -0.41f)
                curveToRelative(1.87f, 0f, 2.5f, 0.63f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-0.63f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6.94f)
                curveToRelative(0.14f, -1.19f, 0.44f, -4.11f, 0.44f, -7f)
                curveToRelative(0f, -3.75f, -0.5f, -7.01f, -0.51f, -7.04f)
                curveToRelative(-0.03f, -0.2f, -0.18f, -0.36f, -0.38f, -0.41f)
                curveToRelative(-0.09f, -0.02f, -2.28f, -0.55f, -4.12f, -0.55f)
                reflectiveCurveToRelative(-4.03f, 0.53f, -4.12f, 0.55f)
                curveToRelative(-0.2f, 0.05f, -0.34f, 0.21f, -0.38f, 0.41f)
                curveToRelative(-0.01f, 0.03f, -0.51f, 3.3f, -0.51f, 7.04f)
                curveToRelative(0f, 2.89f, 0.3f, 5.81f, 0.44f, 7f)
                horizontalLineToRelative(-1.94f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(18f)
                curveToRelative(2.42f, 0f, 3.5f, -1.08f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.08f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(4f, 15f)
                curveToRelative(0f, -2.98f, 0.32f, -5.64f, 0.45f, -6.55f)
                curveToRelative(0.67f, -0.14f, 2.24f, -0.45f, 3.55f, -0.45f)
                reflectiveCurveToRelative(2.88f, 0.3f, 3.55f, 0.45f)
                curveToRelative(0.12f, 0.91f, 0.45f, 3.58f, 0.45f, 6.55f)
                curveToRelative(0f, 2.94f, -0.32f, 5.92f, -0.44f, 7f)
                horizontalLineToRelative(-7.12f)
                curveToRelative(-0.13f, -1.08f, -0.44f, -4.06f, -0.44f, -7f)
                close()
            }
        }.also { _CandleHolder = it}
