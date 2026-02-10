package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelopes: ImageVector? = null

val Icons.Br.Envelopes: ImageVector
    get() = _Envelopes ?: UXIcon(name = "Envelopes") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 1f)
            lineTo(10.5f, 1f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(8f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18.5f, 4f)
            curveToRelative(0.55f, 0f, 1.05f, 0.18f, 1.46f, 0.48f)
            lineToRelative(-3.79f, 3.79f)
            curveToRelative(-0.95f, 0.95f, -2.59f, 0.95f, -3.54f, 0f)
            lineToRelative(-3.71f, -3.71f)
            curveToRelative(0.43f, -0.35f, 0.98f, -0.56f, 1.57f, -0.56f)
            horizontalLineToRelative(8f)
            close()
            moveTo(18.5f, 14f)
            lineTo(10.5f, 14f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-3.63f)
            lineToRelative(2.52f, 2.52f)
            curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
            reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
            lineToRelative(2.71f, -2.71f)
            verticalLineToRelative(3.82f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(18f, 20.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.5f, 22f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 7.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _Envelopes = it }
