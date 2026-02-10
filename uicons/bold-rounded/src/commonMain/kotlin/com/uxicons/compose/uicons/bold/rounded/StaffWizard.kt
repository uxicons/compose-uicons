package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StaffWizard: ImageVector? = null

val Icons.Br.StaffWizard: ImageVector
    get() = _StaffWizard ?: UXIcon(name = "StaffWizard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.33f, 5.67f)
            lineToRelative(-2.33f, -1.17f)
            lineToRelative(2.33f, -1.17f)
            lineToRelative(1.17f, -2.33f)
            lineToRelative(1.17f, 2.33f)
            lineToRelative(2.33f, 1.17f)
            lineToRelative(-2.33f, 1.17f)
            lineToRelative(-1.17f, 2.33f)
            close()
            moveTo(4f, 11f)
            lineTo(3f, 13f)
            lineTo(1f, 14f)
            lineTo(3f, 15f)
            lineTo(4f, 17f)
            lineTo(5f, 15f)
            lineTo(7f, 14f)
            lineTo(5f, 13f)
            close()
            moveTo(13.06f, 10.94f)
            curveToRelative(-1.83f, -1.83f, -0.87f, -3.72f, -0.77f, -3.91f)
            lineToRelative(0.33f, -0.56f)
            lineToRelative(-0.18f, -0.62f)
            curveToRelative(-1.08f, -3.72f, -3.79f, -5.85f, -7.44f, -5.85f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            curveToRelative(1.55f, 0f, 2.97f, -1f, 2.97f, -3f)
            curveToRelative(0f, -0.86f, -0.58f, -1.5f, -1.47f, -1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            curveToRelative(2.14f, 0f, 3.62f, 1.06f, 4.39f, 3.17f)
            curveToRelative(-0.64f, 1.61f, -0.89f, 4.45f, 1.55f, 6.89f)
            lineToRelative(10.96f, 10.96f)
            lineToRelative(2.12f, -2.12f)
            close()
        }
    }.also { _StaffWizard = it }
