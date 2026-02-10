package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hose: ImageVector? = null

val Icons.Sr.Hose: ImageVector
    get() = _Hose ?: UXIcon(name = "Hose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 4.12f)
                verticalLineToRelative(-0.12f)
                lineTo(5f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(5f, 12f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-0.12f)
                curveToRelative(0f, -1.17f, 1.06f, -2.05f, 2.21f, -1.84f)
                lineToRelative(6.0f, 1.3f)
                curveToRelative(0.46f, 0.1f, 0.79f, 0.51f, 0.79f, 0.98f)
                verticalLineToRelative(1.39f)
                curveToRelative(0f, 0.47f, -0.33f, 0.88f, -0.79f, 0.98f)
                lineToRelative(-5.99f, 1.3f)
                curveToRelative(-1.16f, 0.22f, -2.23f, -0.67f, -2.23f, -1.84f)
                close()
                moveTo(23f, 18f)
                lineTo(1f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 22f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 14f)
                lineTo(1f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Hose = it}
