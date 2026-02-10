package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeDeciduous: ImageVector? = null

val Icons.Ts.TreeDeciduous: ImageVector
    get() = _TreeDeciduous ?: UXIcon(name = "TreeDeciduous") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.92f, 5.07f)
                curveToRelative(-0.45f, -2.87f, -2.98f, -5.07f, -5.92f, -5.07f)
                reflectiveCurveTo(6.53f, 2.19f, 6.08f, 5.07f)
                curveToRelative(-3.44f, 0.46f, -6.08f, 3.42f, -6.08f, 6.93f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -3.51f, -2.64f, -6.48f, -6.08f, -6.93f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.79f)
                lineToRelative(3.85f, -3.85f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.15f, 3.15f)
                verticalLineToRelative(-4.79f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.79f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.85f, 3.85f)
                verticalLineToRelative(2.79f)
                lineTo(7f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -3.12f, 2.44f, -5.75f, 5.56f, -5.98f)
                lineToRelative(0.42f, -0.03f)
                lineToRelative(0.04f, -0.42f)
                curveToRelative(0.22f, -2.56f, 2.41f, -4.57f, 4.98f, -4.57f)
                reflectiveCurveToRelative(4.76f, 2.01f, 4.98f, 4.57f)
                lineToRelative(0.04f, 0.42f)
                lineToRelative(0.42f, 0.03f)
                curveToRelative(3.12f, 0.23f, 5.56f, 2.85f, 5.56f, 5.98f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _TreeDeciduous = it}
