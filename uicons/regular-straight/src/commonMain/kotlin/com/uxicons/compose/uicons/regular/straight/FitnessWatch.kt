package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FitnessWatch: ImageVector? = null

val Icons.Rs.FitnessWatch: ImageVector
    get() = _FitnessWatch ?: UXIcon(name = "FitnessWatch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3.18f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 3f)
                lineTo(7.99f, 3f)
                lineTo(7.96f, -0.01f)
                lineTo(5.96f, 0.01f)
                lineToRelative(0.03f, 3.18f)
                curveToRelative(-1.16f, 0.42f, -1.99f, 1.51f, -1.99f, 2.81f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(3.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                lineTo(20f, 6f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
                moveTo(18f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(7f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(6f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                close()
                moveTo(16f, 11.2f)
                curveToRelative(0f, 2.3f, -4f, 5f, -4f, 5f)
                curveToRelative(0f, 0f, -4f, -2.7f, -4f, -5f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                close()
            }
        }.also { _FitnessWatch = it}
