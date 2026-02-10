package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrescriptionBottle: ImageVector? = null

val Icons.Br.PrescriptionBottle: ImageVector
    get() = _PrescriptionBottle ?: UXIcon(name = "PrescriptionBottle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 2.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(3.5f, 0f)
            curveTo(2.12f, 0f, 1f, 1.12f, 1f, 2.5f)
            curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
            verticalLineToRelative(13.55f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(21f, 4.95f)
            curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
            close()
            moveTo(15.5f, 21f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _PrescriptionBottle = it }
