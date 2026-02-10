package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RecipeBook: ImageVector? = null

val Icons.Bs.RecipeBook: ImageVector
    get() = _RecipeBook ?: UXIcon(name = "RecipeBook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(5f, 0f)
                curveTo(2.79f, 0f, 1f, 1.79f, 1f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(18f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(13f)
                lineTo(5f, 16f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                lineTo(4f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 21f)
                close()
                moveTo(6f, 7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.68f, 0f, 1.3f, 0.28f, 1.75f, 0.72f)
                curveToRelative(0.45f, -0.44f, 1.07f, -0.72f, 1.75f, -0.72f)
                reflectiveCurveToRelative(1.3f, 0.28f, 1.75f, 0.72f)
                curveToRelative(0.45f, -0.44f, 1.07f, -0.72f, 1.75f, -0.72f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.21f, -0.86f, 2.22f, -2f, 2.45f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4.05f)
                curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
                close()
            }
        }.also { _RecipeBook = it}
