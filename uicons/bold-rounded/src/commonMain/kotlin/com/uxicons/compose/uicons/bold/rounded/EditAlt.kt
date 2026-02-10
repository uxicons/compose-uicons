package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditAlt: ImageVector? = null

val Icons.Br.EditAlt: ImageVector
    get() = _EditAlt ?: UXIcon(name = "EditAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 15f)
            horizontalLineTo(18f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
            verticalLineToRelative(3f)
            horizontalLineTo(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.5f)
            verticalLineTo(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 3f)
            horizontalLineToRelative(10f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 1.5f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 0f)
            horizontalLineTo(4.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
            verticalLineToRelative(15f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 24f)
            horizontalLineTo(16.48f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.18f, -1.32f)
            lineToRelative(3.02f, -3.02f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.48f)
            verticalLineTo(11.51f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.96f, 1f)
            arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.11f, 0.98f)
            lineToRelative(-8.14f, 9.09f)
            arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, 3.36f)
            lineToRelative(8.4f, -8.4f)
            arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.16f)
            arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.96f, 1f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.29f, 13.07f)
            curveToRelative(-2.32f, 0.45f, -3.46f, 3.03f, -3.96f, 4.63f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.28f, 19f)
            horizontalLineTo(10f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.99f, -3.27f)
            arcTo(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.29f, 13.07f)
            close()
        }
    }.also { _EditAlt = it }
