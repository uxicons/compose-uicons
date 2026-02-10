package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyeArrow: ImageVector? = null

val Icons.Rs.BullseyeArrow: ImageVector
    get() = _BullseyeArrow ?: UXIcon(name = "BullseyeArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -0.54f, -0.08f, -1.05f, -0.21f, -1.55f)
                lineToRelative(1.57f, -1.57f)
                curveToRelative(0.41f, 0.96f, 0.64f, 2.01f, 0.64f, 3.12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                curveToRelative(1.11f, 0f, 2.16f, 0.23f, 3.12f, 0.64f)
                lineToRelative(-1.57f, 1.57f)
                curveToRelative(-0.49f, -0.13f, -1.01f, -0.21f, -1.55f, -0.21f)
                close()
                moveTo(21.6f, 9.23f)
                curveToRelative(0.26f, 0.88f, 0.4f, 1.81f, 0.4f, 2.77f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.51f, 2f, 12f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(0.96f, 0f, 1.89f, 0.14f, 2.77f, 0.4f)
                lineToRelative(1.57f, -1.57f)
                curveToRelative(-1.35f, -0.53f, -2.81f, -0.83f, -4.34f, -0.83f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -1.53f, -0.3f, -3f, -0.83f, -4.34f)
                lineToRelative(-1.57f, 1.57f)
                close()
                moveTo(11.73f, 8.03f)
                curveToRelative(-2.08f, 0.14f, -3.73f, 1.86f, -3.73f, 3.97f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(3.83f, -1.65f, 3.97f, -3.73f)
                lineToRelative(-1.14f, 1.14f)
                curveToRelative(-1.17f, 1.17f, -3.07f, 1.17f, -4.24f, 0f)
                reflectiveCurveToRelative(-1.17f, -3.07f, 0f, -4.24f)
                lineToRelative(1.14f, -1.14f)
                close()
                moveTo(11.29f, 11.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.71f, -5.71f)
                horizontalLineToRelative(2.59f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(-4f)
                lineTo(20f, 0f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(2.59f)
                lineToRelative(-5.71f, 5.71f)
                close()
            }
        }.also { _BullseyeArrow = it}
