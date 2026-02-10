package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxingGlove: ImageVector? = null

val Icons.Br.BoxingGlove: ImageVector
    get() = _BoxingGlove ?: UXIcon(name = "BoxingGlove") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 7.26f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0f)
            horizontalLineToRelative(-4f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 7.5f)
            verticalLineToRelative(6.14f)
            arcTo(8.54f, 8.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.64f, 19.8f)
            lineToRelative(0.36f, 0.34f)
            lineTo(4f, 21f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
            horizontalLineToRelative(9f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
            verticalLineToRelative(-0.3f)
            lineToRelative(0.96f, -0.8f)
            arcTo(8.48f, 8.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 13.38f)
            lineTo(23f, 11.5f)
            arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7.26f)
            close()
            moveTo(20f, 13.38f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.03f, 17.6f)
            reflectiveCurveToRelative(-1.6f, 1.35f, -1.65f, 1.4f)
            lineTo(6.91f, 19f)
            lineToRelative(-1.2f, -1.37f)
            arcTo(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13.64f)
            verticalLineToRelative(-1.9f)
            arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 12f)
            horizontalLineToRelative(5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3f)
            horizontalLineToRelative(4f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.49f, 4.26f)
            arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11.5f)
            verticalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            close()
        }
    }.also { _BoxingGlove = it }
