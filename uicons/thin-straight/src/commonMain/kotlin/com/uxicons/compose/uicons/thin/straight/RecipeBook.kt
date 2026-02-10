package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RecipeBook: ImageVector? = null

val Icons.Ts.RecipeBook: ImageVector
    get() = _RecipeBook ?: UXIcon(name = "RecipeBook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17.5f)
                lineTo(22f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                lineTo(4.5f, 19f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.2f, -1.5f, 0.51f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(16.5f)
                verticalLineToRelative(3f)
                lineTo(4.5f, 23f)
                close()
                moveTo(8f, 9.95f)
                verticalLineToRelative(5.05f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.62f, 0f, -1.21f, 0.23f, -1.66f, 0.64f)
                curveToRelative(-1.05f, -0.82f, -2.62f, -0.82f, -3.67f, 0f)
                curveToRelative(-0.45f, -0.41f, -1.05f, -0.64f, -1.66f, -0.64f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                close()
                moveTo(8.5f, 6f)
                curveToRelative(0.48f, 0f, 0.94f, 0.24f, 1.23f, 0.64f)
                lineToRelative(0.36f, 0.52f)
                lineToRelative(0.42f, -0.47f)
                curveToRelative(0.78f, -0.88f, 2.21f, -0.88f, 2.98f, 0f)
                lineToRelative(0.42f, 0.47f)
                lineToRelative(0.36f, -0.52f)
                curveToRelative(0.28f, -0.4f, 0.74f, -0.64f, 1.23f, -0.64f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _RecipeBook = it}
