package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfHole: ImageVector? = null

val Icons.Tr.GolfHole: ImageVector
    get() = _GolfHole ?: UXIcon(name = "GolfHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 19f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.86f)
                lineToRelative(7.96f, -4f)
                curveToRelative(0.6f, -0.29f, 0.98f, -0.86f, 1.03f, -1.52f)
                reflectiveCurveToRelative(-0.26f, -1.28f, -0.8f, -1.64f)
                lineTo(14.19f, 0.22f)
                curveToRelative(-0.55f, -0.28f, -1.44f, -0.35f, -2.18f, 0.1f)
                curveToRelative(-0.65f, 0.41f, -1.01f, 1.14f, -1.01f, 2.06f)
                lineTo(11.0f, 18.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(12f, 2.39f)
                curveToRelative(0f, -0.58f, 0.18f, -0.99f, 0.54f, -1.21f)
                curveToRelative(0.21f, -0.13f, 0.47f, -0.18f, 0.69f, -0.18f)
                curveToRelative(0.18f, 0f, 0.35f, 0.03f, 0.45f, 0.08f)
                lineToRelative(5.95f, 4.22f)
                curveToRelative(0.25f, 0.17f, 0.39f, 0.45f, 0.37f, 0.75f)
                curveToRelative(-0.02f, 0.3f, -0.2f, 0.56f, -0.48f, 0.69f)
                lineToRelative(-7.52f, 3.78f)
                lineTo(12f, 2.39f)
                close()
                moveTo(24f, 18.5f)
                curveToRelative(0f, 3.08f, -5.27f, 5.5f, -12f, 5.5f)
                reflectiveCurveTo(0f, 21.58f, 0f, 18.5f)
                curveToRelative(0f, -2.49f, 3.31f, -4.55f, 8.43f, -5.26f)
                curveToRelative(0.26f, -0.04f, 0.53f, 0.15f, 0.56f, 0.43f)
                curveToRelative(0.04f, 0.27f, -0.15f, 0.53f, -0.43f, 0.56f)
                curveToRelative(-4.46f, 0.62f, -7.57f, 2.37f, -7.57f, 4.27f)
                curveToRelative(0f, 2.44f, 5.04f, 4.5f, 11f, 4.5f)
                reflectiveCurveToRelative(11f, -2.06f, 11f, -4.5f)
                curveToRelative(0f, -2.03f, -3.67f, -3.92f, -8.55f, -4.38f)
                curveToRelative(-0.27f, -0.03f, -0.48f, -0.27f, -0.45f, -0.55f)
                curveToRelative(0.03f, -0.28f, 0.28f, -0.47f, 0.55f, -0.45f)
                curveToRelative(5.57f, 0.54f, 9.45f, 2.75f, 9.45f, 5.38f)
                close()
            }
        }.also { _GolfHole = it}
