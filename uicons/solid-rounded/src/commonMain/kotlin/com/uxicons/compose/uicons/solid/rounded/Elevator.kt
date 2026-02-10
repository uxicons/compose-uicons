package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Elevator: ImageVector? = null

val Icons.Sr.Elevator: ImageVector
    get() = _Elevator ?: UXIcon(name = "Elevator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.05f, 4f)
                curveToRelative(-0.69f, 0f, -1.04f, -0.83f, -0.55f, -1.32f)
                lineTo(6.95f, 0.23f)
                curveToRelative(0.3f, -0.3f, 0.79f, -0.3f, 1.1f, 0f)
                lineToRelative(2.45f, 2.45f)
                curveToRelative(0.49f, 0.49f, 0.14f, 1.32f, -0.55f, 1.32f)
                horizontalLineToRelative(-4.9f)
                close()
                moveTo(14.05f, 0f)
                curveToRelative(-0.69f, 0f, -1.04f, 0.83f, -0.55f, 1.32f)
                lineToRelative(2.45f, 2.45f)
                curveToRelative(0.3f, 0.3f, 0.79f, 0.3f, 1.1f, 0f)
                lineToRelative(2.45f, -2.45f)
                curveToRelative(0.49f, -0.49f, 0.14f, -1.32f, -0.55f, -1.32f)
                horizontalLineToRelative(-4.9f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(14f, 12.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(5f, 12.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(11f, 19.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.32f)
                curveToRelative(0.31f, 0.11f, 0.65f, 0.18f, 1f, 0.18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(20f, 19.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.35f, 0f, 0.69f, -0.07f, 1f, -0.18f)
                verticalLineToRelative(-2.32f)
                close()
            }
        }.also { _Elevator = it}
