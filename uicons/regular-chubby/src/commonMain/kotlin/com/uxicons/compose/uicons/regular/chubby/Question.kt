package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Question: ImageVector? = null

val Icons.Rc.Question: ImageVector
    get() = _Question ?: UXIcon(name = "Question") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 1f)
                curveToRelative(-4.43f, 0.03f, -6.91f, 2.56f, -6.99f, 7.12f)
                curveToRelative(-0.01f, 0.55f, 0.43f, 1.01f, 0.98f, 1.02f)
                curveToRelative(0.55f, -0.02f, 1.01f, -0.43f, 1.02f, -0.98f)
                curveToRelative(0.06f, -3.5f, 1.65f, -5.13f, 4.99f, -5.16f)
                curveToRelative(3.31f, 0.02f, 4.95f, 1.71f, 5.01f, 5.12f)
                curveToRelative(-0.06f, 3.55f, -1.61f, 5.14f, -5.01f, 5.16f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.45f, -0.99f, 1f)
                verticalLineToRelative(3.72f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.77f)
                curveToRelative(3.85f, -0.37f, 5.92f, -2.8f, 6f, -7.11f)
                curveToRelative(-0.08f, -4.5f, -2.62f, -7.09f, -7.01f, -7.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22.0f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _Question = it}
