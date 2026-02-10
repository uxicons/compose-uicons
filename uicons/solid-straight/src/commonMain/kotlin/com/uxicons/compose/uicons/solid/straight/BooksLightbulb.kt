package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BooksLightbulb: ImageVector? = null

val Icons.Ss.BooksLightbulb: ImageVector
    get() = _BooksLightbulb ?: UXIcon(name = "BooksLightbulb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                horizontalLineToRelative(-21f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(21f)
                reflectiveCurveToRelative(-1f, -1.5f, -1f, -3f)
                reflectiveCurveToRelative(1f, -3f, 1f, -3f)
                close()
                moveTo(10.92f, 0.11f)
                curveToRelative(-1.91f, 0.4f, -3.44f, 1.96f, -3.82f, 3.87f)
                curveToRelative(-0.41f, 2.07f, 0.47f, 3.96f, 1.97f, 5.04f)
                curveToRelative(0.26f, 0.19f, 0.43f, 0.47f, 0.43f, 0.8f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -0.32f, 0.17f, -0.61f, 0.43f, -0.8f)
                curveToRelative(1.25f, -0.91f, 2.07f, -2.36f, 2.07f, -4.03f)
                curveToRelative(0f, -3.12f, -2.85f, -5.57f, -6.08f, -4.89f)
                close()
                moveTo(13f, 5.72f)
                verticalLineToRelative(3.28f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.28f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                close()
                moveTo(23f, 13f)
                curveToRelative(0f, 1.5f, 1f, 3f, 1f, 3f)
                horizontalLineToRelative(-21f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7.5f)
                reflectiveCurveToRelative(-1f, 1.5f, -1f, 3f)
                close()
            }
        }.also { _BooksLightbulb = it}
