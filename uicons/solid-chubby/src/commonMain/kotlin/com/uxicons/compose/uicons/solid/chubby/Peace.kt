package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peace: ImageVector? = null

val Icons.Sc.Peace: ImageVector
    get() = _Peace ?: UXIcon(name = "Peace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.61f, 0f, -11f, 3.39f, -11f, 11f)
                reflectiveCurveToRelative(3.39f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.39f, 11f, -11f)
                reflectiveCurveToRelative(-3.39f, -11f, -11f, -11f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 1.13f, -0.07f, 2.12f, -0.23f, 2.98f)
                curveToRelative(-2.39f, -3.11f, -4.98f, -4.95f, -6.27f, -5.75f)
                verticalLineToRelative(-5.18f)
                curveToRelative(4.82f, 0.34f, 6.5f, 2.5f, 6.5f, 7.94f)
                close()
                moveTo(10.5f, 4.06f)
                verticalLineToRelative(5.18f)
                curveToRelative(-1.29f, 0.79f, -3.89f, 2.63f, -6.27f, 5.73f)
                curveToRelative(-0.15f, -0.86f, -0.23f, -1.84f, -0.23f, -2.96f)
                curveToRelative(0f, -5.45f, 1.69f, -7.6f, 6.5f, -7.94f)
                close()
                moveTo(5.66f, 18.13f)
                curveToRelative(1.59f, -2.44f, 3.44f, -4.16f, 4.84f, -5.24f)
                verticalLineToRelative(7.05f)
                curveToRelative(-2.24f, -0.16f, -3.81f, -0.71f, -4.84f, -1.81f)
                close()
                moveTo(13.5f, 19.94f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.4f, 1.08f, 3.23f, 2.81f, 4.83f, 5.25f)
                curveToRelative(-1.03f, 1.09f, -2.59f, 1.64f, -4.83f, 1.8f)
                close()
            }
        }.also { _Peace = it}
