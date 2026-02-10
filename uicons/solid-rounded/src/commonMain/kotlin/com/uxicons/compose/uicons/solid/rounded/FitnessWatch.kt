package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FitnessWatch: ImageVector? = null

val Icons.Sr.FitnessWatch: ImageVector
    get() = _FitnessWatch ?: UXIcon(name = "FitnessWatch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 22f)
                curveToRelative(1.07f, 0f, 2.09f, -0.25f, 3f, -0.69f)
                verticalLineToRelative(1.69f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(7f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.69f)
                curveToRelative(0.91f, 0.43f, 1.93f, 0.69f, 3f, 0.69f)
                horizontalLineToRelative(6f)
                close()
                moveTo(20f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(16f, 11.2f)
                curveToRelative(0f, -1.22f, -0.9f, -2.2f, -2f, -2.2f)
                reflectiveCurveToRelative(-2f, 0.98f, -2f, 2.2f)
                curveToRelative(0f, -1.22f, -0.9f, -2.2f, -2f, -2.2f)
                reflectiveCurveToRelative(-2f, 0.98f, -2f, 2.2f)
                curveToRelative(0f, 1.48f, 1.65f, 3.39f, 2.83f, 4.38f)
                curveToRelative(0.68f, 0.57f, 1.66f, 0.57f, 2.34f, 0f)
                curveToRelative(1.18f, -0.98f, 2.83f, -2.9f, 2.83f, -4.38f)
                close()
                moveTo(15f, 2f)
                curveToRelative(1.07f, 0f, 2.09f, 0.25f, 3f, 0.69f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(7f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.69f)
                curveToRelative(0.91f, -0.43f, 1.93f, -0.69f, 3f, -0.69f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _FitnessWatch = it}
