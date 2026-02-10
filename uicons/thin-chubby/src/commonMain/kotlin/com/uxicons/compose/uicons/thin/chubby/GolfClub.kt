package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfClub: ImageVector? = null

val Icons.Tc.GolfClub: ImageVector
    get() = _GolfClub ?: UXIcon(name = "GolfClub") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.41f, 1.0f)
                curveToRelative(-0.27f, -0.03f, -0.53f, 0.15f, -0.56f, 0.42f)
                lineToRelative(-1.66f, 11.71f)
                curveToRelative(-5.09f, -2.34f, -10.74f, -3.58f, -16.45f, -3.58f)
                curveToRelative(-0.15f, 0f, -0.29f, 0.07f, -0.39f, 0.18f)
                curveTo(0.46f, 13.23f, 0.46f, 19.34f, 3.34f, 22.82f)
                curveToRelative(0.1f, 0.11f, 0.23f, 0.18f, 0.39f, 0.18f)
                lineTo(12.77f, 23f)
                curveToRelative(4.58f, 0f, 8.31f, -3.62f, 8.31f, -8.07f)
                verticalLineToRelative(-1.01f)
                lineToRelative(1.75f, -12.34f)
                curveToRelative(0.04f, -0.27f, -0.15f, -0.53f, -0.42f, -0.56f)
                close()
                moveTo(20.08f, 14.93f)
                curveToRelative(0f, 3.9f, -3.28f, 7.08f, -7.31f, 7.08f)
                lineTo(3.97f, 22f)
                curveToRelative(-2.41f, -3.11f, -2.41f, -8.33f, 0f, -11.44f)
                curveToRelative(5.55f, 0.02f, 11.12f, 1.28f, 16.11f, 3.63f)
                verticalLineToRelative(0.73f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.57f, 14.89f)
                lineToRelative(8.05f, 1.03f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                curveToRelative(0.25f, 0f, 0.46f, -0.18f, 0.49f, -0.44f)
                curveToRelative(0.04f, -0.27f, -0.16f, -0.52f, -0.43f, -0.56f)
                lineToRelative(-8.05f, -1.03f)
                curveToRelative(-0.27f, -0.04f, -0.52f, 0.16f, -0.56f, 0.43f)
                curveToRelative(-0.04f, 0.27f, 0.16f, 0.52f, 0.43f, 0.56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.17f, 18.66f)
                lineToRelative(4.72f, 0.6f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                curveToRelative(0.25f, 0f, 0.46f, -0.18f, 0.49f, -0.44f)
                curveToRelative(0.04f, -0.27f, -0.16f, -0.52f, -0.43f, -0.56f)
                lineToRelative(-4.72f, -0.6f)
                curveToRelative(-0.27f, -0.04f, -0.52f, 0.16f, -0.56f, 0.43f)
                reflectiveCurveToRelative(0.16f, 0.52f, 0.43f, 0.56f)
                close()
            }
        }.also { _GolfClub = it}
