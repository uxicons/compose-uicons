package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Question: ImageVector? = null

val Icons.Tc.Question: ImageVector
    get() = _Question ?: UXIcon(name = "Question") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 1f)
                curveToRelative(-4.5f, 0.03f, -6.92f, 2.43f, -7.0f, 6.93f)
                curveToRelative(-0.01f, 0.28f, 0.21f, 0.5f, 0.49f, 0.51f)
                curveToRelative(0.26f, -0.02f, 0.5f, -0.21f, 0.51f, -0.49f)
                curveToRelative(0.07f, -3.98f, 2.04f, -5.93f, 6.0f, -5.95f)
                curveToRelative(3.92f, 0.03f, 5.93f, 2.03f, 6.0f, 5.93f)
                curveToRelative(-0.07f, 4.04f, -1.98f, 5.93f, -6.0f, 5.95f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.42f)
                curveToRelative(4.23f, -0.19f, 6.42f, -2.52f, 6.5f, -6.94f)
                curveToRelative(-0.08f, -4.44f, -2.56f, -6.91f, -7.0f, -6.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22.25f)
                moveToRelative(-0.74f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.49f, 0f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.49f, 0f)
            }
        }.also { _Question = it}
