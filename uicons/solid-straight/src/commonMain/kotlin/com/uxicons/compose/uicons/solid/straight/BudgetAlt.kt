package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BudgetAlt: ImageVector? = null

val Icons.Ss.BudgetAlt: ImageVector
    get() = _BudgetAlt ?: UXIcon(name = "BudgetAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20.51f)
                curveToRelative(0f, 1.92f, -1.57f, 3.49f, -3.5f, 3.49f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.56f, -3.5f, -3.49f)
                curveToRelative(0f, -2.66f, 1.97f, -5.82f, 4.52f, -6.74f)
                curveToRelative(-0.76f, -0.75f, -1.52f, -1.75f, -1.52f, -2.77f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.02f, -0.76f, 2.02f, -1.52f, 2.77f)
                curveToRelative(2.55f, 0.93f, 4.52f, 4.08f, 4.52f, 6.74f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-11.76f)
                curveToRelative(0.48f, 0.72f, 0.76f, 1.58f, 0.76f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(8f, 2.5f)
                curveTo(8f, 1.03f, 6.74f, -0.14f, 5.24f, 0.01f)
                curveToRelative(-1.3f, 0.13f, -2.24f, 1.32f, -2.24f, 2.63f)
                verticalLineToRelative(6.36f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.78f, -0.23f, 1.51f, -0.58f, 2.18f)
                curveToRelative(2.17f, 1.78f, 3.58f, 4.69f, 3.58f, 7.33f)
                curveToRelative(0f, 1.32f, -0.47f, 2.54f, -1.26f, 3.49f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(21f, 6f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _BudgetAlt = it}
