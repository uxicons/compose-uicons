package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarAndCrescent: ImageVector? = null

val Icons.Ts.StarAndCrescent: ImageVector
    get() = _StarAndCrescent ?: UXIcon(name = "StarAndCrescent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(0f, -5.15f, 4.16f, -8.97f, 8.02f, -10.33f)
                lineToRelative(1.18f, -0.42f)
                lineToRelative(-1.15f, -0.51f)
                curveToRelative(-1.12f, -0.5f, -2.44f, -0.74f, -4.06f, -0.74f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.61f, 0f, 2.82f, -0.22f, 4.05f, -0.74f)
                lineToRelative(1.19f, -0.5f)
                lineToRelative(-1.22f, -0.43f)
                curveToRelative(-3.86f, -1.37f, -8.02f, -5.18f, -8.02f, -10.33f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                curveToRelative(0.93f, 0f, 1.72f, 0.08f, 2.44f, 0.25f)
                curveToRelative(-3.78f, 1.8f, -7.43f, 5.68f, -7.43f, 10.75f)
                reflectiveCurveToRelative(3.65f, 8.95f, 7.43f, 10.75f)
                curveToRelative(-0.72f, 0.17f, -1.49f, 0.25f, -2.43f, 0.25f)
                close()
                moveTo(24f, 10f)
                horizontalLineToRelative(-3.48f)
                lineToRelative(-1.07f, -3.64f)
                horizontalLineToRelative(-0.88f)
                lineToRelative(-1.07f, 3.64f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.84f)
                lineToRelative(2.57f, 1.68f)
                lineToRelative(-0.98f, 3.35f)
                lineToRelative(0.66f, 0.49f)
                lineToRelative(2.78f, -1.95f)
                lineToRelative(2.82f, 1.95f)
                lineToRelative(0.68f, -0.48f)
                lineToRelative(-1.06f, -3.32f)
                lineToRelative(2.54f, -1.74f)
                verticalLineToRelative(-0.83f)
                close()
                moveTo(20.27f, 12.16f)
                lineToRelative(0.78f, 2.45f)
                lineToRelative(-2.05f, -1.42f)
                lineToRelative(-2.02f, 1.42f)
                lineToRelative(0.53f, -1.81f)
                lineToRelative(0.21f, -0.71f)
                lineToRelative(-1.66f, -1.09f)
                horizontalLineToRelative(2.18f)
                lineToRelative(0.76f, -2.59f)
                lineToRelative(0.76f, 2.59f)
                horizontalLineToRelative(2.21f)
                lineToRelative(-1.71f, 1.16f)
                close()
            }
        }.also { _StarAndCrescent = it}
