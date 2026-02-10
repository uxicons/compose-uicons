package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Question: ImageVector? = null

val Icons.Sc.Question: ImageVector
    get() = _Question ?: UXIcon(name = "Question") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 1f)
                curveToRelative(-4.43f, 0.03f, -6.91f, 2.62f, -6.99f, 7.31f)
                curveToRelative(-0.01f, 0.83f, 0.66f, 1.52f, 1.5f, 1.52f)
                curveToRelative(0.82f, 0f, 1.49f, -0.66f, 1.5f, -1.48f)
                curveToRelative(0.05f, -3.04f, 1.25f, -4.34f, 3.99f, -4.36f)
                curveToRelative(2.72f, 0.02f, 3.96f, 1.36f, 4.01f, 4.31f)
                curveToRelative(-0.05f, 3.08f, -1.22f, 4.34f, -4.01f, 4.36f)
                curveToRelative(-0.82f, 0.01f, -1.49f, 0.68f, -1.49f, 1.5f)
                verticalLineToRelative(2.45f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.07f)
                curveToRelative(3.49f, -0.56f, 5.43f, -3.07f, 5.5f, -7.24f)
                curveToRelative(-0.07f, -4.61f, -2.62f, -7.28f, -7.01f, -7.31f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _Question = it}
