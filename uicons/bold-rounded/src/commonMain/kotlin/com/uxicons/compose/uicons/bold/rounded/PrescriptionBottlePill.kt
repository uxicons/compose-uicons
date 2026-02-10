package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrescriptionBottlePill: ImageVector? = null

val Icons.Br.PrescriptionBottlePill: ImageVector
    get() = _PrescriptionBottlePill ?: UXIcon(name = "PrescriptionBottlePill") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5f, 11f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(2f, 4.95f)
            curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
            curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
            horizontalLineToRelative(17f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            curveToRelative(0f, 1.21f, -0.86f, 2.22f, -2f, 2.45f)
            verticalLineToRelative(1.55f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            lineTo(5f, 5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
            close()
            moveTo(24f, 17f)
            curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
            reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            close()
            moveTo(13f, 17f)
            curveToRelative(0f, 0.55f, 0.11f, 1.08f, 0.32f, 1.56f)
            lineToRelative(5.24f, -5.24f)
            curveToRelative(-0.48f, -0.2f, -1.01f, -0.32f, -1.56f, -0.32f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            close()
            moveTo(21f, 17f)
            curveToRelative(0f, -0.55f, -0.11f, -1.08f, -0.32f, -1.56f)
            lineToRelative(-5.24f, 5.24f)
            curveToRelative(0.48f, 0.2f, 1.01f, 0.32f, 1.56f, 0.32f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            close()
        }
    }.also { _PrescriptionBottlePill = it }
