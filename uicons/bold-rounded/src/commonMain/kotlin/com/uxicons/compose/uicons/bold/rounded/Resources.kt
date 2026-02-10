package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resources: ImageVector? = null

val Icons.Br.Resources: ImageVector
    get() = _Resources ?: UXIcon(name = "Resources") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.5f, 2f)
            horizontalLineToRelative(-8f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4.5f)
            verticalLineToRelative(0.3f)
            lineTo(9.73f, 2.61f)
            arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.21f, 1.38f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.37f, 2.54f)
            lineTo(0.38f, 11.19f)
            arcToRelative(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, 1.93f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 15f)
            lineTo(5.2f, 15f)
            arcToRelative(7.07f, 7.07f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.6f, 0f)
            horizontalLineToRelative(2.7f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12.5f)
            verticalLineToRelative(-8f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 2f)
            close()
            moveTo(3.37f, 12f)
            lineTo(7.53f, 4.79f)
            lineTo(10.54f, 10f)
            arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.61f, 2f)
            close()
            moveTo(12f, 21f)
            arcToRelative(4.07f, 4.07f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.07f, -4.07f)
            arcTo(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
            moveTo(21f, 12f)
            lineTo(17.07f, 12f)
            arcTo(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10.14f)
            lineTo(14f, 5f)
            horizontalLineToRelative(7f)
            close()
        }
    }.also { _Resources = it }
