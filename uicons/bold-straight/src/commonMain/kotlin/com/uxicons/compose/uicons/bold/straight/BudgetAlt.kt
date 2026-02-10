package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BudgetAlt: ImageVector? = null

val Icons.Bs.BudgetAlt: ImageVector
    get() = _BudgetAlt ?: UXIcon(name = "BudgetAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.9f, 13.33f)
                curveToRelative(0.63f, -0.64f, 1.24f, -1.48f, 1.24f, -2.33f)
                lineTo(3.87f, 11f)
                curveToRelative(0f, 0.85f, 0.6f, 1.69f, 1.24f, 2.33f)
                curveToRelative(-2.77f, 0.76f, -5.1f, 3.65f, -5.1f, 6.68f)
                curveToRelative(0f, 2.2f, 1.79f, 3.99f, 4f, 3.99f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -3.99f)
                curveToRelative(0f, -3.04f, -2.33f, -5.92f, -5.1f, -6.68f)
                close()
                moveTo(9f, 21f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, -0.44f, -1f, -0.99f)
                curveToRelative(0f, -1.89f, 1.8f, -3.88f, 3.5f, -3.88f)
                reflectiveCurveToRelative(3.5f, 2.0f, 3.5f, 3.88f)
                curveToRelative(0f, 0.55f, -0.45f, 0.99f, -1f, 0.99f)
                close()
                moveTo(24f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 1.83f, -1.5f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4.04f)
                curveToRelative(0.74f, -0.83f, 1.26f, -1.86f, 1.45f, -3f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(18f, 6f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveTo(3f, 1.79f, 4.79f, 0f, 7f, 0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _BudgetAlt = it}
