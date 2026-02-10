package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Ts.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.69f, 17.58f)
                curveToRelative(-0.05f, -0.02f, -2.2f, -0.9f, -5.45f, -1.89f)
                lineTo(22.66f, 0f)
                horizontalLineToRelative(-3.65f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.38f, -2.02f, 1.02f)
                lineToRelative(-6.8f, 9.31f)
                curveToRelative(-1.22f, 1.67f, -3.18f, 2.67f, -5.25f, 2.67f)
                lineTo(0f, 13f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 14f)
                curveToRelative(8.86f, 0f, 18.65f, 3.66f, 20.5f, 4.38f)
                verticalLineToRelative(0.23f)
                curveToRelative(-1.85f, 0.72f, -11.64f, 4.38f, -20.5f, 4.38f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 24f)
                curveToRelative(9.98f, 0f, 21.08f, -4.54f, 21.19f, -4.58f)
                lineToRelative(0.31f, -0.13f)
                verticalLineToRelative(-1.58f)
                lineToRelative(-0.31f, -0.13f)
                close()
                moveTo(7.91f, 13.39f)
                curveToRelative(1.22f, -0.53f, 2.29f, -1.37f, 3.09f, -2.46f)
                lineTo(17.8f, 1.61f)
                curveToRelative(0.28f, -0.39f, 0.73f, -0.61f, 1.21f, -0.61f)
                horizontalLineToRelative(2.32f)
                lineToRelative(-4.05f, 14.41f)
                curveToRelative(-2.68f, -0.78f, -5.97f, -1.57f, -9.38f, -2.03f)
                close()
                moveTo(14f, 18f)
                verticalLineToRelative(1f)
                lineTo(7f, 19f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _PlaneTail = it}
