package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Farm: ImageVector? = null

val Icons.Ss.Farm: ImageVector
    get() = _Farm ?: UXIcon(name = "Farm") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.42f, 19.09f)
                lineToRelative(-3.42f, 2.8f)
                verticalLineToRelative(-5.6f)
                lineToRelative(3.42f, 2.8f)
                close()
                moveTo(12f, 17.8f)
                lineToRelative(3.42f, -2.8f)
                horizontalLineToRelative(-6.84f)
                lineToRelative(3.42f, 2.8f)
                close()
                moveTo(17f, 21.89f)
                verticalLineToRelative(-5.6f)
                lineToRelative(-3.42f, 2.8f)
                lineToRelative(3.42f, 2.8f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 10.43f)
                verticalLineToRelative(13.57f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(8f, 13.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8.0f)
                lineTo(0f, 24.0f)
                lineTo(0f, 10.43f)
                curveToRelative(0f, -0.59f, 0.17f, -1.17f, 0.5f, -1.67f)
                lineTo(3.84f, 3.76f)
                curveToRelative(0.32f, -0.48f, 0.78f, -0.86f, 1.31f, -1.09f)
                lineTo(10.82f, 0.24f)
                curveToRelative(0.75f, -0.32f, 1.61f, -0.32f, 2.36f, 0f)
                lineToRelative(5.67f, 2.43f)
                curveToRelative(0.54f, 0.23f, 0.99f, 0.61f, 1.31f, 1.09f)
                lineToRelative(3.33f, 5.0f)
                curveToRelative(0.33f, 0.49f, 0.5f, 1.07f, 0.5f, 1.66f)
                close()
                moveTo(15f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(16.42f, 24f)
                lineToRelative(-4.42f, -3.62f)
                lineToRelative(-4.42f, 3.62f)
                horizontalLineToRelative(8.84f)
                close()
            }
        }.also { _Farm = it}
