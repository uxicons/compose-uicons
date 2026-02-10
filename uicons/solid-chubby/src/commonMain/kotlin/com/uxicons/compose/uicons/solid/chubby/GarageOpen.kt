package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageOpen: ImageVector? = null

val Icons.Sc.GarageOpen: ImageVector
    get() = _GarageOpen ?: UXIcon(name = "GarageOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.61f, 7.06f)
                curveToRelative(-0.07f, -0.15f, -0.18f, -0.28f, -0.31f, -0.38f)
                curveToRelative(-3.5f, -2.59f, -7.96f, -5.68f, -9.31f, -5.68f)
                curveToRelative(-1.36f, 0f, -5.81f, 3.09f, -9.31f, 5.68f)
                curveToRelative(-0.14f, 0.1f, -0.24f, 0.23f, -0.31f, 0.38f)
                curveToRelative(-0.05f, 0.11f, -1.23f, 2.7f, -1.23f, 8f)
                curveToRelative(0f, 1.86f, 0.15f, 5.21f, 0.35f, 7.05f)
                curveToRelative(0.06f, 0.51f, 0.48f, 0.89f, 0.99f, 0.89f)
                horizontalLineToRelative(3.52f)
                curveToRelative(0.29f, 0f, 0.57f, -0.13f, 0.76f, -0.35f)
                curveToRelative(0.19f, -0.22f, 0.27f, -0.52f, 0.23f, -0.81f)
                curveToRelative(-0.13f, -0.81f, -0.27f, -2.56f, -0.27f, -3.96f)
                curveToRelative(0f, -2.15f, 0.36f, -4.12f, 0.56f, -5.06f)
                curveToRelative(0.89f, -0.2f, 2.71f, -0.54f, 4.71f, -0.54f)
                reflectiveCurveToRelative(3.82f, 0.34f, 4.71f, 0.54f)
                curveToRelative(0.2f, 0.93f, 0.56f, 2.89f, 0.56f, 5.06f)
                curveToRelative(0f, 1.39f, -0.14f, 3.14f, -0.27f, 3.96f)
                curveToRelative(-0.05f, 0.29f, 0.04f, 0.58f, 0.23f, 0.81f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                horizontalLineToRelative(3.52f)
                curveToRelative(0.51f, 0f, 0.94f, -0.38f, 0.99f, -0.89f)
                curveToRelative(0.2f, -1.78f, 0.36f, -5.19f, 0.36f, -7.05f)
                curveToRelative(0f, -5.34f, -1.18f, -7.9f, -1.23f, -8.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.46f, 14.11f)
                lineTo(14.54f, 14.11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.54f, 15.11f)
                lineTo(15.54f, 16.62f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.54f, 17.62f)
                lineTo(9.46f, 17.62f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.46f, 16.62f)
                lineTo(8.46f, 15.11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.46f, 14.11f)
                close()
            }
        }.also { _GarageOpen = it}
