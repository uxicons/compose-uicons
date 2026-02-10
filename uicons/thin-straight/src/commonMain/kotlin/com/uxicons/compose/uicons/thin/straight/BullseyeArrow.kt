package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyeArrow: ImageVector? = null

val Icons.Ts.BullseyeArrow: ImageVector
    get() = _BullseyeArrow ?: UXIcon(name = "BullseyeArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 5.29f)
                curveToRelative(-0.63f, -0.19f, -1.31f, -0.29f, -2f, -0.29f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -0.69f, -0.1f, -1.37f, -0.29f, -2f)
                horizontalLineToRelative(1.04f)
                curveToRelative(0.17f, 0.64f, 0.25f, 1.31f, 0.25f, 2f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                curveToRelative(0.69f, 0f, 1.36f, 0.09f, 2f, 0.25f)
                verticalLineToRelative(1.04f)
                close()
                moveTo(11.4f, 9.06f)
                lineToRelative(1.04f, -1.04f)
                curveToRelative(-0.14f, -0.02f, -0.29f, -0.02f, -0.44f, -0.02f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -0.15f, 0f, -0.3f, -0.02f, -0.44f)
                lineToRelative(-1.04f, 1.04f)
                curveToRelative(-0.28f, 1.37f, -1.49f, 2.4f, -2.94f, 2.4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.45f, 1.03f, -2.66f, 2.4f, -2.94f)
                close()
                moveTo(22.57f, 8.97f)
                curveToRelative(0.28f, 0.96f, 0.43f, 1.98f, 0.43f, 3.03f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 18.07f, 1f, 12f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                curveToRelative(1.05f, 0f, 2.07f, 0.15f, 3.03f, 0.43f)
                lineToRelative(0.79f, -0.8f)
                curveToRelative(-1.2f, -0.41f, -2.49f, -0.63f, -3.83f, -0.63f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -1.34f, -0.22f, -2.62f, -0.62f, -3.82f)
                lineToRelative(-0.8f, 0.79f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(0.71f)
                lineToRelative(-3.29f, 3.29f)
                horizontalLineToRelative(-4f)
                lineToRelative(-4.35f, 4.35f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.35f, -4.35f)
                lineTo(16f, 3.29f)
                lineToRelative(3.25f, -3.29f)
                horizontalLineToRelative(0.75f)
                lineTo(20f, 4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(22.33f, 5f)
                horizontalLineToRelative(-3.33f)
                lineTo(19f, 1.68f)
                lineToRelative(-2f, 2.03f)
                verticalLineToRelative(3.29f)
                horizontalLineToRelative(3.29f)
                lineToRelative(2.03f, -2f)
                close()
            }
        }.also { _BullseyeArrow = it}
