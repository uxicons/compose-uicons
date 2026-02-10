package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Restaurant: ImageVector? = null

val Icons.Br.Restaurant: ImageVector
    get() = _Restaurant ?: UXIcon(name = "Restaurant") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.06f, 14.06f)
            lineToRelative(-9.5f, 9.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, 21.44f)
            lineToRelative(9.5f, -9.49f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.93f, -8f)
            lineTo(14.45f, 0.43f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.1f, 2.14f)
            lineToRelative(-3.57f, 3.5f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 3.63f)
            lineTo(18.44f, 3.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.12f, 2.12f)
            lineTo(14.3f, 11.82f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.64f, -0.81f)
            lineToRelative(3.49f, -3.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.14f, 2.1f)
            lineToRelative(-3.5f, 3.57f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.01f, 0.94f)
            close()
            moveTo(20.13f, 17.51f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17f)
            arcToRelative(19.96f, 19.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.81f, -0.39f)
            lineToRelative(-0.4f, -0.08f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, 2.94f)
            lineToRelative(0.37f, 0.07f)
            arcToRelative(20.96f, 20.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.74f, 0.45f)
            lineToRelative(3.06f, 3.49f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.26f, -1.98f)
            close()
            moveTo(3.78f, 12.66f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.37f, -1.85f)
            arcTo(15.68f, 15.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.04f, 3.57f)
            lineTo(5.75f, 6.52f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.96f, 4.49f)
            lineTo(4.62f, 0.86f)
            arcTo(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.64f, 0.19f)
            arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.65f)
            lineTo(0f, 3f)
            arcTo(17.79f, 17.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.78f, 12.66f)
            close()
        }
    }.also { _Restaurant = it }
