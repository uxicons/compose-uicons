package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WateringCanDrop: ImageVector? = null

val Icons.Bs.WateringCanDrop: ImageVector
    get() = _WateringCanDrop ?: UXIcon(name = "WateringCanDrop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 19.73f)
                curveToRelative(0.98f, 0.98f, 0.98f, 2.56f, 0f, 3.54f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                curveToRelative(-0.98f, -0.98f, -0.98f, -2.56f, 0f, -3.54f)
                lineToRelative(1.77f, -1.73f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.86f, -2f)
                horizontalLineToRelative(-5.08f)
                lineToRelative(-5.58f, 7.6f)
                lineToRelative(-10.48f, -10.48f)
                lineToRelative(0.01f, -4.12f)
                curveToRelative(-0.09f, -1.82f, 0.63f, -3.68f, 1.97f, -5.02f)
                curveToRelative(2.67f, -2.68f, 7.06f, -2.62f, 9.66f, 0.12f)
                lineToRelative(1.73f, -1.35f)
                lineToRelative(7.16f, 7.16f)
                lineToRelative(-2.27f, 3.09f)
                horizontalLineToRelative(2.88f)
                lineToRelative(0.86f, -2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3.0f, 8.86f)
                lineTo(9.26f, 3.96f)
                curveToRelative(-0.71f, -0.64f, -1.61f, -0.96f, -2.51f, -0.96f)
                curveToRelative(-0.96f, 0f, -1.92f, 0.37f, -2.65f, 1.1f)
                curveToRelative(-0.74f, 0.74f, -1.14f, 1.78f, -1.09f, 2.83f)
                lineToRelative(-0.0f, 1.93f)
                close()
                moveTo(16.59f, 8.21f)
                lineTo(13.12f, 4.75f)
                lineTo(4.57f, 11.45f)
                lineTo(10.13f, 17.01f)
                lineTo(16.59f, 8.21f)
                close()
            }
        }.also { _WateringCanDrop = it}
