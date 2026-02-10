package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleDroplet: ImageVector? = null

val Icons.Rs.BottleDroplet: ImageVector
    get() = _BottleDroplet ?: UXIcon(name = "BottleDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 8.82f)
                lineToRelative(-3.5f, -2.8f)
                lineTo(15f, 2f)
                horizontalLineToRelative(1f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.02f)
                lineToRelative(-3.5f, 2.8f)
                curveToRelative(-0.95f, 0.76f, -1.5f, 1.9f, -1.5f, 3.12f)
                verticalLineToRelative(12.06f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-12.06f)
                curveToRelative(0f, -1.22f, -0.55f, -2.36f, -1.5f, -3.12f)
                close()
                moveTo(18f, 22f)
                lineTo(6f, 22f)
                verticalLineToRelative(-10.06f)
                curveToRelative(0f, -0.61f, 0.27f, -1.18f, 0.75f, -1.56f)
                lineToRelative(4.25f, -3.4f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.98f)
                lineToRelative(4.25f, 3.4f)
                curveToRelative(0.48f, 0.38f, 0.75f, 0.95f, 0.75f, 1.56f)
                verticalLineToRelative(10.06f)
                close()
                moveTo(12.68f, 11.77f)
                lineToRelative(-0.68f, -0.64f)
                lineToRelative(-0.68f, 0.64f)
                curveToRelative(-0.47f, 0.44f, -2.82f, 2.73f, -2.82f, 4.73f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -2f, -2.35f, -4.29f, -2.82f, -4.73f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.64f, 0.75f, -1.72f, 1.5f, -2.56f)
                curveToRelative(0.75f, 0.84f, 1.5f, 1.93f, 1.5f, 2.56f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _BottleDroplet = it}
