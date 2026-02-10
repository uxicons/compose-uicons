package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FitnessWatch: ImageVector? = null

val Icons.Ss.FitnessWatch: ImageVector
    get() = _FitnessWatch ?: UXIcon(name = "FitnessWatch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.1f)
                lineTo(6f, 0f)
                horizontalLineToRelative(12f)
                lineTo(18f, 2.1f)
                curveToRelative(-0.32f, -0.07f, -0.66f, -0.1f, -1f, -0.1f)
                lineTo(7f, 2f)
                close()
                moveTo(7f, 22f)
                curveToRelative(-0.34f, 0f, -0.68f, -0.04f, -1f, -0.1f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2.1f)
                curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1f, 0.1f)
                lineTo(7f, 22f)
                close()
                moveTo(20f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(4f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(16f, 11.2f)
                curveToRelative(0f, -1.22f, -0.9f, -2.2f, -2f, -2.2f)
                reflectiveCurveToRelative(-2f, 0.98f, -2f, 2.2f)
                curveToRelative(0f, -1.22f, -0.9f, -2.2f, -2f, -2.2f)
                reflectiveCurveToRelative(-2f, 0.98f, -2f, 2.2f)
                curveToRelative(0f, 2.3f, 4f, 5f, 4f, 5f)
                curveToRelative(0f, 0f, 4f, -2.7f, 4f, -5f)
                close()
            }
        }.also { _FitnessWatch = it}
