package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notes: ImageVector? = null

val Icons.Tr.Notes: ImageVector
    get() = _Notes ?: UXIcon(name = "Notes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                lineTo(0f, 7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(8.3f)
                curveToRelative(0f, 1.2f, -0.47f, 2.33f, -1.32f, 3.18f)
                lineToRelative(-3.7f, 3.7f)
                curveToRelative(-0.84f, 0.84f, -2.0f, 1.32f, -3.18f, 1.32f)
                lineTo(7.5f, 21f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(3f, 4.5f)
                curveTo(3f, 2.02f, 5.02f, 0f, 7.5f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(15.8f, 20f)
                curveToRelative(0.07f, 0f, 0.13f, -0.02f, 0.2f, -0.02f)
                verticalLineToRelative(-4.48f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.48f)
                curveToRelative(0.0f, -0.07f, 0.02f, -0.13f, 0.02f, -0.2f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(7.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(8.3f)
                close()
                moveTo(22.78f, 14f)
                horizontalLineToRelative(-4.28f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.27f)
                curveToRelative(0.47f, -0.17f, 0.91f, -0.44f, 1.27f, -0.8f)
                lineToRelative(3.7f, -3.7f)
                curveToRelative(0.37f, -0.36f, 0.63f, -0.8f, 0.8f, -1.27f)
                close()
            }
        }.also { _Notes = it}
