package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StaffWizard: ImageVector? = null

val Icons.Sr.StaffWizard: ImageVector
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
                moveTo(12.2f, 10.79f)
                curveToRelative(-2.13f, -2.33f, -0.83f, -4.37f, -0.63f, -4.92f)
                curveToRelative(-0.92f, -3.66f, -3.48f, -5.9f, -7.07f, -5.86f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.32f, 0f, 2.4f, -1.04f, 2.48f, -2.34f)
                curveToRelative(0.03f, -0.28f, 0.01f, -0.18f, 0.02f, -0.66f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0f, 0.5f, 0f, 0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(3f, 0f, 4.34f, 1.95f, 4.93f, 3.71f)
                curveToRelative(-0.57f, 1.49f, -0.87f, 4.31f, 1.36f, 6.49f)
                lineToRelative(11.79f, 11.79f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _StaffWizard = it}
