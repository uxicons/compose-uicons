package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burrito: ImageVector? = null

val Icons.Br.Burrito: ImageVector
    get() = _Burrito ?: UXIcon(name = "Burrito") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 4f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
            arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, 0.22f)
            arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.55f)
            arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.87f, 0.68f)
            arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
            arcTo(3.68f, 3.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6.47f)
            lineTo(4f, 18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 24f)
            horizontalLineToRelative(5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18.54f)
            lineTo(20f, 6.47f)
            arcTo(3.68f, 3.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
            close()
            moveTo(11.68f, 3.24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.9f, 2.29f)
            arcToRelative(9.08f, 9.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 1.06f)
            arcTo(16.56f, 16.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.51f, 5.01f)
            arcTo(17.2f, 17.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.68f, 3.24f)
            close()
            moveTo(14.5f, 21f)
            horizontalLineToRelative(-5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 18.5f)
            lineTo(7f, 7.25f)
            curveToRelative(3.67f, 1.12f, 8.88f, 5.86f, 10f, 11.38f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 21f)
            close()
            moveTo(17f, 11.47f)
            arcToRelative(21.22f, 21.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -2.92f)
            arcToRelative(7.61f, 7.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -1.3f)
            close()
            moveTo(12f, 13.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.5f, 12f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.5f)
            close()
            moveTo(12f, 17.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.5f, 19f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17.5f)
            close()
        }
    }.also { _Burrito = it }
