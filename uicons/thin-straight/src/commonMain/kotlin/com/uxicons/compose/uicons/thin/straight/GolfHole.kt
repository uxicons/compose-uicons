package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfHole: ImageVector? = null

val Icons.Ts.GolfHole: ImageVector
    get() = _GolfHole ?: UXIcon(name = "GolfHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.08f)
                lineToRelative(9.29f, -4.87f)
                lineTo(12.97f, 0.09f)
                curveToRelative(-0.16f, -0.06f, -0.34f, -0.09f, -0.53f, -0.09f)
                curveToRelative(-0.85f, 0f, -1.44f, 0.62f, -1.44f, 1.5f)
                lineTo(11.0f, 19f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.92f)
                close()
                moveTo(12f, 1.5f)
                curveToRelative(0f, -0.33f, 0.15f, -0.5f, 0.44f, -0.5f)
                curveToRelative(0.05f, 0f, 0.09f, 0.01f, 0.13f, 0.01f)
                lineToRelative(6.84f, 5.06f)
                lineToRelative(-7.41f, 3.88f)
                lineTo(12f, 1.5f)
                close()
                moveTo(23.99f, 18.58f)
                curveToRelative(-0.09f, 3.04f, -5.32f, 5.42f, -11.99f, 5.42f)
                reflectiveCurveTo(0.1f, 21.62f, 0.01f, 18.58f)
                curveToRelative(-0.01f, -0.05f, -0.01f, -0.08f, -0.01f, -0.08f)
                curveToRelative(0f, -2.61f, 3.77f, -4.73f, 9f, -5.33f)
                verticalLineToRelative(1.01f)
                curveToRelative(-4.56f, 0.55f, -8f, 2.3f, -8f, 4.32f)
                curveToRelative(0f, 2.44f, 5.04f, 4.5f, 11f, 4.5f)
                reflectiveCurveToRelative(11f, -2.06f, 11f, -4.5f)
                curveToRelative(0f, -2.16f, -3.95f, -4.02f, -9f, -4.42f)
                verticalLineToRelative(-1.0f)
                curveToRelative(5.74f, 0.42f, 10f, 2.65f, 10f, 5.42f)
                curveToRelative(0f, 0f, 0f, 0.03f, -0.01f, 0.08f)
                close()
            }
        }.also { _GolfHole = it}
