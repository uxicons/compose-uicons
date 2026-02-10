package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpen: ImageVector? = null

val Icons.Ts.EnvelopeOpen: ImageVector
    get() = _EnvelopeOpen ?: UXIcon(name = "EnvelopeOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.93f, 8.75f)
                lineTo(15.18f, 1.32f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.18f, -1.32f)
                reflectiveCurveToRelative(-2.33f, 0.47f, -3.17f, 1.31f)
                lineTo(1.07f, 8.75f)
                curveToRelative(-0.68f, 0.66f, -1.07f, 1.58f, -1.07f, 2.52f)
                verticalLineToRelative(12.72f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-12.72f)
                curveToRelative(0f, -0.95f, -0.39f, -1.87f, -1.07f, -2.52f)
                close()
                moveTo(9.53f, 2.02f)
                curveToRelative(1.32f, -1.32f, 3.62f, -1.33f, 4.96f, 0.01f)
                lineToRelative(7.62f, 7.32f)
                lineToRelative(-7.62f, 7.63f)
                curveToRelative(-1.32f, 1.32f, -3.63f, 1.32f, -4.95f, 0f)
                lineTo(1.9f, 9.35f)
                lineToRelative(7.63f, -7.33f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-11.72f)
                curveToRelative(0f, -0.4f, 0.1f, -0.79f, 0.28f, -1.14f)
                lineToRelative(7.54f, 7.54f)
                curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
                reflectiveCurveToRelative(2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(7.54f, -7.54f)
                curveToRelative(0.18f, 0.35f, 0.28f, 0.74f, 0.28f, 1.14f)
                verticalLineToRelative(11.72f)
                close()
            }
        }.also { _EnvelopeOpen = it}
