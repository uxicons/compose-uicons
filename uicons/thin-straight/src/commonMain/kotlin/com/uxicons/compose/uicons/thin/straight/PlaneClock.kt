package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneClock: ImageVector? = null

val Icons.Ts.PlaneClock: ImageVector
    get() = _PlaneClock ?: UXIcon(name = "PlaneClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 9f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(-4.36f, -7.7f)
                curveToRelative(-0.44f, -0.8f, -1.28f, -1.3f, -2.19f, -1.3f)
                horizontalLineToRelative(-3.04f)
                lineToRelative(2.9f, 9f)
                horizontalLineToRelative(-4.96f)
                lineToRelative(-2.44f, -2.44f)
                curveToRelative(-0.36f, -0.36f, -0.84f, -0.56f, -1.35f, -0.56f)
                curveToRelative(-0.69f, 0f, -1.3f, 0.35f, -1.65f, 0.95f)
                curveToRelative(-0.34f, 0.59f, -0.35f, 1.3f, -0.01f, 1.9f)
                lineToRelative(2.94f, 5.15f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.2f, -0.35f, 0.43f, -0.69f, 0.68f, -1f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(-2.66f, -4.65f)
                curveToRelative(-0.16f, -0.28f, -0.16f, -0.62f, 0.0f, -0.9f)
                curveToRelative(0.28f, -0.49f, 1.02f, -0.59f, 1.42f, -0.19f)
                lineToRelative(2.73f, 2.73f)
                horizontalLineToRelative(16.21f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-4.76f)
                curveToRelative(0.25f, 0.31f, 0.48f, 0.65f, 0.68f, 1f)
                horizontalLineToRelative(5.08f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9.15f, 1f)
                horizontalLineToRelative(1.67f)
                curveToRelative(0.55f, 0f, 1.05f, 0.3f, 1.32f, 0.79f)
                lineToRelative(4.09f, 7.21f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(12.5f, 17.79f)
                lineTo(14.19f, 19.48f)
                lineTo(13.48f, 20.19f)
                lineTo(11.5f, 18.21f)
                verticalLineToRelative(-3.42f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.0f)
                close()
            }
        }.also { _PlaneClock = it}
