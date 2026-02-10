package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedPulse: ImageVector? = null

val Icons.Rs.BedPulse: ImageVector
    get() = _BedPulse ?: UXIcon(name = "BedPulse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(-2.45f, 3.68f)
                lineToRelative(-3.17f, -5.75f)
                lineToRelative(-1.38f, 2.07f)
                horizontalLineToRelative(-5.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.96f)
                lineTo(14.58f, 0.07f)
                lineToRelative(3.17f, 5.75f)
                lineToRelative(1.22f, -1.83f)
                horizontalLineToRelative(5.04f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineTo(2f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 4f)
                lineTo(2f, 4f)
                lineTo(2f, 15f)
                horizontalLineToRelative(1.35f)
                curveToRelative(-0.22f, -0.46f, -0.35f, -0.96f, -0.35f, -1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.56f, 0f, 1.09f, 0.15f, 1.56f, 0.39f)
                curveToRelative(0.28f, -1.36f, 1.49f, -2.39f, 2.94f, -2.39f)
                horizontalLineToRelative(3.38f)
                lineToRelative(1.1f, 2f)
                horizontalLineToRelative(-4.48f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.23f)
                lineToRelative(1.33f, -1.99f)
                curveToRelative(1.61f, 0.05f, 2.9f, 1.37f, 2.9f, 2.99f)
                close()
                moveTo(6.5f, 15f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(22f, 19f)
                verticalLineToRelative(-2f)
                lineTo(2f, 17f)
                verticalLineToRelative(2f)
                lineTo(22f, 19f)
                close()
            }
        }.also { _BedPulse = it}
