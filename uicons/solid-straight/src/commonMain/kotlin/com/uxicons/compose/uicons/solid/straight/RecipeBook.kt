package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RecipeBook: ImageVector? = null

val Icons.Ss.RecipeBook: ImageVector
    get() = _RecipeBook ?: UXIcon(name = "RecipeBook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 20f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(4f)
                lineTo(4f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(15f, 6f)
                curveToRelative(-0.3f, 0f, -0.53f, 0.15f, -0.66f, 0.27f)
                lineToRelative(-0.6f, 0.56f)
                lineToRelative(-0.67f, -0.48f)
                curveToRelative(-0.65f, -0.47f, -1.5f, -0.47f, -2.15f, 0f)
                lineToRelative(-0.67f, 0.48f)
                lineToRelative(-0.6f, -0.56f)
                curveToRelative(-0.13f, -0.12f, -0.36f, -0.27f, -0.66f, -0.27f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 2f)
                verticalLineToRelative(16f)
                lineTo(4f, 18f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(18f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                curveToRelative(-0.49f, 0f, -0.96f, 0.12f, -1.4f, 0.36f)
                curveToRelative(-1.01f, -0.47f, -2.2f, -0.47f, -3.21f, 0f)
                curveToRelative(-0.43f, -0.23f, -0.91f, -0.36f, -1.4f, -0.36f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                verticalLineToRelative(4.17f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4.17f)
                curveToRelative(1.16f, -0.41f, 2f, -1.52f, 2f, -2.83f)
                close()
            }
        }.also { _RecipeBook = it}
