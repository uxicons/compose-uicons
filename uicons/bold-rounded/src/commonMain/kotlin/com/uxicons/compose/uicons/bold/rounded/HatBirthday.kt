package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatBirthday: ImageVector? = null

val Icons.Br.HatBirthday: ImageVector
    get() = _HatBirthday ?: UXIcon(name = "HatBirthday") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.44f, 21.82f)
            arcTo(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.47f, 24f)
            lineTo(18.53f, 24f)
            arcToRelative(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.03f, -2.18f)
            arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.47f, -4.62f)
            lineTo(13.84f, 5.34f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.69f, 0f)
            lineTo(1.92f, 17.21f)
            arcTo(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.44f, 21.82f)
            close()
            moveTo(16.95f, 15.08f)
            lineTo(12.84f, 21f)
            horizontalLineToRelative(-3.4f)
            lineToRelative(5.81f, -8.37f)
            close()
            moveTo(19.9f, 20.43f)
            curveToRelative(-0.26f, 0.49f, -0.97f, 0.57f, -1.37f, 0.57f)
            lineTo(16.5f, 21f)
            lineToRelative(2.29f, -3.29f)
            lineToRelative(0.84f, 1.21f)
            arcTo(1.53f, 1.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.9f, 20.43f)
            close()
            moveTo(4.38f, 18.92f)
            lineTo(12f, 7.95f)
            lineTo(13.43f, 10f)
            lineTo(5.79f, 21f)
            lineTo(5.47f, 21f)
            curveToRelative(-0.4f, 0f, -1.11f, -0.07f, -1.37f, -0.57f)
            arcTo(1.53f, 1.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.38f, 18.92f)
            close()
        }
    }.also { _HatBirthday = it }
