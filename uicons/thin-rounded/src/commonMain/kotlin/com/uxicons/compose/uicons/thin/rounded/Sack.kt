package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Tr.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.83f, 5.27f)
                curveToRelative(1.11f, -0.59f, 2.46f, -1.58f, 3.06f, -3.09f)
                curveToRelative(0.19f, -0.49f, 0.13f, -1.02f, -0.17f, -1.46f)
                curveToRelative(-0.31f, -0.45f, -0.81f, -0.72f, -1.36f, -0.72f)
                horizontalLineToRelative(-6.73f)
                curveToRelative(-0.54f, 0f, -1.05f, 0.27f, -1.36f, 0.72f)
                curveToRelative(-0.3f, 0.44f, -0.36f, 0.97f, -0.17f, 1.46f)
                curveToRelative(0.6f, 1.5f, 1.95f, 2.5f, 3.06f, 3.09f)
                curveTo(5.24f, 6.62f, 1f, 13.09f, 1f, 18.25f)
                curveToRelative(0f, 3.17f, 2.58f, 5.75f, 5.75f, 5.75f)
                horizontalLineToRelative(10.5f)
                curveToRelative(3.17f, 0f, 5.75f, -2.58f, 5.75f, -5.75f)
                curveToRelative(0f, -5.16f, -4.24f, -11.63f, -9.17f, -12.98f)
                close()
                moveTo(8.04f, 1.81f)
                curveToRelative(-0.07f, -0.17f, -0.04f, -0.37f, 0.07f, -0.53f)
                curveToRelative(0.12f, -0.18f, 0.32f, -0.28f, 0.53f, -0.28f)
                horizontalLineToRelative(6.73f)
                curveToRelative(0.21f, 0f, 0.41f, 0.11f, 0.53f, 0.28f)
                curveToRelative(0.11f, 0.16f, 0.13f, 0.35f, 0.07f, 0.53f)
                curveToRelative(-0.79f, 1.98f, -3.34f, 2.95f, -3.96f, 3.16f)
                curveToRelative(-0.62f, -0.21f, -3.17f, -1.18f, -3.96f, -3.16f)
                close()
                moveTo(17.25f, 23f)
                lineTo(6.75f, 23f)
                curveToRelative(-2.62f, 0f, -4.75f, -2.13f, -4.75f, -4.75f)
                curveToRelative(0f, -5.35f, 4.85f, -12.25f, 10f, -12.25f)
                reflectiveCurveToRelative(10f, 6.9f, 10f, 12.25f)
                curveToRelative(0f, 2.62f, -2.13f, 4.75f, -4.75f, 4.75f)
                close()
            }
        }.also { _Sack = it}
