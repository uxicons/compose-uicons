package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BudgetAlt: ImageVector? = null

val Icons.Sr.BudgetAlt: ImageVector
    get() = _BudgetAlt ?: UXIcon(name = "BudgetAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.86f, 13.92f)
                curveToRelative(0.36f, -0.38f, 0.72f, -0.81f, 0.99f, -1.28f)
                curveToRelative(0.43f, -0.73f, -0.14f, -1.65f, -0.98f, -1.65f)
                horizontalLineToRelative(-3.74f)
                curveToRelative(-0.84f, 0f, -1.41f, 0.92f, -0.98f, 1.65f)
                curveToRelative(0.27f, 0.46f, 0.63f, 0.89f, 0.99f, 1.28f)
                curveToRelative(-2.37f, 1.09f, -4.14f, 4.06f, -4.14f, 6.59f)
                curveToRelative(0f, 1.92f, 1.57f, 3.49f, 3.5f, 3.49f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.56f, 3.5f, -3.49f)
                curveToRelative(0f, -2.53f, -1.77f, -5.5f, -4.14f, -6.59f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-4.26f)
                curveToRelative(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.49f)
                curveToRelative(0f, -2.6f, -1.33f, -5.32f, -3.3f, -7.08f)
                curveToRelative(0.44f, -0.91f, 0.41f, -1.95f, -0.1f, -2.85f)
                curveToRelative(-0.56f, -0.98f, -1.6f, -1.59f, -2.72f, -1.59f)
                horizontalLineToRelative(-3.74f)
                curveToRelative(-0.39f, 0f, -0.77f, 0.07f, -1.13f, 0.21f)
                lineTo(3.0f, 2.64f)
                curveTo(3f, 1.33f, 3.94f, 0.14f, 5.24f, 0.01f)
                curveToRelative(1.5f, -0.15f, 2.76f, 1.02f, 2.76f, 2.49f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveTo(24f, 3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.92f, -0.28f, -1.78f, -0.76f, -2.5f)
                horizontalLineToRelative(11.76f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
            }
        }.also { _BudgetAlt = it}
