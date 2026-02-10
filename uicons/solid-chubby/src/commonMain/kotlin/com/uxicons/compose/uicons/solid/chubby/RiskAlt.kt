package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RiskAlt: ImageVector? = null

val Icons.Sc.RiskAlt: ImageVector
    get() = _RiskAlt ?: UXIcon(name = "RiskAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 20.44f)
                lineToRelative(-4.1f, -4.1f)
                curveToRelative(1.0f, -1.52f, 1.54f, -3.48f, 1.54f, -5.84f)
                curveToRelative(0f, -6.04f, -3.46f, -9.5f, -9.5f, -9.5f)
                reflectiveCurveToRelative(-9.5f, 3.46f, -9.5f, 9.5f)
                reflectiveCurveToRelative(3.46f, 9.5f, 9.5f, 9.5f)
                curveToRelative(2.36f, 0f, 4.32f, -0.54f, 5.84f, -1.54f)
                lineToRelative(4.1f, 4.1f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                reflectiveCurveToRelative(0.59f, -1.53f, 0f, -2.12f)
                close()
                moveTo(10.5f, 15f)
                curveToRelative(-1.72f, 0f, -3.41f, -0.26f, -3.89f, -0.34f)
                curveToRelative(-0.55f, -0.09f, -1.04f, -0.43f, -1.33f, -0.94f)
                curveToRelative(-0.27f, -0.47f, -0.35f, -1.04f, -0.2f, -1.58f)
                curveToRelative(0.16f, -0.63f, 0.6f, -1.95f, 1.7f, -3.64f)
                curveToRelative(1.25f, -1.94f, 2.28f, -2.85f, 2.57f, -3.09f)
                curveToRelative(0.68f, -0.55f, 1.66f, -0.54f, 2.32f, -0.01f)
                curveToRelative(0.29f, 0.23f, 1.32f, 1.15f, 2.57f, 3.1f)
                curveToRelative(1.1f, 1.7f, 1.54f, 3.02f, 1.7f, 3.65f)
                curveToRelative(0.14f, 0.53f, 0.06f, 1.1f, -0.21f, 1.57f)
                curveToRelative(-0.29f, 0.51f, -0.78f, 0.85f, -1.34f, 0.94f)
                curveToRelative(-0.47f, 0.08f, -2.15f, 0.33f, -3.88f, 0.33f)
                close()
                moveTo(11.5f, 12.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(11.5f, 8f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _RiskAlt = it}
