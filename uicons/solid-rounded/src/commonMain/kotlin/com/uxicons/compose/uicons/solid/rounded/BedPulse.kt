package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedPulse: ImageVector? = null

val Icons.Sr.BedPulse: ImageVector
    get() = _BedPulse ?: UXIcon(name = "BedPulse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.96f)
                lineTo(13.67f, 0.45f)
                curveToRelative(0.39f, -0.62f, 1.38f, -0.57f, 1.71f, 0.07f)
                lineToRelative(2.37f, 4.31f)
                lineToRelative(0.92f, -1.38f)
                curveToRelative(0.19f, -0.28f, 0.5f, -0.45f, 0.83f, -0.45f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.96f)
                lineToRelative(-1.54f, 2.31f)
                curveToRelative(-0.39f, 0.62f, -1.38f, 0.57f, -1.71f, -0.07f)
                lineToRelative(-2.37f, -4.31f)
                lineToRelative(-1.09f, 1.63f)
                curveToRelative(-0.19f, 0.28f, -0.5f, 0.45f, -0.83f, 0.45f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(6.5f, 14f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineTo(0f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                lineTo(22f, 21f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                lineTo(2f, 16f)
                lineTo(2f, 5f)
                close()
                moveTo(20.41f, 8.04f)
                lineToRelative(-0.25f, 0.38f)
                curveToRelative(-0.56f, 0.84f, -1.49f, 1.34f, -2.5f, 1.34f)
                curveToRelative(-1.06f, 0.01f, -2.09f, -0.58f, -2.63f, -1.55f)
                lineToRelative(-0.11f, -0.19f)
                curveToRelative(-2.18f, 0.04f, -3.93f, 1.81f, -3.93f, 3.99f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.07f, -1.58f, -3.75f, -3.59f, -3.96f)
                close()
            }
        }.also { _BedPulse = it}
