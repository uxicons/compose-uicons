package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RecipeBook: ImageVector? = null

val Icons.Rs.RecipeBook: ImageVector
    get() = _RecipeBook ?: UXIcon(name = "RecipeBook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(17f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(16f)
                lineTo(5f, 18f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.07f, -1f, 0.18f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 22f)
                close()
                moveTo(8f, 10.83f)
                verticalLineToRelative(4.17f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4.17f)
                curveToRelative(1.16f, -0.41f, 2f, -1.52f, 2f, -2.83f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                curveToRelative(-0.49f, 0f, -0.96f, 0.12f, -1.4f, 0.36f)
                curveToRelative(-1.01f, -0.47f, -2.2f, -0.47f, -3.21f, 0f)
                curveToRelative(-0.43f, -0.23f, -0.91f, -0.36f, -1.4f, -0.36f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                close()
                moveTo(9f, 7f)
                curveToRelative(0.3f, 0f, 0.53f, 0.15f, 0.66f, 0.27f)
                lineToRelative(0.6f, 0.56f)
                lineToRelative(0.67f, -0.48f)
                curveToRelative(0.65f, -0.47f, 1.5f, -0.47f, 2.15f, 0f)
                lineToRelative(0.67f, 0.48f)
                lineToRelative(0.6f, -0.56f)
                curveToRelative(0.13f, -0.12f, 0.36f, -0.27f, 0.66f, -0.27f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _RecipeBook = it}
