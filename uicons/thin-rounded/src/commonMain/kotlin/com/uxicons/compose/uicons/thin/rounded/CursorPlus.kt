package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorPlus: ImageVector? = null

val Icons.Tr.CursorPlus: ImageVector
    get() = _CursorPlus ?: UXIcon(name = "CursorPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 9f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                reflectiveCurveToRelative(3.36f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -3.36f, 7.5f, -7.5f)
                reflectiveCurveToRelative(-3.36f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(16.5f, 23f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(20f, 16.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(12.97f, 6.43f)
                curveToRelative(0.14f, -0.78f, -0.18f, -1.75f, -1.18f, -2.12f)
                lineTo(2.8f, 0.21f)
                curveTo(2.03f, -0.08f, 1.19f, 0.1f, 0.61f, 0.68f)
                curveTo(0.03f, 1.26f, -0.15f, 2.1f, 0.15f, 2.91f)
                lineToRelative(4.11f, 8.85f)
                curveToRelative(0.33f, 0.88f, 1.08f, 1.24f, 1.77f, 1.24f)
                curveToRelative(0.12f, 0f, 0.24f, -0.01f, 0.36f, -0.03f)
                curveToRelative(0.78f, -0.14f, 1.57f, -0.78f, 1.57f, -1.88f)
                lineToRelative(0.03f, -3.09f)
                horizontalLineToRelative(3.09f)
                curveToRelative(1.1f, 0f, 1.74f, -0.79f, 1.88f, -1.57f)
                close()
                moveTo(7.5f, 7f)
                curveToRelative(-0.27f, 0f, -0.5f, 0.22f, -0.5f, 0.49f)
                lineToRelative(-0.04f, 3.58f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.56f, -0.4f, 0.84f, -0.75f, 0.9f)
                curveToRelative(-0.34f, 0.06f, -0.82f, -0.05f, -1.03f, -0.61f)
                lineTo(1.07f, 2.52f)
                curveToRelative(-0.15f, -0.4f, -0.06f, -0.83f, 0.24f, -1.13f)
                curveToRelative(0.21f, -0.21f, 0.48f, -0.32f, 0.75f, -0.32f)
                curveToRelative(0.12f, 0f, 0.24f, 0.02f, 0.35f, 0.06f)
                lineToRelative(8.99f, 4.1f)
                curveToRelative(0.53f, 0.2f, 0.64f, 0.67f, 0.58f, 1.02f)
                curveToRelative(-0.06f, 0.35f, -0.34f, 0.75f, -0.9f, 0.75f)
                horizontalLineToRelative(-3.58f)
                close()
            }
        }.also { _CursorPlus = it}
