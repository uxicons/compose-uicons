package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stamp: ImageVector? = null

val Icons.Rs.Stamp: ImageVector
    get() = _Stamp ?: UXIcon(name = "Stamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                lineTo(2f, 24f)
                verticalLineToRelative(-2f)
                lineTo(22f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 16f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.4f, 0f, -0.65f, -0.22f, -0.77f, -0.36f)
                curveToRelative(-0.11f, -0.13f, -0.29f, -0.42f, -0.22f, -0.81f)
                curveToRelative(0.58f, -3.33f, 0.98f, -6.55f, 0.98f, -7.83f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.28f, 0.41f, 4.5f, 0.98f, 7.83f)
                curveToRelative(0.07f, 0.4f, -0.11f, 0.68f, -0.22f, 0.81f)
                reflectiveCurveToRelative(-0.36f, 0.36f, -0.77f, 0.36f)
                lineTo(3f, 13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(24f, 20f)
                verticalLineToRelative(-4f)
                close()
                moveTo(2f, 16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.89f, 0f, 1.72f, -0.39f, 2.29f, -1.07f)
                curveToRelative(0.57f, -0.68f, 0.81f, -1.57f, 0.66f, -2.44f)
                curveToRelative(-0.55f, -3.18f, -0.96f, -6.33f, -0.96f, -7.49f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.16f, -0.4f, 4.31f, -0.95f, 7.49f)
                curveToRelative(-0.15f, 0.87f, 0.09f, 1.76f, 0.66f, 2.44f)
                curveToRelative(0.57f, 0.68f, 1.41f, 1.07f, 2.3f, 1.07f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                lineTo(2f, 18.0f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Stamp = it}
