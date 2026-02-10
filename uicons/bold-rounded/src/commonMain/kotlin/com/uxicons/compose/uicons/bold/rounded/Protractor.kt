package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Protractor: ImageVector? = null

val Icons.Br.Protractor: ImageVector
    get() = _Protractor ?: UXIcon(name = "Protractor") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.48f, 11.38f)
            curveTo(22.18f, 5.75f, 16.98f, 1f, 11.13f, 1f)
            horizontalLineToRelative(-0.12f)
            arcTo(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.05f, 0f)
            lineTo(7.36f, 0f)
            arcTo(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.36f)
            lineTo(3f, 19.64f)
            arcTo(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.36f, 24f)
            lineTo(9.05f, 24f)
            arcToRelative(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.96f, -1f)
            horizontalLineToRelative(0.45f)
            arcTo(11.12f, 11.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 19.55f)
            arcTo(10.9f, 10.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.48f, 11.38f)
            close()
            moveTo(17.32f, 17.48f)
            arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.45f, 20f)
            lineTo(10f, 20f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 1f)
            lineTo(7.36f, 21f)
            arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19.64f)
            lineTo(6f, 19f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(6f, 16f)
            lineTo(6f, 13.5f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(6f, 10.5f)
            lineTo(6f, 8f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(6f, 5f)
            lineTo(6f, 4.36f)
            arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.36f, 3f)
            lineTo(8.59f, 3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
            horizontalLineToRelative(1.13f)
            curveToRelative(4.23f, 0f, 8.14f, 3.53f, 8.36f, 7.55f)
            arcTo(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.32f, 17.49f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 8f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
            verticalLineToRelative(6.01f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, 0.99f)
            arcTo(4.11f, 4.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.98f, 12.4f)
            arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
            close()
        }
    }.also { _Protractor = it }
