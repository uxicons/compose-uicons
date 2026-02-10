package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckLoading: ImageVector? = null

val Icons.Br.TruckLoading: ImageVector
    get() = _TruckLoading ?: UXIcon(name = "TruckLoading") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 17f)
            arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.04f)
            lineTo(20f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5.5f)
            lineTo(17f, 16.38f)
            lineToRelative(-0.79f, 0.23f)
            arcToRelative(3.29f, 3.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.14f, -0.59f)
            lineToRelative(-2.03f, -6.58f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.4f, -2.27f)
            lineTo(2.44f, 9.46f)
            arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.15f, 13.81f)
            lineToRelative(2.03f, 6.62f)
            curveToRelative(0.03f, 0.09f, 0.07f, 0.18f, 0.11f, 0.27f)
            lineToRelative(-1.21f, 0.36f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 2.88f)
            lineToRelative(15.23f, -4.48f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 17f)
            close()
            moveTo(5.03f, 19.49f)
            lineTo(3.02f, 12.94f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, -0.62f)
            lineToRelative(7.2f, -2.29f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.62f, 0.31f)
            lineToRelative(2.04f, 6.61f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.31f, 0.64f)
            lineToRelative(-0.04f, 0.01f)
            lineTo(5.5f, 19.76f)
            arcTo(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.03f, 19.49f)
            close()
            moveTo(10.12f, 13.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, 1.88f)
            lineToRelative(-1.6f, 0.51f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.91f, -2.86f)
            lineToRelative(1.59f, -0.51f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.12f, 13.44f)
            close()
        }
    }.also { _TruckLoading = it }
