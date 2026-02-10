package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedPulse: ImageVector? = null

val Icons.Bs.BedPulse: ImageVector
    get() = _BedPulse ?: UXIcon(name = "BedPulse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 12f)
                horizontalLineToRelative(0.04f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineTo(3f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 4f)
                lineTo(3f, 4f)
                lineTo(3f, 15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(0.62f)
                lineToRelative(1.79f, 3f)
                horizontalLineToRelative(-2.41f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.04f)
                lineToRelative(1.92f, -2.88f)
                curveToRelative(1.35f, 0.35f, 2.38f, 1.48f, 2.58f, 2.88f)
                close()
                moveTo(18.78f, 4f)
                lineToRelative(-0.96f, 1.44f)
                lineTo(14.58f, 0.03f)
                lineToRelative(-2.78f, 3.97f)
                horizontalLineToRelative(-3.8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.36f)
                lineToRelative(1.02f, -1.46f)
                lineToRelative(3.29f, 5.52f)
                lineToRelative(2.71f, -4.06f)
                horizontalLineToRelative(3.62f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.22f)
                close()
                moveTo(6.5f, 14f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _BedPulse = it}
