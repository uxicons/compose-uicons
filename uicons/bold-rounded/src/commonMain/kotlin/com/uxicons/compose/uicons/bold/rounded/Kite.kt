package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kite: ImageVector? = null

val Icons.Br.Kite: ImageVector
    get() = _Kite ?: UXIcon(name = "Kite") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.45f, 15.95f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.92f, 1.63f)
            curveTo(12.22f, 19.88f, 8.98f, 21f, 4.63f, 21f)
            horizontalLineToRelative(-1.1f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.37f, -0.9f)
            lineTo(5.46f, 17.8f)
            lineToRelative(11.45f, -3.05f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9.43f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
            horizontalLineTo(11.57f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.26f, 4.08f)
            lineTo(3.1f, 15.91f)
            lineToRelative(-2.07f, 2.07f)
            arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.53f, 24f)
            horizontalLineToRelative(1.1f)
            curveToRelative(5.12f, 0f, 9.17f, -1.45f, 12.02f, -4.3f)
            arcTo(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 21.5f)
            verticalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-1f)
            arcTo(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.45f, 15.95f)
            close()
            moveTo(9.16f, 4.86f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.63f, -1.1f)
            lineTo(13.7f, 7.44f)
            lineToRelative(3.63f, -3.63f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.5f)
            verticalLineTo(9.43f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.55f, 1.55f)
            lineTo(13.7f, 7.44f)
            lineTo(6.66f, 14.37f)
            lineToRelative(-0.04f, 0.01f)
            close()
        }
    }.also { _Kite = it }
